package com.qianfeng.learn;

import java.util.Scanner;

public class text3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name[] = new String[5];
		for (int i = 0; i < name.length; i++) {
			System.out.println("�������" + (i + 1) + "���ַ���");
			name[i] = input.next();
		}
		System.out.println("��һ���ַ�����ֵΪ" + name[0]);
		System.out.println("������ַ�����ֵΪ" + name[name.length - 1]);
		System.out.println("�������ַ�����ֵΪ" + name[name.length / 2]);
	}

}
