package cn.djzhao.activitytranslateanim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @Override
    public void finish() {
        super.finish();
        // 下一个的进入，自己的退出
        // overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}