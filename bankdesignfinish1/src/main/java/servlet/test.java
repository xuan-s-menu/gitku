package servlet;

import dao.impl.userDaoimpl;
import dao.userDao;
import unit.user;

public class test {
    public static void main(String[] args) throws Exception {
        user user=new user(util.UUIDUtils.getId(),"a","123",111);
        userDao userDao=new userDaoimpl();
        userDao.adduser(user);
    }
}
