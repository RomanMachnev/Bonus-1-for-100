public class Main {
    public static void main(String[] args) {
        int start = 100;
        int popolnil = 1100;
        int value = 1000;
        int bonus;
        int balance;
        if (popolnil < value) {
            balance = popolnil + start;
            System.out.println(balance);
        } else {
            int other = 100;
            bonus = popolnil / other + popolnil + start ;
            System.out.println(bonus);
        }
    }

    }
