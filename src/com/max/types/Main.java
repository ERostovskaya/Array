package com.max.types;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 6};

        // Создаём промежуточную переменную и записываем туда первый элемент массива
        int temp = nums[0];
        // Меняем местами значения
        nums[0] = nums[4];
        // Значение первого элемента берем из промежуточной переменной
        nums[4] = temp;
        System.out.println(Arrays.toString(nums));

        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = 0; j < nums.length - 4;  j++)
        sum = nums[i] + nums[j];
        }
        System.out.println(sum);
    }
}