package com.yinghuizou.gradecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {


    EditText as1,as2,as3,as4,as5,as6,as7;
    EditText gr1,gr2,gr3,gr4,gr5,gr6,gr7;
    EditText we1,we2,we3,we4,we5,we6,we7;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        as1=(EditText)findViewById(R.id.as1);
        as2=(EditText)findViewById(R.id.as2);
        as3=(EditText)findViewById(R.id.as3);
        as4=(EditText)findViewById(R.id.as4);
        as5=(EditText)findViewById(R.id.as5);
        as6=(EditText)findViewById(R.id.as6);
        as7=(EditText)findViewById(R.id.as7);

        gr1=(EditText)findViewById(R.id.gr1);
        gr2=(EditText)findViewById(R.id.gr2);
        gr3=(EditText)findViewById(R.id.gr3);
        gr4=(EditText)findViewById(R.id.gr4);
        gr5=(EditText)findViewById(R.id.gr5);
        gr6=(EditText)findViewById(R.id.gr6);
        gr7=(EditText)findViewById(R.id.gr7);

        we1=(EditText)findViewById(R.id.we1);
        we2=(EditText)findViewById(R.id.we2);
        we3=(EditText)findViewById(R.id.we3);
        we4=(EditText)findViewById(R.id.we4);
        we5=(EditText)findViewById(R.id.we5);
        we6=(EditText)findViewById(R.id.we6);
        we7=(EditText)findViewById(R.id.we7);

        result = (TextView)findViewById(R.id.result);


    }


    public void compute(View view){
        double numbergr1 =0.0;
        double numberwe1 =0.0 ;

        double numbergr2 =0.0;
        double numberwe2 =0.0;

        double numbergr3 =0.0;
        double numberwe3 =0.0;

        double numbergr4 =0.0;
        double numberwe4 =0.0;

        double numbergr5 =0.0;
        double numberwe5 =0.0;

        double numbergr6 =0.0;
        double numberwe6 =0.0;

        double numbergr7 =0.0;
        double numberwe7 =0.0;






        if( (gr1.getText().toString().trim().length() > 0 ) && ( we1.getText().toString().trim().length() > 0)
                && TextUtils.isDigitsOnly(gr1.getText().toString()) &&  TextUtils.isDigitsOnly(we1.getText().toString())) {

            numbergr1 =  (Double.parseDouble(gr1.getText().toString()));
            numberwe1 = (Double.parseDouble(we1.getText().toString()))*0.01;

        }


        if( (gr2.getText().toString().trim().length() > 0 ) && ( we2.getText().toString().trim().length() > 0)
                && TextUtils.isDigitsOnly(gr2.getText().toString()) &&  TextUtils.isDigitsOnly(we2.getText().toString())){

            numbergr2 = Double.parseDouble(gr2.getText().toString());
            numberwe2 = (Double.parseDouble(we2.getText().toString()))*0.01;

        }





        if( (gr3.getText().toString().trim().length() > 0 ) && ( we3.getText().toString().trim().length() > 0)
                && TextUtils.isDigitsOnly(gr3.getText().toString()) &&  TextUtils.isDigitsOnly(we3.getText().toString())){

            numbergr3 = Double.parseDouble(gr3.getText().toString());
            numberwe3 = (Double.parseDouble(we3.getText().toString()))*0.01;

        }

        if( (gr4.getText().toString().trim().length() > 0 ) && ( we4.getText().toString().trim().length() > 0)
                && TextUtils.isDigitsOnly(gr4.getText().toString()) &&  TextUtils.isDigitsOnly(we4.getText().toString())){

            numbergr4 = Double.parseDouble(gr4.getText().toString());
            numberwe4 = (Double.parseDouble(we4.getText().toString()))*0.01;

        }

        if( (gr5.getText().toString().trim().length() > 0 ) && ( we5.getText().toString().trim().length() > 0)
                && TextUtils.isDigitsOnly(gr5.getText().toString()) &&  TextUtils.isDigitsOnly(we5.getText().toString())){

            numbergr5 = Double.parseDouble(gr5.getText().toString());
            numberwe5 = (Double.parseDouble(we5.getText().toString()))*0.01;

        }

        if( (gr6.getText().toString().trim().length() > 0 ) && ( we6.getText().toString().trim().length() > 0)
                && TextUtils.isDigitsOnly(gr6.getText().toString()) &&  TextUtils.isDigitsOnly(we6.getText().toString())){

            numbergr6 = Double.parseDouble(gr6.getText().toString());
            numberwe6 = (Double.parseDouble(we6.getText().toString()))*0.01;

        }


        if( (gr7.getText().toString().trim().length() > 0 ) && ( we7.getText().toString().trim().length() > 0)
                && TextUtils.isDigitsOnly(gr7.getText().toString()) &&  TextUtils.isDigitsOnly(we7.getText().toString())){

            numbergr7 = Double.parseDouble(gr7.getText().toString());
            numberwe7= (Double.parseDouble(we7.getText().toString()))*0.01;

        }





        if(((numberwe1+ numberwe2+numberwe3+numberwe4+numberwe5+numberwe6+numberwe7)*100)==100.00){
            double resultc =  (numberwe1 * numbergr1) + (numberwe2 * numbergr2)+ (numberwe3 * numbergr3)+ (numberwe4 * numbergr4) + (numberwe5 * numbergr5) + (numberwe6 * numbergr6) + (numberwe7 * numbergr7);

            result.setText("Result = " + String.valueOf(resultc) + " %");


        } else {


            Toast.makeText(getApplicationContext(), "Weight(Percentage) Must be 100", Toast.LENGTH_SHORT).show();
            result.setText("");
        }









    }
}
