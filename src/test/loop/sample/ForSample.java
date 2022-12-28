package test.loop.sample;

import java.util.Random;
import java.util.Scanner;

/**
 * Ƚ���� ������ �ݺ��� �ַ� �����
 * for(�ʱ��;���ǽ�;������){
 * �ݺ� ���� �� ����;
 * }
 * �ʱ�� : �ݺ� ī��Ʈ�� ���۰� �����
 * ���� = ���۰�;�Ǵ� �ڷ��� ������ = ���۰�;
 * ���ǽ� : �ݺ��� ���ᰪ �����, ������ ���� ���� �ݺ��� �����
 * ī��Ʈ���� �񱳿����� ���ᰪ (�� : k < 11)
 * ������ : �ݺ� Ƚ���� ������
 * ī��Ʈ����++ �Ǵ� ++ī��Ʈ���� �Ǵ� ����--
 * ���� += ������, ���� -= ���Ұ�
 * <p>
 * for ���� �帧 :
 * �ʱ�� -> ���ǽ� -> true �̸� ��{} ���� �ݺ����೻�� ����
 * -> ������ -> ���ǽ� -> true : �ݺ�����
 * -> ������ -> ���ǽ� -> false : �ݺ�����
 */
public class ForSample {

    //1���� 100���� �������� �հ踦 ���϶�
    public void sumNumbers() {
        int tot = 0;
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
            tot += i;
        }
        System.out.println(tot);
    }

    public void sumNumbers2() {
        int tot, i;
        //for�������� �ʱ���� �� �ѹ��� �����
        //�ʱ�� ��ġ�� �������� ���� �� ������ ���� ����
        for (i = 0, tot = 1; i < 101; i++) {
            System.out.println(i);
            tot += i;
        }
        System.out.println(tot);
    }

    //1~100 ���� ������ ¦���� �հ�
    public void sum1To100Even() {
        int tot = 0;
        for (int i = 0; i < 101; i += 2) {
            tot += i;

        }
        System.out.println(tot);
    }

    //���� �� ���� ���Ƿ� �Է¹޾�, �� ���� ���������� ū������ �������� �հ踦 ���ؼ� ���
    //ù��° ���� : 12
    //�ι�° ���� : 7
    //7 + 8 + 9 + ... + 12 = �հ�
    public void sumMinToMax() {
        int tot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("ù��° ���� : ");
        int first = sc.nextInt();
        System.out.print("�ι�° ���� : ");
        int second = sc.nextInt();

        for (int i = first; i <= second; i++) {
            if (i != first) {
                System.out.print("+" + i);
            } else {
                System.out.print(i);
            }
            tot += i;
        }
        System.out.print(" = " + tot);
    }

    public void printGugudan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("���� �Է� : ");
        int a = sc.nextInt();
        for(int i = 1; i < 10;i++){
            System.out.println(a + " * " + i + " = " + (i * a));
        }
    }

    //1���� 100 ������ ������ ������ �߻���Ŵ
    //1���� ������ ���������� �հ踦 ���ؼ� ���
    public void sum1ToRandom() {
        Random ran = new Random();
        int sum = 0;
        System.out.print("���� : ");
        int inp = new Scanner(System.in).nextInt();
        for(int i = 0;i < inp;i++){
            int num4 = ran.nextInt(100) + 1;
            System.out.println(num4);
            sum += num4;
        }
        System.out.println("sum : " + sum);


    }
}