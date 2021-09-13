package com.tjnuman.percentageprograssbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

import com.ramijemli.percentagechartview.PercentageChartView;

public class MainActivity extends AppCompatActivity {

    PercentageChartView pring,ppie,pfill;
    SeekBar seekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pfill = findViewById(R.id.progressfill);
        pring = findViewById(R.id.progresspie);
        ppie = findViewById(R.id.progressring);
        seekbar = findViewById(R.id.seekbar);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                ppie.setProgress(i,true);
                pring.setProgress(i,true);
                pfill.setProgress(i,true);

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