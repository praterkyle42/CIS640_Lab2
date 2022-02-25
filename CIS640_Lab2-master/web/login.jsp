
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payroll Login</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>My Company Name Login</h1>
        <form action="login" method="post">
            <label class="pad_top">User ID:</label>
            <input type="text" name="userID" required><br>
            <label class="pad_top">Password:</label>
            <input type="password" name="password" required><br>
            <input type="submit" value="Login" class="margin-left">
        </form>
    </body>
</html>
