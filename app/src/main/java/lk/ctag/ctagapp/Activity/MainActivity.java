package lk.ctag.ctagapp.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import lk.ctag.ctagapp.Adapter.PupolarAdapter;
import lk.ctag.ctagapp.Domain.PopularDomain;
import lk.ctag.ctagapp.R;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterPupolar;
private RecyclerView recyclerViewPupolar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items= new ArrayList<>();
        items.add(new PopularDomain("T-shirt black", "tretretre reytreyre", "item_1", 15, 4, 500));
        items.add(new PopularDomain("Smart Watch", "reyer ytrreyrte reetre", "item_2", 10, 4.5, 450));
        items.add(new PopularDomain("IPhone 14", "yuty treytry trytry", "item_3", 10, 4.3, 800));
        items.add(new PopularDomain("VisionX Pro LED TV", "retrety tytry reeyt", "item_4", 18, 4.0, 1500));

        recyclerViewPupolar = findViewById(R.id.view1);
        recyclerViewPupolar.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterPupolar = new PupolarAdapter(items);
        recyclerViewPupolar.setAdapter(adapterPupolar);
    }
}