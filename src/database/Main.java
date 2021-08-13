package database;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		DBconnection connection = new DBconnection();
		
		
//		boolean isStudentThere = connection.isStudentExist("케인");
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
//		List<Student> stuList = new ArrayList();
//		stuList = connection.getStudentList();
//		for (Student item : stuList) {
//			System.out.println(item.id);
//			System.out.println(item.address);
//			System.out.println(item.classNo);
//			System.out.println(item.gender);
//			System.out.println(item.year);
//			System.out.println(item.name);
//			System.out.println("==================");
//		}
		//ADD into
//		int result = 0;
//		Student stu = new Student();
//		stu.address="은평구";
//		stu.classNo = 1;
//		stu.gender = 0;
//		stu.name = "케인";
//		stu.year = 3;
//		result = connection.addStudent(stu);
//		System.out.println(stu.name);
		
		//Delete
//		int deleteResult = 0;
//		Student stu = new Student();
//		stu.id = 15;                                   //여기에 지우고 싶은 학생 아이디 입력
//		deleteResult = connection.deleteStudent(stu);
//		List<Student> stuList = new ArrayList();
//		stuList = connection.getStudentList();
//		for (Student item : stuList) {
//			System.out.println(item.id);
//			System.out.println(item.address);
//			System.out.println(item.classNo);
//			System.out.println(item.gender);
//			System.out.println(item.year);
//			System.out.println(item.name);
//			System.out.println("==================");
//		}
		
		//Update
//		int updateResult = 0;
//		Student stu = new Student();
//		stu.address = "깜빵";                            //여기에 바꿀 값 입력
//		stu.id = 8;                                     //바꿀 학생의 아이디 
//		updateResult = connection.updateStudentAddress(stu);
//		List<Student> stuList = new ArrayList();
//		stuList = connection.getStudentList();
//		for (Student item : stuList) {
//			System.out.println(item.id);
//			System.out.println(item.address);
//			System.out.println(item.classNo);
//			System.out.println(item.gender);
//			System.out.println(item.year);
//			System.out.println(item.name);
//			System.out.println("==================");
//		}

	}
}