package user_info.jdbc.vo;

public class user_infoVO {
    private String userName;
    private String email;
    private String phone;
    private String address;
    private String id;
    private String pwd;
    private int point;
    private String cardnum;

    public user_infoVO(String userName, String email, String phone, String address, String id, String pwd, int point, String cardnum) {
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.id = id;
        this.pwd = pwd;
        this.point = point;
        this.cardnum = cardnum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }
}
