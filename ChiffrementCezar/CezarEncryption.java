package ChiffrementCezar;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class CezarEncryption 
{
    public static void main(String[] args) throws Exception
    {
        try {
            Scanner sc0 = new Scanner(System.in);
            System.out.print("Entrez 1 pour crypter un message et 2 pour décrypter un message ");
            int choice = sc0.nextInt();
            switch (choice) {
                case 1:
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                        System.out.print("Entrez le message à crypter : ");
                        String text = br.readLine();
                        Scanner sc1 = new Scanner(System.in);
                        System.out.print("Entrez le décalage(nombre strictement positif) que vous souhaiter appliquer : ");
                        int gap = sc1.nextInt();

                        ArrayList<Integer> msg = new ArrayList<>();
                        ArrayList<Character> encryptedMessage = new ArrayList<>();

                        for (int x = 0; x < text.length(); x++) {
                            msg.add((int)text.charAt(x) + gap);
                        }
                        for (int x = 0; x < msg.size(); x++) {
                            encryptedMessage.add((char)msg.get(x));
                        }

                        System.out.println(text + " crypté" + " est : " + String.join("", encryptedMessage));
                    } 
                    catch (InputMismatchException exception) {
                        System.out.println("Entrée invalide");
                    }
                break;

                default:
                    System.out.println("Choix invalide !");
                break;
            }
        }
        catch (InputMismatchException exception) {
            System.out.println("Entrée invalide");
        }
    }

}

