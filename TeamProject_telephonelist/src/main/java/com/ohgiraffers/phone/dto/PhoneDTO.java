package com.ohgiraffers.phone.dto;

public class PhoneDTO {
    //이름 정보 주소
    //게터세터
    //투스티링

    private String name;
    private String number;
    private String address;


    public PhoneDTO() { }

    public PhoneDTO(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PhoneDTO{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
