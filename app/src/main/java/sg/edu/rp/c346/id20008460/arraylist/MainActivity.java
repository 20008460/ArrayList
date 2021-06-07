package sg.edu.rp.c346.id20008460.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        fruits = new ArrayList<String>();
        fruits.add(getString(R.string.apple));
        fruits.add(getString(R.string.banana));
        fruits.add(getString(R.string.cherry));

        fruits.add(3,"durian");
        fruits.get(1);
        fruits.remove(0);

        fruits.set(fruits.size()-1 , "dragon fruit");

        String results="Fruits\n";
        results += "=====\n";

        for (int i = 0 ; i < fruits.size() ; i ++ ) {
            results += fruits.get(i) + "\n";
        }

        tv.setText(results);

    }
}
