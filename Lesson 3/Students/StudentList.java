package com.company;

import java.util.Arrays;
import java.util.Date;

public class StudentList {
    private Student[] arr = new Student[0];
    private int p = 0;

    public void add(Student s){

        if(p > arr.length -1){
            arr = Arrays.copyOf(arr,arr.length +1);
            arr[p++] = s;
        }else{
            arr[p++] = s;
        }
    }

    public Student get(int n){
            return arr[n];
    }

    public int findByName(String name) throws Exception{

        for(int i =0; i <arr.length; i++){
            if(arr[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        throw new Exception("Такой студент не найден!");
    }

    public int findBySurname(String surname){
        for (int i = 0; i < arr.length; i++){
            if(arr[i].getSurname().equalsIgnoreCase(surname)){
                return i;
            }
        }
        return -1;
    }

    public int findByDate(Date date){
        for(int i = 0; i < arr.length; i++){
            if (arr[i].getBirth().equals(date)){
                return i;
            }
        }
        return -1;
    }

    public void deleteStudent(int n){

        if(n >= 0 && n < arr.length){
            Student[] temp = new Student[arr.length -1];
            for(int i = 0, j = 0; i < arr.length; i++){
                if(i != n){
                    temp[j] = arr[i];
                    j++;
                }
            }
            arr = Arrays.copyOf(temp, temp.length);
            p--;
            System.out.println("Студент успешно удалён!");
        }else System.out.println("Такой студент не найден!");
    }

    public void showAll(){
        for(int i = 0; i< arr.length; i++){
            get(i).info();
            System.out.println(" Порядковый номер студента:" +(i+1)+ "\n");
        }
    }

    public int arrLenght(){
        return arr.length;
    }

}
