package com.ohgiraffers.phone.service;

import com.ohgiraffers.phone.dao.PhoneRepository;
import com.ohgiraffers.phone.dto.PhoneDTO;

import java.util.ArrayList;

public class PhoneService {
    //리소스 검사 검증하는 로직
    // 기존에 있는 값인지 검증하는 클래스
    //비즈니스에 걸려있는 데이터를 검사하는 계층
    private final PhoneRepository phoneRepository = new PhoneRepository();

    public String phone(PhoneDTO[] phones){
//        for (PhoneDTO phoneDTO : phones) {
//            if (!phoneDTO.getName().equals(""))
//                return "등록실패";
//            if (!phoneDTO.getNumber().equals(""))
//                return "등록실패";
//            if (!phoneDTO.getAddress().equals(""))
//                return "등록실패";
//
//        }

        return phoneRepository.phone(phones);
    }


    public String phoneModify(String name, int no, String modi){

        return phoneRepository.phoneModify(name, no, modi);
    }



    public ArrayList phoneRead() {

        ArrayList pList = phoneRepository.phoneRead();

        return pList;
    }




    public PhoneDTO phoneDetail(int no){


        PhoneDTO phone = phoneRepository.phoneDetail(no);
        return phone;
    }



}
