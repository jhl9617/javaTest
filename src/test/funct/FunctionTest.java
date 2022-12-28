package test.funct;

import java.util.Scanner;

public class FunctionTest {

    public void test6() {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수");
        int first = sc.nextInt();

        System.out.println("두번째 정수");
        int second = sc.nextInt();

        if (first > 0 && second > 0) {
            System.out.println(first + " + " + second + " = " + (first + second));
            System.out.println(first + " - " + second + " = " + (first - second));
            System.out.println(first + " * " + second + " = " + (first * second));
            System.out.println(first + " / " + second + " = " + (first / second));
            System.out.println(first + " % " + second + " = " + (first % second));
        }
    }

    public void test7() {
        Scanner sc = new Scanner(System.in);
        String st = "abc";
        String st2 = "ABC";

        System.out.println(st.equals(st2));
    }

    /**
     * switch 문 (선택문) : if 문으로 변경 가능
     * 값이 뭐냐? 라는 표현식임 => 변수 == 값과 같음
     * switch(변수 또는 계산식) {
     * <p>
     * case 제시값1: 제시값이 몇으면 실행할 구문들;
     * break; => 반드시 기록함(switch 문 끝냄)
     * case 제시값 2 : 실행구문; break;
     * default: 실행구문;
     * }
     */
    public void switchSample() {

        //정수형으로 번호를 입력 받아, 번호에 따라 인사말이 선택되어 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("번호 입력(1, 2, 3) : ");
        int num = sc.nextInt();
        String msg = null;
        switch (num) {
            case 1:
                msg = "안녕하세요.";    //no == 1
            case 2:
                msg = "환영합니다. ";
                break;
            case 3:
                msg = "어서오세요.";
                break;
            default:
                msg = "안녕히 가세요.";
        }
        System.out.println(msg);


    }

    public void greeting2() {

        //정수형으로 번호를 입력 받아, 번호에 따라 인사말이 선택되어 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("번호 입력(1, 2, 3) : ");
        int num = sc.nextInt();
        String msg = null;
        if (num == 1) msg = "안녕하세요.";
        else if (num == 2) msg = "환영합니다. ";
        else if (num == 3) msg = "어서오세요. ";
        else msg = "안녕히 가세요. ";
        System.out.println(msg);
    }

    //정수 2개와 연산문자(+ - * / %)를 입력 받아서 연산문자에 따라 두 정수의 산술연산을 계산해서 출력
    //입력 예 :
    //첫번째 정수 : 25
    //두번째 정수 : 34
    //연산문자(+,-,*,%) : +
    //출력 예 :
    //25 + 34 = 34
    public void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산문자(+,-,*,%) : ");
        char ch = sc.next().charAt(0);
        int result = 0;
        switch (ch) {
            case '+': {
                result = first + second;
                break;
            }
            case '-': {
                result = first - second;
                break;
            }
            case '*': {
                result = first * second;
                break;
            }
            case '/': {
                result = first / second;
                break;
            }
            case '%': {
                result = first % second;
                break;
            }
            default:
                System.out.println("연산문자가 잘못 입력 되었습니다.\n확인하고 다시 진행하세요.");
                return;
        }

        System.out.println(first + ch + second + " = " + result);

    }

    //과일명(String)과 수량(int)을 입력받아 구매가격을 계산 출력
    //과일의 단가(가격) 변수 : int price = 0; 사용
    //사과 : 1200, 배 : 2500, 포도 : 5000, 오렌지 : 700, 키위 : 500
    //그 외의 과일은 "제품이 품절되었습니다." 출력 처리
    //출력 예시 :
    //사과 : 1200월 * 3개 => 가격 : 3600원
    public void fruitSale() {
        int price;
        Scanner sc = new Scanner(System.in);
        System.out.println("과일명 :");
        String st = sc.next();

        switch (st) {
            case "사과":
                price = 1200;
                break;
            case "배":
                price = 2500;
                break;
            case "포도":
                price = 5000;
                break;
            case "오렌지":
                price = 700;
                break;
            case "키위":
                price = 500;
                break;
            default:
                System.out.println("제품이 품절 되었습니다.");
                return;
        }
        System.out.print("수량 : ");
        int er = sc.nextInt();
        System.out.println(st + " : " + er + "개 => 가격 : " + price * er);
    }

    public void fruitSale2() {
        int price = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("과일명 :");
        String st = sc.next();

        if (st.equals("사과")) price = 1200;
        else if (st.equals("배")) price = 2500;
        else if (st.equals("포도")) price = 5000;
        else if (st.equals("오렌지")) price = 700;
        else if (st.equals("키위")) price = 500;
        else {
            System.out.println("제품이 품절 되었습니다.");
            return;
        }


        System.out.print("수량 : ");
        int er = sc.nextInt();
        System.out.println(st + " : " + er + "개 => 가격 : " + price * er);
    }



}
