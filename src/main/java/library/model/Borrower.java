package library.model;

import library.enums.Role;

public class Borrower {
    private String fullName;

    private Role role;

    public Borrower(String fullName, Role role) {
        this.fullName = fullName;
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "fullName='" + fullName + '\'' +
                ", role=" + role +
                '}';
    }
}
