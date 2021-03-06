package com.devansh.testappwi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.getMenu().getItem(0).setChecked(true);
        fragmentTransaction.replace(R.id.host_fragment,new Fragment1());
        fragmentTransaction.commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()){
                    case R.id.page1:{
                        bottomNavigationView.getMenu().getItem(0).setChecked(true);
                        fragmentTransaction.replace(R.id.host_fragment,new Fragment1());
                        break;
                    }
                    case R.id.page2:{
                        bottomNavigationView.getMenu().getItem(1).setChecked(true);
                        fragmentTransaction.replace(R.id.host_fragment,new Fragment2());
                        break;
                    }
                    case R.id.page3:{
                        bottomNavigationView.getMenu().getItem(2).setChecked(true);
                        fragmentTransaction.replace(R.id.host_fragment,new Fragment3());
                        break;
                    }
                    case R.id.page4:{
                        bottomNavigationView.getMenu().getItem(3).setChecked(true);
                        fragmentTransaction.replace(R.id.host_fragment,new Fragment3());
                        break;
                    }
                    case R.id.page5:{
                        bottomNavigationView.getMenu().getItem(4).setChecked(true);
                        fragmentTransaction.replace(R.id.host_fragment,new Fragment3());
                        break;
                    }
                }
                fragmentTransaction.commit();
                return false;
            }
        });
    }
}