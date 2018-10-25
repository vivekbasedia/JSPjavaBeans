<%@ page language="java" contentType="text/html" %>
<html>
  <body bgcolor="white">
    <jsp:useBean 
      id="userinfo"
      class="isep.lab1.bean.Person">
    
     <jsp:setProperty name="userinfo" property="*" />
 </jsp:useBean>
    Below are the Person information :
    <ul>
      <li>First Name:: <jsp:getProperty
                       name="userinfo" property="firstName" />
      <li>Last Name:: <jsp:getProperty
                        name="userinfo" property="lastName" />
      <li>DOB: <jsp:getProperty
                           name="userinfo" property="birthDay" />
      <li>Sex: <jsp:getProperty
                 name="userinfo" property="sex" />
     
    </ul>
   
  </body>
</html>