public class TimePrinter7 {
         public static void main(String[] args) {
 int s = 54204050;
  int sec = s % 60;
   int m = (s - sec)/60;
    int min = m % 60; 
     int h = (m - min)/60;
	  int hour = h % 24;
	  int d = (h - hour)/24;
	    int day = d % 24;
		  int w = (d - day)/7;
		    int weak = w % 7;
            System.out.println(weak + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд ");
     }
}
