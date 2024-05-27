package com.example.mobliegame;

// MemoryCard.java
public class MemoryCard {

    private int imageId;
    private boolean isFaceUp;
    private boolean isMatched;

    public MemoryCard(int imageId, boolean isFaceUp, boolean isMatched) {
        this.imageId = imageId;
        this.isFaceUp = isFaceUp;
        this.isMatched = isMatched;
    }
    public int getImageId() {
        return imageId;
    }
    public boolean isFaceUp() {
        return isFaceUp;
    }
    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }
    public boolean isMatched() {
        return isMatched;
    }
    public void setMatched(boolean matched) {
        isMatched = matched;
    }
}