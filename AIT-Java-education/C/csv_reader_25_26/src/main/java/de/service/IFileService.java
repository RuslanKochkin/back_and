package de.service;

import java.io.File;
import java.util.List;

public interface IFileService {
    /**
     *
     * @param folderPath Path to folder
     * @return read file
     */
    File readFolder(String folderPath);

    /**
     *
     * @param fileToRead File to read
     * @return A list of rows
     */
    List<String>readFile(File fileToRead);

    /**
     *
     * @param rows Rows to write
     * @param pathToWrite Path to write
     */
    void writefile(List<String> rows, String pathToWrite);
}
