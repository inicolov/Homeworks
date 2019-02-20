package com.company;

public class Folder extends FileSystemObject {

    FileSystemObject [] fileSystemObjects = new FileSystemObject[5];


    public Folder(String name) {
        super(name);
    }

    @Override
    public int getSize() {

        return 0;
    }

}
