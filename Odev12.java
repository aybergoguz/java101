import java.util.Scanner;

public class Odev12{
    
    public static void main(String[] args) {

        int firstNumber,secondNumber,thirdNumber;

        Scanner enteredValue= new Scanner(System.in);

        System.out.println("Please entered first number : ");
        firstNumber=enteredValue.nextInt();

        System.out.println("Please entered second number : ");
        secondNumber=enteredValue.nextInt();

        System.out.println("Please entered third number : ");
        thirdNumber=enteredValue.nextInt();

        if ((firstNumber<secondNumber) && (firstNumber<thirdNumber)){
            if(secondNumber<thirdNumber){
                System.out.println(firstNumber+"<"+secondNumber+"<"+thirdNumber);
            }
            else
            System.out.println(firstNumber+"<"+thirdNumber+"<"+secondNumber);
        }
        else if ((secondNumber<firstNumber) && (secondNumber<thirdNumber) ){
            if(firstNumber<thirdNumber){
                System.out.println(secondNumber+"<"+firstNumber+"<"+thirdNumber);
            }
            else
                System.out.println(secondNumber+"<"+thirdNumber+"<"+firstNumber);
        }
        else
            if(firstNumber<secondNumber){
                System.out.println(thirdNumber+"<"+firstNumber+"<"+secondNumber);
            }
            else 
            System.out.println(thirdNumber+"<"+secondNumber+"<"+firstNumber);

        
    }
}