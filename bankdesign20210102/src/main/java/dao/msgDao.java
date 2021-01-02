package dao;

import unit.msg;

import java.util.List;

public interface msgDao {
   public void addmsg(msg msg)throws  Exception;

   public List<msg> findmsgList()throws  Exception;
}
