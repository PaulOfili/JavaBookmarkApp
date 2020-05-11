package com.paulofili;

public class User {
    protected void printUserType() {
        System.out.println("I am a User");
    }

    protected void saveWebLink() {
        System.out.println("User saved webLink");
        System.out.println(postReview().isApproved());
    }

    protected Review postReview() {
        System.out.println("User posted review");
        return new Review("Sample review");
    }

    public String toString() {
        return "\nPrinting User info such as.";
    }
}
