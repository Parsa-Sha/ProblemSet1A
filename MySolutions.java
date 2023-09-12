
/**
 * Write a description of class MySolutions here.
 *
 * @author Parsa S.
 * @version 9/12/2023
 */
public class MySolutions
{
    public void celsuisToFahrenheit() {
        double c, f;
        c = 23.0;
        f = c * 9.0 / 5.0 + 32;
        System.out.println(c + "°C = " + f + "°F");
    }
    
    public void elapsedTime() {
        int h, m, s, seconds;
        final int totalSeconds = 86400;
        h = 12;
        m = 54;
        s = 12;
        seconds = h*3600 + m*60 + s;
        System.out.println("The current time is " + h + ":" + m + ":" + s + ". It has been " + seconds + " seconds since the day began.");
        System.out.println("There are " + (totalSeconds - seconds) + " seconds left in the day.");
        System.out.println("The day is " + seconds*100.0/totalSeconds + "% done.");
    }
    
    public void secondsToHMS() {
        int h, m, s, seconds;
        seconds = 14562;
        s = seconds % 60;
        m = (seconds / 60) % 60;
        h = (seconds / (60 * 60));
        System.out.println(seconds + " seconds = " + h + " hours, " + m + " minutes, and " + s + " seconds.");
        
    }
}
