package com.ohgiraffers.phone.service;

import com.ohgiraffers.phone.dao.PhoneRepository;
import com.ohgiraffers.phone.dto.PhoneDTO;

public class PhoneService {
    //리소스 검사 검증하는 로직
    // 기존에 있는 값인지 검증하는 클래스
    //비즈니스에 걸려있는 데이터를 검사하는 계층
    private final PhoneRepository phoneRepository = new PhoneRepository();

    public String phone(PhoneDTO phones){
        String result = phoneRepository.phone(phones);
        return result;
    }



    public String servicemodify(String name, int no, String modi){

        return phoneRepository.modify(name, no, modi);

    }



}
