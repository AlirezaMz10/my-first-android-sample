package com.example.linearlayoutsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnSum);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt1 = findViewById(R.id.edtNumberOne);
                String n1 = edt1.getText() + "";

                EditText edt2 = findViewById(R.id.edtNumberTwo);
                String n2 = edt2.getText() + "";

                TextView txt = findViewById(R.id.txtResult);
                if (!n1.equals("") && !n2.equals("")) {
                    txt.setText(Integer.parseInt(n1) + Integer.parseInt(n2) + "");
                } else {
                    txt.setText("Please Fill Numbers");
                }
            }
        });

        Button btn2 = findViewById(R.id.btnSubtract);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt1 = findViewById(R.id.edtNumberOne);
                String n1 = edt1.getText() + "";

                EditText edt2 = findViewById(R.id.edtNumberTwo);
                String n2 = edt2.getText() + "";

                TextView txt = findViewById(R.id.txtResult);
                if (!n1.equals("") && !n2.equals("")) {
                    txt.setText(Integer.parseInt(n1) - Integer.parseInt(n2) + "");
                } else {
                    txt.setText("Please Fill Numbers");
                }
            }
        });

        Button btn3 = findViewById(R.id.btnMultiply);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt1 = findViewById(R.id.edtNumberOne);
                String n1 = edt1.getText() + "";

                EditText edt2 = findViewById(R.id.edtNumberTwo);
                String n2 = edt2.getText() + "";

                TextView txt = findViewById(R.id.txtResult);
                if (!n1.equals("") && !n2.equals("")) {
                    txt.setText(Integer.parseInt(n1) * Integer.parseInt(n2) + "");
                } else {
                    txt.setText("Please Fill Numbers");
                }
            }
        });

        Button btn4 = findViewById(R.id.btnDivide);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt1 = findViewById(R.id.edtNumberOne);
                String n1 = edt1.getText() + "";

                EditText edt2 = findViewById(R.id.edtNumberTwo);
                String n2 = edt2.getText() + "";

                TextView txt = findViewById(R.id.txtResult);
                if (!n1.equals("") && !n2.equals("")) {
                    txt.setText(Integer.parseInt(n1) / Integer.parseInt(n2) + "");
                } else {
                    txt.setText("Please Fill Numbers");
                }
            }
        });
    }
}