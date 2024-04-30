1: class ACC { 
2: public static void executeScript(final String name) throws ScriptException {
3: ScriptEngineManager manager = new ScriptEngineManager();
4: ScriptEngine engine = manager.getEngineByName("javascript");
5: // eval을 이용해서 변수 name 값을 표시한다. 
6: engine.eval("print('" + name + "')");
7: }
8: }
9: ...
10: @RequestMapping(value = "/print", method = RequestMethod.POST) 
11: public void print(@RequestParam("name") String name) throws ScriptException{
12: // 사용자 입력값인 name을 이용해서 eval 을 사용하는 함수를 호출한다.
13: ACC.executeScript(name);
14: ...
15:}