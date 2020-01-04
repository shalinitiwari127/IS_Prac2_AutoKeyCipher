import java.util.Random;
import java.util.Scanner;
public class Autokey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String k,pl,cipher;
        System.out.println("Enter the plain text w/o spaces:");
        pl=sc.next();
        String p="";
        for(int i=0;i<pl.length();i++)
        {  char ch=pl.charAt(i);
           ch=Character.toUpperCase(ch);
           p+=ch;        }
        Random rand=new Random();
        k="";
        for(int i=0;i<p.length();i++){
            int r=rand.nextInt(26);
            r=r+65;
            k+=(char)r;
        }
        cipher="";
        for(int i=0;i<k.length();i++){
            int sum=(int)(p.charAt(i))-65+(int)(k.charAt(i))-65;
            sum=sum%26;
            sum+=65;
            cipher+=(char)sum;
        }
        System.out.println("Random Key:-"+k);
        System.out.println("Cipher Text:-"+cipher);
        String decipher="";
        for(int i=0;i<k.length();i++){
            int sum=(int)cipher.charAt(i)-(int)k.charAt(i);
            if(sum<0)
                sum=sum+26;
            sum=sum%26;
            sum=sum+65;
            decipher+=(char)sum;
        }
        System.out.println("Deciphered text:-"+decipher);
    }
}
