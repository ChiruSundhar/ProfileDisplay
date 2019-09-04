package com.prematix.profiledisplay;

public class Response {
    //Contact:
    private String fullName;
    private String email;
    private String mobileNumber;
    private String password;
    private String gender;
    private String maritalStatus;
    //        private int dob;
    private String permanentAddress;
    private String permanentState;
    private String permanentCity;
    private String permanentPincode;
    private String currAddress;
    private String currState;
    private String currCity;
    private String currPincode;
    private String aadharNo;
    private String existingLoans;
    private String panNumber;
    //Employee
    private String employeeCode;
    private String occupation;//Employee
    private String employementType;
    private float curCompanyExperience;
    private float totalExperience;
    private float netMonthlyIncome;

    //Buisness
    private String companyName;
    private String companyWebsite;
    private String companyAddress;
    private float annTurnover;

    public Response(String fullName, String email, String mobileNumber, String password, String gender, String maritalStatus, String permanentAddress, String permanentState, String permanentCity, String permanentPincode, String currAddress, String currState, String currCity, String currPincode, String aadharNo, String existingLoans, String panNumber, String employeeCode, String occupation, String employementType, float curCompanyExperience, float totalExperience, float netMonthlyIncome, String companyName, String companyWebsite, String companyAddress, float annTurnover) {
        this.fullName = fullName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.permanentAddress = permanentAddress;
        this.permanentState = permanentState;
        this.permanentCity = permanentCity;
        this.permanentPincode = permanentPincode;
        this.currAddress = currAddress;
        this.currState = currState;
        this.currCity = currCity;
        this.currPincode = currPincode;
        this.aadharNo = aadharNo;
        this.existingLoans = existingLoans;
        this.panNumber = panNumber;
        this.employeeCode = employeeCode;
        this.occupation = occupation;
        this.employementType = employementType;
        this.curCompanyExperience = curCompanyExperience;
        this.totalExperience = totalExperience;
        this.netMonthlyIncome = netMonthlyIncome;
        this.companyName = companyName;
        this.companyWebsite = companyWebsite;
        this.companyAddress = companyAddress;
        this.annTurnover = annTurnover;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getPermanentState() {
        return permanentState;
    }

    public void setPermanentState(String permanentState) {
        this.permanentState = permanentState;
    }

    public String getPermanentCity() {
        return permanentCity;
    }

    public void setPermanentCity(String permanentCity) {
        this.permanentCity = permanentCity;
    }

    public String getPermanentPincode() {
        return permanentPincode;
    }

    public void setPermanentPincode(String permanentPincode) {
        this.permanentPincode = permanentPincode;
    }

    public String getCurrAddress() {
        return currAddress;
    }

    public void setCurrAddress(String currAddress) {
        this.currAddress = currAddress;
    }

    public String getCurrState() {
        return currState;
    }

    public void setCurrState(String currState) {
        this.currState = currState;
    }

    public String getCurrCity() {
        return currCity;
    }

    public void setCurrCity(String currCity) {
        this.currCity = currCity;
    }

    public String getCurrPincode() {
        return currPincode;
    }

    public void setCurrPincode(String currPincode) {
        this.currPincode = currPincode;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getExistingLoans() {
        return existingLoans;
    }

    public void setExistingLoans(String existingLoans) {
        this.existingLoans = existingLoans;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmployementType() {
        return employementType;
    }

    public void setEmployementType(String employementType) {
        this.employementType = employementType;
    }

    public float getCurCompanyExperience() {
        return curCompanyExperience;
    }

    public void setCurCompanyExperience(float curCompanyExperience) {
        this.curCompanyExperience = curCompanyExperience;
    }

    public float getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(float totalExperience) {
        this.totalExperience = totalExperience;
    }

    public float getNetMonthlyIncome() {
        return netMonthlyIncome;
    }

    public void setNetMonthlyIncome(float netMonthlyIncome) {
        this.netMonthlyIncome = netMonthlyIncome;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public float getAnnTurnover() {
        return annTurnover;
    }

    public void setAnnTurnover(float annTurnover) {
        this.annTurnover = annTurnover;
    }
}