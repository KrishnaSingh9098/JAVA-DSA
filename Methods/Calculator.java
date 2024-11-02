package Methods;

// METHODS OVERLOADING EXAMPLE BY Diffferent Number Of Arguments
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, double b) {
        return (int) (a + b);// DIfference Types Of Arguments.  By using Type Casting
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // public double add(int a,int b){
    //     return a+b+0.5;
    // }    
    
    
    // differnt datatype does not allow to do method overloadoing

    public static void main(String[] args) {

    }

}

    // USE of Method Overloading is to give Similar Types Of Functionalities

    // Calculator class Overloading means Makes simple to End USers

    // Question : IS this method over;loading or not

//     int add(int a, int b) {
//         return a + b;
//     }

// double add(int a,int b){
//     returna+b+0.5
// }            


//                  *****     RETURN TYPE CHNAGE KAR DENE SE METHOD OVERLOADING NHI HOTA HAI        ******          //