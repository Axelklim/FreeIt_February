public class TimePrinter2 {
         public static void main(String[] args) {
 int s = 4500;
  int sec = s % 60;
   int m = (s - sec)/60;
    int min = m % 60;
	int h = (m - min)/60;
            System.out.println(min + " минут " + sec + " секунд ");
     }
}
