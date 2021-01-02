package service;

import dao.impl.msgDaoimpl;
import dao.msgDao;
import unit.msg;

import java.util.List;

public class msgservice {
    dao.msgDao msgDao=new msgDaoimpl();
    public void addmsg(msg msg)throws  Exception  {
        msgDao.addmsg(msg);
    }

    public List<msg> findmsgList()throws  Exception {
        return msgDao.findmsgList();
    }
}
