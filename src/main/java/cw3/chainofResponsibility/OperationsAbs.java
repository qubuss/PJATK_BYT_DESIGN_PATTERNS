package cw3.chainofResponsibility;

import java.math.BigDecimal;

abstract class OperationsAbs {
    public static int add = 1;
    public static int sub = 2;
    public static int multi = 3;
    public static int div = 4;
    public static int exp = 5;

    int operation;

    private OperationsAbs nextOperationsAbs;

    public void setNextOperationsAbs(OperationsAbs nextOperationsAbs) {
        this.nextOperationsAbs = nextOperationsAbs;
    }

    public void logCount(int operation, BigDecimal number1, BigDecimal number2){
        if(this.operation == operation){
            count(number1, number2);
        }
        if(nextOperationsAbs !=null){
            nextOperationsAbs.logCount(operation, number1, number2);
        }
    }

    abstract protected void count(BigDecimal number1, BigDecimal number2);
}
