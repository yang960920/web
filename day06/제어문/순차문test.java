package ���;

import javax.swing.JOptionPane;

public class ������test {

	public static void main(String[] args) {
//		���α׷��� � ������� ¥���ұ�?
//		�Է� : �����͸� ������ ���� �� !
//		ó�� : Ư���� �۾��� �����մϴ�
//		��� : ó���� ������ �����ּ���!
//		�ڹٴ� ���� ����ϴ� ��ǰ�� �빮�ڷ� �ٷ� ���� �־��!
//		�Է�(input)
		String exercise = JOptionPane.showInputDialog("����� ���?");
		String days = JOptionPane.showInputDialog("����� ��ϱ� �����ϴ� ������?");
		
//		ó��
		String result= days + "�� ���� " + exercise + "�� �մϴ�.";
		
//		���
		System.out.println(result);
	}

}
