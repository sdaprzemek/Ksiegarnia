package com.programowanie2.ksiegarnia.category;

public class Category {

    private int categoryID;
    private String categoryName;
    private int priority;

    public Category(int categoryID, String categoryName, int priority) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.priority = priority;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "ID: " + categoryID +
                ", Name: " + categoryName + "\n";
    }
}
