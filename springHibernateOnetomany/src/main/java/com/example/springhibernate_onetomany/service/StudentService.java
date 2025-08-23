package com.example.springhibernate_onetomany.service;

import org.springframework.stereotype.Service;

import com.example.springhibernate_onetomany.dao.IStudentDao;
import com.example.springhibernate_onetomany.dao.StudentDaoImpl;
import com.example.springhibernate_onetomany.entity.Student;

@Service
public class StudentService{
	private final IStudentDao dao;

	public StudentService(IStudentDao dao) {
		super();
		this.dao = dao;
	}
	
	
	public void saveData(Student student)
	{
		dao.saveStudent(student);
	}
	
	public Student getStudent(Long id)
	{
		
		return dao.getStudent(id);
	}
	
}