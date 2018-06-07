<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>登录界面</title>
  </head>
    <script type="text/javascript">
  function check(from){
  if(from.name.value == ""){
  alert("用户名不能为空");
  return false;
  }
  if(from.password.value == ""){
  alert("密码不能为空");
  return false;
  }
  }
  </script>
  <body bgcolor="#E6E6FA" style="font-family:Microsoft YaHei" >
  <div style="text-align:center;margin-top:120px">
    <h1 >请  登  录</h1>
    <form action="LoginServlet" method="post">
    	<table style="margin-left:40%">
    		<caption> 用 户 登  录 </caption>
    		<tr>
    			<td>登录名：</td>
    			<td><input name="name" type="text" size="20"></td>
    		</tr>
    		<tr>
    			<td>密 码:</td>
    			<td><input name="password" type="password" size="20"></td>
    		</tr>
    	</table> 
    	<input type="submit" value="登录">
    	<input type="reset" value="重置"> 
    </form>
    <br>
    <a href="register.jsp">没有账号？点击注册</a>
    </div>
  </body>
</html>
