package chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesPractice {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get(scanner.nextLine());

        if (Files.exists(path)){
            System.out.printf("%n%s exists", path.getFileName());
            System.out.printf("%n%s a directory", Files.isDirectory(path)? "is" : "is not");
            System.out.printf("%n%s absolute", path.isAbsolute()? "is" : "is not");
            System.out.printf("%n Last modified time %s", Files.getLastModifiedTime(path));
            System.out.printf("%n Size: %s", Files.size(path));
            System.out.printf("%n Absolute: %s", path.toAbsolutePath());

            Files.isDirectory(path);
                try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
                    for (Path filePath:
                         directoryStream) {
                        System.out.println(filePath.getFileName());
                    }
                }

        } else {
            System.out.printf("Path %s is not a directory", path);
        }
    }
}
