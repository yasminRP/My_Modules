package sg.edu.rp.c346.id22026024.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayC203 extends AppCompatActivity {
TextView textCode;
TextView textName;
TextView textYear;
TextView textSemester;
TextView textCredit;
TextView textVenue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_c203);

        textCode=findViewById(R.id.code);
        textName=findViewById(R.id.name);
        textYear=findViewById(R.id.year);
        textSemester=findViewById(R.id.semester);
        textCredit=findViewById(R.id.credit);
        textVenue=findViewById(R.id.venue);
    }
}