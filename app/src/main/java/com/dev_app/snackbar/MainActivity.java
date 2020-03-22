package com.dev_app.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    /*
    Snackbar in android is a new widget introduced with
    the Material Design library as a replacement of a Toast.
    Android Snackbar is light-weight widget and they are used to
    show messages in the bottom of the application with swiping enabled.
    Snackbar android widget may contain an optional action button. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Call the button from the XML layout
       Button btn = findViewById(R.id.button);

       //Set OnCLick Listener for the button and write your Snackbar code in the onClick Method
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Code for the SnackBar to appear

                Snackbar snackbar = Snackbar.make(view,"Button Clicked",Snackbar.LENGTH_LONG)
                        .setAction("Retry", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(view,"Button Un-clicked",Snackbar.LENGTH_LONG);
                                snackbar1.show();
                            }
                        });

                snackbar.show();
            }
        });



    }
}
