package com.onus.demo_crud.repositories;

import com.onus.demo_crud.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
// 해당 인터페이스가 Employee 테이블을 의미한다.
    boolean existsByEmail(String email);
    Employee findByEmail(String email);
}
