package dao;

import unit.card;

import java.util.List;

public interface cardDao {
    public List<card> findcardbyuserid(String id)throws  Exception;

    public void addcard(card card)throws  Exception;

    public void removecard(card card)throws  Exception;

    public  void moneymove(String id, double money)throws  Exception ;

    public  void moneyin(String id2, double money)throws  Exception ;

    public  card findcardbycardname(String id)throws  Exception ;

    public List<card> findcardList()throws Exception;

   public void deletecard(String id)throws  Exception;
}
