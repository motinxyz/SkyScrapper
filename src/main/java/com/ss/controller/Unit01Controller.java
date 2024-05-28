package com.ss.controller;

import com.ss.api.Tenant;
import com.ss.dao.TenantDAO;
import com.ss.dao.TenantDAOImpl;
import com.ss.dto.TenantDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("u01")
public class Unit01Controller {


    private TenantDAO tenantDAO;
//    = new TenantDAOImpl();

    @GetMapping("/tenants")
    public String tenants(Model model){

        List<TenantDTO> allTenantsInfo = tenantDAO.getAllTenantsInfo();

        model.addAttribute("allTenantsInfo", allTenantsInfo);
        System.out.println(allTenantsInfo.toString());
        return "tenants-info";
    }

    @Autowired
    public Unit01Controller(TenantDAO tenantDAO){
        this.tenantDAO = tenantDAO;
    }
}
