var dataMyLineChart1;
var dataMyLineChart2;
var chartQuy;
window.onload = function() {
	const year = $("#yearPieChart").val();
	$.ajax({
		url : `/api/report/${year}`,
		type : "GET",
		contentType : "application/json",
		dataType : "json",
		success : function(result) {
			if (result !== null) {
				//dataMyPieChart = result.val(prices)
				dataMyLineChart1 = result.revenueByMonthOfYearNow;
				dataMyLineChart2 = result.revenueByMonthOfYear;
				chartQuy = result.quarterlyRevenueOfTheYear;
				showChart();
			}
		}
	});
	
	
}

$("#yearPieChart").change(function() {
	const year = $("#yearPieChart").val();
	$.ajax({
		url : `/api/report/${year}`,
		type : "GET",
		contentType : "application/json",
		dataType : "json",
		success : function(result) {
			if (result !== null) {
				//dataMyPieChart = result.val(prices)
				dataMyLineChart1 = result.revenueByMonthOfYearNow;
				dataMyLineChart2 = result.revenueByMonthOfYear;
				chartQuy = result.quarterlyRevenueOfTheYear;
				showChart();
			}
		}
	});
})

function showChart(){
	var ctxP = document.getElementById("pieChart").getContext('2d');
	var myPieChart = new Chart(ctxP, {
		type : 'pie',
		data : {
			labels : [ "Quý 1", "Quý 2", "Quý 3", "Quý 4" ],
			datasets : [ {
				data : chartQuy,
				backgroundColor : [ 'rgba(255, 99, 132, 0.2)',
						'rgba(105, 0, 132, .2)', 'rgba(255, 206, 86, 0.2)',
						'rgba(75, 192, 192, 0.2)' ],
				hoverBackgroundColor : [ 'rgba(255, 99, 132, 0.2)',
						'rgba(105, 0, 132, .2)', 'rgba(255, 206, 86, 0.2)',
						'rgba(75, 192, 192, 0.2)' ]
			} ]
		},
		options : {
			responsive : true
		}
	});

	// line
	var ctxL = document.getElementById("lineChart").getContext('2d');
	var myLineChart = new Chart(ctxL, {
		type : 'line',
		data : {
			labels : [ "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5",
					"Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10",
					"Tháng 11", "Tháng 12" ],
			datasets : [ {
				label : "Năm 2021",
				data : dataMyLineChart1,
				backgroundColor : [ 'rgba(105, 0, 132, .2)', ],
				borderColor : [ 'rgba(200, 99, 132, .7)', ],
				borderWidth : 2
			}, {
				label : "Năm 2020",
				data : dataMyLineChart2,
				backgroundColor : [ 'rgba(0, 137, 132, .2)', ],
				borderColor : [ 'rgba(0, 10, 130, .7)', ],
				borderWidth : 2
			} ]
		},
		options : {
			responsive : true
		}
	});
}
