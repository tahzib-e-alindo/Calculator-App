package edu.ewubd.simplecalculator;



import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Formatter;
import com.fathzer.soft.javaluator.DoubleEvaluator;

public class MainActivity extends AppCompatActivity{

    private TextView tvEquation,viewbox, history,historyClear;
    private TextView h1,h2,h3,h4,h5,h6,h7,h8,h9,h10;
    private TextView btnC, btnBracketOpen, btnBracketClose, btnDel, btn9, btn8, btn7, btn6, btn5, btn4, btn3, btn2, btn1, btn0, btnDiv, btnMulti, btnSub, btnAdd, btnEqual, btnPoint;
    private GridLayout grid1, gridHistory;
    boolean flg = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvEquation = findViewById(R.id.tvEquation);
        viewbox = findViewById(R.id.viewbox);
        history = findViewById(R.id.history);
        historyClear = findViewById(R.id.historyClear);
        gridHistory = findViewById(R.id.gridHistory);
        h1 = findViewById(R.id.h1);
        h2 = findViewById(R.id.h2);
        h3 = findViewById(R.id.h3);
        h4 = findViewById(R.id.h4);
        h5 = findViewById(R.id.h5);
        h6 = findViewById(R.id.h6);
        h7 = findViewById(R.id.h7);
        h8 = findViewById(R.id.h8);
        h9 = findViewById(R.id.h9);
        h10 = findViewById(R.id.h10);
        grid1 = findViewById(R.id.grid1);
        btnC = findViewById(R.id.btnC);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPoint = findViewById(R.id.btnPoint);
        btnBracketOpen = findViewById(R.id.btnBracketOpen);
        btnBracketClose = findViewById(R.id.btnBracketClose);
        btnDiv = findViewById(R.id.btnDiv);
        btnMulti = findViewById(R.id.btnMulti);
        btnSub = findViewById(R.id.btnSub);
        btnAdd = findViewById(R.id.btnAdd);
        btnEqual = findViewById(R.id.btnEqual);
        btnDel = findViewById(R.id.btnDel);

        historyClear.setVisibility(View.GONE);
        gridHistory.setVisibility(View.GONE);

