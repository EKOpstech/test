< projectDetail.jsp >
14: <% 
15: String pid = request.getParameter(“projectid”) == null ? “” : 
request.getParame- ter(“projectid”); 
16:MashupProjectDao mashupDao = (MashupProjectDao)
DAOHelper.getMashupPro- jectDao(application); 
17: ProjectCommentDao commentDao = (ProjectCommentDao)
DAOHelper.getProject- CommentDao(application); 
18: MashupProjectTbl prjTbl = mashupDao.getMashupProjectTbl(pid); 
19: ArrayList commentList =
commentDao.getProjectCommentTblByWhere(“where projectid=” + pid + “ order by 
writedate desc”); 
20: String loginID = session.getAttribute(“userid”) == null ? “” : (String)
session.getAt- tribute(“userid”); 
21: int category = prjTbl.getCategory(); 
22: String categoryStr = “”;
