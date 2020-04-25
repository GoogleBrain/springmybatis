package cn.k.mapper;

import java.util.List;

import cn.k.domain.StudentDomain;

public interface StudentDao {
	
	List<StudentDomain>select(StudentDomain student);

	
	void inset(StudentDomain student);
}
