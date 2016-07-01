package ga.demo.viewslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Put your Java code in here
        Button mbutton1 = (Button) findViewById(R.id.but1);
        Button mbutton2 = (Button) findViewById(R.id.but2);
        Button mbutton3 = (Button) findViewById(R.id.but3);
        Button mbutton4 = (Button) findViewById(R.id.but4);
        Button mbutton5 = (Button) findViewById(R.id.but5);
        Button mbutton6 = (Button) findViewById(R.id.but6);
        Button mbutton7 = (Button) findViewById(R.id.but7);
        Button mbutton8 = (Button) findViewById(R.id.but8);
        Button mbutton9 = (Button) findViewById(R.id.but9);
        Button mbutton10 = (Button) findViewById(R.id.but10);

        View.OnClickListener listenerOne = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view instanceof Button)
                    Toast.makeText(view.getContext(), "TextViews 1 & 2 are above", Toast.LENGTH_SHORT).show();
            }
        };
        mbutton1.setOnClickListener(listenerOne);// I spend *all day* trying to put multiple listeners in a single onClick method. oh well, it's over now.

        View.OnClickListener listenerTwo = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view instanceof Button)
                    Toast.makeText(view.getContext(), "TextViews 3 & 4 are above", Toast.LENGTH_SHORT).show();
            }
        };
        mbutton2.setOnClickListener(listenerTwo);

        View.OnClickListener listenerThree = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view instanceof Button)
                    Toast.makeText(view.getContext(), "TextViews 5 & 6 are above", Toast.LENGTH_SHORT).show();
            }
        };
        mbutton3.setOnClickListener(listenerThree);

        View.OnClickListener listenerFour = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view instanceof Button)
                    Toast.makeText(view.getContext(), "TextViews 7 & 8 are above", Toast.LENGTH_SHORT).show();
            }
        };
        mbutton4.setOnClickListener(listenerFour);

        View.OnClickListener listenerFive = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view instanceof Button)
                    Toast.makeText(view.getContext(), "TextViews 9 & 10 are above", Toast.LENGTH_SHORT).show();
            }
        };
        mbutton5.setOnClickListener(listenerFive);

        View.OnClickListener listenerSix = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view instanceof Button)
                    Toast.makeText(view.getContext(), "TextViews 11 & 12 are above", Toast.LENGTH_SHORT).show();
            }
        };
        mbutton6.setOnClickListener(listenerFive);

        View.OnClickListener listenerSeven = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view instanceof Button)
                    Toast.makeText(view.getContext(), "TextViews 13 & 14 are above", Toast.LENGTH_SHORT).show();
            }
        };
        mbutton7.setOnClickListener(listenerSeven);

        View.OnClickListener listenerEight = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view instanceof Button)
                    Toast.makeText(view.getContext(), "TextViews 15 & 16 are above", Toast.LENGTH_SHORT).show();
            }
        };
        mbutton8.setOnClickListener(listenerEight);

        View.OnClickListener listenerNine = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view instanceof Button)
                    Toast.makeText(view.getContext(), "TextViews 17 & 18 are above", Toast.LENGTH_SHORT).show();
            }
        };
        mbutton9.setOnClickListener(listenerNine);

        View.OnClickListener listenerTen = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view instanceof Button)
                    Toast.makeText(view.getContext(), "TextViews 19 & 20 are above", Toast.LENGTH_SHORT).show();
            }
        };
        mbutton10.setOnClickListener(listenerTen);
    }
}