import java.util.Scanner;

public class q2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int inum = in.nextInt();
        int flag = 0;

        try{
            if(inum>=0){
                try{
                    if(inum>1){
                        for(int i=2;i<Math.sqrt(inum);i++){
                            if(inum%i==0){
                                flag = 1;
                                throw new NumberNotPrimeException();
                            }
                        }
                    }
                    else{
                        flag = 1;
                        throw new NumberNotPrimeException();
                    }
                }catch(NumberNotPrimeException p){
                    System.out.println(p.toString());
                }
            }
            else{
                flag = 1;
                throw new NegativeNumberNotAllowedException();
            }
        }catch(NegativeNumberNotAllowedException e){
            System.out.println(e.toString());
        }
        if(flag==0){
            System.out.println("This number is a prime number and positive number");
        }
    }    
}

class NegativeNumberNotAllowedException extends Exception{
    public String toString(){
        return super.toString()+" : This is a negative number";
    }
}


class NumberNotPrimeException extends Exception{
    public String toString(){
        return super.toString()+" : Number is not prime number";
    }
}