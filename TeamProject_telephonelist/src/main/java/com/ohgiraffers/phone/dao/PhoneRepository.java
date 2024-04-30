package com.ohgiraffers.phone.dao;

import com.ohgiraffers.phone.dto.PhoneDTO;
import com.ohgiraffers.phoneDB.PhoneDB;

import java.util.ArrayList;



public class PhoneRepository {

    private final ArrayList phones = new ArrayList();
    public final PhoneDB phoneDB = PhoneDB.getInstance();


    public String phone(PhoneDTO[] phones)
    {
        int oldList = phoneDB.getPhones().size();

        for (PhoneDTO phoneDTO : phones) {
            phoneDB.setPhoneDB(phoneDTO);
        }

        if (oldList >= phoneDB.getPhones().size()) {
            return "등록실패";
        }

        return "등록성공";
    }


//    public String phone(PhoneDTO phoneDTO){ //등록메서드 - gpt랑 해본거
//
//        boolean oldList = phones.contains(phoneDTO);
//
//        if(oldList){
//            return "등록실패";
//        } else {
//            phones.add(phoneDTO);
//            return "등록성공";
//        }
//
//    }


    public String phoneModify(String name, int num, String modi){ //수정메서드 미완성
        // 입력된 이름이 비어있는지 확인
        if (name.isEmpty()) {
            return "이름을 입력하세요.";
        }
        // phoneDB.getPhones()에서 반환된 리스트가 비어있는지 확인
        ArrayList<PhoneDTO> phones = phoneDB.getPhones();
        if (phones.isEmpty()) {
            return "전화번호 목록이 비어 있습니다.";
        }

        // 수정할 대상을 찾음
        PhoneDTO phone = null;
        for (PhoneDTO phoneDTO : phones) {
            // 이름 비교 시 대소문자를 구분하지 않도록 수정
            if (phoneDTO.getName().equalsIgnoreCase(name)) {
                phone = phoneDTO;
                break;
            }
        }

        // 대상을 찾지 못한 경우
        if (phone == null) {
            return "해당하는 이름의 전화번호가 없습니다.";
        }
        switch (num) {
            case 1:
                phone.setName(modi);
                break;
            case 2:
                phone.setNumber(modi);
                break;
            case 3:
                phone.setAddress(modi);
                break;
            default:
                return "잘못된 입력입니다.";
        }


        return phone.toString() + " 로 수정 되었습니다.";
    }


    public ArrayList phoneRead() {

        return phoneDB.getPhones();
    }



    public PhoneDTO phoneDetail(int no) {
        PhoneDTO phone = (PhoneDTO) phoneDB.getPhones().get(no);
        return phone;
    }

}
