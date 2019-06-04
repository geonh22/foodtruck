package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btn_add;
    Button btn_seoul;
    Button btn_gangdong;
    Button btn_gangseo;
    Button btn_gangnam;
    Button btn_gangbuk;
    EditText edt_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("푸드트럭");
        Button btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Detail.class);
                startActivity(intent);
            }
        });
        final String[] gangdong = {"유림이네 팟타이","cube steak", "건희네 닭꼬치"};
        final String[] gangseo = {"맛있는 피자","피자가 먹고싶다","여름엔 아이스크림"};
        final String[] gangnam = {"핵존맛 타코야키",
                "버거는 수제버거","호호호떡"};
        final String[] gangbuk = {"붕어없는 붕어빵","순대야 순대야","맛있새우"};

        final String[] mid = {"유림이네 팟타이","cube steak", "건희네 닭꼬치", "맛있는 피자","피자가 먹고싶다","여름엔 아이스크림","핵존맛 타코야키",
                "버거는 수제버거","호호호떡","붕어없는 붕어빵","순대야 순대야","맛있새우"};

        btn_seoul = findViewById(R.id.btn_seoul);
        btn_gangdong = findViewById(R.id.btn_gangdong);
        btn_gangseo = findViewById(R.id.btn_gangseo);
        btn_gangnam = findViewById(R.id.btn_gangnam);
        btn_gangbuk = findViewById(R.id.btn_gangbuk);

        final ListView list = (ListView)findViewById(R.id.listView1);
        final ListView list_gangdong = (ListView)findViewById(R.id.listView_gangdong);
        final ListView list_gangseo = (ListView)findViewById(R.id.listView_gangseo);
        final ListView list_gangnam = (ListView)findViewById(R.id.listView_gangnam);
        final ListView list_gangbuk = (ListView)findViewById(R.id.listView_gangbuk);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mid);
        ArrayAdapter<String> adapter_gangdong = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, gangdong);
        ArrayAdapter<String> adapter_gangseo = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, gangseo);
        ArrayAdapter<String> adapter_gangnam = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, gangnam);
        ArrayAdapter<String> adapter_gangbuk = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, gangbuk);

        list_gangdong.setAdapter(adapter_gangdong);
        list_gangseo.setAdapter(adapter_gangseo);
        list_gangnam.setAdapter(adapter_gangnam);
        list_gangbuk.setAdapter(adapter_gangbuk);

        list.setVisibility(View.VISIBLE);
        list_gangdong.setVisibility(View.GONE);
        list_gangseo.setVisibility(View.GONE);
        list_gangnam.setVisibility(View.GONE);
        list_gangbuk.setVisibility(View.VISIBLE);
        list.setAdapter(adapter);


        btn_seoul.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v) {
                list.setVisibility(View.VISIBLE);
                list_gangdong.setVisibility(View.GONE);
                list_gangseo.setVisibility(View.GONE);
                list_gangnam.setVisibility(View.GONE);
                list_gangbuk.setVisibility(View.GONE);
            }
        });
        btn_gangdong.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v) {
                list.setVisibility(View.GONE);
                list_gangdong.setVisibility(View.VISIBLE);
                list_gangseo.setVisibility(View.GONE);
                list_gangnam.setVisibility(View.GONE);
                list_gangbuk.setVisibility(View.GONE);
            }
        });
        btn_gangseo.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v) {
                list.setVisibility(View.GONE);
                list_gangdong.setVisibility(View.GONE);
                list_gangseo.setVisibility(View.VISIBLE);
                list_gangnam.setVisibility(View.GONE);
                list_gangbuk.setVisibility(View.GONE);
            }
        });
        btn_gangnam.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v) {
                list.setVisibility(View.GONE);
                list_gangdong.setVisibility(View.GONE);
                list_gangseo.setVisibility(View.GONE);
                list_gangnam.setVisibility(View.VISIBLE);
                list_gangbuk.setVisibility(View.GONE);
            }
        });
        btn_gangbuk.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v) {
                list.setVisibility(View.GONE);
                list_gangdong.setVisibility(View.GONE);
                list_gangseo.setVisibility(View.GONE);
                list_gangnam.setVisibility(View.GONE);
                list_gangbuk.setVisibility(View.VISIBLE);
            }
        });


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Intent intent = new Intent(getApplicationContext(),Detail.class);
                startActivity(intent);
            }
        });
        list_gangdong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Intent intent = new Intent(getApplicationContext(),Detail.class);
                startActivity(intent);
            }
        });
        list_gangseo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Intent intent = new Intent(getApplicationContext(),Detail.class);
                startActivity(intent);
            }
        });
        list_gangnam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Intent intent = new Intent(getApplicationContext(),Detail.class);
                startActivity(intent);
            }
        });
        list_gangbuk.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Intent intent = new Intent(getApplicationContext(),Detail.class);
                startActivity(intent);
            }
        });
    }
}
