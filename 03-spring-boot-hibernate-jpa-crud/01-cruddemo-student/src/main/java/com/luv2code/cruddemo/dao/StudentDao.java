package com.luv2code.cruddemo.dao;

import java.util.List;

import com.luv2code.cruddemo.entity.Student;

public interface StudentDao {
    // create
    void save(Student tehStudent);

    // read
    Student findById(Integer id);

    // query all
    List<Student> findAll();

    // find by last name
    List<Student> findByLastName(String thelastName);

    // update the table
    void update(Student thestudent);

    // delete the student
    void delete(Integer id);

    // delete all the student
    int deleteAll();
}
