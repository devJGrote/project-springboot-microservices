package de.inosofttech.organizationservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {

    @Schema(description = "Organization ID")
    private Long id;

    @Schema(description = "Name of the organization")
    private String organizationName;

    @Schema(description = "Description of the organization")
    private String organizationDescription;

    @Schema(description = "Code of the organization")
    private String organizationCode;

    @Schema(description = "Date and time when the organization was created")
    private LocalDateTime createdDate;
}
