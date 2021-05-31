package com.example.lesson3dz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.view.*;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    String a = null;
    char operations;
    int oneInt = 0;
    int twoInt = 0;
    int result = 0;
    private TextView textView;
    private Button button1;
    private Button button2;
    private Button button4;
    private Button button5;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonDivision;
    private Button buttonAddition;
    private Button buttonMultiplication;
    private Button buttonTaking_away;
    private Button buttonEqually;
    private Button buttonCancel;
    private Switch aSwitch;

    public MainActivity() {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if (savedInstanceState != null && savedInstanceState.containsKey("a")) {
            a = savedInstanceState.getString("a");
            textView.setText(a);
        } else {
            a = null;
        }

        if (savedInstanceState != null && savedInstanceState.containsKey("operations")) {
            operations = savedInstanceState.getChar("operations");
        }

        if (savedInstanceState != null && savedInstanceState.containsKey("oneInt")) {
            oneInt = savedInstanceState.getInt("oneInt");
            textView.setText(String.valueOf(oneInt));
        }

        if (savedInstanceState != null && savedInstanceState.containsKey("twoInt")) {
            twoInt = savedInstanceState.getInt("twoInt");
            textView.setText(String.valueOf(twoInt));
        }

        if (savedInstanceState != null && savedInstanceState.containsKey("result")) {
            result = savedInstanceState.getInt("result");
            textView.setText(String.valueOf(result));
        }

        textView = findViewById(R.id.input);
        button1 = findViewById(R.id.but1);
        button2 = findViewById(R.id.but2);
        Button button3 = findViewById(R.id.but3);
        button4 = findViewById(R.id.but4);
        button5 = findViewById(R.id.but5);
        Button button6 = findViewById(R.id.but6);
        button7 = findViewById(R.id.but7);
        button8 = findViewById(R.id.but8);
        button9 = findViewById(R.id.but9);
        button0 = findViewById(R.id.but0);
        buttonDivision = findViewById(R.id.division);
        buttonAddition = findViewById(R.id.addition);
        buttonMultiplication = findViewById(R.id.multiplication);
        buttonTaking_away = findViewById(R.id.taking_away);
        buttonCancel = findViewById(R.id.cancel);
        buttonEqually = findViewById(R.id.equally);


        button1.setOnClickListener(v -> {
            a = String.valueOf(textView.getText());
            a = a + "1";
            textView.setText(a);
        });
        button2.setOnClickListener(v -> {
            a = String.valueOf(textView.getText());
            a = a + "2";
            textView.setText(a);
        });

        button3.setOnClickListener(v -> {
            a = String.valueOf(textView.getText());
            a = a + "3";
            textView.setText(a);
        });
        button4.setOnClickListener(v -> {
            a = String.valueOf(textView.getText());
            a = a + "4";
            textView.setText(a);
        });
        button5.setOnClickListener(v -> {
            a = String.valueOf(textView.getText());
            a = a + "5";
            textView.setText(a);
        });
        button6.setOnClickListener(v -> {
            a = String.valueOf(textView.getText());
            a = a + "6";
            textView.setText(a);
        });
        button7.setOnClickListener(v -> {
            a = String.valueOf(textView.getText());
            a = a + "7";
            textView.setText(a);
        });
        button8.setOnClickListener(v -> {
            a = String.valueOf(textView.getText());
            a = a + "8";
            textView.setText(a);
        });
        button9.setOnClickListener(v -> {
            a = String.valueOf(textView.getText());
            a = a + "9";
            textView.setText(a);
        });
        button0.setOnClickListener(v -> {
            a = String.valueOf(textView.getText());
            a = a + "0";
            textView.setText(a);
        });
        buttonDivision.setOnClickListener(v -> {
            setOneInt();
            operations = '/';
        });
        buttonAddition.setOnClickListener(v -> {
            setOneInt();
            operations = '+';
        });
        buttonMultiplication.setOnClickListener(v -> {
            setOneInt();
            operations = '*';
        });
        buttonTaking_away.setOnClickListener(v -> {
            setOneInt();
            operations = '-';
        });
        buttonCancel.setOnClickListener(v -> {
            a = null;
            textView.setText(a);

        });
        buttonEqually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoInt = Integer.parseInt(String.valueOf(textView.getText()));
                switch (operations) {
                    case '/':
                        if (twoInt == 0) {
                            a = null;
                            textView.setText(a);
                        } else {
                            result = oneInt / twoInt;
                            break;
                        }
                    case '*':
                        result = oneInt * twoInt;
                        break;
                    case '+':
                        result = oneInt + twoInt;
                        break;
                    case '-':
                        result = oneInt - twoInt;
                        break;
                }
                textView.setText(String.valueOf(result));
            }
        });


    }

    public int setOneInt() {
        a = String.valueOf(textView.getText());
        oneInt = Integer.parseInt(a);
        textView.setText(null);
        return oneInt;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("a", a);
        outState.putChar("operation", operations);
        outState.putInt("oneInt", oneInt);
        outState.putInt("twoInt", twoInt);
        outState.putInt("result", result);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

    }
}
