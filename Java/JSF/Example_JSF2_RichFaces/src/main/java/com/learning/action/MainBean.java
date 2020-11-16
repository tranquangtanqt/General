package com.learning.action;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "MainBean")
@ViewScoped
public class MainBean implements Serializable {

	private static final long serialVersionUID = 3697291510143832558L;
	private String demoStr;
	
	@PostConstruct
	public void initBean() {
		demoStr = "MainBean";
	}

	public void menuAction(ActionEvent event) {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/richfaces/index.jsf");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getDemoStr() {
		return demoStr;
	}

	public void setDemoStr(String demoStr) {
		this.demoStr = demoStr;
	}

}