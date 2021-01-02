package dao.impl;

import dao.adminDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import unit.admin;
import unit.user;

public class adminDaoimpl implements adminDao {
    public admin findadminbyId(String id) throws Exception {
        System.out.println("进入了管理员登录层");
        String sql="select * from admin where adminid = ? ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        admin admin= qr.query(sql, new BeanHandler<admin>(admin.class),id);
        return admin;
    }
}
