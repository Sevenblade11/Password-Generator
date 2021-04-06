package password;

public class Password {

    private String password;
    private int passwordLength;

    public Password(){
        password = "";
        passwordLength = 0;
    }

    public Password(String password, int passwordLength){
        this.password = password;
        this.passwordLength = passwordLength;
    }
}
