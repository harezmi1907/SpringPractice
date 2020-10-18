package service;

import implementation.Mentor;

/**
 * @author ykeskin
 * @since 10/18/2020
 */
public class MentorAccount {
    Mentor mentor;

    public MentorAccount(Mentor mentor) {
        this.mentor = mentor;
    }

    public void manageAccount(){
        this.mentor.createAccount();
    }
}
