/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvm.work.bourne;

/**
 *
 * @author pyuser
 * 
 * Time2 class declaration with overloaded constructors
 */
public class Time2 {
    
    private int hour; // 0 - 23 
    private int minute; // 0 - 59
    private int second; // 0 - 59
    
    public Time2(){
        this(0,0,0);
    }
    
    public Time2(int hour){
        this(hour, 0, 0);
    }
    
    public Time2(int hour, int minute){
        this(hour, minute, 0);
    }
    
    public Time2(int hour, int minute, int second){
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute mus be 0-59");
        
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    
    public Time2(Time2 time){
       
    }
    
    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute mus be 0-59");
        
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void setHour(int hour){
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        this.hour = hour;
    }
    
    public void setMinute(int minute){
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute mus be 0-59");
        
        this.minute = minute;
    }
    
    public void setSecond(int second){
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), 
                getMinute(), getSecond());
    }
    
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
    
} // end class Time2
