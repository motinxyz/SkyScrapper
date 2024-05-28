package com.ss.rowMapper;

import com.ss.api.Tenant;
import com.ss.dto.TenantDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TenantRowMapper implements RowMapper<TenantDTO> {
    @Override
    public TenantDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        TenantDTO tenantDTO = new TenantDTO();
        tenantDTO.setTenantId(rs.getInt("tenant_id"));
        tenantDTO.setTenantName(rs.getString("tenant_name"));
        tenantDTO.setSsn(rs.getLong("ssn"));
        tenantDTO.setAddress(rs.getString("address"));
        tenantDTO.setEmail(rs.getString("email"));

//        System.out.println(tenantDTO);
        return tenantDTO;

    }
}
