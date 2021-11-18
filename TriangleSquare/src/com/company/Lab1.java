package com.company;
import java.util.Scanner;
public class Lab1
{
    public static void main(String[] args) {
        System.out.println("Первая точка: ");
        Point3d P1 = readPoints();
        System.out.println("Вторая точка: ");
        Point3d P2 = readPoints();
        System.out.println("Третья точка: ");
        Point3d P3 = readPoints();
        //Проверка на совпадение точек
        if (P1.isEqual(P2))
            System.out.println("Точки №1 и №2 равны, площадь не вычисляется");
        else if (P2.isEqual(P3))
            System.out.println("Точки №2 и №3 равны, площадь не вычисляется");
        else if (P3.isEqual(P1))
            System.out.println("Точки №3 и №1 равны, площадь не вычисляется");
        else
        {
            // Вывод вычисленной площади
            System.out.printf("Площадь треугольника: %.4f\n", computeArea(P1, P2, P3) );
        }
    }
    public static Point3d readPoints()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Х ");
        double x = scanner.nextDouble();
        System.out.print("Введите Y ");
        double y = scanner.nextDouble();
        System.out.print("Введите Z ");
        double z = scanner.nextDouble();
        return new Point3d(x, y, z);
    }
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3)
    {
            double a = p1.distanceTo(p2);
            double b = p2.distanceTo(p3);
            double c = p3.distanceTo(p1);
            double p = (a+b+c)/2;
            return Math.ceil(Math.sqrt(p* (p-a) * (p-b) * (p-c))*100)/100;
    }
}