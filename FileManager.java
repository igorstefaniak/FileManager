
import java.io.File;
import java.util.Scanner;

public class FileManager {

    private File currentDirectory;

    public FileManager() {
        currentDirectory = new File(System.getProperty("user.dir")); //skąd aplikacja jest uruchomiona
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.println("Nawigator plików: użyj /? aby wyświetlić pomoc.");
        while (true) {
            System.out.print(currentDirectory.getAbsolutePath() + " > ");
            command = scanner.nextLine().trim();
            if (command.equalsIgnoreCase("q")) {
                break;
            }
            processCommand(command);
        }
    }

    private void processCommand(String command) {
        //TODO przetwarzanie komend
    }

    public static void main(String[] args) {
        FileManager manager = new FileManager();
        manager.run();
    }
}
