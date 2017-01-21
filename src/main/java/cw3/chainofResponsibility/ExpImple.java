package cw3.chainofResponsibility;

import org.apache.log4j.Logger;

import java.math.BigDecimal;

public class ExpImple extends OperationsAbs {

    private final static Logger LOGGER = Logger.getLogger(ExpImple.class);

    public ExpImple(int operation) {
        this.operation = operation;
    }


    protected void count(BigDecimal number1, BigDecimal number2) {
        LOGGER.info(number1.pow(number2.intValue()));
    }
}
