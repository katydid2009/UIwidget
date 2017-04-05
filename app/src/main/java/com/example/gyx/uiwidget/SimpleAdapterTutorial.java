package com.example.gyx.uiwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterTutorial extends AppCompatActivity {

    private String[] names= new String[]{"Lion","Tiger","Monkey","Dog","Cat","Elephone" };
    private int [] imageIds= new int []{R.drawable.lion,R.drawable.tiger,R.drawable.monkey,
            R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter_tutorial);
        List<Map<String,Object>> listItems = new ArrayList<>();
        for (int i=0;i<names.length;i++){
            Map<String,Object> listItem=new HashMap<>();
            listItem.put("name",names[i]);
            listItem.put("img",imageIds[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,listItems,
                R.layout.list_view_items,new String[] {"name","img"},
                new int []{R.id.name,R.id.img});
        ListView list = (ListView)findViewById(R.id.simpleListView);
        list.setAdapter(simpleAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        names[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
