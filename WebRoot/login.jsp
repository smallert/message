<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>��¼����</title>
  </head>
    <script type="text/javascript">
  function check(from){
  if(from.name.value == ""){
  alert("�û�������Ϊ��");
  return false;
  }
  if(from.password.value == ""){
  alert("���벻��Ϊ��");
  return false;
  }
  }
  </script>
  <body bgcolor="#E6E6FA" style="font-family:Microsoft YaHei" >
  <div style="text-align:center;margin-top:120px">
    <h1 >��  ��  ¼</h1>
    <form action="LoginServlet" method="post">
    	<table style="margin-left:40%">
    		<caption> �� �� ��  ¼ </caption>
    		<tr>
    			<td>��¼����</td>
    			<td><input name="name" type="text" size="20"></td>
    		</tr>
    		<tr>
    			<td>�� ��:</td>
    			<td><input name="password" type="password" size="20"></td>
    		</tr>
    	</table> 
    	<input type="submit" value="��¼">
    	<input type="reset" value="����"> 
    </form>
    <br>
    <a href="register.jsp">û���˺ţ����ע��</a>
    </div>
  </body>
</html>
