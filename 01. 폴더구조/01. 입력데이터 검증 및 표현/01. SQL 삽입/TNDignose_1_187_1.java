1: … 
2: String tableName = props.getProperty(“jdbc.tableName”); 
3: String name = props.getProperty(“jdbc.name”); 
4: String query = “SELECT * FROM “ + tableName + “ WHERE Name =‘” + name + “’”;
5: stmt = con.prepareStatement(query); 
6: rs = stmt.executeQuery(); 
7: …