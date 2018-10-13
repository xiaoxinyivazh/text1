package com.qianfeng.learn;

import java.util.Scanner;

public class text3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name[] = new String[5];
		for (int i = 0; i < name.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个字符串");
			name[i] = input.next();
		}
		System.out.println("第一个字符串的值为" + name[0]);
		System.out.println("第五个字符串的值为" + name[name.length - 1]);
		System.out.println("第三个字符串的值为" + name[name.length / 2]);
	}

}
