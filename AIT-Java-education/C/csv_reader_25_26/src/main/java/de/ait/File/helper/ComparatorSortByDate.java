package de.ait.File.helper;

import java.io.File;
import java.util.Comparator;

public class ComparatorSortByDate implements Comparator<File> {
    @Override
    public int compare(File o1, File o2) {
        long o1CreateDate = FileUtils.readFileAttribute(o1);
        long o2CreateDate = FileUtils.readFileAttribute(o2);
        return Long.compare(o1CreateDate, o2CreateDate);
    }
}
