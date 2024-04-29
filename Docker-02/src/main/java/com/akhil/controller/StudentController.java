package com.akhil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.entity.StudentData;
import com.akhil.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	@GetMapping("/fetch")
	public List<StudentData> fetchingData(){
		return service.fetchingData();
	}
}
