< ProjectCommentDAO.java > 
131:public ArrayList getProjectCommentTblByWhere(String where) { 
132: String sql_ = 
this.getMessageSourceAccessor().getMessage(“ProjectCommentDao.
getProjectCommentTbl”);
133: ArrayList ret = new ArrayList();
134: sql_ += “ “ + where;
135:
136: try { 
137: JdbcTemplate template_ = this.getJdbcTemplate(); 
138: List tmp = template_.query(sql_, new ProjectCommentRowMapper());
139: ret = Util.trimToResize(tmp);
140: } catch (DataAccessException e) {