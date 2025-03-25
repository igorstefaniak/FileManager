package filemanager;

import java.io.File;

public class FileOperations {
    private File currentDirectory;

    public FileOperations() {
        this.currentDirectory = new File(System.getProperty("user.dir")); //skąd aplikacja jest uruchomiona
    }

    public File getCurrentDirectory() {
        return currentDirectory;
    }
    
}
