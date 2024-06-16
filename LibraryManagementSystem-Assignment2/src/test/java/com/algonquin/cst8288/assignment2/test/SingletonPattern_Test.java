package com.algonquin.cst8288.assignment2.test;

import com.algonquin.cst8288.assignment2.database.DBConnection;
import com.algonquin.cst8288.assignment2.logger.LMSLogger;
import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hongxiu Guo
 */
public class SingletonPattern_Test {
    

    /**
     * Test DBConnection is singleton
     */
     @Test
     public void testDBConnection() {
         // Get multiple instances of the DBConnection
        Connection connection1 = DBConnection.getInstance();
        Connection connection2 = DBConnection.getInstance();
        Connection connection3 = DBConnection.getInstance();

        // Assert that all instances are the same
        assertSame("DBConnection instances are not the same", connection1, connection2);
        assertSame("DBConnection instances are not the same", connection2, connection3);
        assertSame("DBConnection instances are not the same", connection1, connection3);
     
     }
     /**
      * Test LMSLogger is singleton
      */
     @Test
     public void testLMSLogger() {
          // Get multiple instances of the LMSLogger
        LMSLogger log1 = LMSLogger.getInstance();
        LMSLogger log2 = LMSLogger.getInstance();
        LMSLogger log3 = LMSLogger.getInstance();

        // Assert that all instances are the same
        assertSame("LMSLogger instances are not the same", log1, log2);
        assertSame("LMSLogger instances are not the same", log2, log3);
        assertSame("LMSLogger instances are not the same", log1, log3);
     }
}
