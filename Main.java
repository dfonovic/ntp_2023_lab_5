public class Main {
    public static void main(String[] args) { 
            Boja boja = Boja.PLAVA; 
            System.out.print("Moguce boje: ");
            for (Boja b : Boja.values()){
                System.out.print(b + " ");
            } 
            System.out.print("\nVarijabla sadrzi "); 
            switch (boja) { 
            case CRVENA: System.out.print("crvenu"); break;
            case ZUTA: System.out.print("zutu"); break;
            case PLAVA: System.out.print("plavu"); break;
    }
            System.out.println(" boju."); 
    }

    }
