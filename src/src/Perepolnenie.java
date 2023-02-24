public class Perepolnenie {
    //    математические операторы
    public static void main(String[] args) {
        int zarplata = 190000;
        double premiya = 135000.6;
        int rabotnikov = 1_500;
        double zarabotok_za_god = (zarplata + premiya)*12;
        System.out.println(zarabotok_za_god);
        int fot_mes = zarplata * rabotnikov;
        System.out.println(fot_mes);

        int fot_god = fot_mes * 12; //переполнение
        System.out.println(fot_god);

        double dney = 247.0;
        int otpusk = 28;
        double dneyOtpuskaZaMesyacRaboty = (otpusk/dney*21);
        System.out.println(dneyOtpuskaZaMesyacRaboty);

        int otpusknyevseh_za_god = fot_god/365*28; //переполнение
        System.out.println(otpusknyevseh_za_god);
    }

}
