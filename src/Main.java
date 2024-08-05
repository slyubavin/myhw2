public class Main {
    public static void main(String[] args) {

        int eaters = 5; // сколько людей будут есть

        double water = 6; // миллилитров воды
        int potatoes = 6; // картофелин
        int chicken = 6; // куриных бёдер
        int spices = 6; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eaters) + " миллилитров(а) воды");
        System.out.println((potatoes / eaters) + " картофелин(а/ы)");
        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + " ложек(ки/ка) специй");

    }
}