package com.unco.dto;

import java.io.Serializable;

public class AttendanceDayDto implements Serializable {

	private static final long serialVersionUID = 3149951370837768879L;

	/**
	 * 基礎日数
	 */
	private int basicDay;

	/**
	 * 出勤(日)
	 */
	private int workDay;
	
	/**
	 * 欠勤(日)	
	 */
	private int absenceDay;
	
	/**
	 * 半日欠勤(回)		
	 */
	private int absenceHalfDay;
	
	/**
	 * 積立有休(日)	
	 */
	private int revervedHoliday;
	
	/**
	 * 有休(日)	
	 */
	private double paidDay;
	
	/**
	 * 半日有休(回)	
	 */
	private int paidHoidayHalfDay;
	
	/**
	 * 時間有休(時間)
	 */
	private int paidTime;
	
	/**
	 * 慶弔(日)	
	 */
	private int condolenceDay;
	
	/**
	 * 他休(日)	
	 */
	private int otherHoidayDay;
	
	/**
	 * 公傷(日)
	 */
	private int publicInjuryDay;
	
	/**
	 * 残業時間
	 */
	private double overtime;
	
	/**
	 * 所定休出時間
	 */
	private double scheduleHolidayTime;
	
	/**
	 * 法定休出時間
	 */
	private double legalHolidayTime;
	
	/**
	 * 深夜時間
	 */
	private double midnightTime;
	
	/**
	 * 60h超過時間
	 */
	private double sixtyHOvertime;
	
	/**
	 * 所定休出(日)
	 */
	private int scheduleHolidayDay;
	
	/**
	 * 法定休出(日)
	 */
	private int legalHolidayDay;
	
	/**
	 * 所定代休(日)
	 */
	private int scheduleHolidayDayFee;
	
	/**
	 * 法定代休(日)
	 */
	private int legalHolidayDayFee;
	
	/**
	 * 所定半休(回)
	 */
	private int scheduleHoidayHalfDayTime;
	
	/**
	 * 法定半休(回)	
	 */
	private int legalHoidayHalfDayTime;
	
	/**
	 * 産前産後(日)	
	 */
	private int beforeChildbirthDay;
	
	/**
	 * 育児休業(日)
	 */
	private int childcareDay;
	
	/**
	 * 介護休業(日)
	 */
	private int nursingcareDay;
	
	/**
	 * 積立有休残日数
	 */
	private int leftPaidHolidayDay;
	
	/**
	 * 有休残日数(前年)
	 */
	private int preYearLeftHolidayDay;
	
	/**
	 * 有休残日数(当年)
	 */
	private int remainPaidHolidayDay;
	
	/**
	 * 有休端数
	 */
	private int paidFraction;
	
	/**
	 * 当年時間有休残
	 */
	private double currYearLeftHolidayDay;

	public int getBasicDay() {
		return basicDay;
	}

	public void setBasicDay(int basicDay) {
		this.basicDay = basicDay;
	}

