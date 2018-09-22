package com.class16t1.dominhthuy.tonghaiso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cach2Activity extends AppCompatActivity {


    public EditText edtSoA, edtSoB;
    private Button btn_tong2so, btn_hieu2so, btn_clean;
    private TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cach2);
        btn_tong2so = findViewById(R.id.btn_tong);
        btn_hieu2so = findViewById(R.id.btn_hieu);
        btn_clean = findViewById(R.id.btn_clean);
        edtSoA = findViewById(R.id.edt_soa);
        edtSoB = findViewById(R.id.edt_sob);
        edtSoA.getText().toString();
        edtSoB.getText().toString();

        btn_tong2so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtSoA.getText().toString().equals("") == false && edtSoB.getText().toString().equals("") == false) {
                    int a = Integer.parseInt(edtSoA.getText().toString());
                    int b = Integer.parseInt(edtSoB.getText().toString());
                    ketqua = findViewById(R.id.edt_ketqua);
                    ketqua.setText((a + b) + "");
                } else
                    Toast.makeText(Cach2Activity.this, "Dữ liệu trống!!!", Toast.LENGTH_LONG).show();
            }
        });
        btn_hieu2so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtSoA.getText().toString().equals("") == false && edtSoB.getText().toString().equals("") == false) {
                    int a = Integer.parseInt(edtSoA.getText().toString());
                    int b = Integer.parseInt(edtSoB.getText().toString());
                    ketqua = findViewById(R.id.edt_ketqua);
                    ketqua.setText((a - b) + "");
                } else
                    Toast.makeText(Cach2Activity.this, "Dữ liệu trống!!!", Toast.LENGTH_LONG).show();
            }
        });
        btn_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtSoA.getText().toString().equals("") == false && edtSoB.getText().toString().equals("") == false) {
                    edtSoA.setText("");
                    edtSoB.setText("");
                } else
                    Toast.makeText(Cach2Activity.this, "Dữ liệu trống!!!", Toast.LENGTH_LONG).show();

            }
        });
    }
}

