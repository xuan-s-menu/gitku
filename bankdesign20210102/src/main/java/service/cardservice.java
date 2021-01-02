package service;

import dao.cardDao;
import dao.impl.cardDaoimpl;
import unit.card;

import java.util.List;

public class cardservice {
    dao.cardDao cardDao=new cardDaoimpl();



    public List<card> findcardbyuserid(String id) throws  Exception{
        return cardDao.findcardbyuserid(id);
    }

    public void addcard(card card) throws  Exception{
        cardDao.addcard(card);
    }

    public void removecard(card card)throws  Exception {
        cardDao.removecard(card);
    }

    public void moneymove(String id, double money) throws  Exception {
        cardDao.moneymove(id,money);
    }

    public void moneyin(String id2, double money)throws  Exception  {
        cardDao.moneyin(id2,money);
    }

    public card findcardbycardname(String id)throws  Exception  {
        return cardDao.findcardbycardname(id);
    }

    public List<card> findcardList() throws  Exception{
        return cardDao.findcardList();
    }

    public void deletecard(String id) throws  Exception{
        cardDao.deletecard(id);
    }
}
