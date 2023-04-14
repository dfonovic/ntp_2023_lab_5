
/**
 * Write a description of class Auto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Auto
{
    public static void main(String [] args){
        String proizvodac = "VW";
        String model = "Passat";
        Motor m = new Motor("2.0v","110KS");
        System.out.print(model + "\t" + m.getModel() + "\t" + m.getSnaga() ); 


    }
}
