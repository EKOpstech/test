1: @RequestMapping(value = "/execute", method = RequestMethod.GET)
2: public String execute(@RequestParam("src") String src) throws ScriptException {
3: // 유효한 문자 “_” 일 경우 실행할 메소드 호출한다.
4: if (src.matches("UNDER_BAR“) == true) { 
5: ...
6: // 유효한 문자 “$” 일 경우 실행할 메소드 호출한다.
7: } else if (src.matches("DOLLAR“) == true) {
8: ...
9: // 유효하지 않은 특수문자 입력시 예외를 발생시킨다.
10: } else {
11: throw new IllegalArgumentException();
12: }
13: ...
14: }