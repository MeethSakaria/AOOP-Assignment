import java.util.Scanner;
import java.io.*;

public class q4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int ivar;
        System.out.println("Enter the data to be entered in to the file");
        String s=in.nextLine();

        File f1 = new File("C:/Users/Dell/Desktop/AOOP/Alphabet.txt");
        try{
            FileOutputStream fout = new FileOutputStream(f1);

            for(int i=0; i<s.length();i++){
                fout.write(s.charAt(i));
            }

            File f2 = new File("C:/Users/Dell/Desktop/AOOP/Consonants.txt");

            FileOutputStream fout1 = new FileOutputStream(f2);

            FileInputStream fin = new FileInputStream(f1);

            do{
                ivar = fin.read();
                if(ivar != -1){
                    try{

                        switch((char)ivar){
                            case 'a':
                            case 'A':
                            case 'e':
                            case 'E':
                            case 'i':
                            case 'I':
                            case 'o':
                            case 'O':
                            case 'u':
                            case 'U': throw new VowelNotAllowedException((char)ivar);

                            default: fout1.write((char)ivar);
                        }
                    }catch(VowelNotAllowedException p){
                        System.out.println(p);
                    }
                }
            }
            while(ivar!=-1);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}

class VowelNotAllowedException extends Exception{
    char a;
    public VowelNotAllowedException(char a){
        this.a=a;
    }
    public String toString(){
        return "'"+a+"'"+super.toString()+": Vowels are not allowed";
    }
}