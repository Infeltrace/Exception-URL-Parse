package com.company;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args)  {

        Path source = Paths.get("D:\\result.txt");
        Path destination = Paths.get("D:\\progress.txt");

        try {
            new Warehouse(source.toString(),destination.toString()).copy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

