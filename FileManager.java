package filemanager;

public class FileManager {
    public static void main(String[] args) {
        FileOperations fileOperations = new FileOperations();
        CommandHandler commandHandler = new CommandHandler(fileOperations);
        commandHandler.processCommands();
    }
}