package com.discursive.example.student.store;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.inject.Singleton;

import com.discursive.example.student.Student;
import com.discursive.example.student.StudentStore;

@Singleton
public class DummyStudentStore implements StudentStore {
	
	private final Map<Integer,Student> studentMap;
	
	public DummyStudentStore() {
		studentMap = new HashMap<Integer, Student>();
	}
	
	public boolean exists(Integer id) {
		return studentMap.containsKey( id );
	}
	
	public Student load(Integer id) {
		Student s = studentMap.get(id);
		return s;
	}

	public Student save(Student p) {
		if( p.getId() == null ) {
			p.setId( studentMap.size() + 1 );
		}
		studentMap.put( p.getId(), p );	
		return p;
	}

}
