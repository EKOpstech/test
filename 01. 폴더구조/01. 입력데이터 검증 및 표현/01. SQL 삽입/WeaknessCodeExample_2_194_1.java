1: public class CodeInjectionController { 
2: @RequestMapping(value = "/execute", method = RequestMethod.GET) 
3: public String execute(@RequestParam("src") String src)
4: throws ScriptException { 
5: ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
6: ScriptEngine scriptEngine= scriptEngineManager.getEngineByName("javascript");
7: // 외부 입력값인 src를 javascript eval 함수로 실행하고 있어 안전하지 않다.
8: String retValue = (String)scriptEngine.eval(src);
9: return retValue;
10: }
11: }
