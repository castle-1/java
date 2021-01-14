package emp.input.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp.input.dvo.EmpVo;

public class EmpDAO {
	
	DataSource dataSource;
	
	public EmpDAO() {

		try {
	         Context context = new InitialContext();
	         dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
	      } catch (Exception e) {
	         // TODO: handle exception
	         e.printStackTrace();
	      }
	}
	
	
	public ArrayList<EmpVo> managerSelect() { //html에서 select에서 매니저 출력
		ArrayList<EmpVo> dtos = new ArrayList<EmpVo>();

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String query = "select m.EMPNO ,m.ename as manage from emp e , emp m where e.mgr = m.empno group by m.ename ,m.EMPNO";

		try {

			 con = dataSource.getConnection();
			 stmt = con.prepareStatement(query);
	         rs = stmt.executeQuery(query);

			while (rs.next()) {
				 String name = rs.getString("manage");
		         int empno = rs.getInt("empno");
				
				EmpVo eDto = new EmpVo(name,empno);
				dtos.add(eDto); // 어레이 리스트로 관리
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {

				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

		return dtos;

	}
	public ArrayList<EmpVo> deptSelect() {// dept 테이블에서 dname, deptno가져오기
		ArrayList<EmpVo> dtos = new ArrayList<EmpVo>();

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String query = "select dname,deptno from dept GROUP BY dname,deptno";

		try {

			 con = dataSource.getConnection();
			 stmt = con.prepareStatement(query);
	         rs = stmt.executeQuery(query);

			while (rs.next()) {
				 String dname = rs.getString("dname");
		         String deptno = rs.getString("deptno");
				
				EmpVo eDto = new EmpVo(dname,deptno);
				dtos.add(eDto); // 어레이 리스트로 관리
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {

				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

		return dtos;

	}
	
	
	
	public void write(int empno,String ename, String job, int mgr, String hiredate,int sal,int comm,int deptno) {
		//html에 입력한 값을 db에 업데이트하기
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String query = "insert into emp (empno, ename, job, mgr,hiredate,sal,comm,deptno)values (?,?,?,?,?,?,?,?)";
		try {
			connection = dataSource.getConnection();
			
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, empno);
			preparedStatement.setString(2, ename);
			preparedStatement.setString(3, job);
			preparedStatement.setInt(4, mgr);
			preparedStatement.setString(5, hiredate);
			preparedStatement.setInt(6, sal);
			preparedStatement.setInt(7, comm);
			preparedStatement.setInt(8, deptno);
			
			int rn = preparedStatement.executeUpdate();
			System.out.println(rn);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}

	
	public ArrayList<EmpVo> empJoindept() { //emp와 dept 조인해서 출력
		ArrayList<EmpVo> dtos = new ArrayList<EmpVo>();

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String query = "select emp.*,dept.dname,dept.loc from emp,dept WHERE emp.deptno=dept.deptno ";
		try {

			 con = dataSource.getConnection();
			 stmt = con.prepareStatement(query);
	         rs = stmt.executeQuery(query);

			while (rs.next()) {
				String name = rs.getString("ename");
				int empno = rs.getInt("empno");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				String hiredate = rs.getString("hiredate");
				String sal = rs.getString("sal");
				String comm = rs.getString("comm");
				String deptno = rs.getString("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				EmpVo eDto = new EmpVo(name, empno, job, mgr, hiredate, sal, comm, deptno,dname,loc);
				dtos.add(eDto); // 어레이 리스트로 관리
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {

				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

		return dtos;

	}

}
