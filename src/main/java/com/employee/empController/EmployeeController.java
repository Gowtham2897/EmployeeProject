 package com.employee.empController;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.empEntity.Employee;
import com.employee.empService.EmployeeService;

@CrossOrigin("*")
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService Es;
	
	static Logger log=Logger.getLogger(EmployeeController.class);
	
	@PostMapping(value="/postSingleObject")
	public String postSingleObject(@RequestBody Employee e) {
		PropertyConfigurator.configure("Employeelog.properties");
		log.info(Es.postSingleObject(e));
		return Es.postSingleObject(e); 
	}
	
	@PostMapping(value="/postListObject")
	public String ListObject(@RequestBody List<Employee> e) {
		return Es.ListObject(e); 
	}
	
	@GetMapping(value="/getSingleObject/{x}")
	public Employee getSingleObject(@PathVariable int x) {
		return Es.getSingleObject(x); 
	}
	
	@GetMapping(value="/getAllObject")
	public List<Employee> getObject() {
		return Es.getObject(); 
	}
	
	@DeleteMapping(value="/deleteById/{a}")
	public String deleteById(@PathVariable int a) {
		return Es.deleteById(a); 
	}
	@DeleteMapping(value="/deleteAll")
	public String deleteAll() {
		return Es.deleteAll(); 
	}
	@PutMapping(value="/update/{x}")
	public String updateObject(@RequestBody Employee e,@PathVariable int x) {
		return Es.updateObject(e,x);
	}
	@PatchMapping(value="/updateName/{x}")
	public String updateName(@PathVariable int x,@RequestBody Employee e) {
		return Es.updateName(x,e); 
	}
	@DeleteMapping(value="/deleteById/{x}")
	public String delete(@PathVariable int x) {
		return Es.delete(x); 
	}
	@GetMapping("/employeespage")
    public Page getEmployees( @PageableDefault(page = 0, size = 3) Pageable x) {
        return Es.getEmployees(x);
    }

}
