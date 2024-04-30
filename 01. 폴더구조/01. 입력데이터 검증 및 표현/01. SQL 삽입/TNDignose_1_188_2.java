1: … 
2: public class U9102 implements ContactDAO { 
3: public List<Contact> listContacts() { 
4: PersistenceManager pm = getPersistenceManagerFactory().getPersistenceMan ager(); 
5: String query = “select from “ + Contact.class.getName(); 
6: try { 
7: Properties props = new Properties(); 
8: String fileName = “contacts.txt”;
9: FileInputStream in = new FileInputStream(fileName); 
10:
11: if (in != null) { 
12: props.load(in); 
13: in.close(); 
14: }
15: // 외부로부터 입력을 받는다 
16: String name = props.getProperty(“name”); 
17: if (name != null) { 
18: query += “ where name = ‘” + name + “’”; 
19: }
20: } catch (IOException e) { 
21: … 
22: } 
23: // 외부입력 값이 JDO 객체의 인자로 사용된다. 
24: return (List<Contact>) pm.newQuery(query).execute(); 
25: }
26: }
27: …