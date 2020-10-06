package com.example.newslist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.net.URI;
import android.widget.TextView;
public class NewsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle(getLocalClassName());
        Intent intent = getIntent();
        String login="";
        TextView nomcompte=(TextView) findViewById(R.id.textView2);
        Button logout=(Button) findViewById(R.id.logoutBtn);
        Button details=(Button) findViewById(R.id.detailsBtn);
        Button about=(Button) findViewById(R.id.aboutBtn);
        if (intent.hasExtra("login")) {
            login = intent.getStringExtra("login");
        }

        nomcompte.setText(login);
        logout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        details.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(),DetailslActivity.class);
                startActivity(intent);
                finish();
            }
        });
        about.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String url = "https://news.google.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });
    }
    public void onBackPressed(){
        super.onBackPressed();
        Log.i("NewsActivity","BackButton Clicked");
    }
}
