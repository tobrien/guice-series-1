package com.discursive.example.student;

public interface Registrar {
	
	public boolean checkStudentStatus( Integer studentId );
	public Student registerStudent( String name, Integer credits );

}
