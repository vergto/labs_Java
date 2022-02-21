package com.company.laboratorka3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

class MyFile {
    protected File file;
    public MyFile(String filename) throws IOException {
        file = new File(".", filename);
        if (file.exists()){
            System.out.println("Файл удален и создан новый");
            file.delete();
        }
        file.createNewFile();
    }

    public boolean delete () {
        return file.delete();
    }
    public void rename (String newFilename) {
        File fileNewName = new File(newFilename);
        if (fileNewName.exists()) {
            fileNewName.delete();
            System.out.println("Файл удален и создан новый");
        }


        boolean success = file.renameTo(fileNewName);
        if (success) {
            file = fileNewName;
            System.out.println("File Rename success");
        }else System.out.println("File is not Rename");
//        try {
//            Path source = Paths.get(String.valueOf(file));
//            Files.move(source, source.resolveSibling("." + newFilename));
//        }catch(Exception e) {
//            System.out.println(e);
//        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyFile myFile = (MyFile) o;
        return Objects.equals(file, myFile.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file);
    }

    @Override
    public String toString() {
        return "MyFile{" +
                "file=" + file +
                '}';
    }
}

public class TextFile  extends MyFile {

    public TextFile(String filename) throws IOException {
        super(filename +".txt");
    }

    @Override
    public void rename(String newFilename) {
        super.rename(newFilename+".txt");
    }

    public void print() throws IOException {
        System.out.println(file);
        System.out.println(file.getName());
        BufferedReader fin = new BufferedReader(new FileReader(file));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
    }


    public void append(String text) {
        try(FileWriter writer = new FileWriter(file, true)) {
            writer.write(text + " " );
            writer.flush();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }



}
