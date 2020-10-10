package com.test.enumconditional.testenumconditional;

import org.springframework.stereotype.Service;

@Service
public class ConditionalIf {
    public String calculator(String OpertionType){
        String typeOfCalculate = null;
        if(OpertionType.equals("SUM")){
            typeOfCalculate = "summed";
        }else if(OpertionType.equals("SUBTRACT")){
            typeOfCalculate = "subtracted";
        }

        return typeOfCalculate;
    }

    
}
