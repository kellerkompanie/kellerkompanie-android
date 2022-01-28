package com.kellerkompanie;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView textViewHomepage = findViewById(R.id.text_view_homepage);
        textViewHomepage.setText(Html.fromHtml("<a href=\"https://kellerkompanie.com\">kellerkompanie.com</a>"));
        textViewHomepage.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textViewVersion = findViewById(R.id.text_view_version);
        textViewVersion.setText(String.format("App Version: %s", BuildConfig.VERSION_NAME));

        TextView textViewEmail = findViewById(R.id.text_view_email);
        textViewEmail.setText(Html.fromHtml("Kontakt: <a href=\"mailto:leitung@kellerkompanie.com\">leitung@kellerkompanie.com</a>"));
        textViewEmail.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textViewGitHub = findViewById(R.id.text_view_github);
        textViewGitHub.setText(Html.fromHtml("Quellcode auf <a href=\"https://github.com/kellerkompanie/kellerkompanie-android/\">GitHub</a>"));
        textViewGitHub.setMovementMethod(LinkMovementMethod.getInstance());
    }
}