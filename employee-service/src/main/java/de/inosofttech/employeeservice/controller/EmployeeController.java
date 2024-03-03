package de.inosofttech.employeeservice.controller;

import de.inosofttech.employeeservice.dto.APIResponseDto;
import de.inosofttech.employeeservice.dto.EmployeeDto;
import de.inosofttech.employeeservice.entity.Employee;
import de.inosofttech.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
@Tag(name = "Employee Controller", description = "Operations pertaining to employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Operation(summary = "Save a new employee")
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto employee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @Operation(summary = "Get employee by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Employee found"),
            @ApiResponse(responseCode = "404", description = "Employee not found")
    })
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEmployee(
            @Parameter(description = "ID of the employee to be retrieved", required = true)
            @PathVariable("id") Long employeeId) {
        APIResponseDto apiResponseDto = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
