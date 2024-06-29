import javax.naming.spi.DirStateFactory.Result;
import java.util.*;
public class FunctionMethod {
    
    //create a function to Swap value of two variable
    public static void ReplateValueOfVariable(int a, int b){
        int temp=b;
        b=a;
        a=temp;
        System.out.println("After Swap value of first variablr" + a);
    }



    //Function to calculate factorial of a number
    public static int Fact(int n){
        int Final=1;
        if(n==0 || n==1){
            return 1;
        }else{
            for(int i=1; i<=n; i++){
                Final=Final*i;
            }
        }
        return Final;
    }



    //Function Oveloading
    // Two function with same name but the parameter will be changed(may be dataType, or number of parameter)
    public static void Sum(int a, int b){
        System.out.println(a+b);
    }

    public static void Sum(float a, float b){
        System.out.println(a+b);
    }

    public static void Sum(int a, int b, int c){
        System.out.println(a + b + c);
    }




    //Check is a numbr is prime or not for the positive number
    public static boolean CheckPrime(int num){
        if(num==1){
            return false;
        }
        if(num == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if((num % i)== 0){
                return false;
            }
        }
        return true;
    }

    

    //Convert Binary to decimal
    public static int BinaryToDecimal(int bin){
        int Result=0;
        int pow = 0;
        while(bin>0){
            int lastdig = bin%10;
            Result += lastdig* (int)Math.pow(2, pow);
            pow++;
            bin = bin/10;
        }
        return Result;
    }


    //Convert Decimal to Binary
    public static void DecimalToBinary(int num){
        int Bin=0;
        int pow=0;
        while(num>0){
            int rem = num%2;
            Bin += (rem*(int)Math.pow(10, pow));
            pow++;
            num = num/2; 
        }
        System.out.println(Bin);
    }
    public static void main(String[] args) {
        
    // public static[access modifier]  void[return type]  main()[main function, input/parameter] 
        //we cannot make function name whith the reverve name like Main

            // call BY value ==> if we change any value in the function it is not reflect outside of that function 


            //swap value of two variable
            int var1=10;
            int var2=20;
            System.out.println(var1);
            ReplateValueOfVariable(var1, var2);
            System.out.println(var1); // It also print value 10 Because function not change value in the original variable


            //factorial of a number
            System.out.println(Fact(5));

            //Function Oveloading 
            Sum(5, 10);
            Sum(5.0F, 10.2F);
            Sum(5,10,15);


            //Prime numer
            System.out.println(CheckPrime(5));


            //Binary To decimal conversion
            System.out.println(BinaryToDecimal(101));

            
            //Decimal to Binary
            DecimalToBinary(7);

    }
}
