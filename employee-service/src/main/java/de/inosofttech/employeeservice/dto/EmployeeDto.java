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
public class EmployeeDto {

    @Schema(description = "Employee ID")
    private Long id;

    @Schema(description = "Employee's first name")
    private String firstName;

    @Schema(description = "Employee's last name")
    private String lastName;

    @Schema(description = "Employee's email")
    private String email;

    @Schema(description = "Department code of the employee")
    private String departmentCode;

    @Schema(description = "Organization code of the employee")
    private String organizationCode;

}
