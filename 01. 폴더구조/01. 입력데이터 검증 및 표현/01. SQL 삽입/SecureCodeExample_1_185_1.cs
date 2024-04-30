1: void ButtonClickGood(object sender, EventArgs e)
2: {
3: string connect = "MyConnString"; 
4: string usrinput = Request["ID"]; 
5: //파라미터 바인딩을 위해 @을 사용합니다. 외부입력 값에 의해 쿼리 구조 변경을 할 수 없습니다.
6: string query = "Select * From Products Where ProductID = @ProductID";
7: using (var conn = new SqlConnection(connect))
8: {
9: using (var cmd = new SqlCommand(query, conn)) 
10: {
11: cmd.Parameters.AddWithValue("@ProductID",
Convert.ToInt32(Request["ProductID"]);
12: conn.Open();
13: cmd.ExecuteReader();
14: }
15: 