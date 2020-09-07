package com.test.springapplications.pojo;

public class SpringDemoInheritance {

    private String message;
    private String message2;
    private String message3;

    public void getMessage2() {
        System.out.println("Hello" + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void getMessage3() {
        System.out.println("Hello" + message3);
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }

    public void getMessage() {
        System.out.println("Hello" + message);

    }

    public void setMessage(String message) {
        this.message = message;
    }
}
