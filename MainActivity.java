package aadityaaitictactoe.ca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;l

public class MainActivity extends AppCompatActivity {
    boolean values[]={false,false,false,false,false,false,false,false,false};
    int turn = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void oneClick(View view){
        ImageView i = (ImageView)findViewById(R.id.one);
        if(values[0]==false && turn == 1) {
            i.setImageResource(R.drawable.x);
            values[0] = true;
            turn = 2;
            turn2();
        }
    }
    public void twoClick(View view){
        ImageView i = (ImageView)findViewById(R.id.two);
        if(values[1]==false && turn == 1) {
            i.setImageResource(R.drawable.x);
            values[1] = true;
            turn = 2;
            turn2();
        }
    }
    public void threeClick(View view){
        ImageView i = (ImageView)findViewById(R.id.three);
        if(values[2]==false && turn == 1) {
            i.setImageResource(R.drawable.x);
            values[2] = true;
            turn = 2;
            turn2();
        }
    }
    public void fourClick(View view){
        ImageView i = (ImageView)findViewById(R.id.four);
        if(values[3]==false && turn == 1) {
            i.setImageResource(R.drawable.x);
            values[3] = true;
            turn = 2;
            turn2();
        }
    }
    public void fiveClick(View view){
        ImageView i = (ImageView)findViewById(R.id.five);
        if(values[4]==false && turn == 1) {
            i.setImageResource(R.drawable.x);
            values[4] = true;
            turn = 2;
            turn2();
        }
    }
    public void sixClick(View view){
        ImageView i = (ImageView)findViewById(R.id.six);
        if(values[5]==false && turn == 1) {
            i.setImageResource(R.drawable.x);
            values[5] = true;
            turn = 2;
            turn2();
        }
    }
    public void sevenClick(View view){
        ImageView i = (ImageView)findViewById(R.id.seven);
        if(values[6]==false && turn == 1) {
            i.setImageResource(R.drawable.x);
            values[6] = true;
            turn = 2;
            turn2();
        }
    }
    public void eightClick(View view){
        ImageView i = (ImageView)findViewById(R.id.eight);
        if(values[7]==false && turn == 1) {
            i.setImageResource(R.drawable.x);
            values[7] = true;
            turn = 2;
            turn2();
        }
    }
    public void nineClick(View view){
        ImageView i = (ImageView)findViewById(R.id.nine);
        if(values[8]==false && turn == 1) {
            i.setImageResource(R.drawable.x);
            values[8] = true;
            turn = 2;
            turn2();
        }
    }
    public void turn2 (){
        while(turn == 2) {
            int num = (int) (Math.random() * 8);
            if (values[num] == false) {
                if (num == 0) {
                    ImageView i = (ImageView) findViewById(R.id.one);
                    i.setImageResource(R.drawable.o);
                }
                if (num == 1) {
                    ImageView i = (ImageView) findViewById(R.id.two);
                    i.setImageResource(R.drawable.o);
                }
                if (num == 2) {
                    ImageView i = (ImageView) findViewById(R.id.three);
                    i.setImageResource(R.drawable.o);
                }
                if (num == 3) {
                    ImageView i = (ImageView) findViewById(R.id.four);
                    i.setImageResource(R.drawable.o);
                }
                if (num == 4) {
                    ImageView i = (ImageView) findViewById(R.id.five);
                    i.setImageResource(R.drawable.o);
                }
                if (num == 5) {
                    ImageView i = (ImageView) findViewById(R.id.six);
                    i.setImageResource(R.drawable.o);
                }
                if (num == 6) {
                    ImageView i = (ImageView) findViewById(R.id.seven);
                    i.setImageResource(R.drawable.o);
                }
                if (num == 7) {
                    ImageView i = (ImageView) findViewById(R.id.eight);
                    i.setImageResource(R.drawable.o);
                }
                if (num == 8) {
                    ImageView i = (ImageView) findViewById(R.id.nine);
                    i.setImageResource(R.drawable.o);
                }
                turn = 1;
                values[num] = true;
            }
        }

    }
}