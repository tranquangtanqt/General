package com.learning.action;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

public class MainBean implements Serializable {

	private static final long serialVersionUID = 4767912458943386484L;
	private String demoStr;
	
	@PostConstruct
	public void initBean() {
		demoStr = "Page Main1";
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