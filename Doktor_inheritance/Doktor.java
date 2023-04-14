
/**
 * Write a description of class Doktor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doktor
{
    // instance variables - replace the example below with your own
    private String ime;
    private boolean radiUBolnici;
    
    

    /**
     * Constructor for objects of class Doktor
     */
    public Doktor(String ime, boolean radiUBolnici)
    {
        this.ime = ime;// initialise instance variables
        this.radiUBolnici = radiUBolnici;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void postaviDijagnozu()
    {
        // put your code here
        System.out.println("Neka bolest");
    }
    
    public void propisiTerapiju(){
        System.out.println("Terapija je: ");
    }
}

