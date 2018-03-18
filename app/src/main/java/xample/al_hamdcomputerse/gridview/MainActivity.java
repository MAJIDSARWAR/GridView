package xample.al_hamdcomputerse.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
GridView gridView;
int image[]= {R.drawable.regal4,R.drawable.download,R.drawable.FP_3,R.drawable.regal4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView) findViewById(R.id.gridView);
        MyAdapter myAdapter=new MyAdapter(MainActivity.this,image);
        gridView.setAdapter(myAdapter  );
    }
}
