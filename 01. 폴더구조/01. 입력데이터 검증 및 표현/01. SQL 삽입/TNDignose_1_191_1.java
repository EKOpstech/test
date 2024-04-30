1: import org.hibernate.Query
2: import org.hibernate.Session
3: ......
4: String name = request.getParameter(“name”); 
5: Query query = session.createQuery(“from Student where studentName = ‘” + name 
+ “’ “);