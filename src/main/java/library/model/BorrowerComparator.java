package library.model;

import library.enums.Role;

import java.util.Comparator;

public class BorrowerComparator implements Comparator<Borrower> {

    @Override
    public int compare(Borrower b1, Borrower b2) {

        if (b1.getRole().equals(Role.TEACHER) && !b2.getRole().equals(Role.TEACHER)) {
            return -1;
        } else if (!b1.getRole().equals(Role.TEACHER) && b2.getRole().equals(Role.TEACHER)) {
            return 1;
        } else if (b1.getRole().equals(Role.SENIOR_STUDENT) && !b2.getRole().equals(Role.SENIOR_STUDENT)){
            return -1;
        } else if (!b1.getRole().equals(Role.SENIOR_STUDENT) && b2.getRole().equals(Role.SENIOR_STUDENT)) {
            return 1;
        } else {
            return 0;
        }

    }

}