package com.example.sys.directscrollview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.sys.directscrollview.Gallery.GalleryActivity;
import com.example.sys.directscrollview.Shop.ShopActivity;
import com.example.sys.directscrollview.Weather.WeatherActivity;

public class Main2Activity extends AppCompatActivity {
   public Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        b1=findViewById( R.id.gallery );
        b2=findViewById( R.id.shop );
        b3=findViewById( R.id.weather );
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(  Main2Activity.this, GalleryActivity.class ));
            }
        } );
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(  Main2Activity.this, ShopActivity.class ));
            }
        } );
        b3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(  Main2Activity.this, WeatherActivity.class ));
            }
        } );
    }
}
