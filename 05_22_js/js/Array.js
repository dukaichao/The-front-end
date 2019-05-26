function Array(){
	this.search = function(array,data){
		for(var i = 0;i<array.length;i++){
			if(array[i] == data){
				return i;
			}
		}
		return -1;
	}
	
	
	this.max = function(arr){
		var max = arr[0];
		for(var i = 1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
}


/*function Array(){
	//追加两个方法
	this.search=function(array,data){
		for(var i =0;i <array.length;i++){
			if(array[i]==data){
				return i ;
			}
		}
		return -1 ;
	}
	
	
	//max
	this.max = function(array){
		//定义一个参照物
		var max = array[0] ;
		for(var i =1 ; i < array.length;i++){
			if(array[i]>max){
				max = array[i] ;
			}
		}
		return max ;
	}
	
	
	
}*/