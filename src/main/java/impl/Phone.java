package impl;

import interfaces.IPhone;
import lombok.Data;

@Data
public class Phone implements IPhone {
    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone() {
    }


    @Override
    public void displayPhone() {
        System.out.println("phone number: " + phoneNumber);
    }

}