	public int getWorkDay() {
		return workDay;
	}

	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}

	public int getAbsenceDay() {
		return absenceDay;
	}

	public void setAbsenceDay(int absenceDay) {
		this.absenceDay = absenceDay;
	}

	public int getAbsenceHalfDay() {
		return absenceHalfDay;
	}

	public void setAbsenceHalfDay(int absenceHalfDay) {
		this.absenceHalfDay = absenceHalfDay;
	}

	public int getRevervedHoliday() {
		return revervedHoliday;
	}

	public void setRevervedHoliday(int revervedHoliday) {
		this.revervedHoliday = revervedHoliday;
	}

	public double getPaidDay() {
		return paidDay;
	}

	public void setPaidDay(double paidDay) {
		this.paidDay = paidDay;
	}

	public int getPaidHoidayHalfDay() {
		return paidHoidayHalfDay;
	}

	public void setPaidHoidayHalfDay(int paidHoidayHalfDay) {
		this.paidHoidayHalfDay = paidHoidayHalfDay;
	}

	public int getPaidTime() {
		return paidTime;
	}

	public void setPaidTime(int paidTime) {
		this.paidTime = paidTime;
	}

	public int getCondolenceDay() {
		return condolenceDay;
	}

	public void setCondolenceDay(int condolenceDay) {
		this.condolenceDay = condolenceDay;
	}

	public int getOtherHoidayDay() {
		return otherHoidayDay;
	}

	public void setOtherHoidayDay(int otherHoidayDay) {
		this.otherHoidayDay = otherHoidayDay;
	}

	public int getPublicInjuryDay() {
		return publicInjuryDay;
	}

	public void setPublicInjuryDay(int publicInjuryDay) {
		this.publicInjuryDay = publicInjuryDay;
	}

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}

	public double getScheduleHolidayTime() {
		return scheduleHolidayTime;
	}

	public void setScheduleHolidayTime(double scheduleHolidayTime) {
		this.scheduleHolidayTime = scheduleHolidayTime;
	}

	public double getLegalHolidayTime() {
		return legalHolidayTime;
	}

	public void setLegalHolidayTime(double legalHolidayTime) {
		this.legalHolidayTime = legalHolidayTime;
	}

	public double getMidnightTime() {
		return midnightTime;
	}

	public void setMidnightTime(double midnightTime) {
		this.midnightTime = midnightTime;
	}

	public double getSixtyHOvertime() {
		return sixtyHOvertime;
	}

	public void setSixtyHOvertime(double sixtyHOvertime) {
		this.sixtyHOvertime = sixtyHOvertime;
	}

	public int getScheduleHolidayDay() {
		return scheduleHolidayDay;
	}

	public void setScheduleHolidayDay(int scheduleHolidayDay) {
		this.scheduleHolidayDay = scheduleHolidayDay;
	}

	public int getLegalHolidayDay() {
		return legalHolidayDay;
	}

	public void setLegalHolidayDay(int legalHolidayDay) {
		this.legalHolidayDay = legalHolidayDay;
	}

	public int getScheduleHolidayDayFee() {
		return scheduleHolidayDayFee;
	}

	public void setScheduleHolidayDayFee(int scheduleHolidayDayFee) {
		this.scheduleHolidayDayFee = scheduleHolidayDayFee;
	}

	public int getLegalHolidayDayFee() {
		return legalHolidayDayFee;
	}

	public void setLegalHolidayDayFee(int legalHolidayDayFee) {
		this.legalHolidayDayFee = legalHolidayDayFee;
	}

	public int getScheduleHoidayHalfDayTime() {
		return scheduleHoidayHalfDayTime;
	}

	public void setScheduleHoidayHalfDayTime(int scheduleHoidayHalfDayTime) {
		this.scheduleHoidayHalfDayTime = scheduleHoidayHalfDayTime;
	}

	public int getLegalHoidayHalfDayTime() {
		return legalHoidayHalfDayTime;
	}

	public void setLegalHoidayHalfDayTime(int legalHoidayHalfDayTime) {
		this.legalHoidayHalfDayTime = legalHoidayHalfDayTime;
	}

	public int getBeforeChildbirthDay() {
		return beforeChildbirthDay;
	}

	public void setBeforeChildbirthDay(int beforeChildbirthDay) {
		this.beforeChildbirthDay = beforeChildbirthDay;
	}

	public int getChildcareDay() {
		return childcareDay;
	}

	public void setChildcareDay(int childcareDay) {
		this.childcareDay = childcareDay;
	}

	public int getNursingcareDay() {
		return nursingcareDay;
	}

	public void setNursingcareDay(int nursingcareDay) {
		this.nursingcareDay = nursingcareDay;
	}

	public int getLeftPaidHolidayDay() {
		return leftPaidHolidayDay;
	}

	public void setLeftPaidHolidayDay(int leftPaidHolidayDay) {
		this.leftPaidHolidayDay = leftPaidHolidayDay;
	}

	public int getPreYearLeftHolidayDay() {
		return preYearLeftHolidayDay;
	}

	public void setPreYearLeftHolidayDay(int preYearLeftHolidayDay) {
		this.preYearLeftHolidayDay = preYearLeftHolidayDay;
	}

	public int getRemainPaidHolidayDay() {
		return remainPaidHolidayDay;
	}

	public void setRemainPaidHolidayDay(int remainPaidHolidayDay) {
		this.remainPaidHolidayDay = remainPaidHolidayDay;
	}

	public int getPaidFraction() {
		return paidFraction;
	}

	public void setPaidFraction(int paidFraction) {
		this.paidFraction = paidFraction;
	}

	public double getCurrYearLeftHolidayDay() {
		return currYearLeftHolidayDay;
	}

	public void setCurrYearLeftHolidayDay(double currYearLeftHolidayDay) {
		this.currYearLeftHolidayDay = currYearLeftHolidayDay;
	}

}
