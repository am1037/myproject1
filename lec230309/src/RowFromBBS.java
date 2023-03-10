public class RowFromBBS {
    private int BBS_No;
    private String BBS_Title;
    private int BBS_AuthorId;
    private String BBS_Contents;

    public RowFromBBS(int BBS_No, String BBS_Title, int BBS_AuthorId, String BBS_Contents) {
        this.BBS_No = BBS_No;
        this.BBS_Title = BBS_Title;
        this.BBS_AuthorId = BBS_AuthorId;
        this.BBS_Contents = BBS_Contents;
    }

    public int getBBS_No() {
        return BBS_No;
    }

    public String getBBS_Title() {
        return BBS_Title;
    }

    public int getBBS_AuthorId() {
        return BBS_AuthorId;
    }

    public String getBBS_Contents() {
        return BBS_Contents;
    }
}
