package com.example.mycalculator;

import java.math.BigDecimal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Evaluator {
    public ScriptEngine engine;

    public Evaluator() {
        engine = new ScriptEngineManager().getEngineByName("rhino");
    }

    public Evaluator(String name) {
        engine = new ScriptEngineManager().getEngineByName(name);
    }

    public BigDecimal evaluate(String expression) throws ScriptException {
        String result = engine.eval(expression).toString();
        return new BigDecimal(result);

    }
}
