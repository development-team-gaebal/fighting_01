package com.ohgiraffers;

import com.ohgiraffers.phone.controller.PhoneController;
import com.ohgiraffers.phone.dto.PhoneDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PhoneController phoneController = new PhoneController();
        boolean program = true;
        int index;
        String result = "";
        String name = "";         String number = "";        String address = "";

        while(program){

            System.out.println("1. 등록");
            System.out.println("2. 삭제");
            System.out.println("3. 수정");
            System.out.println("4. 조회");
            System.out.println("5. 전체조회");
            System.out.println("6. 종료");
            System.out.println("목차 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1: //등록

                    System.out.println("이름 입력 : ");
                    name = sc.nextLine();
                    System.out.println("전화번호 입력 : ");
                    number = sc.nextLine();
                    System.out.println("주소 입력 : ");
                    address = sc.nextLine();

                    PhoneDTO phones = new PhoneDTO(name, number, address);

                    result = phoneController.phone(new PhoneDTO[]{phones});
                    System.out.println("등록이 완료되었습니다");
                    break;

                case 2: //삭제
                    System.out.print("삭제할 정보의 번호를 입력해주세요 : ");

                    index = Integer.parseInt(sc.nextLine());
                    result = index + "번 정보가 ";
                    result += phoneController.phoneDelete(index);

                    break;

                case 3: //수정
//
//                    System.out.println(phoneController.phoneRead());
//                    System.out.println("수정할 정보의 등록번호 : ");
//                    num = sc.nextLine();

//                    phoneController.phoneModify(num);
//                    sc.nextLine();

                    //------------------------------------------------

                    System.out.println(phoneController.phoneRead());
                    System.out.print("수정할 정보의 등록 번호를 입력해주세요 : ");
                    index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("이름을 수정해주세요 : ");
                    name = sc.nextLine();
                    System.out.print("번호를 수정해주세요 : ");
                    number = sc.nextLine();
                    System.out.print("주소를 수정해주세요 : ");
                    address = sc.nextLine();
                    PhoneDTO modifyPhone = new PhoneDTO(name, number, address);
                    result = phoneController.phoneModify(index, modifyPhone);

                    break;

                case 4: //조회 //+수정 +삭제

                    System.out.println("조회번호 : ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    result = phoneController.phoneDetail(num);

                    break;

                case 5: //전체조회
                    result = phoneController.phoneRead();
                    break;

                case 6: //종료

                    program = false;

                default:

                    System.out.println("입력 오류");
                    break;
            }

            System.out.println(result);
//            program = sc.nextBoolean();

        }
    }
}
