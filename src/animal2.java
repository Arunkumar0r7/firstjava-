class animal {

    void sleep(){
        System.out.println("this animal is slepping");
    }
}

class dog extends animal{
    void eat(){
        System.out.println("dog is eating");
    }
}

class cat extends dog{

}

public class animal2 {
    public static void main(String[] args) {
        dog name = new dog();
        name.sleep();
        name.eat();

    }
}