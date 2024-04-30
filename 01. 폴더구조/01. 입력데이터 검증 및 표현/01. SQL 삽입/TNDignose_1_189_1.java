1: public class U9103 implements ServletContextListener { 
2: public List<?> getAllItemsInWildcardCollection() { 
3: EntityManager em = getEntityManager(); 
4: List<U9103> r_type = null; 
5: try {
6: Properties props = new Properties(); 
7: String fileName = “conditions.txt”; 
8: FileInputStream in = new FileInputStream(fileName); 
9: props.load(in);
10: // 외부로부터 입력을 받는다. 
11: String id = props.getProperty(“id”); 
12: // 외부 입력 값이 query의 인자로 사용이 된다. 
13: Query query = em.createNativeQuery(“SELECT OBJECT(i) FROM Item i WHERE 
i.itemID > “ + id); 
14: List<U9103> items = query.getResultList(); 
15: …
16: return r_type;
17: }
18: …