1: <body>
2: <%
3: String name = request.getparameter("name");
4: %>
5: ...
6:<script>
7: // 외부 입력값인 name을 javascript new Function()을 이용하여 문자열을 함수로 실행하고 있다.
8: (new Function(<%=name%>))();
9: </script>
10: </body>