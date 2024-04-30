1: //외부로부터 입력받은 값을 검증 없이 사용할 경우 안전하지 않다.
2: String gubun = request.getParameter("gubun");
3: ......
4: String sql = "SELECT * FROM board WHERE b_gubun = '" + gubun + "'";
5: Connection con = db.getConnection();
6: Statement stmt = con.createStatement();
7: //외부로부터 입력받은 값이 검증 또는 처리 없이 쿼리로 수행되어 안전하지 않다.
8: ResultSet rs = stmt.executeQuery(sql);