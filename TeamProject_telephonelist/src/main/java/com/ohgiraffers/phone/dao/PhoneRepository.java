package com.ohgiraffers.phone.dao;

import com.ohgiraffers.phone.dto.PhoneDTO;
import com.ohgiraffers.phoneDB.PhoneDB;

import java.util.ArrayList;



public class PhoneRepository {

    private final ArrayList phones = new ArrayList();
    public final PhoneDB phoneDB = PhoneDB.getInstance();

    public String phone(PhoneDTO phones){

        String oldList = String.valueOf(phoneDB.getPhones());
        String newList = String.valueOf(phones.getName());

        if(oldList.equals(newList)){
            return "등록실패";
        }

        return "등록성공";
    }






    public String modify(String name, int no, String modi){
        PhoneDTO phoneDTO = modify();
        if (name == null || name.equals("")) {

               switch (no) {
                        case 1:
                            phoneDTO.setName(modi);
                            break;
                        case 2:
                            phoneDTO.setNumber(modi);
                            break;
                        case 3:
                            phoneDTO.setAddress(modi);
                            break;
                        default:
                            return "잘못된 입력입니다.";
               }
               return phoneDTO.toString(modify) + " 로 수정 되었습니다.";
        }
        return "잘못된 입력";
    }



}
