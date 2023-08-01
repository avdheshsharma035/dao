package com.Dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoimpl implements StudentDao
{
	List<Student> stud;
	
	public StudentDaoimpl()
	{
		stud = new ArrayList<Student>();
		Student s1 = new Student(1, "Robert");
		Student s2 = new Student(2, "John");
		stud.add(s1);
		stud.add(s2);
	}

	@Override
	public List<Student> getAllStudent() 
	{
			return stud;     //RETRIEVE DATA
	}

	@Override
	public Student getstudent(int rollno) {
		return null;                            //INSERT DATA 
	}

	@Override
	public void deletestudent(Student stud)   //DELETE DATA
	{
		
	}

	@Override
	public void updatestudent(Student stud)   //UPDATE DATA 
	{
			
	}

}
