package com.qianfeng.learn;

import java.util.Scanner;

public class text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] array = new int[8];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入第" + (i + 1) + "年龄的值");
			array[i] = input.nextInt();
			sum = sum + array[i];

		}
		int avg = sum / array.length;
		System.out.println("8个人的平均年龄为：" + avg);
	}

}
