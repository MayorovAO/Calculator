package packages;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Milkey
 */
public class Calculate{

    public String getResult(Double number1, Double number2, String option) {
        String result ="";
        switch(option){
            case "p" :{
            result += number1 + number2;
            break;
            }
            case "m" :{
            result += number1 - number2;
            break;
            }
            case "mul" :{
            result += number1 * number2;
            break;
            }
            case "d" :{
                if(number2!=0){
                 result += number1 / number2;
                }
                else{
                    result = "division by 0";
                }
            }
        }
        return result;
    }
}
