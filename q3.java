import java.util.Scanner;

public class q3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the line of text: ");
        String s = in.nextLine();

        System.out.println(s);
        String s1 = "SDMCET";
        try{
            if(s.toUpperCase().contains(s1)){
                System.out.println("SUCCESS in finding the substtring");
            }
            else{
                throw new SubStringNotFoundException();
            }
        }catch(SubStringNotFoundException e){
            System.out.println(e.toString());
        }
    }
}

class SubStringNotFoundException extends Exception{
    public String tString(){
        return super.toString()+": NOT SUCCESS in finding the substring";
    }
}