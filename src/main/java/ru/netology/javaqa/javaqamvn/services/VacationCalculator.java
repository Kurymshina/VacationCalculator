package ru.netology.javaqa.javaqamvn.services;

public class VacationCalculator {

    public int calculate(int income, int expense, int threshold) {
        int countOfRelax = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money > threshold) { // можем ли отдыхать?
                countOfRelax++; // увеличиваем счётчик месяцев отдыха
                money = (money - expense) / 3; //отнимаем ежемесячные траты
            } else {
                money = money + income - expense;//прибавляем зп и отнимаем траты
            }
        }
        return countOfRelax;
    }
}
