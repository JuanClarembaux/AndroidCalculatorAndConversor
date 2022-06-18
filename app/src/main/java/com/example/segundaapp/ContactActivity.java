package com.example.segundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ContactActivity extends AppCompatActivity {

    private Button TelefonoButton;
    private Button GmailButton;
    private Button GithubButton;
    private String[] mails = {"juanclarembaux12@gmail.com"};
    private int phoneNumber = 123456789;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        GithubButton = findViewById(R.id.GithubButton);
        GmailButton = findViewById(R.id.GmailButton);
        TelefonoButton = findViewById(R.id.TelefonoButton);

        GithubButton.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/JuanClarembaux"));
            startActivity(intent);
        });
        GmailButton.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_EMAIL, mails);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });
        TelefonoButton.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + phoneNumber));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });
    }

}