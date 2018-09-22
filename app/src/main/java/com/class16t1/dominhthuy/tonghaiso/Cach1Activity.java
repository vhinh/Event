package com.class16t1.dominhthuy.tonghaiso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cach1Activity extends AppCompatActivity {


    public EditText edtSoA, edtSoB;
    private TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cach1);
        edtSoA = findViewById(R.id.edt_soa);
        edtSoB = findViewById(R.id.edt_sob);
        edtSoA.getText().toString();
        edtSoB.getText().toString();
    }

    public void btnTong (View v){
        if (edtSoA.getText().toString().equals("") == false && edtSoB.getText().toString().equals("") == false) {
            int a = Integer.parseInt(edtSoA.getText().toString());
            int b = Integer.parseInt(edtSoB.getText().toString());
            ketqua = findViewById(R.id.edt_ketqua);
            ketqua.setText((a + b) + "");
        } else
            Toast.makeText(Cach1Activity.this, "Dữ liệu trống!!!", Toast.LENGTH_LONG).show();
    }
    public void btnHieu (View v){
        if (edtSoA.getText().toString().equals("") == false && edtSoB.getText().toString().equals("") == false) {
            int a = Integer.parseInt(edtSoA.getText().toString());
            int b = Integer.parseInt(edtSoB.getText().toString());
            ketqua = findViewById(R.id.edt_ketqua);
            ketqua.setText((a - b) + "");
        } else
            Toast.makeText(Cach1Activity.this, "Dữ liệu trống!!!", Toast.LENGTH_LONG).show();
    }

    public void btnClean (View view){
            if (edtSoA.getText().toString().equals("") == false && edtSoB.getText().toString().equals("") == false) {
                edtSoA.setText("");
                edtSoB.setText("");
            } else
                Toast.makeText(Cach1Activity.this, "Dữ liệu trống!!!", Toast.LENGTH_LONG).show();

        }
}

