import org.jetbrains.annotations.Contract;

public class Jeneric {




    static class DataBaseWriter<T> {
        //Здесь мы объявляем обобщенный тип T для значения поля.
        // Конструктор берет за основу два аргумента - имя данных и значение для собрания.
        // Метод сохранения выводит сообщение на экран со сведениями о типе данных, используя метод getClass() и метод getSimpleName(), который возвращает простое имя класса без пакета.
        private String database;
        private T value;
        private String databaseName;

        public void save(){
            System.out.println("Данные в базу данных %s записано значение с типом %s\n " + database + " записаны, тип данных = " + value.getClass().getSimpleName());

        }

        public DataBaseWriter(String databaseName , T value) {
            this.database = databaseName;
            this.value = value;
        }
            public String getDatabase() {
                return database;
        }





    public void setDatabase(String databaseName) {
            this.databaseName = databaseName;
        }

     public T getValue(){
            return value;
     }

    public void setValue(){
            this.value = value;
    }






    }







        }



        







    
