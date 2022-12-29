package test.loop.sample;

import java.util.Scanner;

/**
 * while 문 테스트용 클래스
 * 반복할 횟수가 정해지지 않은 반복 실행시 주로 사용
 * while(반복에 대한 조건식) {
 * 반복 수행 할 내용에 대한 구문들
 * }
 */
public class WhileSample {

    //키보로드 문자 하나를 입력받아, 그 문자의 유니코드 출력
    //반복실행
    //반복종류는 '0'이 입력되면 종료됨
    public void printUnicode1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 입력 : ");
        char ch = sc.next().charAt(0);

        while (ch != '0') {
            System.out.println(ch + " is unicode " + (int) ch);

            System.out.print("문자 입력 : ");
            ch = sc.next().charAt(0);

        }
        System.out.println("--- The End ---");
    }

    public void printUnicode2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 입력 : ");
        //char ch = sc.next().charAt(0);
        char ch;

        while ((ch = sc.next().charAt(0)) != '0') {
            System.out.println(ch + " is unicode " + (int) ch);

            System.out.print("문자 입력 : ");
            ch = sc.next().charAt(0);

        }
        System.out.println("--- The End ---");
    }

    //중복구문 줄이기 2
    public void printUnicode3() {
        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.print("문자 입력 : ");
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
        System.out.println("1부터 100까지의 정수들의 합계 : " + sum);

    }

}
