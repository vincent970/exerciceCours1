package cba533.exercicecours1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CompareNumbers compareNumbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compareNumbers = new CompareNumbers();
    }

    public void compare(View button){
        EditText editTextNumber1 = findViewById(R.id.editText_number);
        EditText editTextNumber2 = findViewById(R.id.editText_number2);
        editTextNumber1.setBackgroundColor(Color.TRANSPARENT);
        editTextNumber2.setBackgroundColor(Color.TRANSPARENT);
        if(!editTextNumber1.getText().toString().isEmpty() && !editTextNumber2.getText().toString().isEmpty()){
            int number1 = Integer.parseInt(editTextNumber1.getText().toString());
            int number2 = Integer.parseInt(editTextNumber2.getText().toString());
            CompareNumbers.numbers biggerNumber = compareNumbers.compareNumbers(number1,number2);
            if(biggerNumber == CompareNumbers.numbers.NUMBER1){
                editTextNumber1.setBackgroundColor(Color.GREEN);
            }else if(biggerNumber == CompareNumbers.numbers.NUMBER2){
                editTextNumber2.setBackgroundColor(Color.GREEN);
            }
        }else{
            Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
        }

    }



}
