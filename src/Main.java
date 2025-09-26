/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Edward
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sum2=add(0,1);
        System.err.println(sum2);
        int sum4=add(0,1,2,3);
        System.err.println(sum4);
        String morning=morningGreeting("Toby", "Fox");
        System.err.println(morning);
        String afternoon=afternoonGreeting("Mac", "Miller");
        System.err.println(afternoon);
        String tripletext=triple("oohbaby");
        System.err.println(tripletext);
        int roundpositive=roundPositiveValueToNearestInteger(6.7);
        System.err.println(roundpositive);
        int roundnegative=roundNegativeValueToNearestInteger(-9.9);
        System.err.println(roundnegative);


  
        
    }

    // 1. add
    public static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    
    // 2. add
    public static int add(int a, int b, int c, int d){
        int once=add(a,b);
        int twice=add(c,d);
        int thrice=add(once,twice);
        return thrice;
    }

    // 3. morningGreeting
    public static String morningGreeting(String firstname){
        String greeting="早上好, " + firstname + "!";
        return greeting;
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String firstname){
        String greeting="下午好, " + firstname + "!";
        return greeting;
    }

    // 5. triple
    public static String triple(String text){
        String tripletext=text+text+text;
        return tripletext;
    }


    // 6. half
    public static double half(int x){
        double halfvalue=x/2.0;
        return halfvalue;
    }


    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double x){
        int value=(int)(x+0.5);
        return value;
    }



    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double x){
        int value=(int)(x-0.5);
        return value;
    }

}