        int[] tvids = {R.id.h1, R.id.h2, R.id.h3, R.id.h4, R.id.h5, R.id.h6, R.id.h7, R.id.h8, R.id.h9, R.id.h10};

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+0);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+9);
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();System.out.println(text);
                String vtext = viewbox.getText().toString();
                if(text==null) {
                    text = "";
                }
                tvEquation.setText(text+"+");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+"−");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+"×");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+"÷");
            }
        });
        btnBracketOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+"(");
            }
        });
        btnBracketClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text = "";
                }
                tvEquation.setText(text+")");
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text.isEmpty()){
                    return;
                }
                tvEquation.setText(text.substring(0, text.length() - 1));
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                viewbox.setText("");
                tvEquation.setText("");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                System.out.println(text);
                if(text.isEmpty()){
                    return;
                }
                String result = getResult(text);
                if(!result.equalsIgnoreCase("error")){
                    if(result.equalsIgnoreCase("infinity") || result.equalsIgnoreCase("NaN")) {
                        tvEquation.setText("");
                        viewbox.setText("Error");
                        Toast.makeText(MainActivity.this, "Error - Divide By Zero", Toast.LENGTH_LONG).show();
                    }
                    else {
                        SharedPreferences sp = getSharedPreferences("calculatorHistory", MODE_PRIVATE);
                        SharedPreferences.Editor spEditor = sp.edit();
                        String history_text = sp.getString("history", "");
                        spEditor.putString("history", text+"="+result+","+history_text);
                        spEditor.apply();
                        tvEquation.setText("");
                        viewbox.setText(result);
                    }
                }
                else{
                    tvEquation.setText("");
                    viewbox.setText("Error");
                    Toast.makeText(MainActivity.this, "Error - Calculation Invalid", Toast.LENGTH_LONG).show();
                }
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (!flg){
                    SharedPreferences sp = getSharedPreferences("calculatorHistory", MODE_PRIVATE);
                    SharedPreferences.Editor spEditor = sp.edit();
                    String history_text = sp.getString("history", "");
                    String[] arr = history_text.split(",");

                    if(arr.length<10){
                        for(int i= 0; i< arr.length; i++){
                            ((TextView)findViewById( tvids[i] )).setText(arr[i]);
                        }
                    }
                    else {
                        for(int i= 0; i< 10; i++){
                            ((TextView)findViewById( tvids[i] )).setText(arr[i]);
                        }
                    }
                    viewbox.setText("");
                    gridHistory.setVisibility(View.VISIBLE);
                    historyClear.animate().translationX(0).alpha(1.0f);
                    historyClear.setVisibility(View.VISIBLE);
                    history.setText("▶Back");
                    grid1.animate().translationY(grid1.getHeight()).alpha(0.0f);
                    grid1.setVisibility(View.GONE);
                    flg = true;
                }
                else {
                    grid1.animate().translationY(0).alpha(1.0f);
                    grid1.setVisibility(View.VISIBLE);
                    historyClear.animate().translationX(-historyClear.getWidth()).alpha(0.0f);
                    historyClear.setVisibility(View.GONE);
                    history.setText("▼History");
                    gridHistory.setVisibility(View.GONE);
                    flg = false;
                }
            }
        });

        historyClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                SharedPreferences sp = getSharedPreferences("calculatorHistory", MODE_PRIVATE);
                SharedPreferences.Editor spEditor = sp.edit();
                spEditor.clear().apply();
                history.callOnClick();
                h1.setText("");h2.setText("");h3.setText("");h4.setText("");h5.setText("");h6.setText("");h7.setText("");h8.setText("");h9.setText("");h10.setText("");
            }
        });

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String text = h1.getText().toString();
                if(text.isEmpty()){
                    return;
                }
                String[] arr = text.split("=");
                tvEquation.setText(arr[0]);
                history.callOnClick();
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String text = h2.getText().toString();
                if(text.isEmpty()){
                    return;
                }
                String[] arr = text.split("=");
                tvEquation.setText(arr[0]);
                history.callOnClick();
            }
        });
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = h3.getText().toString();
                if (text.isEmpty()) {
                    return;
                }
                String[] arr = text.split("=");
                tvEquation.setText(arr[0]);
                history.callOnClick();
            }
        });

        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = h4.getText().toString();
                if (text.isEmpty()) {
                    return;
                }
                String[] arr = text.split("=");
                tvEquation.setText(arr[0]);
                history.callOnClick();
            }
        });
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = h5.getText().toString();
                if (text.isEmpty()) {
                    return;
                }
                String[] arr = text.split("=");
                tvEquation.setText(arr[0]);
                history.callOnClick();
            }
        });
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = h6.getText().toString();
                if (text.isEmpty()) {
                    return;
                }
                String[] arr = text.split("=");
                tvEquation.setText(arr[0]);
                history.callOnClick();
            }
        });
        h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = h7.getText().toString();
                if (text.isEmpty()) {
                    return;
                }
                String[] arr = text.split("=");
                tvEquation.setText(arr[0]);
                history.callOnClick();
            }
        });
        h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = h8.getText().toString();
                if (text.isEmpty()) {
                    return;
                }
                String[] arr = text.split("=");
                tvEquation.setText(arr[0]);
                history.callOnClick();
            }
        });
        h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = h9.getText().toString();
                if (text.isEmpty()) {
                    return;
                }
                String[] arr = text.split("=");
                tvEquation.setText(arr[0]);
                history.callOnClick();
            }
        });
        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = h10.getText().toString();
                if (text.isEmpty()) {
                    return;
                }
                String[] arr = text.split("=");
                tvEquation.setText(arr[0]);
                history.callOnClick();
            }
        });
    }

    String getResult(String data) {
        if(data.contains("−")){
            data = data.replace("−", "-");}
        if(data.contains("×")){
            data = data.replace("×", "*");}
        if(data.contains("÷")){
            data = data.replace("÷", "/");}
        try {
            DoubleEvaluator eval = new DoubleEvaluator();
            Double result = eval.evaluate(data);
            Formatter formatter = new Formatter();
            formatter.format("%.2f", result);
            String final_result = formatter.toString();
            if(final_result.endsWith(".00")){
                final_result = final_result.replace(".00","");
            }
            return final_result;
        }
        catch (Exception e){
            return "error";
        }
    }
}