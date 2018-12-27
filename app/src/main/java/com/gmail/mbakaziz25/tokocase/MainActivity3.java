package com.gmail.mbakaziz25.tokocase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView nama_val, hp_val, alamat_val, jenis_val, adds_val, ket_val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );

        //deklarasi nilai
        nama_val = (TextView) findViewById(R.id.value_nama);
        hp_val = (TextView) findViewById(R.id.value_hp);
        alamat_val = (TextView) findViewById(R.id.value_alamat);
        jenis_val = (TextView) findViewById(R.id.value_jenis);
        adds_val = (TextView) findViewById(R.id.value_adds);
        ket_val = (TextView) findViewById(R.id.value_ket);

        //ambil intent
        Intent intent = getIntent();
        Bundle c = intent.getExtras();

        //ambil nilai
        String nama = c.getString("Nama Pemesan : ");
        String hp = c.getString("Nomor HP : ");
        String alamat = c.getString("Alamat Kirim : ");
        String jenis_case = c.getString("Jenis CustomCase : ");
        String adds = c.getString("adds : ");
        String ket = c.getString("Keterangan : ");

        nama_val.setText(nama);
        hp_val.setText(hp);
        alamat_val.setText(alamat);
        jenis_val.setText(jenis_case);
        adds_val.setText(adds);
        ket_val.setText(ket);

    }
}
