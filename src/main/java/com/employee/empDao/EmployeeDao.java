package com.employee.empDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.empEntity.Employee;
import com.employee.empRepository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository Er;
	public String postSingleObject(Employee e) {
		// TODO Auto-generated method stub
		Er.save(e);
		return "Post Single Successfully";
	}
	public String ListObject(List<Employee> e) {
		// TODO Auto-generated method stub
		Er.saveAll(e);
		return "Post List Successfully";
	}
	public Employee getSingleObject(int x) {
		// TODO Auto-generated method stub
		Employee x1=Er.findById(x).get();
		return x1; 
	}
	public List<Employee> getObject() {
		// TODO Auto-generated method stub
		return Er.findAll(); 
	}
	public String deleteById(int a) {
		// TODO Auto-generated method stub
		Er.deleteById(a); 
		return "Delete by Id Successfully";
	}
	public String deleteAll() {
		// TODO Auto-generated method stub
		Er.deleteAll();
		return "Delete All Successfully";
	}
	public String updateObject(Employee e,int x) {
		// TODO Auto-generated method stub
		Employee a=Er.findById(x).get();
		a.setName(e.getName());
		a.setSalary(e.getSalary());
		a.setExperience(e.getExperience());
		a.setGender(e.getGender());
		Er.save(a);
		return "Update Successfully";
	}
	public String updateName(int x, Employee e) {
		// TODO Auto-generated method stub
		Employee a=Er.findById(x).get();
		a.setName(e.getName());
		Er.save(a);
		return "Update Successfully";
	}
	public String delete(int x) {
		// TODO Auto-generated method stub
		Er.deleteById(x);
		return "delete Successfully";
	}

}
