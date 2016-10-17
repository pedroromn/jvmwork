public class Time1{

    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 ||
           second < 0 || second >= 60){

            throw new IlegalArgumentException(
               "hour, minute and/or second was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    
} // end class Time1
