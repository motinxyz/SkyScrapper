package com.ss.dao;

import com.ss.dto.TenantDTO;

import java.util.List;

public interface TenantDAO {
    List<TenantDTO> getAllTenantsInfo();
}
