var a=1;
function search(){
     var index= $("#index").val();
        　　$.ajax({
        　　　　url:"/study/searchByIndex",
        　　　　type:"post",
        　　　　data:{
        　　　　　　index
        　　　　},
        　　　success:function(res){
       var  content=$("#wenben").val(res);
        　　},
        error:function(e){
        　　　　// 抛弃异常
        }
        
        　});       
}
function shanchu(){
    var index = $("#index").val();
       　　$.ajax({
       　　　　url:"/study/deleteByIndex",
       　　　　type:"post",
       　　　　data:{
       　　　　　 index
       　　　　},
       　　　success:function(res){
    	     alert('删除成功');
       　　　},
       error:function(e){
       　　　　// 抛弃异常
       }
       
       　});       
}
function genggai(){
    var index = $("#index").val();
    var wenben = $("#wenben").val();
       　　$.ajax({
       　　　　url:"/study/updateByIndex",
       　　　　type:"post",
       　　　　data:{
       　　　　　 index,
                 wenben
       　　　　},
       　　　success:function(res){
    	     alert('更改成功');
       　　　},
       error:function(e){
       　　　　// 抛弃异常
       }
       
       　});       
}
     
