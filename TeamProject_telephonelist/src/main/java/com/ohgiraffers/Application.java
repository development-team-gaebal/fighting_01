package com.ohgiraffers;

import com.ohgiraffers.phone.dto.PhoneDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

                    PhoneDTO phoneInput = new PhoneDTO();
                    System.out.println("이름 입력 : ");
                    String name = sc.nextLine();
                    System.out.println("전화번호 입력 : ");
                    String number = sc.nextLine();
                    System.out.println("주소 입력 : ");
                    String address = sc.nextLine();
                    System.out.println("등록이 완료되었습니다");
                    sc.nextLine();

                    phoneInput = new PhoneDTO(name, number, address);
                    result = phoneController.phone(phoneInput);
                    System.out.println(result);
                    break;

                case 2: //삭제


                    break;
                case 3: //수정

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
