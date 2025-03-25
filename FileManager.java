import java.io.File;

public class FileManager {

    private File currentDirectory;

    public FileManager() {
        currentDirectory = new File(System.getProperty("user.dir")); //skąd aplikacja jest uruchomiona
    }

    public static void main(String[] args) {
        
    }
}