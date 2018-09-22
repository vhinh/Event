package com.class16t1.dominhthuy.tonghaiso;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cach3Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtA, edtB;
    private TextView tvKQ;
    private Button btnTong, btnClean,btnHieu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cach3);
        TimID();
        LayDL();
        btnTong.setOnClickListener(this);
        btnHieu.setOnClickListener(this);
        btnClean.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_tong:
                KiemTra(1);
                break;
            case R.id.btn_hieu:
                KiemTra(2);
                break;
            case R.id.btn_clean:
                KiemTra(3);
                edtA.setText("");
                edtB.setText("");
                tvKQ.setText("");
                break;
        }
    }
    public void TimID() {
        edtA = findViewById(R.id.edt_soa);
        edtB = findViewById(R.id.edt_sob);
        tvKQ = findViewById(R.id.edt_ketqua);
        btnClean = findViewById(R.id.btn_clean);
        btnTong = findViewById(R.id.btn_tong);
        btnHieu = findViewById(R.id.btn_hieu);
    }
    public void LayDL(){
        edtA.getText().toString();
        edtB.getText().toString();
    }
    public void KiemTra(int x){
        if (edtA.getText().toString().equals("") == false && edtB.getText().toString().equals("") == false){
            int a = Integer.parseInt(edtA.getText().toString());
            int b = Integer.parseInt(edtB.getText().toString());
            if (x==1) tvKQ.setText((a+b)+"");
            else if (x==2) tvKQ.setText((a-b)+"");
        }
        else Toast.makeText(Cach3Activity.this, "Dữ liệu rỗng", Toast.LENGTH_SHORT).show();
    }
}