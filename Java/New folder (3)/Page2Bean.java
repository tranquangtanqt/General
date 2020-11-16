package com.learning.action;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

public class Page2Bean implements Serializable{

	private static final long serialVersionUID = -8596407534119171791L;
	private String demoStr;

	@PostConstruct
	public void initBean() {
		demoStr = "Page 2";
	}
	public void menuAction(ActionEvent event) {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/richfaces/page2.jsf");
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