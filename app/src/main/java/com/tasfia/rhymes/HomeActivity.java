package com.tasfia.rhymes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    //declare button object
    Button btnPoem1,btnPoem2,btnPoem3,btnPoem4,btnPoem5,btnPoem6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnPoem1=findViewById(R.id.btn_poem1);
        btnPoem2=findViewById(R.id.btn_poem2);
        btnPoem3=findViewById(R.id.btn_poem3);
        btnPoem4=findViewById(R.id.btn_poem4);
        btnPoem5=findViewById(R.id.btn_poem5);
        btnPoem6=findViewById(R.id.btn_poem6);



        btnPoem1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"one");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "12345 Once I caught A fish Alive", Toast.LENGTH_SHORT).show();

            }
        });


        btnPoem2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"two");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Alphabet Song", Toast.LENGTH_SHORT).show();

            }
        });


        btnPoem3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"three");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Baa Baa Black Sheep", Toast.LENGTH_SHORT).show();

            }
        });


        btnPoem4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"four");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Humpty Dumpty", Toast.LENGTH_SHORT).show();

            }
        });


        btnPoem5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"five");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Jack and Jill", Toast.LENGTH_SHORT).show();

            }
        });

        btnPoem6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id" ,"six");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Twinkle Twinkle Little Star", Toast.LENGTH_SHORT).show();

            }
        });







    }
}
