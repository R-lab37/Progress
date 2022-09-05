package com.example.progress;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {
    GraphView graphView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        graphView =findViewById(R.id.idGraphView);


        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                // on below line we are adding
                // each point on our x and y axis.
                new DataPoint(6.29, 160),
                new DataPoint(7/6, 150),
                new DataPoint(7/13, 143),
                new DataPoint(7/20, 144),
                new DataPoint(7/27, 140),
                new DataPoint(8/3, 141),
                new DataPoint(8/10, 135.5),

        });
        graphView.setTitleColor(R.color.text_color);
        graphView.setTitleColor(18);
        graphView.setCursorMode(true);
        graphView.addSeries(series);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch( item.getItemId()){
            case R.id.files:
                Toast.makeText(this, "files selected ", Toast.LENGTH_SHORT).show();
                break;

            case R.id.add:
                Toast.makeText(this, "add something", Toast.LENGTH_SHORT).show();
        break;
            default:
                Toast.makeText(this, "nothing ", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}