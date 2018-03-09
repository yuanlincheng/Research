package com.ylc.streams;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Created by tree on 2017/6/11.
 */
public class StudyStream {

    public boolean readFileContent(String filePath){
        Path path = new File(filePath).toPath();
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            lines.onClose(() -> System.out.println("Done!")).forEach(System.out::println);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
