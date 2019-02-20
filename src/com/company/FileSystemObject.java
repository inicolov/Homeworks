package com.company;



public abstract class FileSystemObject {
    private String name;

    public FileSystemObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract int getSize();
}


