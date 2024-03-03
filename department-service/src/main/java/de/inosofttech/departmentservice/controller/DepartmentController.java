package de.inosofttech.departmentservice.controller;

import de.inosofttech.departmentservice.dto.DepartmentDto;
import de.inosofttech.departmentservice.service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
@Tag(name = "Department Controller", description = "Operations pertaining to departments")
public class DepartmentController {

    private DepartmentService departmentService;

    @Operation(summary = "Save a new department")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Department created"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "409", description = "Department already exists")
    })
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Department object to be saved", required = true) @RequestBody DepartmentDto departmentDto) {
        DepartmentDto saveDepartmentDto = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(saveDepartmentDto, HttpStatus.CREATED);
    }

    @Operation(summary = "Get department by department code")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Department found"),
            @ApiResponse(responseCode = "404", description = "Department not found")
    })
    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartment(@Parameter(description = "Code of the department to be retrieved", required = true) @PathVariable("department-code") String departmentCode) {
        DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
        if (departmentDto != null) {
            return new ResponseEntity<>(departmentDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
