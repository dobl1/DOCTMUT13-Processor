package fr.unice.polytech.doct13.processors.binary;

import spoon.reflect.code.BinaryOperatorKind;

/**
 * Processor for mutating divide into multiplication modification
 */
public class DivProcessor extends BinaryProcessor {

    public DivProcessor(){
        super(BinaryOperatorKind.DIV,BinaryOperatorKind.MUL);
    }
}