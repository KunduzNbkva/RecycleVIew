package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity  implements Serializable {
    Button button;
    EditText editText;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        button=findViewById(R.id.buttonBack);
        editText=findViewById(R.id.editText2);

    }
    public void onClickBack(View v){
        text = editText.getText().toString();
        Intent intent= new Intent(SecondActivity.this, FirstActivity.class);
        intent.putExtra("text",text);
        setResult(RESULT_OK,intent);
        finish();

    }

}
