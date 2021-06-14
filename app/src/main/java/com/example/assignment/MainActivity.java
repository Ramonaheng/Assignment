package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
        addListenerOnButton2();
        addListenerOnButton3();


    }

                public void addListenerOnButton() {

                    image = (ImageView) findViewById(R.id.image);
                    button1 = findViewById(R.id.kendrick);
                    button1.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {

                            image.setImageResource(R.drawable.k_dot);
                            Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_SHORT).show();
                            button1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View arg0) {
                                    image.setImageResource(R.drawable.dre);
                                    button1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View arg0) {
                                            image.setImageResource(R.drawable.ypoung_tiller);
                                        }

                                    }) ;
                                }

                            });
                        }
                    });
                }


                        public void addListenerOnButton2() {

                            image = (ImageView) findViewById(R.id.image);
                            button2 = findViewById(R.id.Tiller);
                            Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_SHORT).show();

                            button2.setOnClickListener(new View.OnClickListener() {

                                @Override
                                public void onClick(View arg0) {

                                    image.setImageResource(R.drawable.ypoung_tiller);
                                    button2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View arg0) {
                                            image.setImageResource(R.drawable.dre);

                                            button2.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View arg0) {
                                                    image.setImageResource(R.drawable.k_dot);


                                                }
                                            });
                                        }

                                    });
                                }
                            });
                        }
                        public void addListenerOnButton3() {

                            image = (ImageView) findViewById(R.id.image);
                            button3= findViewById(R.id.Dre);
                            Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_SHORT).show();
                            button3.setOnClickListener(new View.OnClickListener() {

                                @Override
                                public void onClick(View arg0) {

                                    image.setImageResource(R.drawable.k_dot);
                                    button3.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View arg0) {
                                            image.setImageResource(R.drawable.k_dot);


                                            button3.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View arg0) {
                                                    image.setImageResource(R.drawable.ypoung_tiller);


                                                }
                                            });
                                        }

                                    });
                                }
                            });
                }
              }



