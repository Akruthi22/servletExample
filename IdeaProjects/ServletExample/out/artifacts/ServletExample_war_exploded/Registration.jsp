<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 8/12/2018
  Time: 5:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/Registration">


    First name:<input type="text" name="First name" required> <br>
    Last name:<input type="text" name="Last name" required> <br>

    <input type="radio" value="gender" value="male"> Male <br>
    <input type="radio" value="gender" value="female"> Female <br>
    <input type="radio" value="gender" value="Others"> Others <br>
    <label>Email id:</label>
    <input type="text" name="Email id" required> <br>
    <label>Username</label>
    <input type="text" name="Username" required> <br>
    <label>Password</label>
    <input type="text" name="Password" required> <br>
    <input type="submit" value="submit"> <br>

</form>

</body>
</html>
