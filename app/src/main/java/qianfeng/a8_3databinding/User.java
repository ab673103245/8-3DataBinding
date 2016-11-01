package qianfeng.a8_3databinding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Administrator on 2016/10/19 0019.
 */
public class User {
    private String username;
    private String nickname;
    private String password;
    private int userface;
    private String url;


    // 注意方法一定是这样开头： public static void
    @BindingAdapter("bind:userface")
    public static void getUserface(ImageView iv,int resId)
    {
        iv.setImageResource(resId);
    }

    // 使用自定义属性url，注意是用 bind:
    @BindingAdapter("bind:url")
    public static void getUrl(ImageView iv,String url)
    {
        Picasso.with(iv.getContext()).load(url).into(iv);
    }

    public User(String username, String nickname, String password) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
    }

    public User(String username, String nickname, String password, int userface, String url) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.userface = userface;
        this.url = url;
    }

    public User() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public int getUserface() {
        return userface;
    }

    public void setUserface(int userface) {
        this.userface = userface;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
