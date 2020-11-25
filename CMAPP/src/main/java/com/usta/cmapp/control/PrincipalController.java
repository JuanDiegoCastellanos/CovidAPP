package com.usta.cmapp.control;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;

import com.mysql.model.Ciudade;	
import com.mysql.model.Persona;
import com.mysql.model.TipoDocumento;
import com.usta.cmapp.constants.EnumDataBase;
import com.usta.cmapp.constants.EnumRh;
import com.usta.desarrollo_juancaste.service.ServicesDao;


@ManagedBean(name = "principal")
@SessionScoped
public class PrincipalController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String PAGE_PRINCIPAL = "../login/login.faces";
	private Properties properties;
	private String userAccess;
	private String usLoged;
	private List<TipoDocumento> typesDocuments;
	private List<Ciudade> ciudades;
	private List<EnumRh> rhlist;
	private Persona newPerson; 
	private TipoDocumento docType;
	private Ciudade ciudad;
	private String phone;
	
	
	@EJB
	private ServicesDao<Object> servicesDao;
	

	public PrincipalController() {

		try {
			properties = new Properties();
			userAccess = null;
			newPerson = new Persona();
			ciudad= new Ciudade();
			typesDocuments = new ArrayList<TipoDocumento>();
			ciudades = new ArrayList<Ciudade>();
			rhlist = new ArrayList<EnumRh>();
			docType =  new TipoDocumento();
			chargeProperties();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
		
	private void chargeProperties() {
		try {
			
			properties.load(PrincipalController.class.getResourceAsStream("messages.properties"));
			userAccess = ((String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get(LoginController.USER_AUTENTICH)).toUpperCase();
			usLoged = ((String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(LoginController.AUTH_KEY)).toUpperCase();
			
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					properties.getProperty("errorGeneral"), properties.getProperty("errorCargaProperties")));
		}
	}

	/**
	 * Se carga despues de cargar la clase y despues crea el constructor no recibe
	 * de ningun cliente, el cliente es el mismo servidor cuando la aplicación es
	 * inicializada
	 */

	@PostConstruct
	public void chargeData() {
		try {
			List<Object> d = servicesDao.findAll(TipoDocumento.class,EnumDataBase.MYSQL.getId());
			for (Object o : d) {
				typesDocuments.add((TipoDocumento) o);
			}
			List<Object> c = servicesDao.findAll(Ciudade.class,EnumDataBase.MYSQL.getId());
			for (Object o : c) {
			 ciudades.add((Ciudade) o);
			}
			rhlist.add(EnumRh.ABNEG);
			rhlist.add(EnumRh.ANEG);
			rhlist.add(EnumRh.APOS);
			rhlist.add(EnumRh.ABPOS);
			rhlist.add(EnumRh.BNEGA);
			rhlist.add(EnumRh.BPOS);
			rhlist.add(EnumRh.ONGE);
			rhlist.add(EnumRh.OPOS);
			
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					properties.getProperty("errorGeneral"), properties.getProperty("errorCargaProperties")));
		}
		
	}
	
	public String onFlowProcess(FlowEvent event) {
		String result = null;
		
		
		if(validateDataPerson()) {
			result = event.getNewStep();
			
		}else {
			result = event.getOldStep();
			
		}
		return result; 		
	}
	
	private boolean validateDataPerson() {
		boolean flag = false;
		if((newPerson.getDocumento()!=null && !newPerson.getDocumento().equals(""))
				&& (newPerson.getPrimerNombre()!=null && !newPerson.getPrimerNombre().equals(""))
				&& (newPerson.getPrimerApellido()!=null && !newPerson.getPrimerApellido().equals(""))
				&& (newPerson.getFechaNacimiento()!=null && !newPerson.getFechaNacimiento().equals(""))
				&& (phone!=null && phone.equals(""))) {
			Date today = new Date();
			if(newPerson.getFechaNacimiento().before(today)) {
				flag = true;
			}else {
				flag = false;
			}
		}else {
			flag = false;
			
		}
		return flag;
	}
	

	public String logout() {
		
		try {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("principal");
//			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("personcontroller");
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(LoginController.USER_AUTENTICH);
			FacesContext.getCurrentInstance().getExternalContext().redirect(PAGE_PRINCIPAL);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void createPerson() {
		try {
			if(validateDataPerson()) {
				newPerson.setTelefono(new BigDecimal(phone));
				servicesDao.createObject(newPerson, EnumDataBase.MYSQL.getId());
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,properties.getProperty(""), properties.getProperty("")));
				
			}else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,properties.getProperty(""), properties.getProperty("")));
			}
			
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,properties.getProperty(""), properties.getProperty("")));
		}
	}
	
	

	public String getUserAccess() {
		return userAccess;
	}

	public void setUserAccess(String userAccess) {
		this.userAccess = userAccess;
	}


	public Persona getNewPerson() {
		return newPerson;
	}

	public void setNewPerson(Persona newPerson) {
		this.newPerson = newPerson;
	}

	public List<TipoDocumento> getTypesDocuments() {
		return typesDocuments;
	}

	public void setTypesDocuments(List<TipoDocumento> typesDocuments) {
		this.typesDocuments = typesDocuments;
	}

	public List<Ciudade> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudade> ciudades) {
		this.ciudades = ciudades;
	}

	public List<EnumRh> getRhlist() {
		return rhlist;
	}

	public void setRhlist(List<EnumRh> rhlist) {
		this.rhlist = rhlist;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
