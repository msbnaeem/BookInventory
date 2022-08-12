/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naeemmohammadprogrammingckpt3;

import java.util.*;

/**
 * this class represents premium member as an object which is a type of member
 *
 * @author Mohammad Naeem
 */
public class PremiumMember extends Member {

    private boolean isFeePaid;

    /**
     * this constructor creates PREMIUM MEMBER object with member: name, id,
     * spending, and isFeePaid
     * @param memberName
     * @param memberID
     * @param memberSpending
     * @param isFeePaid
     */
    public PremiumMember(String memberName, int memberID, double memberSpending, boolean isFeePaid) {
        super(memberName, memberID, memberSpending);
        this.isFeePaid = isFeePaid;
    }

    /**
     * gets fee information whether it is paid or not
     *
     * @return isFeePaid
     */
    public boolean getIsFeePaid() {
        return isFeePaid;
    }

    /**
     * sets Boolean value depending if the member has paid the fee
     *
     * @param isFeePaid
     */
    public void setIsFeePaid(boolean isFeePaid) {
        this.isFeePaid = isFeePaid;
    }

    /**
     * an override that allows super display to be used from parent class in
     * this subclass along with premium member
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Premium Member = " + this.getIsFeePaid());
    }

}
