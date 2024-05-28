package com.ss.dao;

import com.ss.api.Tenant;
import com.ss.dto.TenantDTO;
import com.ss.rowMapper.TenantRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TenantDAOImpl implements  TenantDAO{

    JdbcTemplate jdbcTemplate;

    @Autowired
    public TenantDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<TenantDTO> getAllTenantsInfo() {

        String sql = "select * from tenant_info";
        return jdbcTemplate.query(sql, new TenantRowMapper());
    }
}
