package com.ohgiraffers.phoneDB;

import com.ohgiraffers.phone.dto.PhoneDTO;

import java.util.ArrayList;

public class PhoneDB {

    // 값을 전달해주면 값을 써준다
    // 입력된 값이 데이터베이스에 저장된다.
    private final ArrayList phones;
    private static PhoneDB phoneDB = new PhoneDB();

    private PhoneDB() {
        phones = new ArrayList();
        PhoneDTO phoneDTO = new PhoneDTO();
        phones.add(phoneDTO);
    }

    public static PhoneDB getInstance() {
        return phoneDB;
    }

    public void setPhoneDB(PhoneDTO phoneDTO) {
        phones.add(phoneDTO);
    }

    public ArrayList getPhones() {
        return phones;
    }

}
