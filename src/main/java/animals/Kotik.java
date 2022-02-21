package animals;

import java.util.*;

public class Kotik {
    private String name; // имя
    private String voice; // голос
    private int satiety; // сытость
    private int weight; // вес
    private static int count = 0; // отвечает за кол-во экземпляров класса
    private static ArrayList cat = new ArrayList(count);

    // Конструкторы //
    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;

    }

    public Kotik() {
        name = getName();
        voice = getVoice();
        satiety = getSatiety();
        weight = getWeight();
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public static int getCount() {
        return count++;
    }

    public void setCount(int count) {
        this.count = getCount();
    }

    public static void setCat(ArrayList cat) {
        Kotik.cat = cat;
        count++;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int play; // играть
    private int sleep; // спать
    private int wash; // умываться
    private int walk; // гулять
    private int hunt; // охотиться
    private String eda;

    public String getEda() {
        return eda;
    }

    public void setEda() {
        this.eda = eda;
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public int getWash() {
        return wash;
    }

    public void setWash(int wash) {
        this.wash = wash;
    }

    public int getWalk() {
        return walk;
    }

    public void setWalk(int walk) {
        this.walk = walk;
    }

    public int getHunt() {
        return play;
    }

    public void setHunt(int hunt) {
        this.hunt = hunt;
    }

    public boolean play() {
        setPlay(play);
        if (satiety > 0) {
            satiety--;
            //  System.out.println("Котик играет");
            return true;
        } else {
            System.out.println("Котик просит есть ");
            return false;
        }
    }

    public boolean sleep() {
        setSleep(sleep);
        if (satiety > 0) {
            satiety--;
            //    System.out.println("Котик спит");
            return true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean wash() {
        setWash(wash);
        if (satiety > 0) {
            satiety--;
            //    System.out.println("Котик умывается");
            return true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean walk() {
        setWalk(walk);
        if (satiety > 0) {
            satiety--;
            //    System.out.println("Котик гуляет");
            return true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }
    }

    public boolean hunt() {
        setHunt(hunt);
        if (satiety > 0) {
            satiety--;
            //  System.out.println("Котик охотится");
            return true;
        } else {
            System.out.println("Котик просит есть");
            return false;
        }

    }

    public boolean getSatiety(int s2) {
        if (satiety < 1) {
            satiety++;
            return true;
        } else {
            return false;
        }
    }

    public void eat(int s2) {
        this.satiety = satiety;
        if (satiety < 1) {
            getSatiety();
            satiety++;
            satiety += s2;
            System.out.println("котик поел. Сытость: " + satiety);
        } else {
            System.out.println("Котик не голоден. Уровень сытости: " + satiety);
        }
    }

    public void eat(int satiety, String eda) {
        this.eda = eda;
        this.satiety = satiety;
        System.out.println("Котик ел " + eda + " Уровень сытости " + satiety);
    }

    public void eat() {
        this.satiety = satiety;
        satiety++;
        this.eda = eda;
        this.eat(satiety, eda);
        eat(satiety, eda);
    }

    private static final int METHODS = 5;

    public String[] liveAnotherDay() {
        System.out.println("Имя: " + getName());
        System.out.println("Вес: " + getWeight());
        String[] myArray= new String[24];
        for (int num = 0; num < myArray.length; num++) {
            switch ((int) (Math.random() * METHODS) + 1) {
                case 1:
                    if (play()) {
                        myArray[num] = num + " - " + "играл";
                    }
                    break;
                case 2:
                    if (sleep()) {
                        myArray[num] = num + " - " + "спал";
                    }
                    break;
                case 3:
                    if (wash()) {
                        myArray[num] = num + " - " + "умывался";
                    }
                    break;
                case 4:
                    if (walk()) {
                        myArray[num] = num + " - " + "гулял";
                    }
                    break;
                case 5:
                    if (hunt()) {
                        myArray[num] = num + " - " + "охотился";
                    }
                    break;
            }
                if (satiety <= 0) {eat(7);}
            }
            for (String s : myArray) {
                System.out.println(s);
            }
            System.out.println();
            return myArray;
        }
    }
