<%-- 
    Document   : Index
    Created on : 16.03.2016, 14:00:30
    Author     : Milkey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form id="myform" method = "post" action = "./CalculateServlet">
            Number 1 :<input type="text" id = "1" name = "no1"><br>
            Operator :
            <select name = "opt">
                <option value = "p">+</option>
                <option value = "m">-</option>
                <option value = "mul">*</option>
                <option value = "d">/</option>
            </select><br>
            Number 2 :<input type="text" id = "2" name = "no2"><br>
            <input type="submit" value = "Go"><br>
            <label>Result:</label>
            <label id ="result">${result}</label><br>
            <script type="text/javascript" src = "jquery-1.5.2.min.js"></script>
            <script type="text/javascript" src = "jquery.validate.min.js"></script>
            <script type="text/javascript" src = "myscripts.js"></script>
        </form>
    </body>
</html>
