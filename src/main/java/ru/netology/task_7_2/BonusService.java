package ru.netology.task_7_2;

public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
    public void register(boolean registered){

        if (registered){
            System.out.println("Ты зарегестрирован");
        }
        else {
            System.out.println("Иди регистрируйся!");
        }
    }
}