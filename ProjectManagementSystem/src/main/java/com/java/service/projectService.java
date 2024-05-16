package com.java.service;

import java.util.Scanner;


import com.java.dao.ProjectRepositoryImpl;
import com.java.exception.ProjectNotFoundException;

import com.java.model.Project;

public class projectService {
	
	Scanner sc ;
	ProjectRepositoryImpl pri;
	
	public projectService() {
		sc=new Scanner(System.in);
		pri=new ProjectRepositoryImpl();	
	}
	
	public void createProject() {
		
		Project p=new Project();
		
		System.out.println("Enter project Id : ");
		p.setId(sc.nextInt());
		
		System.out.println("Enter Project Name : ");
		sc.nextLine();
		p.setProjectName(sc.nextLine());
		
		System.out.println("Enter Discription : ");
		p.setDescription(sc.nextLine());
	
		System.out.println("Enter Starting date : ");
		p.setStart_date(sc.nextLine());
		
		System.out.println("Enter Status(started/dev/build/test/deployed) : ");
		p.setStatus(sc.nextLine());
		
		System.out.println(" project details added ");
		
		pri.createProject(p);
		
	}
	
	public void deleteProject() throws ProjectNotFoundException{
		int userId;
		System.out.println("Enter Project ID to delete : ");
		userId=sc.nextInt();
		pri.deleteProject(userId);
	}
	}
