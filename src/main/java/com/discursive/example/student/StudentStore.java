package com.discursive.example.student;



public interface StudentStore {
	public boolean exists(Integer id);
	public Student load(Integer id);
	public Student save(Student p);
}
