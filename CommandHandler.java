package filemanager;

import java.util.Scanner;

public class CommandHandler {

    private FileOperations fileOperations;

    public CommandHandler(FileOperations fileOperations) {
        this.fileOperations = fileOperations;
    }

    public void processCommands() {
        try (Scanner scanner = new Scanner(System.in)) {
            String command;

            System.out.println("Nawigator plików: użyj /? lub /h aby wyświetlić pomoc.");
            while (true) {
                System.out.print("PLR " + fileOperations.getCurrentDirectory().getAbsolutePath() + "> "); //➜
                command = scanner.nextLine().trim();
                if (command.equalsIgnoreCase("/q") || command.equalsIgnoreCase("/exit") || command.equalsIgnoreCase("/quit")) {
                    break;
                }
                processCommand(command);
            }
        }
    }

    private void processCommand(String command) {
        String[] tokens = command.split("\\s+");
        if (tokens.length == 0) {
            return;
        }
        switch (tokens[0].toLowerCase()) {
            case "/?", "/help", "/h" -> printHelp();
            case "/ls", "/dir" -> fileOperations.listFiles();
            case "/cd" -> {
                if (tokens.length < 2) {
                    System.out.println("Użycie: cd <ścieżka>");
                } else {
                    fileOperations.changeDirectory(tokens[1]);
                }
            }
            case "/mkdir" -> {
                if (tokens.length < 2) {
                    System.out.println("Użycie: mkdir <nazwa_folderu>");
                } else {
                    fileOperations.createDirectory(tokens[1]);
                }
            }
            case "/touch", "/mkfile" -> {
                if (tokens.length < 2) {
                    System.out.println("Użycie: touch <nazwa_pliku>");
                } else {
                    fileOperations.createFile(tokens[1]);
                }
            }
            case "/rm" -> {
                if (tokens.length < 2) {
                    System.out.println("Użycie: rm <nazwa_pliku/folderu>");
                } else {
                    fileOperations.delete(tokens[1]);
                }
            }
            default -> System.out.println("Nieznana komenda. Wpisz '/h' aby uzyskać pomoc.");
        }
    }

    private void printHelp() {
        //TODO sformatować do tabelki
        System.out.println("Dostępne komendy:");
        System.out.println("/help, /?, /h- wyświetla pomoc");
        System.out.println("/ls, /dir- listuje pliki i foldery");
        System.out.println("/cd <ścieżka>- zmienia katalog (użyj '..' aby wrócić do katalogu nadrzędnego)");
        System.out.println("/mkdir <nazwa>- tworzy folder");
        System.out.println("/mkfile, /touch <nazwa>- tworzy pusty plik");
        System.out.println("/rm <nazwa>- usuwa plik lub folder (foldery usuwane rekurencyjnie)");
        System.out.println("/exit, /quit, /q- wychodzi z programu");
    }
}
