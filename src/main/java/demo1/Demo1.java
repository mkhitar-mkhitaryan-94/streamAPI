package demo1;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Demo1  {


    static final String PATH_TO_DEMO_TXT_FILE = "src/main/resources/data.txt";

    public static void main(String[] args) throws IOException {
        //Считываем данные из файла
        byte[] bytes = Files.readAllBytes(Paths.get(PATH_TO_DEMO_TXT_FILE));


        //Преобразуем текст из файла в символьную строку
        String contents = new String(bytes, StandardCharsets.UTF_8);

        //Выделяем из всего файла - список слов
        String[] words = contents.split("\\PL+");

        //Выполняем подсчет количества слов
        int count = 0;
        for (String w : words) {
            if (w.length() > 8) {//считаем слово длинным, если length > 12
                count++;
            }
        }

        //  Collection

        System.out.println(count);

    }
}
