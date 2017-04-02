package app.com.example.android.lifeintheuk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click (View view) {
        
        Integer totalScore = 0;
        CheckBox checkBox_1a = (CheckBox) findViewById(R.id.q1_a);
        CheckBox checkBox_1b = (CheckBox) findViewById(R.id.q1_b);
        CheckBox checkBox_1c = (CheckBox) findViewById(R.id.q1_c);
        CheckBox checkBox_1d = (CheckBox) findViewById(R.id.q1_d);
        if (checkBox_1a.isChecked()==true && checkBox_1c.isChecked()==true
                && checkBox_1b.isChecked()==false && checkBox_1d.isChecked()==false) {
            totalScore++;
        }

        EditText editText   = (EditText) findViewById(R.id.q2_response);
        String strEditText = editText.getText().toString().trim().toLowerCase();
        if (strEditText.equals("london")) {
            totalScore++;
        }

        RadioButton radioButton_3b = (RadioButton) findViewById(R.id.q3_b);
        if (radioButton_3b.isChecked()==true) {
            totalScore++;
        }

        CheckBox checkBox_4a = (CheckBox) findViewById(R.id.q4_a);
        CheckBox checkBox_4b = (CheckBox) findViewById(R.id.q4_b);
        CheckBox checkBox_4c = (CheckBox) findViewById(R.id.q4_c);
        CheckBox checkBox_4d = (CheckBox) findViewById(R.id.q4_d);

        if (checkBox_4a.isChecked()==true && checkBox_4b.isChecked()==true
                && checkBox_4c.isChecked()==false && checkBox_4d.isChecked()==false) {
            totalScore++;
        }
        
        editText   = (EditText) findViewById(R.id.q5_response);
        strEditText = editText.getText().toString().toLowerCase();
        if (strEditText.equals("11")) {
            totalScore=totalScore+1;
        }
        if (totalScore==5) {
            Toast.makeText(MainActivity.this, "Great job! You have scored " + totalScore + " out of 5 ! Well done !", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "You have scored " + totalScore + " out of 5 !", Toast.LENGTH_SHORT).show();
        }
        }
    }


