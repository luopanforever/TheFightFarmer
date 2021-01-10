import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class TheFightFamer {
    public static void main(String[] args) {
        System.out.println("请输入玩家一的名字");
        String num1 = new Scanner(System.in).next();
        System.out.println("请输入玩家二的名字");
        String num2 = new Scanner(System.in).next();
        System.out.println("请输入玩家三的名字");
        String num3 = new Scanner(System.in).next();
        System.out.println("这三名玩家的名字分别是" + num1 + "," + num2 + "," + num3);
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> player04 = new ArrayList<>();
        String[] a = {"2", "A", "k", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3" };
        String[] b = {"♣", "♥", "♠", "♦" };
        ArrayList<String> cards = new ArrayList<>();
        cards.add("大王");
        cards.add("小王");
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 13; i1++) {
                cards.add(b[i] + a[i1]);
            }
        }
        Collections.shuffle(cards);
        for (int i = 0; i < 54; i++) {
            if (i > 50) {
                player04.add(cards.get(i));
            } else {
                if (i % 3 == 0) {
                    player01.add(cards.get(i));
                } else if (i % 3 == 1) {
                    player02.add(cards.get(i));
                } else if (i % 3 == 2) {
                    player03.add(cards.get(i));
                }
            }
        }
        System.out.println("此次发牌结果如下：(无花片,且拥有♥3的为地主)");
        System.out.println(num1 + "的手牌：");
        System.out.println(player01);
        System.out.println(num2 + "的手牌：");
        System.out.println(player02);
        System.out.println(num3 + "的手牌：");
        System.out.println(player03);
        System.out.println("底牌：");
        System.out.println(player04);
        if (player01.contains("♥3")) {
            System.out.println(num1 + "是地主");
            for (int i = 0; i < player04.size(); i++) {
                player01.add(player04.get(i));
            }
            System.out.println("其手牌为" + player01);
        } else if (player02.contains("♥3")) {
            System.out.println(num1 + "是地主");
            for (int i = 0; i < player04.size(); i++) {
                player02.add(player04.get(i));
            }
            System.out.println("其手牌为" + player02);
        } else if (player03.contains("♥3")) {
            System.out.println(num1 + "是地主");
            for (int i = 0; i < player04.size(); i++) {
                player03.add(player04.get(i));
            }
            System.out.println("其手牌为" + player03);
        } else if (player04.contains("♥3")) {
            System.out.println("糟糕，♥3在底牌里面，那就♥4叭");
            if (player01.contains("♥4")) {
                System.out.println(num1 + "是地主");
                for (int i = 0; i < player04.size(); i++) {
                    player01.add(player04.get(i));
                }
                System.out.println("其手牌为" + player01);
            } else if (player02.contains("♥4")) {
                System.out.println(num1 + "是地主");
                for (int i = 0; i < player04.size(); i++) {
                    player02.add(player04.get(i));
                }
                System.out.println("其手牌为" + player02);
            } else if (player03.contains("♥4")) {
                System.out.println(num1 + "是地主");
                for (int i = 0; i < player04.size(); i++) {
                    player03.add(player04.get(i));
                }
                System.out.println("其手牌为" + player03);
            } else if (player04.contains("♥4")) {
                System.out.println("卧槽牛逼，♠4竟然也在底牌里面，那就黑桃5叭");
                if (player01.contains("♥5")) {
                    System.out.println(num1 + "是地主");
                    for (int i = 0; i < player04.size(); i++) {
                        player01.add(player04.get(i));
                    }
                    System.out.println("其手牌为" + player01);
                } else if (player02.contains("♥5")) {
                    System.out.println(num1 + "是地主");
                    for (int i = 0; i < player04.size(); i++) {
                        player02.add(player04.get(i));
                    }
                    System.out.println("其手牌为" + player02);
                } else if (player03.contains("♥5")) {
                    System.out.println(num1 + "是地主");
                    for (int i = 0; i < player04.size(); i++) {
                        player03.add(player04.get(i));
                    }
                    System.out.println("其手牌为" + player03);
                } else if (player04.contains("♥5")) {
                    System.out.println("雅客，去买彩票叭，这运气也是没sei啦，那就♠6是地主");
                    if (player01.contains("♥5")) {
                        System.out.println(num1 + "是地主");
                        for (int i = 0; i < player04.size(); i++) {
                            player01.add(player04.get(i));
                        }
                        System.out.println("其手牌为" + player01);
                    } else if (player02.contains("♥5")) {
                        System.out.println(num1 + "是地主");
                        for (int i = 0; i < player04.size(); i++) {
                            player02.add(player04.get(i));
                        }
                        System.out.println("其手牌为" + player02);
                    } else if (player03.contains("♥5")) {
                        System.out.println(num1 + "是地主");
                        for (int i = 0; i < player04.size(); i++) {
                            player03.add(player04.get(i));
                        }
                        System.out.println("其手牌为" + player03);
                    }
                }
            }
        }
    }
}