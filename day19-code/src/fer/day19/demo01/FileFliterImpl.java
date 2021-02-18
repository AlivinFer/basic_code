package fer.day19.demo01;

import java.io.File;
import java.io.FileFilter;

/**
 * @author: Alivin Fer
 * @date: 2020/12/29 13:17
 **/

public class FileFliterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return false;
    }
}
