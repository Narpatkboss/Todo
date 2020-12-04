package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


}
    Button btn
    ContactsContract.CommonDataKinds.Email email



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContactsContract.CommonDataKinds.Email = (EditText) findViewById(R.id.email);
        btn = (Button) findViewById(R.id.btn);



        btn .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(ContactsContract.CommonDataKinds.Email.getText().toString().equals("narpat23@gmail.com") && {
                    Intent intent=new Intent(MainActivity.this,Home_PageActivity.class);
                    startActivity(intent);


            }
        });

    }
}
