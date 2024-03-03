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
public class DepartmentDto {

    @Schema(description = "Department ID")
    private Long id;

    @Schema(description = "Name of the department")
    private String departmentName;

    @Schema(description = "Description of the department")
    private String departmentDescription;

    @Schema(description = "Code of the department")
    private String departmentCode;
}
