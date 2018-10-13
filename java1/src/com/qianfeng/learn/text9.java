/*使用二分查找对数据进行排序*/
package com.qianfeng.learn;

import java.util.Scanner;

public class text9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = { 23, 24, 25, 26, 27, 28, 29, 32 };
		int start = 0;
		int end = array.length - 1;
		System.out.println("请输入你要查找的数据");
		int num = input.nextInt();
		int result = -1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (array[middle] > num) {
				end = middle - 1;
			} else if (array[middle] < num) {
				start = middle + 1;
			} else {
				result = middle;
				break;
			}

		}
		if (result == -1) {
			System.out.println("没有找到该数");
		} else {
			System.out.println("找到了该数，该数的位置是：" + result + "的位置");
		}
	}
}
