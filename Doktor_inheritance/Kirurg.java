
/**
 * Write a description of class Kirurg here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kirurg extends Doktor
{
    // instance variables - replace the example below with your own
    private String specijalizacija;

    /**
     * Constructor for objects of class Kirurg
     */
    public Kirurg(String ime, boolean radiUBolnici, String specijalizacija)
    {
        super(ime,radiUBolnici);
        this.specijalizacija = specijalizacija;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void operiraj()
    {
        // put your code here
        System.out.println("operiram!");
    }
    @Override
    public void propisiTerapiju()
    {
        // put your code here
        System.out.println("Nova terapija je: ");
    }
}
