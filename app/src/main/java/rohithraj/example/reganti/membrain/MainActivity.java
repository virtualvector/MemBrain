package rohithraj.example.reganti.membrain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goAddtionActivity (View view){

        Intent i = new Intent(MainActivity.this,AdditionActivity.class);
        i.putExtra("add","0");
        startActivity(i);


    }
    public void goSubtractionActivity (View view){

        Intent i = new Intent(MainActivity.this,subtraction.class);
        i.putExtra("sub","0");
        startActivity(i);


    }



}
