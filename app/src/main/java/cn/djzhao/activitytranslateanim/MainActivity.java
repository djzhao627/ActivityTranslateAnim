package cn.djzhao.activitytranslateanim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity2.class));
            // 下一个的进入，自己的退出
            overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom);
        });
    }

    @Override
    public void finish() {
        super.finish();
        // 下一个的进入，自己的退出
        overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_right);
    }
}