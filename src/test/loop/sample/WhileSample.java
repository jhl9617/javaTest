package test.loop.sample;

import java.util.Scanner;

/**
 * while �� �׽�Ʈ�� Ŭ����
 * �ݺ��� Ƚ���� �������� ���� �ݺ� ����� �ַ� ���
 * while(�ݺ��� ���� ���ǽ�) {
 * �ݺ� ���� �� ���뿡 ���� ������
 * }
 */
public class WhileSample {

    //Ű���ε� ���� �ϳ��� �Է¹޾�, �� ������ �����ڵ� ���
    //�ݺ�����
    //�ݺ������� '0'�� �ԷµǸ� �����
    public void printUnicode1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("���� �Է� : ");
        char ch = sc.next().charAt(0);

        while (ch != '0') {
            System.out.println(ch + " is unicode " + (int) ch);

            System.out.print("���� �Է� : ");
            ch = sc.next().charAt(0);

        }
        System.out.println("--- The End ---");
    }

    public void printUnicode2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("���� �Է� : ");
        //char ch = sc.next().charAt(0);
        char ch;

        while ((ch = sc.next().charAt(0)) != '0') {
            System.out.println(ch + " is unicode " + (int) ch);

            System.out.print("���� �Է� : ");
            ch = sc.next().charAt(0);

        }
        System.out.println("--- The End ---");
    }

    //�ߺ����� ���̱� 2
    public void printUnicode3() {
        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.print("���� �Է� : ");
            char ch = sc.next().charAt(0);
            if (ch == '0') break;
            System.out.println(ch + " is unicode " + (int) ch);


        }
        System.out.println("--- The End ---");
    }

    //for to while
    //1 to 100
    public void testWhile1() {
        int sum =0;

        for (int i = 1; i < 101; i++){
            sum += i;
        }
        System.out.println("1���� 100������ �������� �հ� : " + sum);

    }

}
