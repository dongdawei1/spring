<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#testJson").click(function(){
			var url = this.href;
			var args = {};
			$.post(url, args, function(data){
				for(var i = 0; i < data.length; i++){
					var id = data[i].id;
					var lastName = data[i].lastName;
					
					alert(id + ": " + lastName);
				}
			});
			return false;
		});
	})
</script>

</head>
<body>


  
   

	
	
     <!--获取Cookie --value --> 
	<a href="springmvc/testCookieValue">Test CookieValue</a>
	<br><br>


  <!--获取请求头  --> 
  	<a href="springmvc/testRequestHeader">Test RequestHeader</a>
	<br><br>
  
<!--带参数到控制器  --> 
 	<a href="springmvc/testRequestParam?username=atguigu&age=11">Test RequestParam</a>
 
 
    <form action="springmvc/testMethodbb" method="post">
    年份：<input type="text" name="lyear" value="lyear"/><br>
  
   季节：<select name="season" >
    <option value="春">春</option>
    <option value="夏">夏</option>
    <option value="秋">秋</option>
    <option value="冬">冬</option>
    </select><br>
    标题：<input type="text" name="title" value="title"/><br>
 
     <input type="text" name="dddd">

    <input type="submit" value="添加">
    
    </form>
 
 
 
 
<form action="springmvc/testMethodbb" method="POST"> 
 <input type="submit" value="pringmv"/>
 </form>



 <a href="springmvc/helloworldaa">Hello world</a>
</body>
</html>