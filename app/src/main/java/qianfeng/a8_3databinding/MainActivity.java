package qianfeng.a8_3databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import qianfeng.a8_3databinding.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.activity_main);

        ActivityMainBinding dataBinding = ((ActivityMainBinding) DataBindingUtil.setContentView(this, R.layout.activity_main));
        User user = new User("zhangsan","张三","123456");

        user.setUserface(R.mipmap.ic_launcher);
        user.setUrl("http://cms-bucket.nosdn.127.net/88c9022417d44627b4df67bd815a6c7e20161017193119.jpeg");
        dataBinding.setUser(user); // 注解都需要绑定哦！

    }
}
