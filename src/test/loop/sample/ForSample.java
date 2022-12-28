package test.loop.sample;

import java.util.Random;
import java.util.Scanner;

/**
 * 횟수가 정해진 반복에 주로 사용함
 * for(초기식;조건식;증감식){
 * 반복 실행 할 구문;
 * }
 * 초기식 : 반복 카운트의 시작값 명시함
 * 변수 = 시작값;또는 자료형 변수명 = 시작값;
 * 조건식 : 반복의 종료값 명시함, 조건이 참일 동안 반복이 수행됨
 * 카운트변수 비교연산자 종료값 (예 : k < 11)
 * 증감식 : 반복 횟수를 결정함
 * 카운트변수++ 또는 ++카운트변수 또는 변수--
 * 변수 += 증가값, 변수 -= 감소값
 * <p>
 * for 실행 흐름 :
 * 초기식 -> 조건식 -> true 이면 블럭{} 안의 반복수행내용 실행
 * -> 증감식 -> 조건식 -> true : 반복수행
 * -> 증감식 -> 조건식 -> false : 반복종료
 */
public class ForSample {

    //1부터 100까지 정수들의 합계를 구하라
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
        //for문에서는 초기식이 딱 한번만 실행됨
        //초기식 위치에 여러개의 변수 값 지정할 수도 있음
        for (i = 0, tot = 1; i < 101; i++) {
            System.out.println(i);
            tot += i;
        }
        System.out.println(tot);
    }

    //1~100 까지 정수중 짝수만 합계
    public void sum1To100Even() {
        int tot = 0;
        for (int i = 0; i < 101; i += 2) {
            tot += i;

        }
        System.out.println(tot);
    }

    //정수 두 개를 임의로 입력받아, 두 수중 작은값에서 큰값가지 정수들의 합계를 구해서 출력
    //첫번째 정수 : 12
    //두번째 정수 : 7
    //7 + 8 + 9 + ... + 12 = 합계
    public void sumMinToMax() {
        int tot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 : ");
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
        System.out.print("정수 입력 : ");
        int a = sc.nextInt();
        for(int i = 1; i < 10;i++){
            System.out.println(a + " * " + i + " = " + (i * a));
        }
    }

    //1부터 100 사이의 임의의 정수를 발생시킴
    //1부터 임의의 정수까지의 합계를 구해서 출력
    public void sum1ToRandom() {
        Random ran = new Random();
        int sum = 0;
        System.out.print("정수 : ");
        int inp = new Scanner(System.in).nextInt();
        for(int i = 0;i < inp;i++){
            int num4 = ran.nextInt(100) + 1;
            System.out.println(num4);
            sum += num4;
        }
        System.out.println("sum : " + sum);


    }
}