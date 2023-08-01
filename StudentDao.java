package com.Dao;
import java.util.*;
public interface StudentDao 
{
	public List<Student>getAllStudent();
	public Student getstudent(int rollno);
	public void deletestudent(Student stud);
	public void updatestudent(Student stud);

}
