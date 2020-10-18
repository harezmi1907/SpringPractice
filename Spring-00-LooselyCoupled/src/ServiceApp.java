import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

/**
 * @author ykeskin
 * @since 10/18/2020
 */
public class ServiceApp {

    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        MentorAccount mentorAccount = new MentorAccount(fullTimeMentor);
        MentorAccount mentorAccount2 = new MentorAccount(partTimeMentor);

        mentorAccount.manageAccount();
        mentorAccount2.manageAccount();
    }
}
