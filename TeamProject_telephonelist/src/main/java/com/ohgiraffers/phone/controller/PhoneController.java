package com.ohgiraffers.phone.controller;

import com.ohgiraffers.phone.dto.PhoneDTO;
import com.ohgiraffers.phone.service.PhoneService;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneController {
    private final PhoneService phoneService = new PhoneService();
    Scanner sc = new Scanner(System.in);


    public void controllerChoice(String choice){
        System.out.println(choice);
    }



    public String phone(PhoneDTO[] phones){

//        for (int i = 0; i < phones.length; i++) {
//            if (PhoneDTO.getName().equals("")) {
//                System.out.println("이름을 입력해주세요");
//                continue;
//            }
//
//            if (PhoneDTO.getNumber().equals("")) {
//                System.out.println("폰 번호를 입력해주세요");
//                continue;
//            }
//
//            if (PhoneDTO.getAddress().equals("")) {
//                System.out.println("주소를 입력해주세요");
//                continue;
//            }
//            break;
//
//        }
        //service 로직으로 넘김
        return phoneService.phone(phones);

    }

    public  String phoneDelete(int no){
        String result = phoneService.phoneDelete(no);

        return result;
    }

    public String phoneModify(int index, PhoneDTO modifyPhone){
        String result = phoneService.phoneModify(index,modifyPhone);
        return result;
    }

//    public void phoneModify(int num){
//          boolean modify = true;
//        while(modify){
//                      System.out.println("1. 이름");
//                      System.out.println("2. 번호");
//                      System.out.println("3. 주소");
//                      System.out.println("4. 뒤로(수정취소)");
//                      int modi = sc.nextInt();
//                      sc.nextLine();
//           switch(modi) {
//                  case 1: //이름
//                      System.out.println("이름 입력 : ");
//                      name = sc.nextLine();

//                      break;
//                  case 2: //번호
//                      System.out.println("번호 입력 : ");
//                      number = sc.nextLine();

//                      break;
//                  case 3: //주소
//                      System.out.println("주소 입력 : ");
//                      address = sc.nextLine();
//
//                      break;
//                  case 4: //수정취소
//
//                    modify = false;
//
//                default:
//                    System.out.println("입력 오류");
//                    break;
//            }
//
//           System.out.println(result);
//           modify = sc.nextBoolean();
//       }
//        phoneService.phoneModify(name, number, address);
//    }





    public String phoneRead(){

        ArrayList phoneList = phoneService.phoneRead();
        String viewAll = "목록 : " + phoneList.toString();
        return viewAll;

    }


    public String phoneDetail(int no){

        // 서비스 로직으로 넘기기
        PhoneDTO phoneDTO = phoneService.phoneDetail(no);
        if(no < 0){
            return "잘못 입력하였습니다.";
        }


        if(phoneDTO == null){
            return "존재하지 않는 정보입니다.";
        }

        return phoneDTO.toString(); //★
    }

}
