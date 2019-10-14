package com.bryan1.laptoparena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.bryan1.laptoparena.about.ProfileAbout;
import com.bryan1.laptoparena.adapter.ListLaptopAdapter;
import com.bryan1.laptoparena.model.Laptop;
import com.bryan1.laptoparena.model.LaptopData;
import com.bryan1.laptoparena.model.LaptopDetail;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvLaptop;
    private ArrayList<Laptop> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLaptop = findViewById(R.id.rv_laptop);
        rvLaptop.setHasFixedSize(true);

        list.addAll(LaptopData.getListData());
        showRecyclerList();
}
    private void showRecyclerList(){
        rvLaptop.setLayoutManager(new LinearLayoutManager(this));
        ListLaptopAdapter listLaptopAdapter = new ListLaptopAdapter(list);
        rvLaptop.setAdapter(listLaptopAdapter);
        listLaptopAdapter.setOnItemClickCallBack(new ListLaptopAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Laptop data)
            {
                showSelectedLaptop(data);
            }
        });
    }

    private void showSelectedLaptop(Laptop laptop)
    {
        Intent moveDetail = new Intent(MainActivity.this, LaptopDetail.class);
        moveDetail.putExtra(LaptopDetail.EXTRA_PHOTO,laptop.getPhoto());
        moveDetail.putExtra(LaptopDetail.EXTRA_NAME, laptop.getName());
        moveDetail.putExtra(LaptopDetail.EXTRA_DETAIL, laptop.getDetail());
        startActivity(moveDetail);
        Toast.makeText(this, laptop.getName() + " Details", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.profile_about,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profile_about:
                Intent moveToProfile = new Intent(MainActivity.this, ProfileAbout.class);

                startActivity(moveToProfile);

                return true;
        }
        return false;
    }

}
