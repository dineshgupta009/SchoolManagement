package com.SchoolMgmt.Service;

import com.SchoolMgmt.Entity.Student;
import com.SchoolMgmt.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService{

    @Autowired
    private StudentRepository repository;
    @Override
    public List<Student> getAllStudent() {
        return repository.findAll();
    }
}
