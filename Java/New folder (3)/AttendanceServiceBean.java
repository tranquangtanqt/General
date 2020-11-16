package com.unco.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.ejb.Stateless;

import com.unco.dto.AttendanceDayDto;
import com.unco.dto.AttendanceDto;
import com.unco.dto.UCC02lDto;

import net.poweregg.faces.util.StringUtils;
import net.poweregg.util.DateUtils;

@Stateless
public class AttendanceServiceBean implements AttendanceService {

	@Override
	public UCC02lDto getAttendanceList(int empid) throws Exception {
		// create AttendanceDto
		UCC02lDto ucc02lDto = new UCC02lDto();
		List<AttendanceDto> attendanceDtoList = new ArrayList<AttendanceDto>();
		@SuppressWarnings("deprecation")
		Date date1 = new Date(120, 11, 1, 6, 12, 22);
		String[] closedTimeList = {"0000", "0100", "0200", "0300", "0400", "0500", "0600", "0700", "0800"};
		String[] holidayCodeString = {"", "0", "1", "2", "3"};
		String[] holidayString = { "休日区分", "終業時刻", "休息時間", "法定休出" };
		String[] WorkString = { "休日", "時刻", "時間" };
		Random random = new Random();

		for (int i = 0; i < 32; i++) {
			AttendanceDto attendanceDto = new AttendanceDto();
			date1 = DateUtils.addDate(date1, "DAY", 1);
//			attendanceDto.setDate(DateUtils.getDateTimeInfo(date1, null, null, null ));
			attendanceDto.setDate(date1);
			attendanceDto.setState(random.nextBoolean());
			attendanceDto.setHolidayClass(holidayCodeString[random.nextInt(5)]);
			attendanceDto.setHolidayName(holidayString[random.nextInt(4)]);
			attendanceDto.setWorkClass(holidayCodeString[random.nextInt(5)]);
			attendanceDto.setWorkName(WorkString[random.nextInt(3)]);
			date1 = DateUtils.addDate(date1, "HOUR", 1);
			attendanceDto.setStartTime(DateUtils.convertDateTime(date1, DateUtils.DATE_PARTTERN.TIME_NO_COLON_PATTERN));
			date1 = DateUtils.addDate(date1, "HOUR", 1);
			attendanceDto
					.setClosingTime(DateUtils.convertDateTime(date1, DateUtils.DATE_PARTTERN.TIME_NO_COLON_PATTERN));
			date1 = DateUtils.addDate(date1, "HOUR", 1);
			attendanceDto
					.setWorkingTime(DateUtils.convertDateTime(date1, DateUtils.DATE_PARTTERN.TIME_NO_COLON_PATTERN));
			date1 = DateUtils.addDate(date1, "HOUR", 1);
			attendanceDto.setBreakTime(DateUtils.convertDateTime(date1, DateUtils.DATE_PARTTERN.TIME_NO_COLON_PATTERN));
			date1 = DateUtils.addDate(date1, "HOUR", 1);
			attendanceDto.setRestTime(DateUtils.convertDateTime(date1, DateUtils.DATE_PARTTERN.TIME_NO_COLON_PATTERN));
			date1 = DateUtils.addDate(date1, "HOUR", 1);
			attendanceDto
					.setAcWorkingTime(DateUtils.convertDateTime(date1, DateUtils.DATE_PARTTERN.TIME_NO_COLON_PATTERN));
			date1 = DateUtils.addDate(date1, "HOUR", 1);
			attendanceDto.setOvertime(DateUtils.convertDateTime(date1, DateUtils.DATE_PARTTERN.TIME_NO_COLON_PATTERN));
			date1 = DateUtils.addDate(date1, "HOUR", 1);
			attendanceDto
					.setMidnightTime(DateUtils.convertDateTime(date1, DateUtils.DATE_PARTTERN.TIME_NO_COLON_PATTERN));
			date1 = DateUtils.addDate(date1, "HOUR", 1);
			attendanceDto
					.setLegalHoliday(DateUtils.convertDateTime(date1, DateUtils.DATE_PARTTERN.TIME_NO_COLON_PATTERN));
			date1 = DateUtils.addDate(date1, "HOUR", 1);
			attendanceDto.setScheduleHoliday(
					DateUtils.convertDateTime(date1, DateUtils.DATE_PARTTERN.TIME_NO_COLON_PATTERN));
			attendanceDto.setClosedTime(closedTimeList[random.nextInt(9)]);

			attendanceDtoList.add(attendanceDto);
		}

		String time = StringUtils.formatTime("1215");
		short totalWorkingTimeHour = 0;
		short totalBreakTimeHour = 0;
		short totalRestTimeHour = 0;
		short totalAcWorkingTimeHour = 0;
		short totalOvertimeHour = 0;
		short totalMidnightTimeHour = 0;
		short totalLegalHolidayHour = 0;
		short totalScheduleHolidayHour = 0;
		short totalClosedTimeHour = 0;

		short totalWorkingTimeMinute = 0;
		short totalBreakTimeMinute = 0;
		short totalRestTimeMinute = 0;
		short totalAcWorkingTimeMinute = 0;
		short totalOvertimeMinute = 0;
		short totalMidnightTimeMinute = 0;
		short totalLegalHolidayMinute = 0;
		short totalScheduleHolidayMinute = 0;
		short totalClosedTimeMinute = 0;
		
		for (AttendanceDto element : attendanceDtoList) {
			totalWorkingTimeHour += Short.valueOf(element.getWorkingTime().substring(0, 2));
			totalWorkingTimeMinute += Short.valueOf(element.getWorkingTime().substring(2, 4));			
			totalBreakTimeHour += Short.valueOf(element.getBreakTime().substring(0, 2));
			totalBreakTimeMinute += Short.valueOf(element.getBreakTime().substring(2, 4));
			totalRestTimeHour += Short.valueOf(element.getRestTime().substring(0,2));
			totalRestTimeMinute += Short.valueOf(element.getRestTime().substring(2,4));
			totalAcWorkingTimeHour += Short.valueOf(element.getAcWorkingTime().substring(0,2));
			totalAcWorkingTimeMinute += Short.valueOf(element.getAcWorkingTime().substring(2,4));
			totalOvertimeHour += Short.valueOf(element.getOvertime().substring(0,2));
			totalOvertimeMinute += Short.valueOf(element.getOvertime().substring(2,4));
			totalMidnightTimeHour += Short.valueOf(element.getMidnightTime().substring(0,2));
			totalMidnightTimeMinute += Short.valueOf(element.getMidnightTime().substring(2,4));
			totalLegalHolidayHour +=  Short.valueOf(element.getLegalHoliday().substring(0,2));
			totalLegalHolidayMinute +=  Short.valueOf(element.getLegalHoliday().substring(2,4));
			totalScheduleHolidayHour +=  Short.valueOf(element.getScheduleHoliday().substring(0,2));
			totalScheduleHolidayMinute +=  Short.valueOf(element.getScheduleHoliday().substring(2,4));
			totalClosedTimeHour +=  Short.valueOf(element.getClosedTime().substring(0,2));
			totalClosedTimeMinute +=  Short.valueOf(element.getClosedTime().substring(2,4));	
		}
//		ucc02lDto.setAttendanceDtoList(attendanceDtoList);
		ucc02lDto.getAttendanceDtoList().setWrappedData(attendanceDtoList);
		
		ucc02lDto.setTotalWorkingTime(padLeftZeros(String.valueOf(totalWorkingTimeHour + totalWorkingTimeMinute/60), 3) + ":"
				+ padLeftZeros(String.valueOf(totalWorkingTimeMinute%60), 2));
		ucc02lDto.setTotalBreakTime(padLeftZeros(String.valueOf(totalBreakTimeHour + totalBreakTimeMinute/60), 3) + ":"
				+ padLeftZeros(String.valueOf(totalBreakTimeMinute%60), 2));
		ucc02lDto.setTotalRestTime(padLeftZeros(String.valueOf(totalRestTimeHour + totalRestTimeMinute/60), 3) + ":"
				+ padLeftZeros(String.valueOf(totalRestTimeMinute%60), 2));
		ucc02lDto.setTotalAcWorkingTime(padLeftZeros(String.valueOf(totalAcWorkingTimeHour + totalAcWorkingTimeMinute/60), 3) + ":"
				+ padLeftZeros(String.valueOf(totalAcWorkingTimeMinute%60), 2));
		ucc02lDto.setTotalOvertime(padLeftZeros(String.valueOf(totalOvertimeHour + totalOvertimeMinute/60), 3) + ":"
				+ padLeftZeros(String.valueOf(totalOvertimeMinute%60), 2));
		ucc02lDto.setTotalLegalHoliday(padLeftZeros(String.valueOf(totalLegalHolidayHour + totalLegalHolidayMinute/60), 3) + ":"
				+ padLeftZeros(String.valueOf(totalLegalHolidayMinute%60), 2));
		ucc02lDto.setTotalMidnightTime(padLeftZeros(String.valueOf(totalMidnightTimeHour + totalMidnightTimeMinute/60), 3) + ":"
				+ padLeftZeros(String.valueOf(totalMidnightTimeMinute%60), 2));
		ucc02lDto.setTotalScheduleHoliday(padLeftZeros(String.valueOf(totalScheduleHolidayHour + totalScheduleHolidayMinute/60), 3) + ":"
				+ padLeftZeros(String.valueOf(totalScheduleHolidayMinute%60), 2));
		ucc02lDto.setTotalClosedTime(padLeftZeros(String.valueOf(totalClosedTimeHour + totalClosedTimeMinute/60), 3) + ":"
				+ padLeftZeros(String.valueOf(totalClosedTimeMinute%60), 2));
		
		return ucc02lDto;
	}

