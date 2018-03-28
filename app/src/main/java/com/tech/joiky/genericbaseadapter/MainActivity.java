package com.tech.joiky.genericbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.tech.joiky.genericbaseadapter.controllers.UserAdapter;
import com.tech.joiky.genericbaseadapter.models.User;
import com.tech.joiky.genericbaseadapter.utils.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BaseAdapter.OnRecyclerObjectClickListener<User> {
    UserAdapter adapter;

    RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new UserAdapter(this);
        adapter.setListener(this);
        adapter.setItems(getData());

        myRecyclerView = findViewById(R.id.myRecycler);
        myRecyclerView.setAdapter(adapter);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onItemClicked(User item) {
        Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show();
    }


    private List<User> getData() {
        List<User> list = new ArrayList<>();
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        list.add(new User("A", "B"));
        return list;
    }
}
