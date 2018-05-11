package com.programowanie2.ksiegarnia.category;

import java.util.List;

public class CategoriesData {

    private static CategoriesData instance = new CategoriesData();

    private CategoriesData() {}

    private List <Category> categories;

    public static CategoriesData getInstance() {
        return instance;
    }

    public List<Category> getAllCategories() {
        return categories;
    }

    public void setCategories(List <Category> categories) {
        this.categories = categories;
    }
}
