package kr.co.tjoeun.lifecycle_20200525;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("secondActivity", "onCreate 실행");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("secondActivity", "onDestroy 실행");
    }
}
