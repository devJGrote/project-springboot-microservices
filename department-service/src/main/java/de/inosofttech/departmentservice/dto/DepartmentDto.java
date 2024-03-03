package de.inosofttech.departmentservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "Department", description = "DTO for Department entity")
public class DepartmentDto {

    @Schema(description = "Unique identifier of the department", example = "1")
    private Long id;

    @Schema(description = "Name of the department", example = "Engineering")
    private String departmentName;

    @Schema(description = "Description of the department", example = "Responsible for development")
    private String departmentDescription;

    @Schema(description = "Code of the department", example = "ENG")
    private String departmentCode;
}
