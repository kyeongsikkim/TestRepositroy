function totalSum(from,to){//변수 선언을 하지 않는다. 매개변수 이름만 하면 된다.리턴 타입이 없다 리턴값을 줄때는 값을 리턴해준다. 
	if(to==undefined){
			to=from;
			form=1;
			}
		var sum=0;
		for(var i=from;i<=to;i++){
			sum+=i;
			}
			return sum;//함수이름으로 호출 한다.
		}
		function handleBtnOk(){
		console.log("OK 버튼을 클릭함")
		}
			
		