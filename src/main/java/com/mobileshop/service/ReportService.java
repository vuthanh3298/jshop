package com.mobileshop.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileshop.dto.ReportByMonthDto;
import com.mobileshop.dto.ReportByQuy;
import com.mobileshop.dto.ReportDto;
import com.mobileshop.mapper.ProductMapper;
import com.mobileshop.mapper.ReportMapper;

@Service
public class ReportService {
	@Autowired
	ReportMapper reportMapper;
	@Autowired
	ProductMapper productMapper;
	

	public ReportDto getReport(int year) throws Exception {
		ReportDto data = new ReportDto();

		int y = Calendar.getInstance().get(Calendar.YEAR);
		List<ReportByMonthDto> revenueByMonthOfYearNow = reportMapper.getRevenueByMonthOfYearNow(y);

		Map<Integer, ReportByMonthDto> reportMap = revenueByMonthOfYearNow.stream()
				.collect(Collectors.toMap(ReportByMonthDto::getMonth, Function.identity()));

		List<Long> prices = new ArrayList<>();

		for (int i = 1; i <= 12; i++) {
			if (reportMap.get(i) != null) {
				prices.add(reportMap.get(i).getPrices() == null ? 0 : reportMap.get(i).getPrices());
			} else {
				prices.add((long) 0);
			}
		}
		data.setRevenueByMonthOfYearNow(prices);

		List<ReportByMonthDto> revenueByMonthOfYearNow1 = reportMapper.getRevenueByMonthOfYearNow(y-1);

		Map<Integer, ReportByMonthDto> reportMap1 = revenueByMonthOfYearNow1.stream()
				.collect(Collectors.toMap(ReportByMonthDto::getMonth, Function.identity()));

		List<Long> prices1 = new ArrayList<>();

		for (int i = 1; i <= 12; i++) {
			if (reportMap1.get(i) != null) {
				prices1.add(reportMap.get(i).getPrices() == null ? 0 : reportMap1.get(i).getPrices());
			} else {
				prices1.add((long) 0);
			}
		}
		data.setRevenueByMonthOfYear(prices1);
		
		ReportByQuy reportByQuy = reportMapper.getQuarterlyRevenueOfTheYear(year).get(0);
		data.setQuarterlyRevenueOfTheYear(Arrays.asList(reportByQuy.getQ1(), reportByQuy.getQ2(), reportByQuy.getQ3(), reportByQuy.getQ4()));
		
		
		data.setProductsInStock(productMapper.getProductsInStock());
//		data.setRevenueByMonthOfYear(reportMapper.getRevenueByMonthOfYear(y-1));// report theo thag
//		data.setQuarterlyRevenueOfTheYear(reportMapper.getQuarterlyRevenueOfTheYear(year));// report theo quy 
//		data.setRevenueByYear(reportMapper.getRevenueByYear(y));// report theo nam 
//		data.setProductsInStock(productMapper.getProductsInStock());// ton kho
		return data;
	}

}
