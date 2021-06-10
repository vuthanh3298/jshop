package com.mobileshop.mapper;

import java.util.List;

import com.mobileshop.dto.ReportByMonthDto;
import com.mobileshop.dto.ReportByQuy;

public interface ReportMapper {


	public List<ReportByMonthDto> getRevenueByMonthOfYearNow(int year) throws Exception;
	public List<Integer> getRevenueByMonthOfYear(int year) throws Exception;// report theo thang
	public List<ReportByQuy> getQuarterlyRevenueOfTheYear(int year) throws Exception;// report theo quy
	public List<Integer> getRevenueByYear(int year) throws Exception;// report theo nam
	
	
	
	
}
