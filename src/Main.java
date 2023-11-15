public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        System.out.println("Ф.И.О.сотрудника — "+middleName+" "+firstName+" "+lastName);
        //Задача 2
        System.out.println("Задача 2");
        String fullName= "Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — "+(fullName.toUpperCase()));
        //Задача 3
        System.out.println("Задача 3");
        String fullName1= "Иванов Семён Семёнович";
        String fullName2= fullName1.replace("ё","е");
        System.out.println(fullName2);
    }
}