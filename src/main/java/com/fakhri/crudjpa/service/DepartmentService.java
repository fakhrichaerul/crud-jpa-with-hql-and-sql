package com.fakhri.crudjpa.service;

import com.fakhri.crudjpa.dto.DepartmentRequest;
import com.fakhri.crudjpa.dto.DepartmentResponse;

import java.util.List;

public interface DepartmentService {

    DepartmentResponse create(DepartmentRequest department);

    DepartmentResponse update(Integer id, DepartmentRequest department) throws Exception;

    void delete(Integer id) throws Exception;

    List<DepartmentResponse> read();

    DepartmentResponse findByDepartmentName(String departmentName) throws Exception;

    List<DepartmentResponse> findDepartmentListByDepartmentNameWithSpec(String departmentName);

    DepartmentResponse findByDepartmentNameWithHql(String departmentName) throws Exception;

    DepartmentResponse findByDepartmentNameWithSql(String departmentName) throws Exception;

    List<DepartmentResponse> findDepartmentListByDepartmentNameWithHql(String departmentName);

    List<DepartmentResponse> findDepartmentListByDepartmentNameWithSql(String departmentName);
}
