$(document).ready(function(){
    $("#myform").validate({
        rules:{
            no1:{
                required: true,
                number: true,
            },
            no2:{
                required: true,
                number: true,
            },
        },
        
        messages:{
            no1:{
                required: "this field is required",
                number: "this field not number",
            },
            no2:{
                required: "this field is required",
                number: "this field not number",
            },
        }
    });
});

