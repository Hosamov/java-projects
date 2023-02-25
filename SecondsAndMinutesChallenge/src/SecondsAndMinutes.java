package SecondsAndMinutesChallenge.src;

public class SecondsAndMinutes {
  public static void main(String[] args) {
    System.out.println(getDurationString(-3945)); // first test case
    System.out.println(getDurationString(-65, 45)); // second test case
    System.out.println(getDurationString(65, 145)); // third test case
    System.out.println(getDurationString(65, 45)); 
    System.out.println(getDurationString(3945)); // first test case
  }

  public static String getDurationString(int seconds) {
    // 1min = 60s, 1hr 60m or 3600s
    if(seconds < 0) {
      return "Invalid data for seconds(" + seconds
              + "), must be a positive integer value";
    }
    
    return getDurationString(seconds / 60, seconds % 60);
  }

  public static String getDurationString(int minutes, int seconds) {
    if(minutes < 0) {
      return "Invalid data for minutes(" + minutes
              + "), must be a positive integer value";
    }

    if(seconds <= 0 || seconds >= 59) {
      return "Invalid data for seconds(" + seconds
              + "), must be between 0 and 59";
    }
    
    int hours = (minutes / 60); //seconds
    int remainingMinutes = minutes % 60;
    
    return hours + "h " + remainingMinutes +"m " + seconds +"s";
  }

}
