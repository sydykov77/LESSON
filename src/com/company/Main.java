package com.company;

public class Main {

    public static void main(String[] args) {
        int temperature = 44;
        boolean isRainy = true;

        if (!isRainy || temperature < 0 && temperature > 40) {
            System.out.println("Лучше остаться дома");
        }else {
            System.out.println("Можно идти гулять");
        }
        }
        }

