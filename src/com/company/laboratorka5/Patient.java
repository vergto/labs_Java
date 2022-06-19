package com.company.laboratorka5;

public class Patient {
    private int id;
    private String surname;
    private String name;
    private String lastname;
    private String address;
    private String phone;
    private long card_number;
    private String diagnosis;

    public Patient(){
    }

    public Patient(int id, String surname, String name, String lastname, String address,
                   String phone, long card_number, String diagnosis) throws MyException {
        if ((id <= 0) || (id > 99999)){
            throw new MyException("Неверный id");
        }
        for (char s : surname.toCharArray()){
            if (Character.isDigit(s)){throw new MyException("Ошибка в фамилии");}
        }
        for (char s : name.toCharArray()){
            if (Character.isDigit(s)){throw new MyException("Ошибка в имени");}
        }
        for (char s : lastname.toCharArray()){
            if (Character.isDigit(s)){throw new MyException("Ошибка в отчестве");}
        }
        if (phone.length() != 8){
            throw new MyException("Неверный номер телефона");
        }
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.card_number = card_number;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws MyException {
        if ((id <= 0) || (id > 99999)){
            throw new MyException("Неверный id");
        }
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws MyException {
        for (char s : surname.toCharArray()){
            if (Character.isDigit(s)){throw new MyException("Ошибка в фамилии");}
        }
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws MyException {
        for (char s : name.toCharArray()){
            if (Character.isDigit(s)){throw new MyException("Ошибка в имени");}
        }
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) throws MyException {
        for (char s : lastname.toCharArray()){
            if (Character.isDigit(s)){throw new MyException("Ошибка в отчестве");}
        }
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws MyException {
        if (phone.length() != 8){
            throw new MyException("Неверный номер телефона");
        }
        this.phone = phone;
    }

    public long getCard_number() {
        return card_number;
    }

    public void setCard_number(long card_number) {
        this.card_number = card_number;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", card_number=" + card_number +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
