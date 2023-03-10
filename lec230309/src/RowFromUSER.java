public class RowFromUSER {
    private int USER_ID;
    private String USER_NICKNAME;
    private String USER_PASSWORD;

    public RowFromUSER(int USER_ID, String USER_NICKNAME, String USER_PASSWORD) {
        this.USER_ID = USER_ID;
        this.USER_NICKNAME = USER_NICKNAME;
        this.USER_PASSWORD = USER_PASSWORD;
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public String getUSER_NICKNAME() {
        return USER_NICKNAME;
    }

    public String getUSER_PASSWORD() {
        return USER_PASSWORD;
    }
}
