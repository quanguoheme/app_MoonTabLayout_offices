package com.example.liuwangshu.mytablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 1; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.person_add);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.person_delete);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.drawable.person_update);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.person_add);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear", R.drawable.person_delete);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape", R.drawable.person_update);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.person_add);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.person_delete);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry", R.drawable.person_add);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango", R.drawable.person_add);
            fruitList.add(mango);

        }
    }
}
