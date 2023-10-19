package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        int salaireMin = 30000;
        int nombreAnMin = 2;

        System.out.println("Saisir le nombre d'argent gagner par an : ");
        int salaireAn = clavier.nextInt();

        System.out.println("Saisir le nombre d'année travailler :");
        int nombreAnTravailler = clavier.nextInt();
        clavier.close();

        if (salaireAn >= salaireMin && nombreAnTravailler >= nombreAnMin ){
            System.out.println("Votre prêt est accepter");
        }

        else{
            System.out.println("Votre prêt n'est pas accepter");
        }

    }
    
}
