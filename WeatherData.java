import java.util.ArrayList;
public class WeatherData
{
    
    private ArrayList<Double> temperatures = new ArrayList<Double>();
    public WeatherData(ArrayList<Double> temp2)
    {
      temperatures=temp2;
    }
    public void cleanData(double lower, double upper){
      System.out.println(temperatures);
      System.out.println(lower+", "+upper);
    for (int i=0; i<temperatures.size(); i++)
    {
      double temp=temperatures.get(i);
      if (temp<lower||temp>upper)
      {
        temperatures.remove(i);
        i--;
      }
    }
    System.out.println(temperatures);

    }

    public int longestHeatWave(double threshold){
      int lent=0;
      int onglen=0;
      for (int i=0;i<temperatures.size();i++)
      {
        if (temperatures.get(i)>threshold)
        {
         onglen++;
         if (onglen>lent) lent=onglen;
        }
        else
        {
          onglen=0;
        }
      }
      return lent;
    }
  
}