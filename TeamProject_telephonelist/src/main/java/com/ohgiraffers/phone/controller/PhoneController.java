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



    public void phoneModify(String name){

        if(name != null && !name.isEmpty()){
            return;
        }

        System.out.println("어떤 정보를 수정하시겠습니까? 1.이름 / 2.번호 / 3.주소 : ");
        String input = sc.nextLine();
        int num = 0;
        if (input.equals("1")) {
                num = 1;
        } else if (input.equals("2")) {
                num = 2;
        } else if (input.equals("3")) {
                num = 3;
        } else {
                return;
        }

        System.out.println("수정할 정보를 입력 : ");
        String modi = sc.nextLine();
        sc.nextLine();

        phoneService.phoneModify(name, num, modi);
    }





    public String phoneRead(){

        ArrayList phoneList = phoneService.phoneRead();
        String viewAll = "주문 목록 : " + phoneList.toString();
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
