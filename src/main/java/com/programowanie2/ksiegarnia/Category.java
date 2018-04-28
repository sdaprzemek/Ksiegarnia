package com.programowanie2.ksiegarnia;

public class Category {

    int categoryID;
    String categoryName;
    int numberOfPositions;

    public Category(int categoryID, String categoryName, int numberOfPositions) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.numberOfPositions = numberOfPositions;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getNumberOfPositions() {
        return numberOfPositions;
    }

    public void setNumberOfPositions(int numberOfPositions) {
        this.numberOfPositions = numberOfPositions;
    }

    @Override
    public String toString() {
        return "categoryID: " + categoryID +
                ", Category Name: " + categoryName + '\'' +
                ", Number of positions: " + numberOfPositions +
                '}';
    }
}
