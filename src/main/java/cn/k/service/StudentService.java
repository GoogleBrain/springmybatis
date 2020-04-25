package cn.k.service;

import java.util.List;

import cn.k.domain.StudentDomain;

public interface StudentService {
	List<StudentDomain>select(StudentDomain student);

	
	void inset(StudentDomain student);
}
