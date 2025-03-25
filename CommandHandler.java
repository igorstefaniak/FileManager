package filemanager;
import java.util.Scanner;

public class CommandHandler {
    
    private FileOperations fileOperations;

    public CommandHandler(FileOperations fileOperations) {
        this.fileOperations = fileOperations;
    }

    public void processCommands() {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Nawigator plików: użyj /? lub /h aby wyświetlić pomoc.");
        while (true) {
            System.out.print(fileOperations.getCurrentDirectory().getAbsolutePath() + "> --> " );
            command = scanner.nextLine().trim();
            if (command.equalsIgnoreCase("/q") || command.equalsIgnoreCase("/exit") || command.equalsIgnoreCase("/quit")) {
                break;
            }
            processCommand(command);
        }
        scanner.close();
    }
    private void processCommand(String command) {
        //TODO przetwarzanie komend
        String[] tokens = command.split("\\s+");
        if (tokens.length == 0) {
            return;
        }
        switch (tokens[0].toLowerCase()) {
            case "/?", "/help", "/h" -> printHelp();
        }
    }
    private void printHelp() {
        //TODO sformatować do tabelki
        System.out.println("Dostępne komendy:");
        System.out.println("/help, /?, /h- wyświetla pomoc");
        System.out.println("/ls- listuje pliki i foldery");
        System.out.println("/cd <ścieżka>- zmienia katalog (użyj '..' aby wrócić do katalogu nadrzędnego)");
        System.out.println("/mkdir <nazwa>- tworzy folder");
        System.out.println("/mkfile <nazwa>- tworzy pusty plik");
        System.out.println("/rm <nazwa>- usuwa plik lub folder (foldery usuwane rekurencyjnie)");
        System.out.println("/exit, /quit, /q- wychodzi z programu");
    }
}
