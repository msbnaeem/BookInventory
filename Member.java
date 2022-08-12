/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naeemmohammadprogrammingckpt3;

import java.util.*;

/**
 * this class represents member as an object
 *
 * @author Mohammad Naeem
 */
public class Member {

    private String memberName;
    private int memberID;
    private double memberSpending;

    /**
     * this constructor creates member object with member: name, id, and
     * spending
     * @param memberName
     * @param memberID
     * @param memberSpending
     */
    public Member(String memberName, int memberID, double memberSpending) {
        this.memberName = memberName;
        this.memberID = memberID;
        this.memberSpending = memberSpending;
    }

    /**
     * collects member's name
     *
     * @return memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * gets member's id
     *
     * @return memberID
     */
    public int getMemberID() {
        return memberID;
    }

    /**
     * gets how much member spends
     *
     * @return memberSpending
     */
    public double getMemberSpending() {
        return memberSpending;
    }

    /**
     * sets name of members
     *
     * @param memberName
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * sets id of members
     *
     * @param memberID
     */
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    /**
     * sets how much member spends in store
     *
     * @param memberSpending
     */
    public void setMemberSpending(double memberSpending) {
        this.memberSpending = memberSpending;
    }

    /**
     * displays member: name, id, and spending as a super display in sub classes
     */
    public void display() {
        System.out.println("Name: " + this.getMemberName()
                + " ID: " + this.getMemberID()
                + " Spending: " + this.getMemberSpending());
    }

}
