package com.onus.demo_crud.mapper;

import com.onus.demo_crud.dtos.EmployeeDTO;
import com.onus.demo_crud.dtos.EmployeeResponseDTO;
import com.onus.demo_crud.entities.Employees;

public class EmployeeMapper {
    public static Employees mapToEmployee(EmployeeDTO employeeDTO) {
        Employees employee = new Employees();
        employee.setId(employeeDTO.getId());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setDepartment(employeeDTO.getDepartment());
        return employee;
    }

    public static EmployeeResponseDTO mapToEmployeeResponseDTO(Employees employee) {
        EmployeeResponseDTO employeeResponseDTO = new EmployeeResponseDTO();
        employeeResponseDTO.setId(employee.getId());
        employeeResponseDTO.setFirstName(employee.getFirstName());
        employeeResponseDTO.setLastName(employee.getLastName());
        employeeResponseDTO.setEmail(employee.getEmail());
        employeeResponseDTO.setDepartment(employee.getDepartment());
        return employeeResponseDTO;
    }
}
