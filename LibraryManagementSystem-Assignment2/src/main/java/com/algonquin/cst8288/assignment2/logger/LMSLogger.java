package com.algonquin.cst8288.assignment2.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Manage application logging, using singleton pattern
 * @author Hongxiu Guo
 */
public class LMSLogger {
    private static LMSLogger lmsLogger;
    private final String LOGFILE = "logs.txt";
    private PrintWriter writer;
    /**
     * private Constructor
     */
    private LMSLogger (){
        try {
            writer = new PrintWriter(new FileWriter(LOGFILE,true));
           
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * get instance of LMSLogger
     * @return  lmsLogger instance
     */
    public static LMSLogger  getInstance(){
        if(lmsLogger == null ){
            lmsLogger  = new LMSLogger();
        }
    
    return lmsLogger;
    }
    /**
     * Write log information into file
     * @param msg message
     * @param className 
     * @param logLevel 
     */
    public void saveLogInformation(String msg, String className, LogLevel logLevel){
        
        writer.println(formatMessage (msg,className ,logLevel));               
        writer.flush();
    
    }
    /**
     * Format log message
     * @param message
     * @param className
     * @param logLevel
     * @return formatted message
     */
    private String formatMessage(String message,String className, LogLevel logLevel) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String timestamp = sdf.format(new Date());
        return String.format("%s [%s] [class:%s] [message:%s]", timestamp, logLevel.name(), className , message);
    }

}
