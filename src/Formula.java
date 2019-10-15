public class Formula {
    
    public static int gcdOf( int m , int n ){
        int i,gcd = 1;
        
         for( i=2; i <= m && i <= n; ++i)
    {
        if( m%i==0 && n%i==0 )
            gcd=i;
    }
         return gcd;
       
    }
    
    public static int dValue(int e , int Phi){
        
        int k=1;
        
        while(true)
        {
            if((1+k*Phi)%e==0)
                break;
            k++;
        }
        return k;
        
    }
    
    public static char encryption(char letter, int e , int N){
        
        int letterValue = letter - 96;//coverting index of letter , start from 1;
        int encryptionValue = (int) (Math.pow( letterValue , e )%N);
        char encryptedLetter =  (char)('a'+encryptionValue-1);//'97' + 2 - 1 =b ; like 2=b;
        return encryptedLetter;
    }
    
    public static char decryption(char letter, int e, int N, int phi){
        
        int k=1;
        int d=0;
        
        // finding decryption key 
        while(true){
            d = (1+k*phi)/e;
             
            if(d*e == (1+k*phi))// if value is not fractional
                break;
            k++;
        }
        
        int letterValue = letter - 96;//coverting index of letter , start from 1;
        int decryptionValue = (int) (Math.pow( letterValue , d )%N);
        char decryptedLetter =  (char)('a'+decryptionValue-1);//'97' + 2 - 1 =b ; like 2=b;
  
        return decryptedLetter;
        
    }
    
}
