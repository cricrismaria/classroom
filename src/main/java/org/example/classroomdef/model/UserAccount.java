package org.example.classroomdef.model;

public class UserAccount {

    private String username;
    private String password;
    private String name;
    private Sex sex;

    public UserAccount(String username, String password, String name, int sex) {
        this.username = username;
        this.password = password;
        this.name = name;
        switch (sex){
            case 1:
                this.sex = Sex.FEMENINE;
                break;
            case 2:
                this.sex = Sex.MASCULINE;
                break;
        }

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
