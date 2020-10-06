package com.example.newslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DetailslActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsl);
        setTitle(getLocalClassName());
        Button ok=(Button) findViewById(R.id.okBtn);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToNews();
            }
        });
    }
    public void onBackPressed(){
        super.onBackPressed();
        backToNews();
    }
    private void backToNews(){
        Intent intent = new Intent(DetailslActivity.this,NewsActivity.class);
        startActivity(intent);
        finish();
    }
}
