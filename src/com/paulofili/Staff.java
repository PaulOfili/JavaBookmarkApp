package com.paulofili;

public class Staff extends User{
    protected void printUserType() {
        System.out.println("I am a Staff");
    }

    protected Review postReview() {
        System.out.println("Staff posted review");
        Review review = super.postReview();
        review.setApproved(true);
        return review;
    }
}
