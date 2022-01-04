package ru.skypro;

public class Main {

    public static void main(String[] args) {
	for (int i = 1; i <= 10; i++) {
        System.out.print(i + " ");
    }
    System.out.println();
    int a = 10;
    while (a > 0){
        System.out.print(a + " ");
        a--;
    }
    System.out.println();
    int s = 5;
    while (s <= 31) {
        System.out.println("Сегодня пятница " + s + "-е число. Необходимо подготовить отчет!");
        s += 7;
    }
    int year1 = 1821;
    int yaer2 = 2121;
    while (year1 <= yaer2) {
        System.out.println(year1);
        year1 += 79;
    }
    }
}
