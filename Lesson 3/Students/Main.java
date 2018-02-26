package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    private final static StudentList sl = new StudentList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (true){
            printMenu();
            try {
                action(scanner.nextLine());
            }catch (Exception e){
                e.getMessage();
            }
        }
    }

    private static void action(String string) throws Exception{
        String temp;

        switch (string){
            case "1":
                addCheck();
                break;
            case "2":
                sl.showAll();
                break;
            case "3":
                System.out.print("Введите порядковый номер студента которого желаете удалить: ");
                temp = scanner.nextLine();
                if(parseStringValue(temp)){
                sl.deleteStudent(Integer.parseInt(temp) -1);
                }else throw new NumberFormatException("Неверный порядковый номер студента.");
                break;
            case "4":
                exit();
                break;
        }
    }

    private static void printMenu(){
        System.out.println("Выберите действие: ");
        System.out.println("1 - Добавить студента");
        System.out.println("2 - Вывести весь список студентов");
        System.out.println("3 - Удалить студента по номеру");
        System.out.println("4 - Выйти");
    }

    private static void exit(){
        System.exit(0);
    }

    private static void addCheck(){

        String name, surname;
        int intDay, intMonth, intYear;
        String checkStringDay, checkStringMonth, checkStringYear;

        System.out.print("Введите имя студента: ");
        name = scanner.nextLine();
        System.out.print("Введите фамилию студента: ");
        surname = scanner.nextLine();

        while (true) {

            System.out.print("Введите год студента: ");
            checkStringYear = scanner.nextLine();
            if (parseStringValue(checkStringYear)) {
                if (!yearCheck(Integer.parseInt(checkStringYear))) {
                    System.out.println("Указаный год не соответствует допустимому диапазону.");
                    continue;
                } else {
                    intYear = Integer.parseInt(checkStringYear) -1900;
                }
            } else {
                System.out.println("Не верный формат введённых данных.");
                continue;
            }

            System.out.print("Введие месяц: ");
            checkStringMonth = scanner.nextLine();
            if (parseStringValue(checkStringMonth)) {
                if (monthCheck(Integer.parseInt(checkStringMonth))) {
                    intMonth = Integer.parseInt(checkStringMonth) - 1;
                } else {
                    System.out.println("Такого месяца не существует.");
                    continue;
                }
            } else {
                System.out.println("Не верный формат введённых данных.");
                continue;
            }

            System.out.print("Введите день: ");
            checkStringDay = scanner.nextLine();
            if (parseStringValue(checkStringDay)) {
                if (checkDay(Integer.parseInt(checkStringDay), intMonth, intYear)) {
                    intDay = Integer.parseInt(checkStringDay);
                    break;
                } else System.out.println("Введён неверный день.");
            } else System.out.println("Не верный формат введённых данных.");
        }

        sl.add(new Student(name,surname,new Date(intYear,intMonth,intDay)));
        System.out.println("Студент успешно добавлен.");
    }

    private static boolean yearCheck(int year){
        return year > 0 && year < new Date().getYear()+1900;
    }

    private static boolean monthCheck(int month){
        return month > 0 && month < 13;
    }

    private static boolean parseStringValue(String year){
        try {
            Integer.parseInt(year);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    private static boolean checkDay(int day, int month, int year){
        if(month == 0 || month == 2 || month == 4 || month == 6 || month ==  7 || month == 9 || month == 11){
            if(day <= 31) {
                return true;
            }
        } else if( month == 1){
            if(isYearEqual(year)) {
               if(day <= 29){
                return true;
                }
            }
            else if(day <= 28){
                return true;
            }
           } else if(day <= 30){
            return true;
        }
        return false;
    }

    private static boolean isYearEqual(int year){
        return year % 4 == 0;
    }
}
