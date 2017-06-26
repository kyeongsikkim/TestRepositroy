function backtire(command, speed,direction ) {
	var json = {"command":command, "speed":speed,"direction":direction};

	$.ajax({
		url:"http://" + location.host + "/SensingCarRemoteWebControl/backtire",
		data: json,
		method: "post",
		success: function(data) {
			if(data.result == "success") {
				$("#backtireStatus").html("speed=" + data.speed+",direction="+data.direction);
				$("#backtirespeed0").attr("onclick", "backtire('change', '0', '" + data.direction + "')");
				$("#backtirespeed1").attr("onclick", "backtire('change', '1100', '" + data.direction + "')");
				$("#backtirespeed2").attr("onclick", "backtire('change', '1200', '" + data.direction + "')");
				$("#backtirespeed3").attr("onclick", "backtire('change', '1300', '" + data.direction + "')");
				$("#backtirespeed4").attr("onclick", "backtire('change', '1400', '" + data.direction + "')");
				$("#backtirespeed5").attr("onclick", "backtire('change', '1500', '" + data.direction + "')");
				$("#backtirespeed6").attr("onclick", "backtire('change', '1600', '" + data.direction + "')");
				$("#backtirespeed7").attr("onclick", "backtire('change', '1700', '" + data.direction + "')");
				$("#backtirespeed8").attr("onclick", "backtire('change', '1800', '" + data.direction + "')");
				$("#backtirespeed9").attr("onclick", "backtire('change', '1900', '" + data.direction + "')");
				$("#backtirespeed10").attr("onclick", "backtire('change', '2000', '" + data.direction + "')");
			}
		}
	});
}