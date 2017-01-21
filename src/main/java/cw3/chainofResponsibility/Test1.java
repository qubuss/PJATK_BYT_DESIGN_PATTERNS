package cw3.chainofResponsibility;

import java.math.BigDecimal;

class Test1 {

    private static OperationsAbs getChainOfOperations(){

        OperationsAbs addOperation = new AddImple(OperationsAbs.add);
        OperationsAbs subOperation = new SubImple(OperationsAbs.sub);
        OperationsAbs multiOperation = new MultiImple(OperationsAbs.multi);
        OperationsAbs divOperation = new DivImple(OperationsAbs.div);
        OperationsAbs expOperation = new ExpImple(OperationsAbs.exp);

        addOperation.setNextOperationsAbs(subOperation);
        subOperation.setNextOperationsAbs(multiOperation);
        multiOperation.setNextOperationsAbs(divOperation);
        divOperation.setNextOperationsAbs(expOperation);

        return addOperation;
    }

    public static void main(String[] args) {
        OperationsAbs operationChain = getChainOfOperations();

        operationChain.logCount(OperationsAbs.add, BigDecimal.valueOf(3), BigDecimal.TEN);
        operationChain.logCount(OperationsAbs.sub, BigDecimal.valueOf(3), BigDecimal.TEN);
        operationChain.logCount(OperationsAbs.multi, BigDecimal.valueOf(3), BigDecimal.TEN);
        operationChain.logCount(OperationsAbs.div, BigDecimal.valueOf(3), BigDecimal.TEN);
        operationChain.logCount(OperationsAbs.exp, BigDecimal.valueOf(3), BigDecimal.TEN);
    }
}
