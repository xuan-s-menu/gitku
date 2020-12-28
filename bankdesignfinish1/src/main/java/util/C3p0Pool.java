package util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Pool {
   
    
    public static void main(String[] args)throws SQLException
    {
    	/*
    	ComboPooledDataSource pool2 = new ComboPooledDataSource();//空参，自动到classpath目录下面加载“c3p0-config.xml”配置文件---配置文件的存储位置和名称必须是这样，且使用“默认配置”
    	System.out.println(pool2);
    	*/
    	 ComboPooledDataSource pool = new ComboPooledDataSource();//空参，自动到classpath目录下面加载“c3p0-config.xml”配置文件---配置文件的存储位置和名称必须是这样，且使用“默认配置”
         //ComboPooledDataSource pool = new ComboPooledDataSource("demo");//加载“c3p0-config.xml”文件中定义的“demo”这个配置元素
          for(int i=0;i<25;i++){
                Connection con = pool.getConnection();
                System.out.println(i+":"+ con.hashCode());
            }
    }
}
