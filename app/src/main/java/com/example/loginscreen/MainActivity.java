package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    EditText name,roll;
    Button login;
    CheckBox checkBox1,checkbox2;
    RadioGroup radioGroup;
    Switch agree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.edit_name);
        roll=findViewById(R.id.edit_roll);
        login= findViewById(R.id.login);

        checkBox1=findViewById(R.id.register_checkbox);
        checkbox2 =findViewById(R.id.unregister_checkbox);
        radioGroup=findViewById(R.id.radiogroup);
        agree=findViewById(R.id.agree);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("username",name.getText().toString());
                Log.i("rollno",roll.getText().toString());

                try {
                    int a=radioGroup.getCheckedRadioButtonId();
                    RadioButton radioButton=findViewById(a);
                    Log.i("radio",radioButton.getText().toString());
                }
                catch (Exception e)
                {
                  Log.e("radioBtnError",e.toString());
                }
                if (checkBox1.isChecked())
                {
                    Log.i("checkbox",checkBox1.getText().toString());
                }
                if (checkbox2.isChecked())
                {
                    Log.i("checkbox",checkbox2.toString());
                }
                if (agree.isChecked())
                {
                    Log.i("Switch",agree.getText().toString());
                }

            }
        });

    }
}