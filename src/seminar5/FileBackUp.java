package seminar5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileBackUp {
    String sourceDir = "./src/seminar5/sources";
    String backUpDir = "./backup";
    public void start() {
        try {
            File backUpDirectory = new File(backUpDir);
            if (!backUpDirectory.exists()) {
                backUpDirectory.mkdirs();
            }
            File[] files = new File(sourceDir).listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        Path sourcePath = file.toPath();
                        Path destinationPath = new File(backUpDir + File.separator + file.getName()).toPath();
                        Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Successfully copied " + file.getName() + " to " + backUpDir);
                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}