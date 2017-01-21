package cw3.chainofResponsibility;

import org.apache.log4j.Logger;

import java.math.BigDecimal;

public class AddImple extends OperationsAbs {
    private final static Logger LOGGER = Logger.getLogger(AddImple.class);

    public AddImple(int operation) {
        this.operation = operation;
    }


    protected void count(BigDecimal number1, BigDecimal number2) {
        LOGGER.info(number1.add(number2));
    }
}
