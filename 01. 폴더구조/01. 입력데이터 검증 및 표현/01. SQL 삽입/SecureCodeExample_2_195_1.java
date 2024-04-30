1: @RequestMapping(value = "/execute", method = RequestMethod.GET)
2: public String execute(@RequestParam("src") String src) throws ScriptException {
3: // 정규식을 이용하여 특수문자 입력시 예외를 발생시킨다.
4: if (src.matches("[\\w]*") == false) { 
5: throw new IllegalArgumentException();
6: }
7: ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
8: ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("javascript");
9: String retValue = (String)scriptEngine.eval(src);
10: return retValue;
11: }
