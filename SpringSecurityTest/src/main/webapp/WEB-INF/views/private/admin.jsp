<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%@ page session="false"%>
<!doctype html>
<html lang="ru">
<head>
<meta charset="utf-8">
</head>
    <body>
        <form id="myform">
          Number 1 :<input type="text" id = "1" name = "no1"><br>
          Operator :
          <select name = "op" id="op">
                <option value = "p">+</option>
                <option value = "m">-</option>
                <option value = "mul">*</option>
                <option value = "d">/</option>
           </select><br>
           Number 2 :<input type="text" id = "2" name = "no2"><br>
           <input id="btn" type="button" value = "Go"><br>
            <label>Result:</label>
            <label id ="result"></label><br>
            <a class="btn btn-primary" href="j_spring_security_logout">Выход</a>
            <script type="text/javascript" src = "resources/jquery-1.5.2.min.js"></script>
            <script type="text/javascript" src = "resources/jquery.validate.min.js"></script>
            <script>
                   $(document).ready(function() {
                        var elementnumber1 = $('#1'),
                            elementnumber2 = $('#2');
                            
                        $("#btn").click(function () {
                            var number1 = elementnumber1.val();
                            var number2 = elementnumber2.val();
                            var operation = $('#op').val();
                                json = {number1: number1, number2: number2, operation: operation};  
                        $.ajax({
                            type: "POST",
                            url: "ckl",
                            data: json,
                            success: function(res){
                            $('#result').text(res);
                        }
                    });
                    return false;
                });
           });
        </script> 
        <script type="text/javascript" src = "resources/myscripts.js"></script>
        </form>
</body>
<foot>
    <form action="stats" method="POST">
        <input type = "submit" value="stats"/>
    </form>
</foot>
</html>