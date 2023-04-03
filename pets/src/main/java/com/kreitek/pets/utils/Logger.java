package com.kreitek.pets.utils;

import com.kreitek.pets.interfaces.ILogger;

public class Logger implements ILogger {

    private static Logger instance;
    private int count;

    private Logger(){
        count = 0;
    }

    public static synchronized Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }
    @Override
    public void debug(String message){
        count ++;
        System.out.println("[debug][" + count + "] - " + message);
    }
}
