package services;

import implementation.Mentor;

/**
 * @author ykeskin
 * @since 10/18/2020
 */
public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("FullTimeMentor created");
    }
}
