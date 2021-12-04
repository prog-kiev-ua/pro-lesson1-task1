package ua.kovalev;

import com.google.gson.Gson;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("json.txt"));
        String json = br.lines().collect(Collectors.joining());
        Books books = new Gson().fromJson(json, Books.class);
        System.out.println(books);
    }
}
