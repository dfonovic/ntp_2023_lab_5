public class Razlomak
{
    
    private int brojnik;
    private int nazivnik;

    
    public Razlomak(int brojnik, int nazivnik)
    {
        // initialise instance variables
        this.brojnik = brojnik;
        this.nazivnik = nazivnik;
    }
    public Razlomak(Razlomak r1, Razlomak r2){
        this.brojnik=r1.getBrojnik();
        this.nazivnik=r2.getNazivnik();
    }
    

 
    public int getBrojnik(){
        return this.brojnik;
    }
    public int getNazivnik(){
        return this.nazivnik;
    }
    
}
