import java.time.LocalDate;

import static java.lang.String.valueOf;
import static java.time.LocalDate.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        Jeneric.DataBaseWriter<String> dataBaseWriter = new Jeneric.DataBaseWriter<>("MySQL", "Hello World!");
                  // выводит: Данные в базу данных  MySQL записаны, тип данных = String

        Jeneric.DataBaseWriter<Integer> dataBaseWriter1 = new Jeneric.DataBaseWriter<>("MySQL", 123);
        // выводит: Данные в базу данных MySQL записаны, тип данных = Integer

        Jeneric.DataBaseWriter<LocalDate> dateDateDataBaseWriter = new Jeneric.DataBaseWriter<>("PostgreSQL", LocalDate.now());

        dataBaseWriter.save();
        dataBaseWriter1.save();
        dateDateDataBaseWriter.save();


    }
}