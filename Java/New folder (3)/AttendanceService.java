package com.unco.service;

import javax.ejb.Local;
import com.unco.dto.UCC02lDto;
import com.unco.dto.AttendanceDayDto;

@Local
public interface AttendanceService {
	
	public UCC02lDto getAttendanceList(int empid) throws Exception;
	
	public AttendanceDayDto getAttendanceDay(int empid) throws Exception; 
	
}
