package com.example.mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import javax.script.ScriptException;

public class EvaluatorTest2 {

    @Test
    public void evaluate_subtraction() throws ScriptException {
        Evaluator evaluator = new Evaluator();
        double actual = evaluator.evaluate( "20-2").doubleValue();
        double expected = 18.0;
        assertEquals(expected,actual, 0.0001);
    }
}