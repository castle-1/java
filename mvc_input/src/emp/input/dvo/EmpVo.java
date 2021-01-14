package emp.input.dvo;

public class EmpVo {
	private int empno;
	private String ename;
	private String job;
	private String mgr;
	private String hiredate;
	private String sal;
	private String comm;
	private String deptno;

	private String ddeptno;
	private String dname;
	private String loc;

	public EmpVo() {
	}

	public EmpVo(String ename, int empno, String job, String mgr, String hiredate, String sal, String comm,
			String deptno, String dname, String loc) {
		super();
		this.ename = ename;
		this.empno = empno;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public EmpVo(String ename, int empno, String job, String mgr, String hiredate, String sal, String comm,
			String deptno) {
		super();
		this.ename = ename;
		this.empno = empno;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;

	}

	public EmpVo(String ddeptno, String dname, String loc) {
		super();
		this.ddeptno = ddeptno;
		this.dname = dname;
		this.loc = loc;
	}

	public EmpVo(String ename, int empno) {
		this.ename = ename;
		this.empno = empno;
		}

	public EmpVo(String dname, String ddeptno) {
		this.dname = dname;
		this.ddeptno = ddeptno;
	}

	public String getDdeptno() {
		return ddeptno;
	}

	public void setDdeptno(String ddeptno) {
		this.ddeptno = ddeptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {

		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

}
