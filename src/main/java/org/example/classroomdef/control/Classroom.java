package org.example.classroomdef.control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.classroomdef.model.UserAccount;

import java.util.ArrayList;

public class Classroom {
    private ObservableList<UserAccount> accounts;
    private static Classroom instance;

    public Classroom() {
        accounts = FXCollections.observableArrayList();
    }

    public static Classroom getInstance() {
        if (instance == null) {
            instance = new Classroom();
        }
        return instance;
    }

    public void addAccount(String user, String password, String name, int sex) {
        UserAccount temp = new UserAccount(user, password, name, sex);
        accounts.add(temp);
    }

    public int getAccount(String user, String password) {
        int result = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUsername().equals(user)) {
                result = 1;
                if (accounts.get(i).getPassword().equals(password)) {
                    return 2;
                }
            }
        }
        return result;
    }

    public boolean existingUser(String user) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUsername().equals(user)){
                return true;
            }
        }
        return false;
    }

    public ObservableList<UserAccount> getAccounts() {
        return accounts;
    }

    public String accountList (){
        String accountList = "";
        for (UserAccount account : accounts) {
            accountList += account.toString() + "\n";
        }
        return accountList;
    }
}
