package com.bertucci.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonLimpar;
    private Button buttonConfirmar;
    private EditText editText;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLimpar = (Button) findViewById(R.id.buttonLimpar);
        buttonConfirmar = (Button) findViewById(R.id.buttonConfirmar);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                textView.setText(getText(R.string.text_write_top));
            }
        });

    }

    public void confirmar(View view) {
        textView.setText(editText.getText());

    }

}