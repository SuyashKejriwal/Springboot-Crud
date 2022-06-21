package com.example.springbootthymeleafcrud.service;

import com.example.springbootthymeleafcrud.entity.Employee;
import com.example.springbootthymeleafcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public void createEmployee(Employee employee){
        employeeRepository.save(employee);
    }



    public void deleteEmployee(Long employeeId){
        employeeRepository.deleteById(employeeId);
    }

    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).get();
    }
}
