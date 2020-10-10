package com.test.enumconditional.testenumconditional;

public enum ConditionalEnum {
    SUM{

        @Override
        public String calculate() {
            return "summed";
        }
    },
    SUBTRACT{

        @Override
        public String calculate() {
            return "subtracted";
        }
    };
    
    public abstract String calculate();

}
