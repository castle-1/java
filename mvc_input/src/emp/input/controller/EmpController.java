package emp.input.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.input.commend.BCommand;
import emp.input.commend.SuccessCommend;

/**
 * Servlet implementation class EmpController
 */
@WebServlet("*.do")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("actionDo");
		
		request.setCharacterEncoding("utf-8");
		
		String viewPage = null; //view단에 어떤 페이지를 보여줄지 정하는 변수
		BCommand command = null; // 데이타 베이스로부터 로직수행 dao에게 잡업을 시키기 위한 커맨드
 		
		String uri = request.getRequestURI(); //contextpath + 결로
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());// uri에서 contextPath 앞까지 자른다.
		
		System.out.println(uri);
		System.out.println(conPath);
		System.out.println(com);
		
		if(com.equals("/input_view/success.do")) {//html에서 입력한 데이터 db에 업데이트
			command = new SuccessCommend();
			command.execute(request, response);
			viewPage = "success.jsp";
		}else if(com.equals("/input_view/list.do")) {// list.jsp이동
			viewPage = "list.jsp";
		}else if(com.equals("/input_view/inputInform.do")) {//inputInform.jsp이동
			viewPage = "inputInform.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage); //포워딩
		dispatcher.forward(request, response);
		
		
	}
	
	

}
