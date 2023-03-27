/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Mohasin Miah
 */
public class DBQuery {
    
    private static PreparedStatement preparedStatement;
    
    // Create Prepared Statement Object
    public static PreparedStatement setPreparedStatement(String sqlStatement) throws SQLException {
        Connection conn = DBConnection.getConnection();
        preparedStatement = conn.prepareStatement(sqlStatement);
        return preparedStatement;
    }
    
    // Return Prepared Statement Object
    public static PreparedStatement getPreparedStatement(){
        return preparedStatement;
    }
}
