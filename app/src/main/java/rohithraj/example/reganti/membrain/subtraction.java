package rohithraj.example.reganti.membrain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class subtraction extends AppCompatActivity {

    TextView questionTextViewSub;
    Button option1ButtonSub,option2ButtonSub,option3ButtonSub,option4ButtonSub;
    int answer;
    Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction);
        Intent i = getIntent();
        //Toast.makeText(this, i.getStringExtra("sub"), Toast.LENGTH_SHORT).show();

        questionTextViewSub=(TextView)findViewById(R.id.question_textView_sub);
        option1ButtonSub =(Button)findViewById(R.id.option_1_button_sub);
        option2ButtonSub = (Button)findViewById(R.id.option_2_button_sub);
        option3ButtonSub = (Button)findViewById(R.id.option_3_button_sub);
        option4ButtonSub = (Button)findViewById(R.id.option_4_button_sub);

        setvalues();
    }

    public void setvalues(){


        int val = r.nextInt(100);
        int val2 = r.nextInt(100);
        if(val>val2){
        questionTextViewSub.setText(new String(Integer.toString(val)+"-"+Integer.toString(val2)));
        answer=val-val2;
        }
        else{
            questionTextViewSub.setText(new String(Integer.toString(val2)+"-"+Integer.toString(val)));
            answer=val2-val;
        }

        int button_number=r.nextInt(100)%4;



        switch (button_number+1){
            case 1: option1ButtonSub.setText(Integer.toString(answer));break;
            case 2 : option2ButtonSub.setText(Integer.toString(answer));break;
            case 3 : option3ButtonSub.setText(Integer.toString(answer));break;
            case 4: option4ButtonSub.setText(Integer.toString(answer));break;

        }

        int answer_dummy;
        Random r2 = new Random();

        for(int i=1;i<=5;i++){
            if(!(i==(button_number+1))){
                answer_dummy=r2.nextInt(50);
                switch (i){


                    case 1: option1ButtonSub.setText(Integer.toString(answer_dummy));break;
                    case 2 : option2ButtonSub.setText(Integer.toString(answer_dummy));break;
                    case 3 : option3ButtonSub.setText(Integer.toString(answer_dummy));break;
                    case 4: option4ButtonSub.setText(Integer.toString(answer_dummy));break;

                }

            }
        }

    }

    public void option1Clicked(View view){

        int buttonAnswer = Integer.parseInt(option1ButtonSub.getText().toString());
        if(buttonAnswer==answer){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }
        setvalues();
    }
    public void option2Clicked(View view){
        int buttonAnswer = Integer.parseInt(option2ButtonSub.getText().toString());
        if(buttonAnswer==answer){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }
        setvalues();
    }
    public void option3Clicked(View view){
        int buttonAnswer = Integer.parseInt(option3ButtonSub.getText().toString());
        if(buttonAnswer==answer){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }

        setvalues();
    }
    public void option4Clicked(View view){
        int buttonAnswer = Integer.parseInt(option4ButtonSub.getText().toString());
        if(buttonAnswer==answer){
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }
        setvalues();
    }


}
