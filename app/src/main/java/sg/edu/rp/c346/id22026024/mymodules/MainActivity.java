package sg.edu.rp.c346.id22026024.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button buttonC203;
    Button buttonC206;
    Button buttonC218;
    Button buttonC235;
    Button buttonC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        buttonC203=findViewById(R.id.buttonC203);
        buttonC206=findViewById(R.id.buttonC206);
        buttonC218=findViewById(R.id.buttonC218);
        buttonC235=findViewById(R.id.buttonC235);
        buttonC346=findViewById(R.id.buttonC346);

        buttonC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        }
}