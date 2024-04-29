package com.ohgiraffers;

import com.ohgiraffers.phone.controller.PhoneController;
import com.ohgiraffers.phone.dto.PhoneDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PhoneController phoneController = new PhoneController();
        boolean program = true;
        String result = "";

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

            switch(choice){
                case 1: //등록
                    System.out.println("이름 입력 : ");
                    String name = sc.nextLine();
                    System.out.println("전화번호 입력 : ");
                    String number = sc.nextLine();
                    System.out.println("주소 입력 : ");
                    String address = sc.nextLine();


                    PhoneDTO phones = new PhoneDTO(name, number, address);
                    result = phoneController.phone(phones);
                    System.out.println(result);
                    System.out.println("등록이 완료되었습니다");
                    break;

                case 2: //삭제


                    break;

                case 3: //수정

                    System.out.println("수정할 정보의 주인 : ");
                    name = sc.nextLine();

                    phoneController.modify(name);

                    break;

                case 4: //조회 //+수정 +삭제

                    break;

                case 5: //전체조회

                    break;

                case 6: //종료

                    program = false;

                default:

                    System.out.println("입력 오류");
                    break;
            }



        }


    }


}
