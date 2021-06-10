package com.mobileshop.dto;

import java.util.List;

import com.mobileshop.model.ProductModel;

import lombok.Data;

@Data
public class ReportDto {

	private List<Long> revenueByMonthOfYearNow;
	private List<Long> revenueByMonthOfYear;// report theo thag
	private List<Long> quarterlyRevenueOfTheYear;// report theo quy
	private List<Integer> revenueByYear;// report theo nam
	private List<ProductModel> productsInStock;// ton kho
	
}
