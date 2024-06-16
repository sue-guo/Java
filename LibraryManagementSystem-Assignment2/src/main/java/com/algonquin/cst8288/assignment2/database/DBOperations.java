package com.algonquin.cst8288.assignment2.database;

import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.logger.LMSLogger;
import com.algonquin.cst8288.assignment2.logger.LogLevel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * This class handle CRUD operations with database
 * @author Hongxiu Guo
 */
public class DBOperations {
        /**
         * insert an event into database, return the generatedId
         * @param event even to insert
         * @return  generatedId
         */
	public static int createEvent(Event event) {
            Connection connection = null;
            PreparedStatement pstmt = null;
            int generatedId = -1;
            try {
                //connect to database
                connection = DBConnection.getInstance();
                //prepare query, must add Statement.RETURN_GENERATED_KEYS flag to get the generatedId
                pstmt = connection.prepareStatement("INSERT INTO events (event_name, event_description,event_activities,admission_fees)"+
                        "values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, event.getEventName());
                pstmt.setString(2, event.getEventDescription());
                pstmt.setString(3, event.getEventActivities());
                pstmt.setDouble(4, event.getAdmissionFees());
                //execute query
                int affectedRows = pstmt.executeUpdate();
                
                 // Check if the insertion was successful
                if (affectedRows > 0) {
                    // Get the generated keys
                    ResultSet re = pstmt.getGeneratedKeys();
                    if (re.next()) {
                        generatedId = re.getInt(1);               
                    }
                } else {
                    System.out.println("No rows affected.");
                }
                            
                LMSLogger.getInstance().saveLogInformation("insert an event into database successfully, event_id="+generatedId, DBOperations.class.getName(), LogLevel.INFO);
            } catch (SQLException ex) {
                ex.printStackTrace();
                LMSLogger.getInstance().saveLogInformation("SQLException occur at inserting an event into database :" + ex.getMessage() , DBOperations.class.getName(), LogLevel.ERROR);
            }
            
            return generatedId;

	}
        /**
         * Retrieve event from database by event id
         * @param event_id  event id
         */
	public static void retrieveEvent(int event_id) {
            Connection connection = null;
            PreparedStatement pstmt = null;
            try {
                //connect to database
                connection = DBConnection.getInstance();
                //prepare query
                pstmt = connection.prepareStatement("SELECT * FROM EVENTS WHERE EVENT_ID = ?");
                pstmt.setInt(1, event_id);
  
                //execute query
                ResultSet resultSet = pstmt.executeQuery();
                //check resultSet if it is empty, if empty resultSet.isBeforeFirst() return false
                if(!resultSet.isBeforeFirst()){
                    System.out.println("can not find event that id = "+ event_id);   
                 LMSLogger.getInstance().saveLogInformation("not found an event : event_id="+event_id, DBOperations.class.getName(), LogLevel.WARN);
                }else{
                    while (resultSet.next()){
                    
                           String eventName = resultSet.getString("event_name");
                           String eventDescription = resultSet.getString("event_description");
                           String eventActivities = resultSet.getString("event_activities");
                           String admissionFees = resultSet.getString("admission_fees");

                           System.out.println("Display event id = "+ event_id);
                           
                           System.out.println("eventName:" + eventName + ", eventDescription:" + eventDescription + ", eventActivities:" + eventActivities + ", admissionFees:" + admissionFees);
                   }
                    
                LMSLogger.getInstance().saveLogInformation("retrieve an event from database: event_id="+event_id, DBOperations.class.getName(), LogLevel.INFO);
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace();
               LMSLogger.getInstance().saveLogInformation("SQLException occur at geting an event from database :" + ex.getMessage() , DBOperations.class.getName(), LogLevel.ERROR);
            }
	}
        /**
         * update an event 
         * @param event event to update
         */
	public static void updateEvent(Event event) {
            Connection connection = null;
            PreparedStatement pstmt = null;
            try {
                //connect to database
                connection = DBConnection.getInstance();
                //prepare query
                pstmt = connection.prepareStatement("UPDATE EVENTS SET"
                        +" event_name = ?"
                        +", event_description = ?"
                        +", event_activities = ?"
                        +", admission_fees = ?"
                        +" WHERE event_id = ?"
                );
                pstmt.setString(1, event.getEventName());
                pstmt.setString(2, event.getEventDescription());
                pstmt.setString(3, event.getEventActivities());
                pstmt.setDouble(4, event.getAdmissionFees());
                pstmt.setInt(5, event.getEvent_id());
                //update query
                pstmt.executeUpdate();
                
                LMSLogger.getInstance().saveLogInformation("update an event from database: event_id="+event.getEvent_id(), DBOperations.class.getName(), LogLevel.INFO);
            } catch (SQLException ex) {
                ex.printStackTrace();
                LMSLogger.getInstance().saveLogInformation("SQLException occur at updating an event from database: event_id="+event.getEvent_id(), DBOperations.class.getName(), LogLevel.ERROR);
            }
	}
        /**
         * Delete an event by event id
         * @param event_id  event id
         */
	public static void deleteEvent(int event_id) {
            Connection connection = null;
            PreparedStatement pstmt = null;
            try {
                //connect to database
                connection = DBConnection.getInstance();
                //prepare query
                pstmt = connection.prepareStatement("DELETE FROM events WHERE event_id = ?");
                pstmt.setInt(1, event_id);
                //execute query
                pstmt.executeUpdate();
                LMSLogger.getInstance().saveLogInformation("delete an event from database: event_id="+event_id, DBOperations.class.getName(), LogLevel.INFO);
            } catch (SQLException ex) {
                LMSLogger.getInstance().saveLogInformation("SQLException occur at deleting an event from database: event_id="+event_id, DBOperations.class.getName(), LogLevel.ERROR);
            }
	}
        
}
