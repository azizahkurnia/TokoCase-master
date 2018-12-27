package com.gmail.mbakaziz25.tokocase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    EditText inputText, inputText2, inputText3, inputText4;
    TextView tampilText;
    Button btnSubmit, btnReset, btnExit;
    CheckBox fd, stiker;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        inputText = (EditText) findViewById(R.id.edittext1);
        inputText2 = (EditText) findViewById(R.id.edittext2);
        inputText3 = (EditText) findViewById(R.id.edittext3);
        inputText4 = (EditText) findViewById(R.id.edittext4);
        tampilText = (TextView) findViewById(R.id.textview1);
        fd = (CheckBox) findViewById(R.id.cb_fd);
        stiker = (CheckBox) findViewById(R.id.cb_stiker);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroupNb);
        btnSubmit = (Button) findViewById(R.id.submit);
        btnReset = (Button) findViewById(R.id.reset);
        btnExit = (Button) findViewById(R.id.exit);
        btnSubmit.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnExit.setOnClickListener(this);

    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.submit:
                String adds = "";
                if(fd.isChecked()){
                    adds += "Add Charge Rp. 90.000,-\n";
                }
                if(stiker.isChecked()){
                    adds += "Add Charge Rp. 15.000,- \n";
                }
                //tampilText.setText(inputText.getText().toString());
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                Bundle b = new Bundle();
                b.putString("Nama Pemesan : ", inputText.getText().toString());
                b.putString("Nomor HP : ", inputText2.getText().toString());
                b.putString("Alamat Kirim : ", inputText3.getText().toString());
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton jenis = (RadioButton) findViewById(id);
                b.putString("Jenis CustomCase : ", jenis.getText().toString());
                b.putString("adds : ", adds);
                b.putString("Keterangan : ", inputText4.getText().toString());

                intent.putExtras(b);
                startActivity(intent);
                break;
            case R.id.reset:
                inputText.setText("");
                inputText2.setText("");
                inputText3.setText("");
                inputText4.setText("");
                break;
            case R.id.exit:
                finish();
                break;
        }
    }
}
