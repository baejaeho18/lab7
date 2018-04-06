package edu.handong.csee.java.lab07.prob3;

public class Attendance {
	private String name = "";
	private int year = 0;
	private String student_id = "";
	private int missed = 0;

	//Constructors
	public Attendance()
	{
	this.name = "Null";
	this.year = 0;
	this.student_id = "Null";
	this.missed = 0;
	}

	public Attendance(String name, int year, String student_id, int missed)
	{
	this.name = name;
	this.year = year;
	this.student_id = student_id;
	this.missed = missed;
	}
}
