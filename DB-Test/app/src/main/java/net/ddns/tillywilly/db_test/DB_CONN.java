package net.ddns.tillywilly.db_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_CONN
{
    Statement transmission;
    ResultSet leResultat;
    public void Connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql:192.168.2.103:3306/Test_DB", "handas", "96tf05ht");
            transmission = cn.createStatement();
            leResultat= transmission.executeQuery("select * from User");
        }
        catch (Exception ex)
        {
            String error = ex.getMessage();
        }
    }
}