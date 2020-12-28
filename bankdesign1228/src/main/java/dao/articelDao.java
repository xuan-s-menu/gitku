package dao;

import unit.article;

import java.util.List;

public interface articelDao {
    public void addarticle(String userid, String name, String liuyan, String s,String articleid)throws  Exception;
    public List<article> findarticleListbyadminid(String id)throws Exception;

    public article findarticlebyid(String id)throws Exception;

    public void updatearticle(String articleid, String liuyan)throws  Exception;
}
