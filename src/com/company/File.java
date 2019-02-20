package com.company;

public class File extends FileSystemObject {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size=size;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
