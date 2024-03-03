package de.inosofttech.employeeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {

    @Schema(description = "Employee information")
    private EmployeeDto employee;

    @Schema(description = "Department information")
    private DepartmentDto department;

    @Schema(description = "Organization information")
    private OrganizationDto organization;

}
