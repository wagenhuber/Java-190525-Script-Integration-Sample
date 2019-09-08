package local.wagenhuber.guenther;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import groovy.util.Eval;


public class Testklasse {

    public static void main(String[] args) throws ScriptException {

        ScriptEngineManager javaScriptFactory = new ScriptEngineManager();
        //The Nashorn engine is the default ECMAScript (JavaScript) engine bundled with the Java SE Development Kit (JDK).
        ScriptEngine javascriptEngine = javaScriptFactory.getEngineByName("nashorn");
        Integer sum = (Integer) javascriptEngine.eval("10 * 10");
        System.out.println("Die Summe von Java-Script lautet: " + sum);


        ScriptEngineManager groovyFactory = new ScriptEngineManager();
        ScriptEngine groovyEngine = groovyFactory.getEngineByName("groovy");
        Integer sum2 = (Integer) groovyEngine.eval("10*10");
        System.out.println("Die Summe von Groovy-Script lautet:" + sum2);

    }

}
