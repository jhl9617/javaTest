package test.funct;

import java.util.Scanner;

public class FunctionTest {

    public void test6() {
        Scanner sc = new Scanner(System.in);

        System.out.println("ù��° ����");
        int first = sc.nextInt();

        System.out.println("�ι�° ����");
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
     * switch �� (���ù�) : if ������ ���� ����
     * ���� ����? ��� ǥ������ => ���� == ���� ����
     * switch(���� �Ǵ� ����) {
     * <p>
     * case ���ð�1: ���ð��� ������ ������ ������;
     * break; => �ݵ�� �����(switch �� ����)
     * case ���ð� 2 : ���౸��; break;
     * default: ���౸��;
     * }
     */
    public void switchSample() {

        //���������� ��ȣ�� �Է� �޾�, ��ȣ�� ���� �λ縻�� ���õǾ� ���
        Scanner sc = new Scanner(System.in);
        System.out.print("��ȣ �Է�(1, 2, 3) : ");
        int num = sc.nextInt();
        String msg = null;
        switch (num) {
            case 1:
                msg = "�ȳ��ϼ���.";    //no == 1
            case 2:
                msg = "ȯ���մϴ�. ";
                break;
            case 3:
                msg = "�������.";
                break;
            default:
                msg = "�ȳ��� ������.";
        }
        System.out.println(msg);


    }

    public void greeting2() {

        //���������� ��ȣ�� �Է� �޾�, ��ȣ�� ���� �λ縻�� ���õǾ� ���
        Scanner sc = new Scanner(System.in);
        System.out.print("��ȣ �Է�(1, 2, 3) : ");
        int num = sc.nextInt();
        String msg = null;
        if (num == 1) msg = "�ȳ��ϼ���.";
        else if (num == 2) msg = "ȯ���մϴ�. ";
        else if (num == 3) msg = "�������. ";
        else msg = "�ȳ��� ������. ";
        System.out.println(msg);
    }

    //���� 2���� ���깮��(+ - * / %)�� �Է� �޾Ƽ� ���깮�ڿ� ���� �� ������ ��������� ����ؼ� ���
    //�Է� �� :
    //ù��° ���� : 25
    //�ι�° ���� : 34
    //���깮��(+,-,*,%) : +
    //��� �� :
    //25 + 34 = 34
    public void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ù��° ���� : ");
        int first = sc.nextInt();
        System.out.print("�ι�° ���� : ");
        int second = sc.nextInt();
        System.out.print("���깮��(+,-,*,%) : ");
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
                System.out.println("���깮�ڰ� �߸� �Է� �Ǿ����ϴ�.\nȮ���ϰ� �ٽ� �����ϼ���.");
                return;
        }

        System.out.println(first + ch + second + " = " + result);

    }

    //���ϸ�(String)�� ����(int)�� �Է¹޾� ���Ű����� ��� ���
    //������ �ܰ�(����) ���� : int price = 0; ���
    //��� : 1200, �� : 2500, ���� : 5000, ������ : 700, Ű�� : 500
    //�� ���� ������ "��ǰ�� ǰ���Ǿ����ϴ�." ��� ó��
    //��� ���� :
    //��� : 1200�� * 3�� => ���� : 3600��
    public void fruitSale() {
        int price;
        Scanner sc = new Scanner(System.in);
        System.out.println("���ϸ� :");
        String st = sc.next();

        switch (st) {
            case "���":
                price = 1200;
                break;
            case "��":
                price = 2500;
                break;
            case "����":
                price = 5000;
                break;
            case "������":
                price = 700;
                break;
            case "Ű��":
                price = 500;
                break;
            default:
                System.out.println("��ǰ�� ǰ�� �Ǿ����ϴ�.");
                return;
        }
        System.out.print("���� : ");
        int er = sc.nextInt();
        System.out.println(st + " : " + er + "�� => ���� : " + price * er);
    }

    public void fruitSale2() {
        int price = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("���ϸ� :");
        String st = sc.next();

        if (st.equals("���")) price = 1200;
        else if (st.equals("��")) price = 2500;
        else if (st.equals("����")) price = 5000;
        else if (st.equals("������")) price = 700;
        else if (st.equals("Ű��")) price = 500;
        else {
            System.out.println("��ǰ�� ǰ�� �Ǿ����ϴ�.");
            return;
        }


        System.out.print("���� : ");
        int er = sc.nextInt();
        System.out.println(st + " : " + er + "�� => ���� : " + price * er);
    }



}
