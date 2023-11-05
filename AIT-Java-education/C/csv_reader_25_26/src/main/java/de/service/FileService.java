package de.service;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FileService implements IFileService{
    private static final String ALLOWED_EXTENSION = ".csv";
    @Override
    public File readFolder(String folderPath) {
        File directory = new File(folderPath);
        if(!directory.isDirectory()){
            throw  new RuntimeException("This path is not a directory");
        }
        List<Object> files = new ArrayList<>();
        for (File file: directory.listFiles()){
           if (file.getName().endsWith(ALLOWED_EXTENSION)){
               files.add(file);
           }
        }
//        files.sort();
        return null;
    }

    @Override
    public List<String> readFile(File fileToRead) {
        try {
            return Files.readAllLines(fileToRead.getAbsoluteFile().toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writefile(List<String> rows, String pathToWrite) {
        Path filePath = Path.of(pathToWrite);
        try {
            Files.createFile(filePath);
            for (String row : rows){
                Files.writeString(filePath, row + System.lineSeparator(), StandardOpenOption.APPEND);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    //TODO  write unit test
}

