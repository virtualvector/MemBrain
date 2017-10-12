package rohithraj.example.reganti.membrain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class AdditionActivity extends AppCompatActivity {

    TextView questionTextView;
    Button option1Button,option2Button,option3Button,option4Button;
    int answer;
    RadioButton two_digit_button;

    int number_of_digits;
    Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        Intent i = getIntent();
        //Toast.makeText(this, i.getStringExtra("add"), Toast.LENGTH_SHORT).show();

        questionTextView=(TextView)findViewById(R.id.question_textView);
        option1Button =(Button)findViewById(R.id.option_1_button);
        option2Button = (Button)findViewById(R.id.option_2_button);
        option3Button = (Button)findViewById(R.id.option_3_button);
        option4Button = (Button)findViewById(R.id.option_4_button);
        two_digit_button=(RadioButton)findViewById(R.id.radio_2digit);
        two_digit_button.setChecked(true);
        number_of_digits=2;

        setvalues(number_of_digits);
    }

    public void setvalues(int number_of_digits){
        int range=100;
        switch (number_of_digits){
            case 2: range=100;break;
            case 3 : range=1000;break;
            case 4 : range =10000;break;
        }
        int val = r.nextInt(range);
        int val2 = r.nextInt(range);
        questionTextView.setText(new String(Integer.toString(val)+" + "+Integer.toString(val2)));
        answer=val+val2;
        int button_number=r.nextInt(100)%4;



        switch (button_number+1){
            case 1: option1Button.setText(Integer.toString(answer));break;
            case 2 : option2Button.setText(Integer.toString(answer));break;
            case 3 : option3Button.setText(Integer.toString(answer));break;
            case 4: option4Button.setText(Integer.toString(answer));break;

    }

    int answer_dummy;
        Random r2 = new Random();

    for(int i=1;i<=5;i++){
        if(!(i==(button_number+1))){
            answer_dummy=r2.nextInt(range);
            switch (i){


                case 1: option1Button.setText(Integer.toString(answer_dummy));break;
                case 2 : option2Button.setText(Integer.toString(answer_dummy));break;
                case 3 : option3Button.setText(Integer.toString(answer_dummy));break;
                case 4: option4Button.setText(Integer.toString(answer_dummy));break;

            }

        }
    }

    }

    public void option1Clicked(View view){

        int buttonAnswer = Integer.parseInt(option1Button.getText().toString());
        if(buttonAnswer==answer){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }
        setvalues(number_of_digits);
    }
    public void option2Clicked(View view){
        int buttonAnswer = Integer.parseInt(option2Button.getText().toString());
        if(buttonAnswer==answer){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }
        setvalues(number_of_digits);
    }
    public void option3Clicked(View view){
        int buttonAnswer = Integer.parseInt(option3Button.getText().toString());
        if(buttonAnswer==answer){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }

        setvalues(number_of_digits);
    }
    public void option4Clicked(View view){
        int buttonAnswer = Integer.parseInt(option4Button.getText().toString());
        if(buttonAnswer==answer){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }
        setvalues(number_of_digits);
    }


    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_2digit:
                if (checked){
                    number_of_digits=2;
                    setvalues(number_of_digits);
                    //Toast.makeText(this, "2,"+Integer.toString(number_of_digits), Toast.LENGTH_SHORT).show();
                }
                    // Pirates are the best
                    break;
            case R.id.radio_3digit:
                if (checked){number_of_digits=3;setvalues(number_of_digits);}
                    // Ninjas rule
                    break;
            case R.id.radio_4digit:
                if(checked){number_of_digits=4;setvalues(number_of_digits);}

                    break;
        }

    }


}
