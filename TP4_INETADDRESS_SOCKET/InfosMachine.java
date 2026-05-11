import java.net.*;
import java.util.Scanner;

public class InfosMachine {
    public static void main(String[] args) {
        try {
            // AFFICHE L'ADRESSE DE LA MACHINE LOCALE [CITE: 118]
            System.out.println("MA MACHINE : " + InetAddress.getLocalHost());

            Scanner sc = new Scanner(System.in);
            String nom = "";

            while (!nom.equalsIgnoreCase("stop")) { // [CITE: 119]
                System.out.print("ENTREZ UN NOM DE MACHINE (OU 'STOP') : ");
                nom = sc.nextLine(); // [CITE: 120]
                
                if (!nom.equalsIgnoreCase("stop")) {
                    try {
                        InetAddress addr = InetAddress.getByName(nom);
                        System.out.println("ADRESSE DE " + nom + " : " + addr.getHostAddress()); // [CITE: 118]
                    } catch (UnknownHostException e) {
                        System.out.println("MACHINE INCONNUE.");
                    }
                }
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}