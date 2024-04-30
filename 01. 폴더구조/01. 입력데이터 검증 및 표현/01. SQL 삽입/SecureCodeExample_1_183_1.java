1: import org.hibernate.Query 
2: import org.hibernate.Session 
3: ...... 
4: String name = request.getParameter("name");
5: //1. 파라미터 바인딩을 위해 ?를 사용한다.
6: Query query = session.createQuery("from Student where studentName = ? ");
7: //2. 파라미터 바인딩을 사용하여 외부 입력값에 의해 쿼리 구조 변경을 못하게 사용하였다.
8: query.setString(0, name);