package utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class CompareVideo {

    public static boolean sameContent(Path file1, Path file2) throws IOException {
        final long size = Files.size(file1);
        System.out.println(size);
        if (size != Files.size(file2))
            return false;

        if (size < 1024000)
            return Arrays.equals(Files.readAllBytes(file1), Files.readAllBytes(file2));

        try (InputStream is1 = new BufferedInputStream(Files.newInputStream(file1));
             InputStream is2 = new BufferedInputStream(Files.newInputStream(file2))) {
            int data;
            while ((data = is1.read()) != -1)
                if (data != is2.read())
                    return false;
        }

        return true;
    }

}
