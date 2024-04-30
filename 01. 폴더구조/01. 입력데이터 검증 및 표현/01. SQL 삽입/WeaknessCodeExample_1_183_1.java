1: import org.hibernate.Query
2: import org.hibernate.Session 
3: ......
4: //외부로부터 입력받은 값을 검증 없이 사용할 경우 안전하지 않다.
5: String name = request.getParameter("name");
6: //Hiberate는 기본으로 PreparedStatement를 사용하지만, 파라미터 바인딩 없이 사용 할 경우 
안전하지 않다.
7: Query query = session.createQuery("from Student where studentName = '" + name
+ "' ");