package com.mohamedfathidev.consolesystem.dao;

import com.mohamedfathidev.consolesystem.entity.Student;
import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
    void update(Student theStudent);
    void delete(Integer id);
    int deleteAll();
}
