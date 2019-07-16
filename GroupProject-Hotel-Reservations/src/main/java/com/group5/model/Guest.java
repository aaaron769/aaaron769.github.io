package com.group5.model;
import java.util.Random;
/**
 * This pojo Guest class will have the info
 * of Guest who is looking for reserving a room
 */
public class Guest {
    public static final int randSize =100000;
    private Random random = new Random(randSize);
    private Integer id ;
    // personal details
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String socialSecurity;
    private String dateOfBirth;
    private String phoneNumber;
    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    // booking duration
    private String checkInTime;
    private String checkOutTime;
    private String typeOfBedRoom;// 1_bedRoom or 2_bedRoom
    private String moreInfoTextArea;
    // payment Info
    private String paymentType;// visa , masterCard radio button
    private String cardNumber;
    private String expireDate;
    private String sCode;
    private String paymentAgreement; // radio button yes or no
    // constructor
    private boolean checkedin = false;
    private Room room;

    public boolean isCheckedin() {
        return checkedin;
    }

    public void setCheckedin(boolean checkedin) {
        this.checkedin = checkedin;
    }
//    public Guest() {
//    }

    public Guest( String firstName, String lastName, String emailAddress,
                 String socialSecurity, String dateOfBirth, String phoneNumber, String addressLineOne,
                 String addressLineTwo, String city, String state, String zipCode, String country,
                 String checkInTime, String checkOutTime, String typeOfBedRoom, String moreInfoTextArea,
                 String paymentType, String cardNumber, String expireDate, String sCode,
                 String paymentAgreement) {
        this.id = random.nextInt();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.socialSecurity = socialSecurity;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.typeOfBedRoom = typeOfBedRoom;
        this.moreInfoTextArea = moreInfoTextArea;
        this.paymentType = paymentType;
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.sCode = sCode;
        this.paymentAgreement = paymentAgreement;
    }


    // getters and setters pair

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getTypeOfBedRoom() {
        return typeOfBedRoom;
    }

    public void setTypeOfBedRoom(String typeOfBedRoom) {
        this.typeOfBedRoom = typeOfBedRoom;
    }

    public String getMoreInfoTextArea() {
        return moreInfoTextArea;
    }

    public void setMoreInfoTextArea(String moreInfoTextArea) {
        this.moreInfoTextArea = moreInfoTextArea;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String getPaymentAgreement() {
        return paymentAgreement;
    }

    public void setPaymentAgreement(String paymentAgreement) {
        this.paymentAgreement = paymentAgreement;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
// toString


    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id + "\n"+
                ", firstName='" + firstName + "\n" +
                ", lastName='" + lastName + "\n" +
                ", emailAddress='" + emailAddress +  "\n" +
                ", socialSecurity='" + socialSecurity +  "\n" +
                ", dateOfBirth='" + dateOfBirth +  "\n" +
                ", phoneNumber='" + phoneNumber +  "\n" +
                ", addressLineOne='" + addressLineOne +  "\n" +
                ", addressLineTwo='" + addressLineTwo +  "\n" +
                ", city='" + city +  "\n" +
                ", state='" + state +  "\n" +
                ", zipCode='" + zipCode +  "\n" +
                ", country='" + country +  "\n" +
                ", checkInTime='" + checkInTime +  "\n" +
                ", checkOutTime='" + checkOutTime +  "\n" +
                ", typeOfBedRoom='" + typeOfBedRoom +  "\n" +
                ", moreInfoTextArea='" + moreInfoTextArea +  "\n" +
                ", paymentType='" + paymentType +  "\n" +
                ", cardNumber='" + cardNumber +  "\n" +
                ", expireDate='" + expireDate +  "\n" +
                ", sCode='" + sCode +  "\n" +
                ", paymentAgreement='" + paymentAgreement +  "\n" +
                '}';
    }
}


