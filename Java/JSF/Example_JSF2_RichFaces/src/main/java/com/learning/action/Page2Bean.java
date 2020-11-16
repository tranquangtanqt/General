package com.learning.action;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "Page2Bean")
@ViewScoped
public class Page2Bean {

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