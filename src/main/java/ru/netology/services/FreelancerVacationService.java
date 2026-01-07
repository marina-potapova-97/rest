package ru.netology.services;

public class FreelancerVacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; //изначально нет денег
        int count = 0; //Количество месяцев отдыха

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++;
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}
