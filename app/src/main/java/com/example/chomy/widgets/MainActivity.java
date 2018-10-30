package com.example.chomy.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.buttonResult);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editTextName = findViewById(R.id.editTextName);
        String editTextNameString = editTextName.getText().toString();

        EditText editTextAge = findViewById(R.id.editTextAge);
        String editTextAgeString = editTextAge.getText().toString();

        RadioGroup radioGroupGender = findViewById(R.id.radioGroupGender);

        RadioButton radioButtonGender = findViewById(radioGroupGender.getCheckedRadioButtonId());
        String radioButtonGenderString = radioButtonGender.getText().toString();

        RadioGroup radioGroupJob = findViewById(R.id.radioGroupJob);

        RadioButton radioButtonJob = findViewById(radioGroupJob.getCheckedRadioButtonId());
        String radioButtonJobtring = radioButtonJob.getText().toString();

        TextView textViewResult = findViewById(R.id.textViewResult);
        textViewResult.setText("이름은 "+editTextNameString+", 나이는 "+editTextAgeString
                +"세, 성별은 "+radioButtonGenderString+", 직업은 "+radioButtonJobtring+"입니다.");
    }
}
