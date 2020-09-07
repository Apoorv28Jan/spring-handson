package com.test.springapplications.pojo;

public class SpringHierarchy {

    private String message;

    public void getMessage() {
        System.out.println("Hello: " + message);

    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void start() {
        System.out.println("Starting");
    }

    public void end() {
        System.out.println("End");
    }
}
