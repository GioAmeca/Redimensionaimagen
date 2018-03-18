package com.unidad3.gio.redimensionaimagen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    ImageView ImgMono;
    SeekBar SBUno;
    private int iWidth = 65;
    private int iHeight = 52;
    float density ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DisplayMetrics displayMetrics=getResources().getDisplayMetrics();
        density=displayMetrics.densityDpi;
        ImgMono=(ImageView)findViewById(R.id.ImgMono);
        SBUno=(SeekBar)findViewById(R.id.SBUno);
        SBUno.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                float ancho = (i + iWidth) * density / 50;
                float alto = (i + iHeight) * density / 50;
                ImgMono.getLayoutParams().height = (int)alto;
                ImgMono.getLayoutParams().width = (int)ancho;
                ImgMono.requestLayout();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
