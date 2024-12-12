import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = "Иванов Иван Иванович";
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        //Задача 2
        String fullNameNew = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameNew);

        //Задача 3
        //String fullName = "Иванов Семён Семёнович";
        //String fullNameNew = fullName.replace("ё","е");
        //System.out.println("Данные Ф. И. О. сотрудника — " + fullNameNew);


    }

}