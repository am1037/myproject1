public class VOforMember {
    private String USER_ID;
    private String USER_NICKNAME;
    private String USER_PASSWORD;

    public VOforMember(String USER_ID, String USER_PASSWORD, String USER_NICKNAME) {
        this.USER_ID = USER_ID;
        this.USER_NICKNAME = USER_NICKNAME;
        this.USER_PASSWORD = USER_PASSWORD;
    }

    public String getUSER_ID() {
        return USER_ID;
    }
    public String getUSER_PASSWORD() {
        return USER_PASSWORD;
    }
    public String getUSER_NICKNAME() {
        return USER_NICKNAME;
    }

}
