package com.Omkar.services;

import com.Omkar.superclass.SuperDepartment;

public class HrDepartment extends SuperDepartment{
 public String departmentName() {
	 return "Hr Department";
 }
 
 public String getTodaysWork() {
	 return "Fill today's orksheet and mark your attendance";
 }
 
 public String getWorkDeadline() {
	 return "Complete by EOD";
 }
 
 public String doActivity() {
	 return "team Lunch";
 }
}
