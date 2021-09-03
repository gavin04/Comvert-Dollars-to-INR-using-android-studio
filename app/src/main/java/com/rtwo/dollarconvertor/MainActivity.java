package com.rtwo.dollarconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edittext1;
    private Button buttonConvert;
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        edittext1 = (EditText) findViewById(R.id.textDollar);
        textview = (TextView) findViewById(R.id.txtConvert);
        buttonConvert = (Button) findViewById(R.id.btnConvert);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                double value1=Double.parseDouble(edittext1.getText().toString());
                double convert=value1*75;
                textview.setText(Double.toString(convert));
                Toast.makeText(getApplicationContext(),String.valueOf(convert),Toast.LENGTH_LONG).show();
            }
        });
        }
}