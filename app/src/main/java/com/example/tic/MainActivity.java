package com.example.tic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    int[][] arr = {{0,0,0},
            {0,0,0},
            {0,0,0}};
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,pa;
    TextView txt;
    EditText left,right;
    int turn = 1;


    boolean[] b = new boolean[9];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);


        txt = findViewById(R.id.text3);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        pa = findViewById(R.id.pa);

        Arrays.fill(b,false);
    }

    public int logic() {

        if (arr[0][0]!=0 && arr[0][0]==arr[0][1] && arr[0][2]==arr[0][0])
        {
            return  arr[0][0];
        }
        if (arr[0][0]!=0 && arr[0][0]==arr[1][0] && arr[0][0]==arr[2][0])
        {
            return arr[0][0];
        }

        if (arr[0][1]!=0 && arr[0][1]==arr[1][1] && arr[2][1]==arr[0][1])
        {
            return  arr[0][1];
        }
        if (arr[1][0]!=0&& arr[1][0]==arr[1][1] && arr[1][0]==arr[1][2])
        {
            return  arr[1][0];
        }
        if (arr[2][0]!=0 && arr[2][0]==arr[2][1] && arr[2][0]==arr[2][2])
        {
            return arr[2][0];
        }
        if (arr[0][2]!=0 && arr[0][2]==arr[1][2] && arr[0][2]==arr[2][2])
        {
            return arr[0][2];
        }

        if (arr[0][0]!=0 && arr[0][0]==arr[1][1] && arr[0][0]==arr[2][2])
        {
            return arr[0][0];
        }

        if (arr[0][2]!=0 && arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0])
        {
            return arr[0][2];
        }
        boolean flag = true;
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if (arr[i][j]==0)
                {
                    flag = false;

                }
            }
        }

        if (flag)
        {
            return 0;
        }
        return 12;


    }

    public void result(int val)
    {
        String s = left.getText().toString();
        String f = right.getText().toString();

        if (s.isEmpty())
        {
            s="X";
        }
        if (f.isEmpty())
        {
            f = "O";
        }
        if (val==1)
        {

            txt.setText(s+" has won");
            turn = -1;
            pa.setVisibility(View.VISIBLE);
        }
        else if (val==-1)
        {
            txt.setText(f+" has won");
            turn = -1;
            pa.setVisibility(View.VISIBLE);
        }
        else if (val==0)
        {
            txt.setText("Draw");
            turn = -1;
            System.out.println(turn);
            pa.setVisibility(View.VISIBLE);
        }



    }


    public void onBut1(View view) {
        if (b[0])
            return;

        b[0]=true;
        if (turn == -1)
        {
            return;
        }
        if (this.turn % 2==1)
        {
            b1.setText("X");
            arr[0][0]=1;
            turn++;
        }
        else {
            b1.setText("O");
            arr[0][0]=-1;
            turn++;
        }
        int val = logic();

        result(val);

    }
    public void onBut2(View view) {
        if (b[1])
            return;

        b[1]=true;
        if (turn == -1)
        {
            return;
        }
        if (this.turn % 2==1)
        {
            b2.setText("X");
            arr[0][1]=1;
            turn++;
        }
        else {
            b2.setText("O");
            arr[0][1]=-1;
            turn++;
        }
        int val = logic();

        result(val);

    }
    public void onBut3(View view) {
        if (b[2])
            return;

        b[2]=true;
        if (turn == -1)
        {
            return;
        }
        if (this.turn % 2==1)
        {
            b3.setText("X");
            arr[0][2]=1;
            turn++;
        }
        else {
            b3.setText("O");
            arr[0][2]=-1;
            turn++;
        }
        int val = logic();

        result(val);
    }
    public void onBut4(View view) {
        if (b[3])
            return;

        b[3]=true;
        if (turn == -1)
        {
            return;
        }
        if (this.turn % 2==1)
        {
            b4.setText("X");
            arr[1][0]=1;
            turn++;
        }
        else {
            b4.setText("O");
            arr[1][0]=-1;
            turn++;
        }
        int val = logic();

        result(val);
    }
    public void onBut5(View view) {
        if (b[4])
            return;

        b[4]=true;
        if (turn == -1)
        {
            return;
        }
        if (this.turn % 2==1)
        {
            b5.setText("X");
            arr[1][1]=1;
            turn++;
        }
        else {
            b5.setText("O");
            arr[1][1]=-1;
            turn++;
        }
        int val = logic();

        result(val);
    }
    public void onBut6(View view) {
        if (b[5])
            return;

        b[5]=true;
        if (turn == -1)
        {
            return;
        }
        if (this.turn % 2==1)
        {
            b6.setText("X");
            arr[1][2]=1;
            turn++;
        }
        else {
            b6.setText("O");
            arr[1][2]=-1;
            turn++;
        }
        int val = logic();

        result(val);
    }
    public void onBut7(View view) {
        if (b[6])
            return;

        b[6]=true;
        if (turn == -1)
        {
            return;
        }
        if (this.turn % 2==1)
        {
            b7.setText("X");
            arr[2][0]=1;
            turn++;
        }
        else {
            b7.setText("O");
            arr[2][0]=-1;
            turn++;
        }
        int val = logic();

        result(val);
    }
    public void onBut8(View view) {
        if (b[7])
            return;

        b[7]=true;
        if (turn == -1)
        {
            return;
        }
        if (this.turn % 2==1)
        {
            b8.setText("X");
            arr[2][1]=1;
            turn++;
        }
        else {
            b8.setText("O");
            arr[2][1]=-1;
            turn++;
        }
        int val = logic();

        result(val);
    }
    public void onBut9(View view) {
        if (b[8])
            return;

        b[8]=true;
        if (turn == -1)
        {
            return;
        }
        if (this.turn % 2==1)
        {
            b9.setText("X");
            arr[2][2]=1;
            turn++;
        }
        else {
            b9.setText("O");
            arr[2][2]=-1;
            turn++;
        }
        int val = logic();

        result(val);
    }

    public void play_again(View view)
    {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }





}