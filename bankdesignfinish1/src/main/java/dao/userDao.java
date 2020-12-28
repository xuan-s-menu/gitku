package dao;

import unit.user;

import java.util.List;

public interface userDao {
    public void adduser(user user)throws Exception;

    public  user finduserbyId(String id)throws  Exception;

   public List<user> finduserList()throws  Exception;

   public void deleteruser(String id)throws  Exception;
}
