package bigdata3.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bigdata3.domain.Teacher;
import bigdata3.service.TeacherService;

@Component("/teacher/list")
public class TeacherListControl implements Controller {
  @Autowired TeacherService teacherService;
  
  @Override
  public String service(HttpServletRequest req, HttpServletResponse res) throws Exception {
    int pageNo = 1;
    int pageSize = 5;
    
    try { 
      pageNo = Integer.parseInt(req.getParameter("pageNo"));
    } catch (Exception e) {}
    
    try { 
      pageSize = Integer.parseInt(req.getParameter("pageSize"));
    } catch (Exception e) {}
    
    List<Teacher> list = teacherService.list(pageNo, pageSize);
    req.setAttribute("list", list);
    
    return "/teacher/list.jsp";
  }
}









