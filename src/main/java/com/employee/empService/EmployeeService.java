package com.employee.empService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.empDao.EmployeeDao;
import com.employee.empEntity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao Ed;
	public String postSingleObject(Employee e) {
		// TODO Auto-generated method stub
		return Ed.postSingleObject(e);
	}
	public String ListObject(List<Employee> e) {
		// TODO Auto-generated method stub
		return Ed.ListObject(e);
	}
	public Employee getSingleObject(int x) {
		// TODO Auto-generated method stub
		return Ed.getSingleObject(x);
	}
	public List<Employee> getObject() {
		// TODO Auto-generated method stub
		return Ed.getObject();
	}
	public String deleteById(int a) {
		// TODO Auto-generated method stub
		return Ed.deleteById(a); 
	}
	public String deleteAll() {
		// TODO Auto-generated method stub
		return Ed.deleteAll();
	}
	public String updateObject(Employee e,int x) {
		// TODO Auto-generated method stub
		return Ed.updateObject(e,x);
	}
	public String updateName(int x, Employee e) {
		// TODO Auto-generated method stub
		return Ed.updateName(x,e); 
	}
	public String delete(int x) {
		// TODO Auto-generated method stub
		return Ed.delete(x);
	}
	public Page getEmployees(Pageable x) {
		// TODO Auto-generated method stub
		return Ed.getEmployees(x);
	}

}
