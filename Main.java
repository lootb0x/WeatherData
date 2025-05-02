
import java.util.ArrayList;
public class Main {
 public static void main(String[] args) 
 {
   ArrayList<Double> newL=new ArrayList<Double>();
   double[] t1= {1.0,1.1,1.2,1.3,2.0,1.5,1.0,5.5};
   for (double i: t1 )
   {
    newL.add(i);
   }
   WeatherData test1 = new WeatherData(newL);
   System.out.println(test1.longestHeatWave(1.2));
   test1.cleanData(1.3, 2.5);
 }
}