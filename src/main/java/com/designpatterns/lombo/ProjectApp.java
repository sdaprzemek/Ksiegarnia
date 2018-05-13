package com.designpatterns.lombo;

class ProjectApp {

    public static void main(String[] args) {
        Project project = Project.builder().name("Przemek Miller").company("SDAcademy").author("John Wick").closed(false).build();

        System.out.println(project.toString());
    }
}
