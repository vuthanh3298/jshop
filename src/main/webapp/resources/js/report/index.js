
/*
 * var thang; $(document).ready(function() {
 * $("#QuyPieChart").onChange(function() { var quy =
 * $(this).children("option:selected").val(); switch (quy) { case 1: thang = [
 * "Tháng 1", "Tháng 2", "Tháng 3" ]; break; case 2: thang = [ "Tháng 4", "Tháng
 * 5", "Tháng 6" ]; break; case 3: thang = [ "Tháng 7", "Tháng 8", "Tháng 9" ];
 * break; case 4: thang = [ "Tháng 10", "Tháng 11", "Tháng 12" ]; break;
 *  }
 * 
 * });
 * 
 * });
 */
//pie
var ctxP = document.getElementById("pieChart").getContext('2d');
var myPieChart = new Chart(ctxP,
		{
			type : 'pie',
			data : {
				labels : [ "Quý 1", "Quý 2", "Quý 3", "Quý 4" ],
				datasets : [ {
					data : [ 3, 5, 10, 9 ],
					backgroundColor : [ 'rgba(255, 99, 132, 0.2)',
						'rgba(105, 0, 132, .2)',
						'rgba(255, 206, 86, 0.2)',
						'rgba(75, 192, 192, 0.2)' ],
					hoverBackgroundColor : [ 'rgba(255, 99, 132, 0.2)',
						'rgba(105, 0, 132, .2)',
						'rgba(255, 206, 86, 0.2)',
						'rgba(75, 192, 192, 0.2)']
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
			data : [ 65, 59, 80, 81, 56, 55, 40, 90, 56, 74, 64, 86 ],
			backgroundColor : [ 'rgba(105, 0, 132, .2)', ],
			borderColor : [ 'rgba(200, 99, 132, .7)', ],
			borderWidth : 2
		}, {
			label : "Năm 2020",
			data : [ 28, 48, 40, 19, 86, 27, 90, 12, 32, 45, 23, 65 ],
			backgroundColor : [ 'rgba(0, 137, 132, .2)', ],
			borderColor : [ 'rgba(0, 10, 130, .7)', ],
			borderWidth : 2
		} ]
	},
	options : {
		responsive : true
	}
});

// bar
var ctxB = document.getElementById("barChart").getContext('2d');
var myBarChart = new Chart(ctxB, {
	type : 'bar',
	data: {
		labels : [ "2019", "2020", "2021"],
datasets: [{
			label : 'Doanh thu theo năm',
			data : [ 12, 19, 3 ],
			backgroundColor : [ 'rgba(255, 99, 132, 0.2)',
					'rgba(54, 162, 235, 0.2)', 'rgba(255, 206, 86, 0.2)',
					 ],
			borderColor : [ 'rgba(255,99,132,1)', 'rgba(54, 162, 235, 1)',
					'rgba(255, 206, 86, 1)', ],
			borderWidth : 1
		} ]
	},
	options : {
		scales : {
			yAxes : [ {
				ticks : {
					beginAtZero : true
				}
			} ]
		}
	}
});