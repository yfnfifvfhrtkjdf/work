import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotic1 = new Kotik("Garry", "Meow", 6, 4);
        Kotik.getCount();
        Kotik kotic2 = new Kotik();
        Kotik.getCount();
        kotic2.setName("Torry");
        kotic2.setVoice("Shhhhhh");
        kotic2.setSatiety(5);
        kotic2.setWeight(3);
        kotic2.liveAnotherDay();
        compareVoice(kotic1, kotic2);
        System.out.println("Количество котиков " + Kotik.getCount());

    }

    private static boolean compareVoice(Kotik kot1, Kotik kot2) {
        int kkk = kot1.getVoice().compareTo(kot2.getVoice());
        System.out.println("голоса котиков: " + kkk + "(разные)");
        return true;
    }
}