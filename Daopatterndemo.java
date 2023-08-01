package com.Dao;

public class Daopatterndemo {

	public static void main(String[] args) 
	{
		StudentDaoimpl d =new StudentDaoimpl();
		
		for(Student s : d.getAllStudent())
		{
			System.out.println("Roll no : "+s.getRollno());
			System.out.println("Name : "+s.getName());
		}

	}

}