	@Override
	public AttendanceDayDto getAttendanceDay(int empid) throws Exception {
		Random random = new Random();
		AttendanceDayDto attendanceDayDto = new AttendanceDayDto();
		attendanceDayDto.setAbsenceDay(10 + random.nextInt(90));
		attendanceDayDto.setWorkDay(10 + random.nextInt(90));
		attendanceDayDto.setAbsenceDay(10 + random.nextInt(90));
		attendanceDayDto.setAbsenceHalfDay(10 + random.nextInt(90));
		attendanceDayDto.setRevervedHoliday(10 + random.nextInt(90));
		attendanceDayDto.setPaidDay(50 + random.nextDouble());
		attendanceDayDto.setPaidHoidayHalfDay(10 + random.nextInt(90));
		attendanceDayDto.setPaidTime(10 + random.nextInt(90));
		attendanceDayDto.setCondolenceDay(10 + random.nextInt(90));
		attendanceDayDto.setOtherHoidayDay(10 + random.nextInt(90));
		attendanceDayDto.setPublicInjuryDay(10 + random.nextInt(90));
		attendanceDayDto.setOvertime(50 + random.nextDouble());
		attendanceDayDto.setScheduleHolidayTime(50 + random.nextDouble());
		attendanceDayDto.setLegalHolidayTime(50 + random.nextDouble());
		attendanceDayDto.setMidnightTime(50 + random.nextDouble());
		attendanceDayDto.setSixtyHOvertime(50 + random.nextDouble());
		attendanceDayDto.setScheduleHolidayDay(10 + random.nextInt(90));
		attendanceDayDto.setLegalHolidayDay(10 + random.nextInt(90));
		attendanceDayDto.setScheduleHolidayDayFee(10 +random.nextInt(90));
		attendanceDayDto.setLegalHolidayDayFee(10 + random.nextInt(90));
		attendanceDayDto.setScheduleHoidayHalfDayTime(10 + random.nextInt(90));
		attendanceDayDto.setLegalHoidayHalfDayTime(10 + random.nextInt(90));
		attendanceDayDto.setBeforeChildbirthDay(10 + random.nextInt(90));
		attendanceDayDto.setChildcareDay(10 + random.nextInt(90));
		attendanceDayDto.setNursingcareDay(10 + random.nextInt(90));
		attendanceDayDto.setLeftPaidHolidayDay(10 + random.nextInt(90));
		attendanceDayDto.setPreYearLeftHolidayDay(10 + random.nextInt(90));
		attendanceDayDto.setRemainPaidHolidayDay(10 + random.nextInt(90));
		attendanceDayDto.setPaidFraction(10 + random.nextInt(90));
		attendanceDayDto.setCurrYearLeftHolidayDay(50 + random.nextDouble());
		return attendanceDayDto;
	}
	
	private String padLeftZeros(String inputString, int length) {
	    if (inputString.length() >= length) {
	        return inputString;
	    }
	    StringBuilder sb = new StringBuilder();
	    while (sb.length() < length - inputString.length()) {
	        sb.append('0');
	    }
	    sb.append(inputString);
	 
	    return sb.toString();
	}

}
