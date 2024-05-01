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

        ArrayList phoneList = .get();
        PhoneDTO phones =

        alist.set(0, "이것을 수정함");
        for (int i = 0; i < alist.size(); i++) {
            // 특정 인덱스의 값을 꺼내온다.
            System.out.println(alist.get(i));
        }


        switch (num) {
            case 1:
                phones.setName(modi);
                break;
            case 2:
                phones.setNumber(modi);
                break;
            case 3:
                phones.setAddress(modi);
                break;
            default:
                return "잘못된 입력입니다.";
        }


        return phones.toString(PhoneDTO) + " 로 수정 되었습니다.";
    }


    public ArrayList phoneRead() {

        return phoneDB.getPhones();
    }



    public PhoneDTO phoneDetail(int no) {
        PhoneDTO phone = (PhoneDTO) phoneDB.getPhones().get(no);
        return phone;
    }

}
