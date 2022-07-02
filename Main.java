package com.Omkar.main;


import com.Omkar.services.AdminDepartment;
import com.Omkar.services.HrDepartment;
import com.Omkar.services.TechDepartment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment Ad = new AdminDepartment();
		HrDepartment Hr = new HrDepartment();
		TechDepartment Te = new TechDepartment();
		
		System.out.println("Welcome to " + Ad.departmentName());
		System.out.println(Ad.getTodaysWork());
		System.out.println(Ad.getWorkDeadline());
		System.out.println(Ad.isTodayHoliday());
		System.out.println();
		System.out.println("Welcome to " + Hr.departmentName());
		System.out.println(Hr.doActivity());
		System.out.println(Hr.getTodaysWork());
		System.out.println(Hr.getWorkDeadline());
		System.out.println(Hr.isTodayHoliday());
		System.out.println();
		System.out.println("Welcome to " + Te.departmentName());
		System.out.println(Te.getTodaysWork());
		System.out.println(Te.getWorkDeadline());
		System.out.println(Te.getStackInformation());
		System.out.println(Te.isTodayHoliday());

}
}

