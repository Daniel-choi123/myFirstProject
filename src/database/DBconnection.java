package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBconnection {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	public String SQL;
	public DBconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul", "root", "jumi0821");
			st = con.createStatement();
			
		} catch(Exception e){
			System.out.println("Error : " + e.getMessage());
		}
	}
	public boolean isStudentExist(String name) {
		try {
			SQL = "select * from student where name = '" + name + "'";
			rs = st.executeQuery(SQL);
			if(rs.next()) {
				/*
				String names = rs.getString("name");
				String stid = rs.getString("id");
				String haknyeon = rs.getString("year");
				String sungStar = rs.getString("gender");
				String Jucow = rs.getString("address");
				
				System.out.println(stid);
				System.out.println(haknyeon);
				System.out.println(sungStar);
				System.out.println(Jucow);
				System.out.println(names);*/
								
				return true;
			}
			else {
				return false;
			}
		}catch (Exception e) {
			System.out.println("ERRORORRO");
			return false;
		}
		
	}
	
	public Student getStudent(String name) {
		Student stu = new Student();
	
		
		SQL = "select * from student where name = '" + "이준석" + "'";
		try {
			
			rs = st.executeQuery(SQL);
			if(rs.next()) {
				stu.id = rs.getInt("id");
				stu.name = rs.getString("name");
				stu.address = rs.getString("address");
				stu.classNo = rs.getInt("classNo");
				stu.gender = rs.getInt("gender");
				stu.year = rs.getInt("year");
			}
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
		
		return stu;
	}
	public List<Student> getStudentList(){
		List<Student> stuList = new ArrayList();
		
		SQL = "select * from student";
		try {
			rs = st.executeQuery(SQL);
			while(rs.next()) {
				Student stu = new Student();
				stu.id = rs.getInt("id");
				stu.name = rs.getString("name");
				stu.address = rs.getString("address");
				stu.classNo = rs.getInt("classNo");
				stu.gender = rs.getInt("gender");
				stu.year = rs.getInt("year");
				
				stuList.add(stu);
			}
			
		} catch (Exception e) {
			System.out.println("ListError" + e.getMessage());
		}
		
		return stuList;
	}
	
	public int addStudent(Student stud) {
		int effectedrow = 0;
		SQL ="insert into student (name, year, classNo, gender, address) values ('"
				+ stud.name + "'," +
				+ stud.year +","
				+ stud.classNo + ","
				+ stud.gender + "," 
				+ "'" + stud.address +"');";
		
		//System.out.print(SQL);
		try {
			effectedrow = st.executeUpdate(SQL);
		} catch (Exception e) {
			System.out.println("ADDING ERROR");
		}
		
		return effectedrow;
	}
	
	public int deleteStudent(Student stuId) {
		int deletedrow = 0;
		SQL = "delete from student where id = " + stuId.id;
		
		System.out.println(SQL);
		
		try {
			deletedrow  = st.executeUpdate(SQL);
		} catch (Exception e) {
			System.out.println("Deleting ERROR");
		}
		return deletedrow;
	}
	public int updateStudentAddress(Student stuId) {
		int updaterow = 0;
		SQL = "update student set address = " + "'" + stuId.address + "'" + "where id = "
				+ stuId.id + ";";
		System.out.println(SQL);
		
		try {
			updaterow = st.executeUpdate(SQL);
		} catch(Exception e) {
			System.out.println("UPDATING ERROR");
		}
		
		return updaterow;
	}

}
