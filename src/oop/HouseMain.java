package oop;

public class HouseMain {
    public static void main(String[] args) {

        House obj = new House(5,50.2,"Деревяный","Pink","Кирпичный");
        System.out.println(obj);
        System.out.println(obj.relax() + " " + obj.toWarm());
        str(obj.material);

    }public static void str (String material){
        if (material.equals("Деревянный")){
            System.out.println("Построить на Иссык-Куле");

        }else
            System.out.println("Пострить в Нарыне!");

    }
}
