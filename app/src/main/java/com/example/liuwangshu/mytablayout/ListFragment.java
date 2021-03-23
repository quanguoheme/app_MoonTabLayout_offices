package com.example.liuwangshu.mytablayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRecyclerView =
                (RecyclerView) inflater.inflate(R.layout.list_fragment, container, false);
        return mRecyclerView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
       // mRecyclerView.setAdapter(new RecyclerViewAdapter(getActivity()));
        initFruits();
        FruitAdapter adapter = new FruitAdapter(fruitList);
        mRecyclerView.setAdapter(adapter);
    }

    private List<Fruit> fruitList = new ArrayList<>();
    private void initFruits() {
        for (int i = 0; i < 2; i++) {
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
