package cn.markedquilt.coke.spring_mybatis.entity;

public class User {
    private int id;
    private String username;
    private String password;
    private String sex;
    private String realname;

    public User(int id, String username, String password, String sex, String realname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.realname = realname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}
