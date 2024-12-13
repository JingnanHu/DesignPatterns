package model;

public class User {
    private String gender;
    private int age;

    public User() {
    }

    private String maritalStatus;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }





    public User(String gender, int age, String maritalStatus, String occupation) {
        this.gender = gender;
        this.age = age;
        this.maritalStatus = maritalStatus;

    }


}
