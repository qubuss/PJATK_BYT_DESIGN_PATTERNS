package cw3.chainofResponsibility;

import org.apache.log4j.Logger;

import java.math.BigDecimal;

public class MultiImple extends OperationsAbs{

    private final static Logger LOGGER = Logger.getLogger(MultiImple.class);

    public MultiImple(int operation) {
        this.operation = operation;
    }


    protected void count(BigDecimal number1, BigDecimal number2) {
        LOGGER.info(number1.multiply(number2));
    }
}
