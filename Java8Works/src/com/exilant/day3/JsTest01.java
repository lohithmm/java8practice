package com.exilant.day3;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTest01 {
public static void main(String[] args) throws ScriptException, FileNotFoundException {
	ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
	ScriptEngine nashorn=scriptEngineManager.getEngineByName("nashorn");
	nashorn.eval(new FileReader("/Users/lohith.m/git/java8practice/Java8Works/src/resources/js/test.js"));
	System.out.println(nashorn.eval("fintest()"));
	System.out.println(nashorn.eval("sayHellow('harry')"));
	System.out.println(nashorn.eval("testjson()"));
	/*String name="lohith";
	Integer result;
	//nashorn.eval(name);
	result=(Integer) nashorn.eval("30+12");
	System.out.println(result);*/
}
}
