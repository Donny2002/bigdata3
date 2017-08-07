package bigdata3.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import bigdata3.dao.mysql.MemberDaoImpl;
import bigdata3.dao.mysql.TeacherDaoImpl;
import bigdata3.service.impl.TeacherServiceImpl;
import bigdata3.util.DBConnectionPool;

@WebListener
public class ContextLoaderListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    // 웹 애플리케이션이 시작될 때 DAO를 생성하여 ServletContext 보관소에 저장한다.
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/studydb";
    String jdbcUsername = "study";
    String jdbcPassword = "1111";
    
    try {
      DBConnectionPool conPool = new DBConnectionPool(
          jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
      MemberDaoImpl memberDao = new MemberDaoImpl(conPool);
      TeacherDaoImpl teacherDao = new TeacherDaoImpl(conPool);
      
      TeacherServiceImpl teacherService = new TeacherServiceImpl();
      teacherService.setMemberDao(memberDao);
      teacherService.setTeacherDao(teacherDao);
      
      ServletContext sc = sce.getServletContext();
      sc.setAttribute("teacherService", teacherService);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
  }

}
