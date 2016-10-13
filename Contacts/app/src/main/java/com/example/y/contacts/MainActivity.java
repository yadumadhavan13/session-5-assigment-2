package com.example.y.contacts;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttoncontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttoncontact = (Button) findViewById(R.id.button_contact);
        buttoncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(ContactsContract.Contacts.CONTENT_URI);
                startActivity(intent);
                Log.e("Contacts","contacts app displayed");
                Toast.makeText(MainActivity.this, "Conatacts App", Toast.LENGTH_LONG).show();
            }
        });
    }
}
