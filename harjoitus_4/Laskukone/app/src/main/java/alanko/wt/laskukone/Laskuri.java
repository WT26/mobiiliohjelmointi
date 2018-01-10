package alanko.wt.laskukone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class Laskuri extends AppCompatActivity {


    private EditText ETplus1;
    private EditText ETplus2;
    private Button Bplus;
    private TextView Tplus;

    private EditText ETminus1;
    private EditText ETminus2;
    private Button Bminus;
    private TextView Tminus;

    private EditText ETtimes1;
    private EditText ETtimes2;
    private Button Btimes;
    private TextView Ttimes;

    private EditText ETdivision1;
    private EditText ETdivision2;
    private Button Bdivision;
    private TextView Tdivision;

    private Button Breset;
    private Button Blog;

    private ArrayList<TextView> Tlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laskuri);

        ETplus1 = (EditText) findViewById(R.id.editTextPlus1);
        ETplus2 = (EditText) findViewById(R.id.editTextPlus2);
        Tplus = (TextView) findViewById(R.id.textViewPlus2);
        Bplus = (Button) findViewById(R.id.buttonLaskePlus);

        ETminus1 = (EditText) findViewById(R.id.editTextMinus1);
        ETminus2 = (EditText) findViewById(R.id.editTextMinus2);
        Tminus = (TextView) findViewById(R.id.textViewMinus2);
        Bminus = (Button) findViewById(R.id.buttonLaskeMinus);

        ETtimes1 = (EditText) findViewById(R.id.editTextTimes1);
        ETtimes2 = (EditText) findViewById(R.id.editTextTimes2);
        Ttimes = (TextView) findViewById(R.id.textViewTimes2);
        Btimes = (Button) findViewById(R.id.buttonLaskeTimes);

        ETdivision1 = (EditText) findViewById(R.id.editTextDivision1);
        ETdivision2 = (EditText) findViewById(R.id.editTextDivision2);
        Tdivision = (TextView) findViewById(R.id.textViewDivision2);
        Bdivision = (Button) findViewById(R.id.buttonLaskeDivision);

        Breset = (Button) findViewById(R.id.buttonReset);
        Blog = (Button) findViewById(R.id.buttonLog);
/*
        ETlist = new ArrayList<EditText>(){{
            add(ETplus1);
            add(ETplus2);
            add(ETminus1);
            add(ETminus2);
            add(ETtimes1);
            add(ETtimes2);
            add(ETdivision1);
            add(ETdivision2);
        }};
*/
        Tlist = new ArrayList<TextView>(){{
            add(Tplus);
            add(Tminus);
            add(Ttimes);
            add(Tdivision);
            add(ETplus1);
            add(ETplus2);
            add(ETminus1);
            add(ETminus2);
            add(ETtimes1);
            add(ETtimes2);
            add(ETdivision1);
            add(ETdivision2);
        }};

        Bplus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                countPlus();
            }
        });

        Bminus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                countMinus();
            }
        });

        Btimes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                countTimes();
            }
        });

        Bdivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                countDivision();
            }
        });

        Breset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetValues();
            }
        });
    }

    private void countPlus(){
        Tplus.setText(String.valueOf(Integer.parseInt(ETplus1.getText().toString()) + Integer.parseInt(ETplus2.getText().toString())));
    }

    private void countMinus(){
        Tminus.setText(String.valueOf(Integer.parseInt(ETminus1.getText().toString()) - Integer.parseInt(ETminus2.getText().toString())));
    }

    private void countTimes(){
        Ttimes.setText(String.valueOf(Integer.parseInt(ETtimes1.getText().toString()) * Integer.parseInt(ETtimes2.getText().toString())));
    }

    private void countDivision(){
        Tdivision.setText(String.valueOf(Integer.parseInt(ETdivision1.getText().toString()) / Integer.parseInt(ETdivision2.getText().toString())));
    }

    private void resetValues() {

        for (TextView T: Tlist)
        {
            T.setText("");
        }
    }
}








