package com.te.employeemanagementsystem;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeePrimaryMain {

	public static void main(String[] args) {
		// creating 1st employee and assigning values
		EmployeePrimaryInfo employeePrimaryInfo = new EmployeePrimaryInfo();
		employeePrimaryInfo.setEmpAge(23);
		employeePrimaryInfo.setEmpBloodGroup("o+");
		employeePrimaryInfo.setEmpDeptNo(5);
		employeePrimaryInfo.setEmpDesignation("production");
		employeePrimaryInfo.setEmpDob("20/01/1998");
		employeePrimaryInfo.setEmpEmail("xyz@gmail.com");
		employeePrimaryInfo.setEmpGender("male");
		employeePrimaryInfo.setEmpId(2345);
		employeePrimaryInfo.setEmpMaritalStatus("single");
		employeePrimaryInfo.setEmpName("ajay");

		// creating 2nd employee and assigning values
		EmployeePrimaryInfo employeePrimaryInfo1 = new EmployeePrimaryInfo();
		employeePrimaryInfo1.setEmpAge(234);
		employeePrimaryInfo1.setEmpBloodGroup("o++");
		employeePrimaryInfo1.setEmpDeptNo(54);
		employeePrimaryInfo1.setEmpDesignation("production1");
		employeePrimaryInfo1.setEmpDob("20/01/1999");
		employeePrimaryInfo1.setEmpEmail("xyza@gmail.com");
		employeePrimaryInfo1.setEmpGender("female");
		employeePrimaryInfo1.setEmpId(23452);
		employeePrimaryInfo1.setEmpMaritalStatus("notsingle");
		employeePrimaryInfo1.setEmpName("radha");
		
		// creating 1st address and assigning ALL values
		EmployeeAddressInfo addressInfo = new EmployeeAddressInfo();
		addressInfo.setAddressType("temporary");
		addressInfo.setCountry("india");
		addressInfo.setHouseNo("124");
		addressInfo.setLocality("sector 7");
		addressInfo.setPincode(832104);
		addressInfo.setState("bihar");
		addressInfo.setStreetName("cross 4");
		addressInfo.setEmployeePrimaryInfo(employeePrimaryInfo);

		// creating 2nd address and assigning ALL values
		EmployeeAddressInfo addressInfo1 = new EmployeeAddressInfo();
		addressInfo1.setAddressType("permanent");
		addressInfo1.setCountry("usa");
		addressInfo1.setHouseNo("321");
		addressInfo1.setLocality("sector 9");
		addressInfo1.setPincode(879034);
		addressInfo1.setState("xyz");
		addressInfo1.setStreetName("cross 8");
		addressInfo1.setEmployeePrimaryInfo(employeePrimaryInfo);

		// creating list of address and assigning values
		ArrayList<EmployeeAddressInfo> addressInfos = new ArrayList<EmployeeAddressInfo>();
		addressInfos.add(addressInfo);
		addressInfos.add(addressInfo1);
		
		// created list (both address) assigned to both employee
		employeePrimaryInfo.setEmpAddressInfos(addressInfos);
		employeePrimaryInfo1.setEmpAddressInfos(addressInfos);
		
		// creating 1st skill
		EmployeeSkillInfo employeeSkillInfo=new EmployeeSkillInfo();
		employeeSkillInfo.setSkill("java");

		// creating 2nd skill
		EmployeeSkillInfo employeeSkillInfo1=new EmployeeSkillInfo();
		employeeSkillInfo1.setSkill("sql");
		
		// creating list of both skill
		ArrayList<EmployeeSkillInfo> skillInfos = new ArrayList<>();
		skillInfos.add(employeeSkillInfo);
		skillInfos.add(employeeSkillInfo1);
		
		// both skill given to both employee
		employeePrimaryInfo.setEmpSkillInfo(skillInfos);
		employeePrimaryInfo1.setEmpSkillInfo(skillInfos);
		
		// creating list of both employee
		ArrayList<EmployeePrimaryInfo> skillInfo=new ArrayList();
		skillInfo.add(employeePrimaryInfo);
		skillInfo.add(employeePrimaryInfo1);
		
		//both employee given to one skill
		employeeSkillInfo.setSkillInfo(skillInfo);
		
		//both employee given to another skill
		employeeSkillInfo1.setSkillInfo(skillInfo);
		
		
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();

		createEntityManager.persist(employeePrimaryInfo);

		transaction.commit();
	}
}
