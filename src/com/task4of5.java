package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class task4of5 {

        public static void main(String[] args) throws IOException {

            int number, a;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the limit: ");
            number = Integer.parseInt(br.readLine());
            a = 4;

            System.out.println("List of even numbers: ");
            //the while loop executes until the condition becomes false
            while (a <= number) {
                System.out.println(a + " ");

                a = a + 4; //increments the variable i by 2


                //second way of performing task 4 even numbers from 1 to 100 using loop

                //for loop
                for (a = 4; a <= number; a = a) {
                    System.out.println(a + "");
                    a = a + 4;


                }


            }


        }
    }