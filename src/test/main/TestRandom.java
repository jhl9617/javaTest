package test.main;


import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        //java.lang.Math �� �����ϴ� random() �޼ҵ� ��� �׽�Ʈ

        double value = Math.random();


        //1~100 ������ ������ ������ Ȱ���Ѵٸ�
        //(int)(Math.random() * ����) + ���۰�
        int num1 = (int)(value * 100) + 1;
        //51~100 ������ ���� �߻��� ���Ѵٸ�
        //(int)(Math.random() * (���� - ���۰� + 1)) + ���۰�
        int num2 = (int)(value * 50) + 51;
        System.out.println("num1 : " + num1);

        System.out.println("num2 : " + num2);
        //java.util.Random Ŭ������ �̿� �ص� ��
        Random ran = new Random();
        //�� �ڷ������� ������ �߻�(����) �޼ҵ带 ������
        System.out.println(ran.nextInt(100));
        System.out.println(ran.nextFloat());

        //51~100 ������ ���� �߻�
        int num3 = ran.nextInt(50) + 51;
        System.out.println("num3 : " + num3);

        //1~100 ������ ���� �߻�
        int num4 = ran.nextInt(100) + 1;
        System.out.println("num4 : "+ num4);
    }
}
