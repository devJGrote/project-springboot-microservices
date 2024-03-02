package de.inosofttech.departmentservice.service.impl;

import de.inosofttech.departmentservice.dto.DepartmentDto;
import de.inosofttech.departmentservice.entity.Department;
import de.inosofttech.departmentservice.mapper.DepartmentMapper;
import de.inosofttech.departmentservice.repository.DepartmentRepository;
import de.inosofttech.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        // convert department dto to department jpa entity
        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department saveDepartment = departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(saveDepartment);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return DepartmentMapper.mapToDepartmentDto(department);

    }
}
