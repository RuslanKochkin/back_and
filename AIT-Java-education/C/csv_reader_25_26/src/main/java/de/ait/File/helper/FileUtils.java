package de.ait.File.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileUtils {
    static long readFileAttribute(File file) {
        try {
            BasicFileAttributes attr = Files.readAttributes(file.getAbsoluteFile().toPath(), BasicFileAttributes.class);
            FileTime fileTime = attr.creationTime();
            return fileTime.toMillis();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
