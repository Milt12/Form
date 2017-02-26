package com.example.milt.form;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity  {




NavigationView nv;
DrawerLayout dl;


    String[]sex={"Computer Science","Electronics and Communications","Electrical","Mechanical","Chemical"};
    AlertDialog.Builder builder;
    AlertDialog a;

    public void createBuilder(){
        builder = new AlertDialog.Builder(this);

        builder.setMessage("Do you want to reset?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                EditText e = (EditText) findViewById(R.id.editText);
                EditText e1 = (EditText) findViewById(R.id.editText1);
                EditText e2 = (EditText) findViewById(R.id.editText2);
                EditText e3 = (EditText) findViewById(R.id.editText3);
                EditText e4 = (EditText) findViewById(R.id.editText4);
                EditText e5 = (EditText) findViewById(R.id.editText5);

                RadioButton r1 = (RadioButton) findViewById(R.id.rb1);
                RadioButton r2 = (RadioButton) findViewById(R.id.rb2);
                r1.setChecked(false);
                r2.setChecked(false);

                e.setText("");
                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
                e5.setText("");
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                a.cancel();
            }
        });

        // AlertDialog a=builder.create();
        builder.setTitle("Reset");

         a=builder.create();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);


  nv=(NavigationView)findViewById(R.id.navigation_view);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                return false;
            }
        });

dl=(DrawerLayout)findViewById(R.id.dl);


        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,dl,toolbar,R.string.closeDrawer,R.string.openDrawer){
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank

                super.onDrawerOpened(drawerView);
            }        };


         dl.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();




        Button b2=(Button)findViewById(R.id.button2);
        createBuilder();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.show();
            }

        });



       final RadioButton r1=(RadioButton)findViewById(R.id.rb1);
       final RadioButton r2=(RadioButton)findViewById(R.id.rb2);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r1.isChecked()){
                    r2.setChecked(false);
                }
            }
        }
        );

        r2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      if (r2.isChecked()){
                                          r1.setChecked(false);

                                      }
                                  }
                              });



        Spinner spin=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,sex);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spin.setAdapter(aa);
        spin.getOnItemSelectedListener();






    }
     public  void onRadioButtonClicked(View view) {
         RadioButton r1=(RadioButton)findViewById(R.id.rb1);
         RadioButton r2=(RadioButton)findViewById(R.id.rb2);

         boolean checked=((RadioButton)view).isChecked();

         }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}
