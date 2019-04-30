import java.util.concurrent.TimeUnit;

public class Challenge {
    //Switch, If, While, Do, For

    public static void main(String[] args) throws InterruptedException {
        int i = 1;
        do {
            while (i <= 10) {
                if (i % 2 == 0) {
                    TimeUnit.MILLISECONDS.sleep(250);
                    switch (i) {
                        case 2:
                            System.out.println("2 Turtledoves");
                            break;
                        case 4:
                            System.out.println("4 Calling Birds");
                            break;
                        case 6:
                            System.out.println("6 Geese a Laying");
                            break;
                        case 8:
                            System.out.println("8 Maids a milking");
                            break;
                        case 10:
                            System.out.println("10 Lords a Leaping");
                            break;
                    }
                } else {
                    System.out.println(i + " is the odd one out!");
                }
                i++;
            }
            System.out.println(i);
            for (int cookieMonster = 0; cookieMonster < 6; cookieMonster++) {
                System.out.println("Lulz abound!");
            }
        } while (i < 11);
    }
}
