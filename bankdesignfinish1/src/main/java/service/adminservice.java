package service;

import dao.adminDao;
import dao.impl.adminDaoimpl;
import unit.admin;

public class adminservice {
    dao.adminDao adminDao=new adminDaoimpl();
    public admin findadminbyId(String id)throws Exception {
        return adminDao.findadminbyId(id);
    }
}
