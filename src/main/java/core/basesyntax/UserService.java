package core.basesyntax;

public class UserService {
    private PasswordValidator validate = new PasswordValidator();

    public void registerUser(User user) {
        try {
            validate.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            e.printStackTrace();
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
