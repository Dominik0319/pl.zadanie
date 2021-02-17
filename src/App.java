import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {  
   
    int wynik = 0;
    System.out.println( "Więcej niż jedno zwierzę ");
Scanner scanner = new Scanner(System.in);
String odp= scanner.nextLine();
    String[][] dane = {
    {"stado", "klucz", "dwa","owca","lama"},
    {"sztafeta", "skok o tyczce", "skoki narciarskie","sumo", "szachy" } 
    };                 

        if (odp.equals(dane[0][0])  ) {
            System.out.println("BRZDĘK"+ (++wynik));
        }
            else if (odp.equals(dane[0][1])  ) {
            System.out.println("BRZDĘK"+ (++wynik));
            }    
            else if (odp.equals(dane[0][2])  ) {
                System.out.println("BRZDĘK"+ (++wynik));
                } 
            else if (odp.equals(dane[0][3])  ) {
                System.out.println("BRZDĘK"+ (++wynik));
                    } 
            else if (odp.equals(dane[0][4])  ) {
                System.out.println("BRZDĘK"+ (++wynik));
                        } 
            else { 
                System.out.println("X");
            }
            {
        
            System.out.println( "Sporty na literę S ");
            String add=scanner.nextLine();
            if (add.equals(dane[1][0] + (++wynik) )) {
                System.out.println("BRZDĘK");
            }
                else if (add.equals(dane[1][1] + (++wynik) )) {
                    System.out.println("BRZDĘK");
                }
                else if (add.equals(dane[1][2]  )) {
                     System.out.println("BRZDĘK"+(++wynik));
                    }
                else if (add.equals(dane[1][3]  )) {
                    System.out.println("BRZDĘK"+(++wynik));
                        }
                else if (add.equals(dane[1][4]  )) {
                System.out.println("BRZDĘK"+(++wynik));
            }
            else { 
                System.out.println("X"); }
            System.out.println("twój wynik to: " +wynik);
} 
}  
}
