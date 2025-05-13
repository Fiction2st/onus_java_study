package com.onus.demo_crud.services;

import com.onus.demo_crud.dtos.EmployeeDTO;
import com.onus.demo_crud.dtos.EmployeeResponseDTO;
import com.onus.demo_crud.entities.Employees;
import com.onus.demo_crud.mapper.EmployeeMapper;
import com.onus.demo_crud.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;


    @Override
    public EmployeeResponseDTO createEmployee(EmployeeDTO employeeDTO) {
        return null;
    }

    @Override
    public EmployeeResponseDTO getEmployeeById(String employeeId) {
        return null;
    }

    @Override
    public List<EmployeeResponseDTO> getAllEmployees() {
        List<Employees> employees = employeeRepository.findAll();

        return employees.stream()
                .map(EmployeeMapper::mapToEmployeeResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteEmployeeById(String employeeId) {

    }

    @Override
    public EmployeeResponseDTO updateEmployee(String employeeId, EmployeeDTO employeeDTO) {
        return null;
    }
}
