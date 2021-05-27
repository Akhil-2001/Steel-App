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
        b1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {
                if(b1!=null && !b1.getText().toString().isEmpty()) {
                    total = total+ Integer.parseInt(b1.getText().toString());
                    t2.setText(total + "");
                }
                else
                {
                    b1.getText().clear();
                    t2.setText(total-Integer.parseInt(b1.getText().toString()));
                }
            }
        });

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