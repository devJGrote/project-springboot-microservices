package de.inosofttech.organizationservice.controller;

import de.inosofttech.organizationservice.dto.OrganizationDto;
import de.inosofttech.organizationservice.service.OrganizationService;
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
@RequestMapping("api/organizations")
@AllArgsConstructor
@Tag(name = "Organization Controller", description = "Operations pertaining to organizations")
public class OrganizationController {

    private OrganizationService organizationService;

    @Operation(summary = "Save an organization")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Organization saved successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid organization data provided")
    })
    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto) {
        OrganizationDto savedOrganization = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(savedOrganization, HttpStatus.CREATED);
    }

    @Operation(summary = "Get organization by code")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Organization found"),
            @ApiResponse(responseCode = "404", description = "Organization not found")
    })
    @GetMapping("{code}")
    public ResponseEntity<OrganizationDto> getOrganization(
            @Parameter(description = "Code of the organization to be retrieved", required = true)
            @PathVariable("code") String organizationCode) {
        OrganizationDto organizationDto = organizationService.getOrganizationByCode(organizationCode);
        if (organizationDto != null) {
            return ResponseEntity.ok(organizationDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
