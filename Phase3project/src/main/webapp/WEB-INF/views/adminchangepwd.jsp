<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body style="  background-repeat: no-repeat; background-size: cover;" background="https://i.pinimg.com/originals/f6/47/d4/f647d45c702c77ca4ab8b09d1e940c68.jpg">
<form action="databasechangepwd">
<input type="hidden" value="${username}"/><center><br><br><br><br><br><br><br><br><br>
<b><font color="green" size="50">Enter New password</b><input type="text" name="changepwd" required/>
<input type="submit" style="background:yellow;border:none" value="change"/><br>
</form>
<a href="adminback" style="text-decoration: none">Back</a>
</body>
</html>