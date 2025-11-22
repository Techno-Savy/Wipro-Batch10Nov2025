package com.wipro.onetomany.service;

import org.springframework.stereotype.Service;
import com.wipro.onetomany.dao.IStudentDao;
import com.wipro.onetomany.entity.Student;

@Service
public class StudentService {

	// If you have interface with implementation class(Concrete class) then the proxy implements the interface not the concrete class
	
    private final IStudentDao dao;

    public StudentService(IStudentDao dao) {   
        this.dao = dao;
    }

    public void saveData(Student student) {
        dao.saveStudent(student);
    }

    public Student getStudent(Long id) {
        return dao.getStudent(id);
    }
}
