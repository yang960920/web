package ���;

import javax.swing.JOptionPane;

public class ������1 {

	public static void main(String[] args) {
//		���α׷��� � ������� ¥���ұ�?
//		�Է� : �����͸� ������ ���� �� !
//		ó�� : Ư���� �۾��� �����մϴ�
//		��� : ó���� ������ �����ּ���!
//		�ڹٴ� ���� ����ϴ� ��ǰ�� �빮�ڷ� �ٷ� ���� �־��!
//		�Է�(input)
		String name = JOptionPane.showInputDialog("����� �̸���?");
		
//		ó��
		String result= "���� �̸��� " + name + "�Դϴ�.";
		
//		���
		System.out.println(result);
	}

}
