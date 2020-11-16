package com.unco.dto;

import java.io.Serializable;
import java.util.Date;

public class AttendanceDto implements Serializable {
	
	private static final long serialVersionUID = 3149951370837768879L;
	
	/**
	 * 日付
	 */
	private Date date;
	
	/**
	 * 確
	 */
	private Boolean state;
	
	/**
	 * 休日区分
	 */
	private String holidayClass;
	
	/**
	 * 休日区分名称
	 */
	private String holidayName;
	
	/**
	 * 勤務区分
	 */
	private String workClass;
	
	/**
	 * 勤務区分名称
	 */
	private String workName;
	
	/**
	 * 始業時刻
	 */
	private String startTime;
	
	/**
	 * 終業時刻
	 */
	private String closingTime;
	
	/**
	 * 従事時間
	 */
	private String workingTime;
	
	/**
	 * 休憩時間
	 */
	private String breakTime;
	
	/**
	 * 休息時間
	 */
	private String restTime;
	
	/**
	 * 労働時間
	 */
	private String acWorkingTime;
	
	/**
	 * 残業時間
	 */
	private String overtime;
	
	/**
	 * 深夜時間
	 */
	private String midnightTime;
	
	/**
	 * 法定休出
	 */
	private String legalHoliday;
	
	/**
	 * 所定休出
	 */
	private String scheduleHoliday;
	
	/**
	 * 時間有休
	 */
	private String closedTime;
	
	/**
	 * 時間有休リスト
	 */
	private String[] closedTimeItems = {"0000", "0100", "0200", "0300", "0400", "0500", "0600", "0700", "0800"};

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public String getHolidayClass() {
		return holidayClass;
	}

	public void setHolidayClass(String holidayClass) {
		this.holidayClass = holidayClass;
	}

	public String getHolidayName() {
		return holidayName;
	}

	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}

	public String getWorkClass() {
		return workClass;
	}

	public void setWorkClass(String workClass) {
		this.workClass = workClass;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

	public String getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}

	public String getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}

	public String getRestTime() {
		return restTime;
	}

	public void setRestTime(String restTime) {
		this.restTime = restTime;
	}

	public String getAcWorkingTime() {
		return acWorkingTime;
	}

	public void setAcWorkingTime(String acWorkingTime) {
		this.acWorkingTime = acWorkingTime;
	}

	public String getOvertime() {
		return overtime;
	}

	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}

	public String getMidnightTime() {
		return midnightTime;
	}

	public void setMidnightTime(String midnightTime) {
		this.midnightTime = midnightTime;
	}

	public String getLegalHoliday() {
		return legalHoliday;
	}

	public void setLegalHoliday(String legalHoliday) {
		this.legalHoliday = legalHoliday;
	}

	public String getScheduleHoliday() {
		return scheduleHoliday;
	}

	public void setScheduleHoliday(String scheduleHoliday) {
		this.scheduleHoliday = scheduleHoliday;
	}

	public String getClosedTime() {
		return closedTime;
	}

	public void setClosedTime(String closedTime) {
		this.closedTime = closedTime;
	}

	public String[] getClosedTimeItems() {
		return closedTimeItems;
	}

	public void setClosedTimeItems(String[] closedTimeItems) {
		this.closedTimeItems = closedTimeItems;
	}
	
	



	public AttendanceDto() {

	}
}
