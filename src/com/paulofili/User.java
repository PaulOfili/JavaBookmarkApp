package com.paulofili;

public class User {
    protected void printUserType() {
        System.out.println("I am a User");
    }

    protected void saveWebLink() {
        System.out.println("User saved weblink");
        postReview();
    }

    protected void postReview() {
        System.out.println("User posted review");
    }
}
