package com.onus.demo_crud.mapper;

import com.onus.demo_crud.dtos.EmployeeDTO;
import com.onus.demo_crud.dtos.EmployeeResponseDTO;
import com.onus.demo_crud.entities.Employee;

public class EmployeeMapper {
    public static Employee mapToEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setDepartment(employeeDTO.getDepartment());
        return employee;
    }

    public static EmployeeResponseDTO mapToEmployeeResponseDTO(Employee employee) {
        EmployeeResponseDTO employeeResponseDTO = new EmployeeResponseDTO();
        employeeResponseDTO.setId(employee.getId());
        employeeResponseDTO.setFirstName(employee.getFirstName());
        employeeResponseDTO.setLastName(employee.getLastName());
        employeeResponseDTO.setEmail(employee.getEmail());
        employeeResponseDTO.setDepartment(employee.getDepartment());
        return employeeResponseDTO;
    }
}
