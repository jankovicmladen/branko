package mladen.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import mladen.myapplication.adapters.Adapter;
import mladen.myapplication.model.Vest;

/**
 * Created by Mladen on 6/29/2017.
 */

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private Adapter adapter;
    private ArrayList<Vest> vests;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        vests = new ArrayList<>();
        vests.add(new Vest(1, "Naslov 1", "contenvsion nsnv iua viua a a"));
        vests.add(new Vest(1, "Naslov 2", "contenvsion nsnv iua viua a a"));
        vests.add(new Vest(1, "Naslov 3", "contenvsion nsnv iua viua a a"));
        vests.add(new Vest(1, "Naslov 4", "contenvsion nsnv iua viua a a"));
        vests.add(new Vest(1, "Naslov 5", "contenvsion nsnv iua viua a a"));
        vests.add(new Vest(1, "Naslov 6", "contenvsion nsnv iua viua a a"));
        vests.add(new Vest(1, "Naslov 7", "contenvsion nsnv iua viua a a"));
        vests.add(new Vest(1, "Naslov 8", "contenvsion nsnv iua viua a a"));

        listView = (ListView) findViewById(R.id.list);

        adapter = new Adapter(getApplicationContext(), vests);

        listView.setAdapter(adapter);

    }
}
