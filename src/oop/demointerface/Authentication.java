package oop.demointerface;

public class Authentication implements Resource{

    @Override
    public void loading() {
        System.out.println("Loading");
    }

    @Override
    public void success() {
        System.out.println("Success");

    }

    @Override
    public void fail() {
        System.out.println("fail");
    }

}
