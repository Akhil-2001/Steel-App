package com.example.spinnertrial;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] units = { "Bundles","Kgs","Rods"};
    String choice = "";
    TextView h1,h2,h3,t2,t3,t4;
    Spinner spin ;
    EditText b1,b2,b3,b4,b5;
    int total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin= (Spinner) findViewById(R.id.dropdown);
        h1=(TextView)findViewById((R.id.h1));
        h2=(TextView)findViewById((R.id.h2));
        h3=(TextView)findViewById((R.id.h3));
        t2=(TextView)findViewById((R.id.t2));
        t3=(TextView)findViewById((R.id.t3));
        t4=(TextView)findViewById((R.id.t4));
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,units);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        b1=(EditText)findViewById((R.id.b1));
        b2=(EditText)findViewById((R.id.b2));
        b3=(EditText)findViewById((R.id.b3));
        b4=(EditText)findViewById((R.id.b4));
        b5=(EditText)findViewById((R.id.b5));

        spin.setAdapter(aa);

        TextWatcher textwatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                total=0;
                int i[] = new int[5];
                if (!b1.getText().toString().equals("")) {
                    i[0] = Integer.parseInt(b1.getText().toString());
                    total = total + i[0];
                }
                if (!b2.getText().toString().equals("")) {
                    i[1] = Integer.parseInt(b2.getText().toString());
                    total = total + i[1];
                }
                if (!b3.getText().toString().equals("")) {
                    i[2] = Integer.parseInt(b3.getText().toString());
                    total = total + i[2];
                }
                if (!b4.getText().toString().equals("")) {
                    i[3] = Integer.parseInt(b4.getText().toString());
                    total = total + i[3];
                }
                if (!b5.getText().toString().equals("")) {
                    i[4] = Integer.parseInt(b5.getText().toString());
                    total = total + i[4];
                }

                t2.setText(String.valueOf(total));

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

    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),units[position] , Toast.LENGTH_LONG).show();
        choice = spin.getSelectedItem().toString();
        if(choice.equals("Kgs"))
        {
            h1.setText(choice);
            h2.setText("Bundles");
            h3.setText("Rods");
        }
        if(choice.equals("Rods"))
        {
            h1.setText(choice);
            h2.setText("Bundles");
            h3.setText("Kgs");
        }
        if(choice.equals("Bundles"))
        {
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