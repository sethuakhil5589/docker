package com.akhil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhil.entity.StudentData;

public interface IStudentRepo extends JpaRepository<StudentData, Integer> {

}
