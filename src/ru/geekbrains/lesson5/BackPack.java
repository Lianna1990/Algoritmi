package ru.geekbrains.lesson5;

import static java.lang.Math.*;

/**
 *  Написать программу «Задача о рюкзаке» с помощью рекурсии
 */

public class BackPack {

        private int[] weight = {3, 2, 7, 2};

        private int[] value = {9 ,3, 8, 4};

        public  int backPack (int i, int Capanoity){

            if (i == value.length - 1){

                if (Capanoity < weight[i])

                    return 0;

                else

                    return value[i];

            }

            else {

                if (Capanoity < weight[i]){

                    return backPack(i+1, Capanoity-weight[i]);

                }

                else

                    return max(backPack(i+1, Capanoity), backPack(i+1,Capanoity - weight[i])+value[i]);

            }

        }



        public static void main(String[] args) {

            BackPack demo = new BackPack();

            System.out.println(max(20,45));

            System.out.println("Maximal backpackvalue is: " + demo.backPack(0, 10));





        }

    }