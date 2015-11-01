package com.grabhouse.codedesign.beans;

import javax.persistence.*;

/**
 * Created by srihari on 31/10/15.
 *
 */
@Entity
@Table(name = "grabhouse_user", uniqueConstraints = {
        @UniqueConstraint(columnNames = "userName"),
        @UniqueConstraint(columnNames = "phoneNumber")
})
public class User {
    @Id
    @GeneratedValue
    private Integer userId;
    private String userName;
    private String uuid;
    private String emailId;
    private String phoneNumber;
    private String role;
    private String name;
    private String password;

    public User(){}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() { return this.role; }

    public void setRole(String role) { this.role = role; }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", uuid='" + uuid + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getUserId().equals(user.getUserId())) return false;
        if (!getUserName().equals(user.getUserName())) return false;
        if (getUuid() != null ? !getUuid().equals(user.getUuid()) : user.getUuid() != null) return false;
        if (!getEmailId().equals(user.getEmailId())) return false;
        if (!getPhoneNumber().equals(user.getPhoneNumber())) return false;
        if (!getName().equals(user.getName())) return false;
        return getRole().equals(user.getRole());

    }

    @Override
    public int hashCode() {
        int result = getUserId().hashCode();
        result = 31 * result + getUserName().hashCode();
        result = 31 * result + (getUuid() != null ? getUuid().hashCode() : 0);
        result = 31 * result + getEmailId().hashCode();
        result = 31 * result + getPhoneNumber().hashCode();
        result = 31 * result + getRole().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }
}
