package net.ddns.tillywilly.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_CONN
{
    Statement transmission;
    ResultSet leResultat;
    public String err;
    public void Connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql:192.168.2.103:3306/Test_DB", "handas", "96tf05");
            transmission = cn.createStatement();
            leResultat= transmission.executeQuery("select * from test");
        }
        catch (Exception ex)
        {
            String error = ex.getMessage();
            this.err = error;
        }
    }

    public DB_CONN() {

    }
}