package br.com.simsolutions.peopleware.hrm.people;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "peopleBean")
@ViewScoped
public class PeopleBean {
	private String message;
	private static Logger log = Logger.getLogger(PeopleBean.class.getName());

	public String getMessage() {
		log.info("getMessage: " + this.message);
		return message;
	}

	public void setMessage(String message) {
		log.info("setMessage: " + message);
		this.message = message;
	}

	public void sendMessage() {
		System.out.println("Message sent!");
	}
}
