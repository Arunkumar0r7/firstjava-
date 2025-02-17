/*function in java

public class mobile {

    void iphone(){
        System.out.println("this is iphone ");
        realme();
        samsung();
        oppo();


    }

    void realme(){
        System.out.println("this is realme");

    }

    void samsung(){
        System.out.println("this is samsung");
    }

    void oppo(){

        System.out.println("this is oppo");
    }
    public static void main(String[] args) {

        mobile name = new mobile();
        name.iphone();

    }


}

//functions
// this should be have two variables
//a =10
//b = 20

//create a function called sum which should add a&b and print the total output

class mobile{
 int a = 10;
 int b=20;

 void sum(){
     System.out.println(a+b);
 }

    public static void main(String[] args) {
        mobile output = new mobile();
        output.sum();
    }
}


// create a function called total money  which should multiply count with price  and print the total amount
class mobile{

    int apple_price = 20;
    int apple_count = 5;

    void total_money(){
        System.out.println(apple_price*apple_count);
    }
    public static void main(String[] args) {
        mobile display = new mobile();
        display.total_money();
    }
}

// function and parameters

public class mobile {

    void chocolate(int money ){
        System.out.println(money);
        System.out.println("choclate purchased");

    }

    void powder(int money){
        System.out.println(money);
        System.out.println("powder purchased ");
    }

    public static void main(String[] args) {
        mobile obj = new mobile();
        obj.chocolate(50);
        obj.powder(30);
    }
}

//exercise

//creat a function called sum,send two numbers from main function and add these numbers using function and print it
public class mobile{

    void sum(int num1 ,int num2 ){
        System.out.println(num1+num2 );
        System.out.println("sum is printed ");


    }

    public static void main(String[] args) {
        mobile obj = new mobile();
        obj.sum(30,2);

    }
}

//return keyword

public class mobile{

    String myname ( String name){
        return name;
    }

    public static void main(String[] args) {
        mobile obj = new mobile();
        String message = obj.myname("arun");
        System.out.println(message);

    }
}*/