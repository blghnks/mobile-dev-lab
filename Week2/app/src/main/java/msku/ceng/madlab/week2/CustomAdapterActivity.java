package msku.ceng.madlab.week2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {
    final List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("Cat", R.mipmap.cat));
        animals.add(new Animal("Dog", R.mipmap.dog));
        animals.add(new Animal("Manul", R.mipmap.manul));
        animals.add(new Animal("Pipis", R.mipmap.pipis));

        final ListView listView = (ListView) findViewById(R.id.listview);
        AnimalAdapter animalAdapter = new AnimalAdapter(this, animals);
        listView.setAdapter(animalAdapter);
    }
}