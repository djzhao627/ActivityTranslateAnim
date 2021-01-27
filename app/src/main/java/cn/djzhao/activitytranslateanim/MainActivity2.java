package cn.djzhao.activitytranslateanim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.btn).setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity3.class));
            // 下一个的进入，自己的退出
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }

    @Override
    public void finish() {
        super.finish();
        // 下一个的进入，自己的退出
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}