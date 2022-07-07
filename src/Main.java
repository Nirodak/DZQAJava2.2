public class Main {

    public static void main(String[] args) {

        int startBalance = 100;
        int deposit =1200;
        int bonus;
        int finishBalance;


        if (deposit < 1000) {
             bonus = 0;
        } else {
             bonus = deposit / 100;
        }

        finishBalance = startBalance + deposit + bonus;

        System.out.println("Итоговый баланс " + finishBalance + " Вам начислены бонусы в размере " + bonus);



    }
}
