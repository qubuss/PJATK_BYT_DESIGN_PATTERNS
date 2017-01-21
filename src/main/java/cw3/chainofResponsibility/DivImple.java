package cw3.chainofResponsibility;

import org.apache.log4j.Logger;

import java.math.BigDecimal;

public class DivImple extends OperationsAbs{

    private final static Logger LOGGER = Logger.getLogger(DivImple.class);

    public DivImple(int operation) {
        this.operation = operation;
    }


    protected void count(BigDecimal number1, BigDecimal number2) {
        LOGGER.info(number1.divide(number2));
    }
}
