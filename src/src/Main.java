public class Main {
    public static void main(String[] args) {
        double temp = 9.2;
        boolean cold = temp <= 10;
        if (cold) {

            System.out.println("Смотреть сериал");
        }
        else {
            System.out.println("Идем гулять");
        }


        int zarplata = 190_000;
        double premiya = 135_000.6;
        int rabotnikov = 1500;
        double zarabotok_za_god = (zarplata + premiya)*12;
        System.out.println(zarabotok_za_god);
        int fot_mes = zarplata * rabotnikov;
        System.out.println(fot_mes);

//        переполнение
        int fot_god = fot_mes * 12;
        System.out.println(fot_god);


//        String name = "Саша";
//        System.out.println(name + " любит пить кофе");
//        int age = 17;
//        System.out.println(name + " ученик, ему " + age + " лет");



    }
}