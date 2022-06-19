package com.company.laboratorka5;


public class Customer {
    private int id;
    private String surname;
    private String name;
    private String lastname;
    private long credit_card;
    private long bank_acc;

    public Customer(){
    }

    public Customer(int id, String surname, String name, String lastname, long credit_card, long bank_acc) throws MyException {
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
        if ((credit_card < 100000000) || (credit_card > 999999999)){
            throw new MyException("Неверный номер карты");
        }
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.credit_card = credit_card;
        this.bank_acc = bank_acc;
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

    public long getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(long credit_card) throws MyException {
        if ((credit_card < 100000000) || (credit_card > 999999999)){
            throw new MyException("Неверный номер карты");
        }
        this.credit_card = credit_card;
    }

    public long getBank_acc() {
        return bank_acc;
    }

    public void setBank_acc(long bank_acc) {
        this.bank_acc = bank_acc;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", credit_card=" + credit_card +
                ", bank_acc=" + bank_acc +
                '}';
    }
}
