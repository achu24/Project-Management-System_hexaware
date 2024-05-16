package com.java.service;

import java.util.Scanner;

import com.java.dao.ProjectRepositoryImpl;
import com.java.model.Task;

public class taskService {
	
	Scanner sc ;
	ProjectRepositoryImpl pri;
	
	public taskService() {
		sc=new Scanner(System.in);
		pri=new ProjectRepositoryImpl();
	}
	public void createTask() {
		Task t = new Task();
		
		
		System.out.println("Enter Task Id : ");
		t.setTask_id(sc.nextInt());
		
		System.out.println("Enter Task name : ");
		sc.nextLine();
		t.setTask_name(sc.nextLine());
		
		System.out.println("Enter Project Id : ");
		t.setProject_id(sc.nextInt());
		
		System.out.println("Enter Employee Id : ");
		t.setEmployee_id(sc.nextInt());
		
		System.out.println("Enter Status (Assigned, started, completed)");
		sc.nextLine();
	    t.setStatus(sc.nextLine());
	    
	    pri.createTask(t);
		
	}
	public void getAllTasks() {

		System.out.println("Enter Employee ID to show list  : ");
		int empId=sc.nextInt();
		
		System.out.println("Enter Project ID to show list  : ");
		int projectId=sc.nextInt();
		
		pri.getAllTasks(empId, projectId);
		
		
	}

}
