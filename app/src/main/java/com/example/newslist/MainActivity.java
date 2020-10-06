package com.example.newslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getLocalClassName());
        //get username & password objects
        final EditText editT=(EditText) findViewById(R.id.editText2);
        final EditText passwordT=(EditText) findViewById(R.id.editText);
        final EditText nomCompte=(EditText) findViewById(R.id.editText3);
        Button loginBtn=(Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String message="Connexion refusée";
                Log.i("LoginActivity","Username = "+editT.getText().toString());
                Log.i("LoginActivity","Password = "+passwordT.getText().toString());
                if(editT.getText().toString().equals("admin") && passwordT.getText().toString().equals("admin")){
                    message="Connexion réussie";
                    Intent intent = new Intent(view.getContext(),NewsActivity.class);
                    intent.putExtra("login",nomCompte.getText().toString());
                    startActivity(intent);
                    //finish();
                }
                Toast.makeText(MainActivity.this,message,5).show();
            }
        });
    }

}

