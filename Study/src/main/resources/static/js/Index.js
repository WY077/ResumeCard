function push(){ 
		var index= $("#index").val();
		var content= $(".content").val();
		if(index == "" || content ==""){
			　alert('没有相关数据');
			  return;
		}
		　　$.ajax({
		　　　　url:"/study/accent",
		　　　　type:"post",
		　　　　data:{
		　　　　　　index,
		          content
		　　　　},
		　　　success:function(res){
			   alert(res);
		　　　},
		　　error:function(e){
		　　　　// 抛弃异常
		　　}
		　});
		}

