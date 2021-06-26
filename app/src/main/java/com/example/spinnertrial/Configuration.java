package com.example.spinnertrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Dictionary.dictionary;

public class Configuration extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public List<Integer> databundle;
    public List<Integer> datakg;
    public List<Integer> datarod;
    dataBase database = new dataBase(Configuration.this) ;




    Button add;
    Button del;
    EditText company;
    EditText c[] = new EditText[' '];
    EditText d[] = new EditText[' '];
    Spinner spin;
    int[] cid = {R.id.c1, R.id.c2, R.id.c3, R.id.c4, R.id.c5};
    int[] did = {R.id.d1, R.id.d2, R.id.d3, R.id.d4, R.id.d5};
    dictionary dict;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);



        database = new dataBase(Configuration.this,"defaultTable");
        databundle = database.getValues("BUNDLES");
        datakg = database.getValues("KGs");
        datarod = database.getValues("RODS");
        dict = new dictionary(databundle,datakg,datarod);

        spin = (Spinner) findViewById(R.id.dropdown);
        spin.setOnItemSelectedListener(this);

        SQLiteDatabase db = database.getReadableDatabase();
        ArrayList<String> dropItems = database.getCompanyNames(db);

        Collections.reverse(dropItems);

        //Creating the ArrayAdapter instance having the steel quantities
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, dropItems);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        for(int j=0;j<5;j++)
        {
            c[j] = findViewById(cid[j]);
            d[j] = findViewById(did[j]);
        }

        add = findViewById(R.id.add);
        del = findViewById(R.id.delete);
        company = findViewById(R.id.company);
        company.setText(dropItems.get(dropItems.size()-1));




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(company.getText().toString()!="" && !company.getText().toString().equals("defaultTable")) {

                    database.delete(company.getText().toString());
                    database = new dataBase(Configuration.this,company.getText().toString());
                    SQLiteDatabase db = database.getWritableDatabase();
                    database.onCreate(db);



                    try {

                        boolean check = database.addItem(c, d);
                        if (check)
                            Toast.makeText(Configuration.this, "Added Successfully", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Configuration.this, "Fill", Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(Configuration.this, "Enter company name", Toast.LENGTH_LONG).show();
                    }

                    finish();
                    startActivity(getIntent());
                }
                }


        });


        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(company.getText().toString()!="" && !company.getText().toString().equals("defaultTable")){
                    database = new dataBase(Configuration.this,company.getText().toString());
                    boolean check = database.delete(company.getText().toString());
                    if(check)
                        Toast.makeText(Configuration.this,"Deleted Successfully",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(Configuration.this,"Error",Toast.LENGTH_LONG).show();

                    finish();
                    startActivity(getIntent());

                }
                else
                {
                    Toast.makeText(Configuration.this,"Enter company name",Toast.LENGTH_LONG).show();
                }



            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.tickmark,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ConfigConfirm:
                Intent i = new Intent(Configuration.this, MainActivity.class );
                try{

                    database = new dataBase(Configuration.this,company.getText().toString());
                    databundle = database.getValues("BUNDLES");
                    datakg = database.getValues("KGs");
                    datarod = database.getValues("RODS");
                    dict = new dictionary(databundle,datakg,datarod);
                    


                    dict.calculate();


                    Toast.makeText(Configuration.this,company.getText().toString(),Toast.LENGTH_LONG).show();



                }
                catch (Exception e)
                {
                    Toast.makeText(Configuration.this,"Enter company name",Toast.LENGTH_LONG).show();
                }
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        String choice = arg0.getItemAtPosition(position).toString();
        company.setText(choice);

        database = new dataBase(Configuration.this,company.getText().toString());
        databundle = database.getValues("BUNDLES");
        datakg = database.getValues("KGs");
        datarod = database.getValues("RODS");
        dict = new dictionary(databundle,datakg,datarod);

        for(int j=0;j<5;j++)
        {
            c[j].setText(datakg.get(j).toString());
            d[j].setText(datarod.get(j).toString());
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}