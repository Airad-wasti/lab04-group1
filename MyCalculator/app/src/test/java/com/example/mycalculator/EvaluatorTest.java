package com.example.mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import javax.script.ScriptException;

public class EvaluatorTest {

    @Test
    public void evaluate_addition() throws ScriptException {
        Evaluator evaluator = new Evaluator();
        double actual = evaluator.evaluate( "1+2").doubleValue();
        double expected = 3.0;
        assertEquals(expected,actual, 0.0001);
    }
}