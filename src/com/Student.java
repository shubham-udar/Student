package com;

public class Student {
	
	private int id;
	
	private String Name;
	
	private float marks;
	
	
	public void demo()
	{
		System.out.println("Demo");
	}

	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setMarks(float marks)
	{
		this.marks = marks;
	}
	
	public float getMarks()
	{
		return marks;
	}
}
