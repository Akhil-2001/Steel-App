package com.example.spinnertrial;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] units = {"Bundles", "Kgs", "Rods"};
    String choice = "";
    TextView h1, h2, h3, t2, t3, t4, c1, c2, c3, c4, c5,d1,d2,d3,d4,d5;
    Spinner spin;
    EditText b1, b2, b3, b4, b5;
    Button reset;
    int total[] = new int[3];

    int count=0;



    void bundles() {

        int n[] = new int[2];
        if (!b1.getText().toString().equals("")) {
            n[0] = Integer.parseInt(b1.getText().toString())*47;
            n[1] = Integer.parseInt(b1.getText().toString())*10;
            c1.setText(String.valueOf(n[0]));
            d1.setText(String.valueOf(n[1]));
        }
        else
        {
            c1.setText("");
            d1.setText("");
        }
        if (!b2.getText().toString().equals("")) {
             n[0] = Integer.parseInt(b2.getText().toString())*53;
             n[1] = Integer.parseInt(b2.getText().toString())*7;
            c2.setText(String.valueOf(n[0]));
            d2.setText(String.valueOf(n[1]));
        }
        else
        {
            c2.setText("");
            d2.setText("");
        }
        if (!b3.getText().toString().equals("")) {
             n[0] = Integer.parseInt(b3.getText().toString())*53;
             n[1] = Integer.parseInt(b3.getText().toString())*5;
             c3.setText(String.valueOf(n[0]));
             d3.setText(String.valueOf(n[1]));
        }
        else
        {
            c3.setText("");
            d3.setText("");
        }
        if (!b4.getText().toString().equals("")) {
            n[0] = Integer.parseInt(b4.getText().toString())*56;
            n[1] = Integer.parseInt(b4.getText().toString())*3;
            c4.setText(String.valueOf(n[0]));
            d4.setText(String.valueOf(n[1]));
        }
        else
        {
            c4.setText("");
            d4.setText("");
        }
        if (!b5.getText().toString().equals("")) {
            n[0] = Integer.parseInt(b5.getText().toString())*59;
            n[1] = Integer.parseInt(b5.getText().toString())*2;
            c5.setText(String.valueOf(n[0]));
            d5.setText(String.valueOf(n[1]));
        }
        else
        {
            c5.setText("");
            d5.setText("");
        }

    }

    void kgs() {

        int n[] = new int[2];
        if (!b1.getText().toString().equals("")) {
            n[0] = (int) Math.ceil(Double.parseDouble(b1.getText().toString())/47);
            n[1] = (int) Math.ceil(Double.parseDouble(b1.getText().toString())/4.7);
            c1.setText(String.valueOf(n[0]));
            d1.setText(String.valueOf(n[1]));
        }
        else
        {
            c1.setText("");
            d1.setText("");
        }
        if (!b2.getText().toString().equals("")) {
             n[0] = (int) Math.ceil(Double.parseDouble(b2.getText().toString())/53);
             n[1] = (int) Math.ceil((Double.parseDouble(b2.getText().toString())*7)/53);
            c2.setText(String.valueOf(n[0]));
            d2.setText(String.valueOf(n[1]));
        }
        else
        {
            c2.setText("");
            d2.setText("");
        }
        if (!b3.getText().toString().equals("")) {
             n[0] = (int) Math.ceil(Double.parseDouble(b3.getText().toString())/53);
             n[1] = (int) Math.ceil((Double.parseDouble(b3.getText().toString())*5)/53);
             c3.setText(String.valueOf(n[0]));
             d3.setText(String.valueOf(n[1]));
        }
        else
        {
            c3.setText("");
            d3.setText("");
        }
        if (!b4.getText().toString().equals("")) {
            n[0] = (int) Math.ceil(Double.parseDouble(b4.getText().toString())/56);
            n[1] = (int) Math.ceil((Double.parseDouble(b4.getText().toString())*3)/56);
            c4.setText(String.valueOf(n[0]));
            d4.setText(String.valueOf(n[1]));
        }
        else
        {
            c4.setText("");
            d4.setText("");
        }
        if (!b5.getText().toString().equals("")) {
            n[0] = (int) Math.ceil(Double.parseDouble(b5.getText().toString())/59);
            n[1] = (int) Math.ceil((Double.parseDouble(b5.getText().toString())*2)/59);
            c5.setText(String.valueOf(n[0]));
            d5.setText(String.valueOf(n[1]));
        }
        else
        {
            c5.setText("");
            d5.setText("");
        }

    }

    void rods() {

        int n[] = new int[2];
        if (!b1.getText().toString().equals("")) {
            n[0] = (int) Math.ceil(Double.parseDouble(b1.getText().toString())/10);
            n[1] = (int) Math.ceil(Double.parseDouble(b1.getText().toString())*4.7);
            c1.setText(String.valueOf(n[0]));
            d1.setText(String.valueOf(n[1]));
        }
        else
        {
            c1.setText("");
            d1.setText("");
        }
        if (!b2.getText().toString().equals("")) {
            n[0] = (int) Math.ceil(Double.parseDouble(b2.getText().toString())/7);
            n[1] = (int) Math.ceil((Double.parseDouble(b2.getText().toString())*53)/7);
            c2.setText(String.valueOf(n[0]));
            d2.setText(String.valueOf(n[1]));
        }
        else
        {
            c2.setText("");
            d2.setText("");
        }
        if (!b3.getText().toString().equals("")) {
            n[0] = (int) Math.ceil(Double.parseDouble(b3.getText().toString())/5);
            n[1] = (int) Math.ceil((Double.parseDouble(b3.getText().toString())*53)/5);
            c3.setText(String.valueOf(n[0]));
            d3.setText(String.valueOf(n[1]));
        }
        else
        {
            c3.setText("");
            d3.setText("");
        }
        if (!b4.getText().toString().equals("")) {
            n[0] = (int) Math.ceil(Double.parseDouble(b4.getText().toString())/3);
            n[1] = (int) Math.ceil((Double.parseDouble(b4.getText().toString())*56)/3);
            c4.setText(String.valueOf(n[0]));
            d4.setText(String.valueOf(n[1]));
        }
        else
        {
            c4.setText("");
            d4.setText("");
        }
        if (!b5.getText().toString().equals("")) {
            n[0] = (int) Math.ceil(Double.parseDouble(b5.getText().toString())/2);
            n[1] = (int) Math.ceil((Double.parseDouble(b5.getText().toString())*59)/2);
            c5.setText(String.valueOf(n[0]));
            d5.setText(String.valueOf(n[1]));
        }
        else
        {
            c5.setText("");
            d5.setText("");
        }

    }

    void totalcalc(){

        int b[] = new int[5];
        int c[] = new int[5];
        int d[] = new int[5];

        for (int j = 0; j < 3; j++) {
            total[j] = 0;
        }

        if (!b1.getText().toString().equals("")) {
            b[0] = Integer.parseInt(b1.getText().toString());
            c[0] = Integer.parseInt(c1.getText().toString());
            d[0] = Integer.parseInt(d1.getText().toString());
            total[0] = total[0] + b[0];
            total[1] = total[1] + c[0];
            total[2] = total[2] + d[0];
        }
        if (!b2.getText().toString().equals("")) {
            b[1] = Integer.parseInt(b2.getText().toString());
            c[1] = Integer.parseInt(c2.getText().toString());
            d[1] = Integer.parseInt(d2.getText().toString());

            total[0] = total[0] + b[1];
            total[1] = total[1] + c[1];
            total[2] = total[2] + d[1];
        }
        if (!b3.getText().toString().equals("")) {
            b[2] = Integer.parseInt(b3.getText().toString());
            c[2] = Integer.parseInt(c3.getText().toString());
            d[2] = Integer.parseInt(d3.getText().toString());
            total[0] = total[0] + b[2];
            total[1] = total[1] + c[2];
            total[2] = total[2] + d[2];
        }
        if (!b4.getText().toString().equals("")) {
            b[3] = Integer.parseInt(b4.getText().toString());
            c[3] = Integer.parseInt(c4.getText().toString());
            d[3] = Integer.parseInt(d4.getText().toString());
            total[0] = total[0] + b[3];
            total[1] = total[1] + c[3];
            total[2] = total[2] + d[3];
        }
        if (!b5.getText().toString().equals("")) {
            b[4] = Integer.parseInt(b5.getText().toString());
            c[4] = Integer.parseInt(c5.getText().toString());
            d[4] = Integer.parseInt(d5.getText().toString());
            total[0] = total[0] + b[4];
            total[1] = total[1] + c[4];
            total[2] = total[2] + d[4];
        }

        t2.setText(String.valueOf(total[0]));
        t3.setText(String.valueOf(total[1]));
        t4.setText(String.valueOf(total[2]));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin = (Spinner) findViewById(R.id.dropdown);

        h1 = (TextView) findViewById((R.id.h1));
        h2 = (TextView) findViewById((R.id.h2));
        h3 = (TextView) findViewById((R.id.h3));
        t2 = (TextView) findViewById((R.id.t2));
        t3 = (TextView) findViewById((R.id.t3));
        t4 = (TextView) findViewById((R.id.t4));
        b1 = (EditText) findViewById((R.id.b1));
        b2 = (EditText) findViewById((R.id.b2));
        b3 = (EditText) findViewById((R.id.b3));
        b4 = (EditText) findViewById((R.id.b4));
        b5 = (EditText) findViewById((R.id.b5));
        c1 = (TextView) findViewById((R.id.c1));
        c2 = (TextView) findViewById((R.id.c2));
        c3 = (TextView) findViewById((R.id.c3));
        c4 = (TextView) findViewById((R.id.c4));
        c5 = (TextView) findViewById((R.id.c5));
        d1 = (TextView) findViewById((R.id.d1));
        d2 = (TextView) findViewById((R.id.d2));
        d3 = (TextView) findViewById((R.id.d3));
        d4 = (TextView) findViewById((R.id.d4));
        d5 = (TextView) findViewById((R.id.d5));

        reset = (Button) findViewById(R.id.reset);

        spin.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, units);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        TextWatcher textwatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(choice.equals("Kgs")){
                    kgs();

                }

                if(choice.equals("Bundles")){
                    bundles();

                }

                if(choice.equals("Rods")){
                    rods();

                }
                totalcalc();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        b1.addTextChangedListener(textwatcher);
        b2.addTextChangedListener(textwatcher);
        b3.addTextChangedListener(textwatcher);
        b4.addTextChangedListener(textwatcher);
        b5.addTextChangedListener(textwatcher);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Reset", Toast.LENGTH_LONG).show();
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });

    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), units[position], Toast.LENGTH_LONG).show();
        choice = spin.getSelectedItem().toString();

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");

        if (choice.equals("Kgs")) {
            h1.setText(choice);
            h2.setText("Bundles");
            h3.setText("Rods");
        }
        if (choice.equals("Rods")) {
            h1.setText(choice);
            h2.setText("Bundles");
            h3.setText("Kgs");

        }
        if (choice.equals("Bundles")) {
            h1.setText(choice);
            h2.setText("Kgs");
            h3.setText("Rods");


        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
    }

}
