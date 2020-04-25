package cn.k.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.k.domain.StudentDomain;
import cn.k.mapper.StudentDao;
import cn.k.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<StudentDomain> select(StudentDomain student) {
		return studentDao.select(student);
	}

	@Override
	public void inset(StudentDomain student) {
		studentDao.inset(student);
		studentDao.inset(student);
	}

}
