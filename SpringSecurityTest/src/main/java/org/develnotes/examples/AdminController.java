package org.develnotes.examples;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String home() {
            
            
		return "private/admin";
	}
        @RequestMapping(value = "/ckl", method = RequestMethod.POST)
    public @ResponseBody String Calculator(Double number1, Double number2, String operation) throws JsonProcessingException {
        Calculate calc =  new Calculate();
        String result = calc.getResult(number1, number2, operation);
        ObjectMapper mapper = new ObjectMapper();

        return mapper.writeValueAsString(result);
    }
}
