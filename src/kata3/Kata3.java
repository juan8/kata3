
package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.increment(1,3);
        histogram.increment("gmail.com",4);
        histogram.increment("ulpgc.es",2);
        histogram.increment("ull.es",5);
        new HistogramDisplay(histogram).execute();
    }
 
    
}
