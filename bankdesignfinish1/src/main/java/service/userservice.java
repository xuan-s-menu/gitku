package service;

import dao.impl.userDaoimpl;
import dao.userDao;
import unit.user;

import java.util.List;

public class userservice {
    userDao userDao=new userDaoimpl();
    public user finduserbyId(String id) throws  Exception{
        return userDao.finduserbyId(id);
    }

    public void adduser(user user)throws  Exception {
        userDao.adduser(user);
    }

    public List<user> finduserList() throws  Exception{
        return userDao.finduserList();
    }

    public void deleteuser(String id) throws Exception{
        userDao.deleteruser(id);
    }
}
