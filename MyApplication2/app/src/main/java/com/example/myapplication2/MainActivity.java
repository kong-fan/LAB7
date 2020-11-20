package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed_height,ed_weight;
    private RadioButton btn_boy;
    private TextView tv_weight,tv_bmi,tv_progress;
    private LinearLayout ll_progress;
    private ProgressBar progressBar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_height=findViewById(R.id.ed_height);
        ed_weight=findViewById(R.id.ed_weight);
        btn_boy=findViewById(R.id.btn_boy);
        tv_weight=findViewById(R.id.tv_weight);
        tv_bmi=findViewById(R.id.tv_bmi);
        tv_progress=findViewById(R.id.tv_progress);
        ll_progress=findViewById(R.id.ll_progress);
        progressBar2=findViewById(R.id.progressBar2);
        findViewById(R.id.btn_calculate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed_height.length()<1){
                    Toast.makeText(MainActivity.this,"請輸入身高",Toast.LENGTH_SHORT).show();
                }
                else if(ed_weight.length()<1){
                    Toast.makeText(MainActivity.this,"請輸入體重",Toast.LENGTH_SHORT).show();
                }
                else
                    runAsyncTask();
            }
            private void runAsyncTask(){
                
            }
        });

    }
}