package com.algonquin.cst8288.assignment2.database;

import com.algonquin.cst8288.assignment2.logger.LMSLogger;
import com.algonquin.cst8288.assignment2.logger.LogLevel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class manage the creation of a single instance of the database connection, singleton pattern
 * @author Hongxiu Guo
 */
public class DBConnection {
	// Static variable to hold the single instance of the connection
	private static Connection connection = null;
	
	private static final String serverUrl = "jdbc:mysql://localhost:3306/bookvault";
	private static final String userString = "root";
	private static final String passwordString = "123456";
	private static final String driverString = "com.mysql.cj.jdbc.Driver";
        /**
         * Get the singleton instance of the database connection.
         * @return  The database connection instance.
         */
        public static Connection getInstance(){
            try { 
                if(connection == null){
                    // Initialize the database connection
                    connection = DriverManager.getConnection(serverUrl, userString, passwordString);
                    LMSLogger.getInstance().saveLogInformation("Connect to database successfully", DBConnection.class.getName(), LogLevel.INFO);

                 }
             } catch (SQLException ex) {
                   ex.printStackTrace();
                   LMSLogger.getInstance().saveLogInformation("SQLException occur at database connection:"+ex.getMessage(), DBConnection.class.getName(), LogLevel.ERROR);
             }
            return connection;
        }
	
        
}
