package com.example.fourbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnNateHome;
    private Button btnCall911;
    private Button btnGallary;
    private Button btnClose;

    //안드로이드 시스템이 자동으로 불러주는 콜백함수(생명주기)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //화면객체와 MainActivity UI객체참조멤버변수 연결기능 = @fxml
        btnNateHome=(Button)findViewById(R.id.btnNateHome);
        btnCall911=(Button)findViewById(R.id.btnCall911);
        btnGallary=(Button)findViewById(R.id.btnGallary);
        btnClose=(Button)findViewById(R.id.btnClose);
        //이벤트등록과 처리기능 = javaFX initialize()
        btnNateHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleBtnNateHomeListener(view);
            }
        });
        btnCall911.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleBtnCall911Listener(view);
            }
        });

    }//end of onCreate

    private void handleBtnCall911Listener(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/011-2971-4007"));
        startActivity(intent);
    }

    //1.네이트홈페이지를 눌렀을때 웹사이트가는 화면불러오기
    public void handleBtnNateHomeListener(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
        startActivity(intent);
    }


}












