package cn.k.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.k.domain.StudentDomain;
import cn.k.service.StudentService;
import cn.k.service.impl.StudentServiceImpl;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService service= (StudentService) classPathXmlApplicationContext.getBean(StudentServiceImpl.class);
//		StudentDomain sd = new StudentDomain();
//		List<StudentDomain> select = service.select(sd);
//		for(StudentDomain sdd:select){
//			System.out.println(sdd.toString());
//		}
		
		StudentDomain sd = new StudentDomain();
		sd.setName("hu");
		sd.setAge(22);
		sd.setId(0);
		
		service.inset(sd);
		
	}
}
