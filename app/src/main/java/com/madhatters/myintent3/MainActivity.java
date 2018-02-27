package com.madhatters.myintent3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        EditText editText=(EditText)findViewById(R.id.edittext);
        String strl=editText.getText().toString();
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(strl));
        startActivity(intent);

    }
}
