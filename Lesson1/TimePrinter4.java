public class TimePrinter4 {
         public static void main(String[] args) {
 int s =54500;
  int sec = s % 60;
   int m = (s - sec)/60;
    int min = m % 60;
     int h = (m - min)/60;
	  int d = h % 24;
	    int day = (h - d)/24;
		  int w = day % 7;
		    int weak =(day - w)/7;
            System.out.println(weak + " недель " + day + " дней " + h + " часов " + min + " минут " + sec + " секунд ");
     }
}
