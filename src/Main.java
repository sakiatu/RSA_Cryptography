
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        int p=3,q=11;
//        Scanner scan = new Scanner(System.in);
//        
//        System.out.print("Enter 1st prime: ");
//        p = scan.nextInt();
//        System.out.print("Enter 2nd prime: ");
//        q = scan.nextInt();
        
        int N = p*q , phi =(p-1)*(q-1);
        int e=2;
        
        for( ; e<phi ; e++){
            int gcd = Formula.gcdOf(e,phi);
            if(gcd==1)
                break; //for having "e" as co-prime of "Phi"
        }
        
        int d = Formula.dValue(e,phi);
        
        System.out.print("Enter your message: ");
        Scanner scanNew = new Scanner(System.in);
        String string = scanNew.nextLine();
        int length = string.length();
        char[] letters = new char[length];
        
        System.out.print("Encrypted:");
        //encrypting letters one by one
        for( int i=0 ; i<length ; i++ ){
            
            char letter = string.toLowerCase().charAt(i);
            
            char encryptedLetter = Formula.encryption( letter , e , N );
            System.out.print(encryptedLetter);
            letters[i] = encryptedLetter;
            
        }
        
        System.out.println("");  
        System.out.print("Decrypted:");
        //decrypting letters one by one
        for(int i=0 ; i<length ; i++){
           char decryptedLetter = Formula.decryption(letters[i],e,N,phi); 
           System.out.print(decryptedLetter);

        }
        
        System.out.println("");  

       

    }
    
}



