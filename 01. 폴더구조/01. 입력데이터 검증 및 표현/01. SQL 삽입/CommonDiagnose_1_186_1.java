1: class Login { 
2: public Connection getConnection() throws SQLException { 
3: DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
4: String dbConnection = PropertyManager.getProperty(“db.connection”);
5: return DriverManager.getConnection(dbConnection); 
6: }
7: // 외부입력 값(username, password)을 제공받음 
8: public void doPrivilegedAction(String username, char[] password) throws SQLException {
9: Connection connection = getConnection();
10: if (connection == null) { 
11: // handle error 
12: }
13: try {
14: String pwd = HashUtil.hashPassword(password); 
15: String sqlString = “SELECT * FROM db_user WHERE username = ‘”+ username 
+ “’ AND password = ‘” + pwd + “’”; ··········································································③
16: Statement stmt = connection.createStatement(); ························································②
17: ResultSet rs = stmt.executeQuery(sqlString); ·······························································①
18: if (!rs.next()) { 
19: throw new SecurityException(“User name or password incorrect”);
20: }
21: // Authenticated; proceed
22: } finally {
23: // …
24: }
25: }
26: }