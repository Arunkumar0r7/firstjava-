class animal{

    int nolegs = 4;

    void eat(){
        System.out.println(" i am eating");
    }
}

class dog extends animal{

}

public class animal2 {
    public static void main(String[] args) {
        dog obj = new dog();
        System.out.println(obj.nolegs);
        obj.eat();
    }
}