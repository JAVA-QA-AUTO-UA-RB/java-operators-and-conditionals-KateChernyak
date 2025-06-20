import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ласквао просимо до казкового лісу!");
        System.out.println("Ваше завдання - пройти ліс, ухвалюючи правильні рішення");
        System.out.println("На старті Здоров'я=100, Удача=50 ");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int health = 100;
        int luck = 50;
// Action 1
        System.out.println("Ви йшли чарівною стежкою, і натрапили на роздоріжжя: 1 - піти старою стежкою, 2 - обрати скарб серед кущів ");

        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            System.out.println("Ви обрали піти старою стежкою");
            health -= 20;
            System.out.println("Ви пішли старою стежкою і втратили 20 очок здоров’я.");
        } else if (choice1 == 2) {
            System.out.println("Ви обрали скарб серед кущів та отримали 30 очок удачі");
            luck += 30;
            System.out.println("Ви отримали скарб та 30 очок удачі! ");
        } else if (choice1 > 2) {
            System.out.println("Ви заплуталися");
            health -= 10;
            System.out.println("Ви заплуталися і втратили 10 очок здоров’я.");
        }
// Action 2
        System.out.println("Перед Вами постає загадковий колодязь");
        System.out.println("Що Ви зробите? 1 - вип'єте магічної води, 2 - ігноруєте колодязь ");

        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            System.out.println("Ви обрали випити магічну воду");
            health += 50;
            System.out.println("Ви випили магічну воду з колодця та отримали 50 очок до здоров’я.");
        } else if (choice2 == 2) {
            System.out.println("Ви обрали ігнорувати колодязь");
            luck -= 10;
            System.out.println("Ви проігнорували магічну воду і втомились, тому втратили 10 очок удачі ");
        } else if (choice2 > 2) {
            System.out.println("Ви нічого не обрали");
            System.out.println("Ваш стан здоров'я та удачі не змінився ");

        }
// Action 3
        System.out.println(" Ви зустріли на шляху чарівну істоту, яка перевірить Вашу талан");
        System.out.println("Чарівна істота пильно вдивляється у Ваші очі та обирає дію");
        int choiceOfCreature = random.nextInt(3) + 1;
        if (choiceOfCreature == 1) {
            System.out.println("Істота дружня і ділиться з Вами їжею");
            health += 20;
        } else if (choiceOfCreature == 2) {
            System.out.println("Істота ворожа та атакує, при цьому забирає 30 очок здоров’я.");
            health -=30;
        } else if (choice2 == 3) {
            System.out.println("Істота байдужа до Вас і нічого не змінює");}
// Player Status Chek
        System.out.println("Поточний стан Вашого здоров'я: " + health);
        System.out.println("Поточний стан Вашої Удачі: " + luck);
        if (health <= 0 || luck <= 0) {
            System.out.println("Ви не змогли пройти ліс... Спробуйте ще раз!");
        } else {
            System.out.println("Вітаємо! Ви змогли пройти через чарівний ліс!");
        }
    }
}
