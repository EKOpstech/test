1: public void ButtonClickBad(object sender, EventArgs e)
2: { 
3: string connect = "MyConnString"; 
4: string usrinput = Request["ID"];
5: // 외부로부터 입력받은 값을 SQL 쿼리에 직접 사용하는 것은 안전하지 않다.
6: string query = "Select * From Products Where ProductID = " + usrinput;
7: using (var conn = new SqlConnection(connect)) 
8: { 
9: using (var cmd = new SqlCommand(query, conn)) 
10: {
11: conn.Open();
12: cmd.ExecuteReader(); /* BUG */ 
13: }
14: }
15: 