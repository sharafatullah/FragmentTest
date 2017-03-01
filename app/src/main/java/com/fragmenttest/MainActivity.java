package com.fragmenttest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment=new Main();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.MainLayout,fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        switch (id){
            case R.id.main1:
                Fragment fragment=new FirstFrag();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.MainLayout,fragment);
                fragmentTransaction.commit();
                break;

            case R.id.main2:
                Fragment fragment2=new Second();
                FragmentTransaction fragmentTransaction2=getSupportFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.MainLayout,fragment2);
                fragmentTransaction2.commit();
                break;
        }
        return true;
    }
}
