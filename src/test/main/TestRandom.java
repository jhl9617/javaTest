package test.main;


import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        //java.lang.Math 가 제공하는 random() 메소드 사용 테스트

        double value = Math.random();


        //1~100 사이의 임의의 난수로 활용한다면
        //(int)(Math.random() * 끝값) + 시작값
        int num1 = (int)(value * 100) + 1;
        //51~100 사이의 정수 발생을 원한다면
        //(int)(Math.random() * (끝값 - 시작값 + 1)) + 시작값
        int num2 = (int)(value * 50) + 51;
        System.out.println("num1 : " + num1);

        System.out.println("num2 : " + num2);
        //java.util.Random 클래스를 이용 해도 됨
        Random ran = new Random();
        //각 자료형별로 랜덤값 발생(리턴) 메소드를 제공함
        System.out.println(ran.nextInt(100));
        System.out.println(ran.nextFloat());

        //51~100 사이의 정수 발생
        int num3 = ran.nextInt(50) + 51;
        System.out.println("num3 : " + num3);

        //1~100 사이의 정수 발생
        int num4 = ran.nextInt(100) + 1;
        System.out.println("num4 : "+ num4);
    }
}
