public class Main
{
    public static void main(String [] args)
    {
        // initialise instance variables
        Razlomak r1 = new Razlomak(5,6);
        Razlomak r2 = new Razlomak(7,9);
        Razlomak r3 = new Razlomak(r1,r2);
		System.out.println("Prvi razlomak: " + r1.getBrojnik() + " / " + r1.getNazivnik());
		System.out.println("Derugi razlomak: " + r2.getBrojnik() + " / " + r2.getNazivnik());
		System.out.println("Treci razlomak: " + r3.getBrojnik() + " / " + r3.getNazivnik());
        //System.out.println(r3.getBrojnik() + " / " + r3.getNazivnik());
    }

    
}