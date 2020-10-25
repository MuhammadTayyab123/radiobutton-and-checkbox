package com.example.homework;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.CheckBox;





public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    RadioGroup radioGroup5;
    RadioButton radioButton5;
    TextView textView5;


    CheckBox C1;
    TextView textView6;


    CheckBox C2;
    TextView textView7;


    CheckBox C3;
    TextView textView8;

    CheckBox C4;
    TextView textView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.textViewResults);

        radioGroup5 = findViewById(R.id.radioGroup5);
        textView5 = findViewById(R.id.textViewResults);

        C1 = findViewById(R.id.checkBox3);
        textView6 = findViewById(R.id.textViewResults);


        C2 = findViewById(R.id.checkBox4);
        textView7 = findViewById(R.id.textViewResults);

        C3 = findViewById(R.id.checkBox5);
        textView8 = findViewById(R.id.textViewResults);

        C4 = findViewById(R.id.checkBox6);
        textView9 = findViewById(R.id.textViewResults);
    }

    public void ShowSelection(View view) {
        int checked = radioGroup.getCheckedRadioButtonId();
        int checked5 = radioGroup5.getCheckedRadioButtonId();
        int checked6 = C1.getId();
        int checked7 = C2.getId();
        int checked8 = C3.getId();
        int checked9 = C4.getId();

        radioButton = findViewById(checked);
        radioButton5 = findViewById(checked5);
        C1 = findViewById(checked6);
        C2 = findViewById(checked7);
        C3 = findViewById(checked8);
        C4 = findViewById(checked9);



        if (C1.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() + "and" + C1.getText());
        }
        else if (C2.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C2.getText());
        }
        else if (C3.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C3.getText());
        }
        else if (C4.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C4.getText());
        }
        else if (C1.isChecked()&&C2.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C1.getText() +  "and" +C2.getText());
        }
        else if (C1.isChecked()&&C3.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C1.getText() +  "and" +C3.getText());
        }
        else if (C1.isChecked()&&C4.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C1.getText() +  "and" +C4.getText());
        }
        else if (C2.isChecked()&&C3.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C2.getText() +  "and" +C3.getText());
        }
        else if (C2.isChecked()&&C4.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C2.getText() +  "and" +C4.getText());
        }
        else if (C3.isChecked()&&C4.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C3.getText() +  "and" +C4.getText());
        }
        else if (C1.isChecked()&&C2.isChecked()&&C3.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C1.getText() +  "and" +C2.getText() +  "and" +C3.getText());
        }
        else if (C1.isChecked()&&C3.isChecked()&&C4.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C1.getText() +  "and" +C3.getText() +  "and" +C4.getText());
        }
        else if (C2.isChecked()&&C3.isChecked()&&C4.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C2.getText() +  "and" +C3.getText() +  "and" +C4.getText());
        }
        else if (C1.isChecked()&&C2.isChecked()&&C3.isChecked()&&C4.isChecked()) {
            textView.setText(radioButton.getText() + "and" + radioButton5.getText() +  "and" +C1.getText() +  "and" +C2.getText() +  "and" +C3.getText() +  "and" +C4.getText());
        }
        else{
            textView.setText(radioButton.getText() + "and" + radioButton5.getText());
        }
    }
}