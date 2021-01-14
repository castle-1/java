package emp.input.commend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.input.dao.EmpDAO;



public class SuccessCommend implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		int empno = Integer.parseInt(request.getParameter("empno")) ;
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		int mgr = Integer.parseInt(request.getParameter("mgr"));
		String hiredate = request.getParameter("hiredate");
		int sal = Integer.parseInt(request.getParameter("sal"));
		int comm = Integer.parseInt(request.getParameter("comm"));
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		
		EmpDAO dao = new EmpDAO();
		dao.write(empno, ename, job, mgr, hiredate, sal, comm, deptno);
		
		
	}
	

}
