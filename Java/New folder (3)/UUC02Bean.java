package com.unco.action;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.unco.dto.AttendanceDayDto;
import com.unco.dto.AttendanceDto;
import com.unco.dto.UCC02lDto;
import com.unco.service.AttendanceService;

import net.poweregg.annotations.Login;
import net.poweregg.annotations.PEIntercepter;
import net.poweregg.annotations.Single;
import net.poweregg.web.engine.navigation.LoginUser;

@Named("UUC02Bean")
@ConversationScoped
@PEIntercepter
public class UUC02Bean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	@Single
	private transient Map<String, String> messages;
	
	@Inject
	@Login
	private LoginUser loginUser;
	
	@Inject
	UCC02lDto ucc02lDto;
	
	@Inject
	AttendanceDayDto attendanceDayDto;
	
	private String stringChange;
	
	@EJB
	private AttendanceService attendanceService;	
	
	private String rowIndex;

	public UCC02lDto getUcc02lDto() {
		return ucc02lDto;
	}

	public void setUcc02lDto(UCC02lDto ucc02lDto) {
		this.ucc02lDto = ucc02lDto;
	}
	
	public AttendanceDayDto getAttendanceDayDto() {
		return attendanceDayDto;
	}

	public void setAttendanceDayDto(AttendanceDayDto attendanceDayDto) {
		this.attendanceDayDto = attendanceDayDto;
	}
	
	@PreDestroy
	public void destroy() {
	}

	/**
	 * init list 01
	 * @throws Exception 
	 */
	public void initAppList01l() throws Exception {
		ucc02lDto = attendanceService.getAttendanceList(1);
		attendanceDayDto = attendanceService.getAttendanceDay(1);
	}
	
	public void update() {
		
	}
	
	public void changeHolidayClass() {
		String s = "123";
		stringChange = "123";
//		ucc02lDto = new UCC02lDto();
//		int a = ucc02lDto.getAttendanceDtoList().getRowIndex();
//		com.unco.dto.AttendanceDto attendanceDto = (AttendanceDto) ucc02lDto.getAttendanceDtoList().getRowData(); 
		FacesContext facesContext = FacesContext.getCurrentInstance();
		rowIndex = (String) facesContext.getExternalContext()
				.getRequestParameterMap().get("changeHolidayClass");
	}

	public String getStringChange() {
		return stringChange;
	}

	public void setStringChange(String stringChange) {
		this.stringChange = stringChange;
	}

	public String getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(String rowIndex) {
		this.rowIndex = rowIndex;
	}
}
