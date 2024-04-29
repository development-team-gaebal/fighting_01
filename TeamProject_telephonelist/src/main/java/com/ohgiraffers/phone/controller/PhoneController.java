package com.ohgiraffers.phone.controller;

import com.ohgiraffers.phone.dto.PhoneDTO;
import com.ohgiraffers.phone.service.PhoneService;

import java.util.Scanner;

public class PhoneController {
    private final PhoneService phoneService = new PhoneService();
    Scanner sc = new Scanner(System.in);




    public String phone (PhoneDTO phones){


        if (phones.getName() == "") {
                return "이름을 입력해주세요";
        }

        if (phones.getNumber() == "") {
                return "폰 번호를 입력해주세요";
        }

        if (phones.getAddress() == "") {
                return "주소를 입력해주세요";
        }

        //service 로직으로 넘김
        String result = phoneService.phone(phones);
        return result;

    }



    public String modify(String name){

        if(name == ""){
            return "잘못입력";
        }

        System.out.println("어떤 정보를 수정하시겠습니까? 1.이름 / 2.번호 / 3.주소 : ");
        int no = sc.nextInt();
        System.out.println("수정할 정보를 입력 : ");
        String modi = sc.nextLine();
        sc.nextLine();

        return phoneService.servicemodify(name, no, modi);

    }


}
