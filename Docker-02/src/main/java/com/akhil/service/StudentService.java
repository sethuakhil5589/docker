package com.akhil.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.entity.StudentData;
import com.akhil.repo.IStudentRepo;

@Service
public class StudentService {
	@Autowired
	private IStudentRepo repo;
	
	public List<StudentData> fetchingData(){
		StudentData std1=new StudentData(1,"Akhil",23);
		StudentData std2=new StudentData(2,"Nikhil",33);
		StudentData std3=new StudentData(3,"Suresh",33);
		List<StudentData> sList=new ArrayList<>();
		sList.add(std3);
		sList.add(std2);
		sList.add(std1);
		return sList;
	}

}
