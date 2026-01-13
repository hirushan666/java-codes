package oop;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();
        s2.showMessage();

        if (s1==s2)
        {
            System.out.println("Instances are the same");

        }
        else{
            System.out.println("Instances are not the same");
        }



    }
}
