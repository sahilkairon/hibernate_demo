package demo;

import javax.persistence.*;
import java.util.*;
@Entity
public class userdetails{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
    private String username;


    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
