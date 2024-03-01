package de.inosofttech.employeeservice.service;

import de.inosofttech.employeeservice.dto.APIResponseDto;
import de.inosofttech.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
