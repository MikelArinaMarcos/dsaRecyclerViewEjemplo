package edu.upc.dsa.recyclerviewejemploclase;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.app.Activity;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Hay que hacerlo siempre para llamar a la función
        setContentView(R.layout.activity_main); // Fijamos el layout que vamos a utilizar
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view); // El layout anterior tendrá este recyclerView

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<String> input = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            input.add("Test" +i);
        }

        mAdapter = new MyAdapter(input);
        recyclerView.setAdapter(mAdapter);
    }
}