/*ʹ�ö��ֲ��Ҷ����ݽ�������*/
package com.qianfeng.learn;

import java.util.Scanner;

public class text9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = { 23, 24, 25, 26, 27, 28, 29, 32 };
		int start = 0;
		int end = array.length - 1;
		System.out.println("��������Ҫ���ҵ�����");
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
			System.out.println("û���ҵ�����");
		} else {
			System.out.println("�ҵ��˸�����������λ���ǣ�" + result + "��λ��");
		}
	}
}
