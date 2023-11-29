package hello.servlet.web.servletmvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet (name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp"; //WEB-INF를 사용하면 외부에서 바로 불러지지 않고 controller(servlet)를 거쳐 불러짐
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);//controller에서 view로 넘어갈 때 사용
        dispatcher.forward(request, response); //다른 servlet이나 jsp로 이동하는 기능, 서버 내부에서 다시 호출
    }
}
