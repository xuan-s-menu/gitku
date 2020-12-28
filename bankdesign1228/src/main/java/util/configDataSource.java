package util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class configDataSource {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    /**
     * 配置DataSource
     */
    public static void configDataSource(){
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/money");
            dataSource.setUser("root");
            dataSource.setPassword("123456");
            dataSource.setInitialPoolSize(3);
            dataSource.setMaxPoolSize(10);
            dataSource.setMinPoolSize(3);
            dataSource.setAcquireIncrement(3);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }
    /**
     * 获取Connection连接
     * @return
     */
    public static Connection getConnection(){
        Connection conn = null;
        configDataSource();
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
