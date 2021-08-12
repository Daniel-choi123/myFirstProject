package database;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		DBconnection connection = new DBconnection();
		
		
//		boolean isStudentThere = connection.isStudentExist("이준석");
//		if(isStudentThere) {
//			System.out.println("EXIST");
//		}
//		else {
//			System.out.println("not Exist");
//		}
		
		/*Student stu = new Student();
		stu = connection.getStudent("id");
		stu = connection.getStudent("classNo");
		stu = connection.getStudent("address");
		stu = connection.getStudent("gender");
		stu = connection.getStudent("year");
		stu = connection.getStudent("name");
		System.out.println(stu.id);
		System.out.println(stu.classNo);
		System.out.println(stu.address);
		System.out.println(stu.gender);
		System.out.println(stu.year);
		System.out.println(stu.name);*/
		List<Student> stuList = new ArrayList();
		stuList = connection.getStudentList();
		for (Student item : stuList) {
			System.out.println(item.id);
			System.out.println(item.address);
			System.out.println(item.classNo);
			System.out.println(item.gender);
			System.out.println(item.year);
			System.out.println(item.name);
			System.out.println("==================");
		}
	}

}
