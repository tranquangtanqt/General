package com.unco.dto;

import java.io.Serializable;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@SuppressWarnings("rawtypes")
public class UCC02lDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3149951370837768879L;

//	private List<AttendanceDto> attendanceDtoList;
	
	
	private DataModel attendanceDtoList = new ListDataModel();
	/**
	 * 従事時間合計
	 */	
	private String totalWorkingTime;
	
	/**
	 * 休憩時間合計
	 */	
	private String totalBreakTime;
	
	/**
	 * 残業時間合計
	 */	
	private String totalRestTime;
	
	/**
	 * 労働時間合計
	 */	
	private String totalAcWorkingTime;
	
	/**
	 * 時間有休合計
	 */	
	private String totalOvertime;
	
	/**
	 * 時間有休合計
	 */	
	private String totalMidnightTime;
	
	/**
	 * 法定休出合計
	 */	
	private String totalLegalHoliday;
	
	/**
	 * 所定休出合計
	 */	
	private String totalScheduleHoliday;
	
	/**
	 * 時間有休合計
	 */
	private String totalClosedTime;
	
	

	
	public String getTotalWorkingTime() {
		return totalWorkingTime;
	}

	public void setTotalWorkingTime(String totalWorkingTime) {
		this.totalWorkingTime = totalWorkingTime;
	}

	public String getTotalBreakTime() {
		return totalBreakTime;
	}

	public void setTotalBreakTime(String totalBreakTime) {
		this.totalBreakTime = totalBreakTime;
	}

	public String getTotalRestTime() {
		return totalRestTime;
	}

	public void setTotalRestTime(String totalRestTime) {
		this.totalRestTime = totalRestTime;
	}

	public String getTotalAcWorkingTime() {
		return totalAcWorkingTime;
	}

	public void setTotalAcWorkingTime(String totalAcWorkingTime) {
		this.totalAcWorkingTime = totalAcWorkingTime;
	}

	public String getTotalOvertime() {
		return totalOvertime;
	}

	public void setTotalOvertime(String totalOvertime) {
		this.totalOvertime = totalOvertime;
	}

	public String getTotalMidnightTime() {
		return totalMidnightTime;
	}

	public void setTotalMidnightTime(String totalMidnightTime) {
		this.totalMidnightTime = totalMidnightTime;
	}

	public String getTotalLegalHoliday() {
		return totalLegalHoliday;
	}

	public void setTotalLegalHoliday(String totalLegalHoliday) {
		this.totalLegalHoliday = totalLegalHoliday;
	}

	public String getTotalScheduleHoliday() {
		return totalScheduleHoliday;
	}

	public void setTotalScheduleHoliday(String totalScheduleHoliday) {
		this.totalScheduleHoliday = totalScheduleHoliday;
	}

	public String getTotalClosedTime() {
		return totalClosedTime;
	}

	public void setTotalClosedTime(String totalClosedTime) {
		this.totalClosedTime = totalClosedTime;
	}

	public DataModel getAttendanceDtoList() {
		return attendanceDtoList;
	}

	public void setAttendanceDtoList(DataModel attendanceDtoList) {
		this.attendanceDtoList = attendanceDtoList;
	}

}
