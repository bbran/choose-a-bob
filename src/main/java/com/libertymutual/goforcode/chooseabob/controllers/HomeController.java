package com.libertymutual.goforcode.chooseabob.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.chooseabob.models.Project;
import com.libertymutual.goforcode.chooseabob.models.Student;
import com.libertymutual.goforcode.chooseabob.repositories.ProjectRepository;
import com.libertymutual.goforcode.chooseabob.repositories.StudentRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	
	private ProjectRepository projectRepo;
	private StudentRepository studentRepo;
	
	public HomeController(ProjectRepository projectRepo, StudentRepository studentRepo)	{
		this.projectRepo = projectRepo;
		this.studentRepo = studentRepo;
		
		Project project1 = new Project("Project 1");
		Project project2 = new Project("Project 2");
		Project project3 = new Project("Project 3");
		projectRepo.save(project1);
		projectRepo.save(project2);
		projectRepo.save(project3);
		
		Student student1 = new Student("Bob 1");
		Student student2 = new Student("Bob 2");
		Student student3 = new Student("Bob 3");
		Student student4 = new Student("Bob 4");
		studentRepo.save(student1);
		studentRepo.save(student2);
		studentRepo.save(student3);
		studentRepo.save(student4);
	}
	
	@GetMapping("")
	public ModelAndView index()	{
		ModelAndView mv = new ModelAndView("home/index");
		List<Student> students = studentRepo.findAll();
		System.out.println(students);
		mv.addObject("students", students);
		return mv;
	}
	
	@PostMapping("/selectStudent")
	public ModelAndView selectStudent(long studentId)	{
		ModelAndView mv = new ModelAndView("home/index");
		
		
	}

}
