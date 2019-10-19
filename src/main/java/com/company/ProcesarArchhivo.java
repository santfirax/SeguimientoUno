package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcesarArchhivo {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("src\\main\\resources\\productos.csv"), Charset.forName("Cp1252"))) {
            List<Catalogo> catalogos = lines.map(s -> s.split(","))
                    .map(s -> new Catalogo(s[0], s[1], s[2], s[3], s[4]))
                    .collect(Collectors.toList());
            catalogos.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
