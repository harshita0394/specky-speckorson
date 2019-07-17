package com.core.tester;

import static com.app.utils.StudentUtil.populateData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import com.app.core.Student;
public class Test1 {

	public static void main(String[] args) {
		ArrayList<Student> studentList = populateData();
	//studentList.stream().filter(s->computeAge(s.getDob())>23).forEach(s->System.out.println(s));
	//	studentList.stream().filter(s->s.getSubject().equals("Java")).mapToDouble(s->s.getGpa()).average().getAsDouble();
	Comparator<Student> comp=(s1,s2)->s1.getDob().compareTo(s2.getDob());
		studentList.stream().sorted(comp).forEach(s->System.out.println(s));
	}
	public static int computeAge(LocalDate dob)
	{
		return dob.until(LocalDate.now()).getYears();
	}
	
	

}
