package com.paulofili;

public class Review {
    private String reviewText;
    private boolean isApproved;

    public Review(String reviewText) {
        this.reviewText = reviewText;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
}
