package com.app.utils;

import java.time.LocalDate;
import java.util.ArrayList;

import com.app.core.Student;

public class StudentUtil {

	public static ArrayList<Student> populateData(){
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("harsri3@gmail.com",10.00,"Java",LocalDate.parse("1994-04-03")));
		studentList.add(new Student("harsri4@gmail.com",9.00,"Java",LocalDate.parse("1993-04-03")));
		studentList.add(new Student("harsri5@gmail.com",8.00,"DotNEt",LocalDate.parse("1992-04-03")));
		studentList.add(new Student("harsri6@gmail.com",6.00,"Cpp",LocalDate.parse("1999-04-03")));
		return studentList;
	}
}
