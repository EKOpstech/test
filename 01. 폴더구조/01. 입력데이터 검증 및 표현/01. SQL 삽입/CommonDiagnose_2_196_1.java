1: public class CodeInjection { 
2: // eval 실행 데이터가 프로그램 실행 파라미터이다. 
3: public static void main(String[] args) throws ScriptException { ····························②
4: ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
5: ScriptEngine scriptEngine= scriptEngineManager.getEngineByName("javascript");
6: String src = "print('" + args[1] + "');";
7: scriptEngine.eval(src); ························································································①
8: }
9: }
