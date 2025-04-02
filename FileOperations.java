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

    public Object listFiles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listFiles'");
    }

    public void changeDirectory(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeDirectory'");
    }

    public void createDirectory(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createDirectory'");
    }

    public void createFile(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createFile'");
    }

    public void delete(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
