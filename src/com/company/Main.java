// Lab_03_4
// Нікіта Жовніренко
// Лабораторна робота No 3.4
// Розгалуження, задане плоскою фігурою.
// Варіант 5

package com.company;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double x;
    double y;
    double R;

    String result = new String("");

        System.out.println("Введіть значення для Х: ");
        x = sc.nextDouble();

        System.out.println("Введіть значення для Y: ");
        y = sc.nextDouble();

        System.out.println("Введіть значення для R: ");
        R = sc.nextDouble();

        if (y <= Math.sqrt(Math.pow(R, 2) - Math.pow(x, 2)) && x <= Math.sqrt(Math.pow(R, 2) - Math.pow(y, 2)) && x >= 0 && y >= 0)
        {
            result = "1) Належить.";
        }

        else if (y >= -Math.sqrt(Math.pow(R, 2) - Math.pow(x, 2)) && x >= -Math.sqrt(Math.pow(R, 2) - Math.pow(y, 2)) && x <= 0 && y <= 0)
        {
            result = "1) Належить.";
        }

        else if(y <= x + R && x >= y - R)
        {
            result = "1) Належить.";
        }
        else
            result = "1) Не належить.";
        System.out.println(result);

        if (y <= Math.sqrt(Math.pow(R, 2) - Math.pow(x, 2)))
        {
            if(x <= Math.sqrt(Math.pow(R, 2) - Math.pow(y, 2)))
            {
                if(x >= 0)
                {
                    if (y >= 0)
                    {
                        result = "2) Належить.";
                    }
                }
            }
        }
        else
        {
            if (y >= -Math.sqrt(Math.pow(R, 2) - Math.pow(x, 2)))
            {
                if (x >= -Math.sqrt(Math.pow(R, 2) - Math.pow(y, 2)))
                {
                    if (x <= 0)
                    {
                        if (y <= 0)
                        {
                            result = "2) Належить.";
                        }
                    }
                }

            }
            else
            {
                if (y <= x + R)
                {
                    if (x >= y - R)
                    {
                        result = "2) Належить.";
                    }
                }
                else
                    result = "2) Не належить.";
            }
        }
        System.out.println(result);


    }
}
