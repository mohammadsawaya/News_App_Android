package com.android2017.session12_navigationdrawer;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AccountHeader accountHeader = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.drawer_header)
                .build();


        Drawer drawer = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withAccountHeader(accountHeader)
                .addDrawerItems(
                        new PrimaryDrawerItem().withIdentifier(1).withName(R.string.drawer_Home).withIcon(R.drawable.ic_home_black_24dp).withIconTintingEnabled(true),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withIdentifier(3).withName(R.string.drawer_settings).withIcon(R.drawable.ic_settings_black_24dp).withIconTintingEnabled(true)
                )
                .addStickyDrawerItems(
                        new PrimaryDrawerItem().withName("V 1.0").withSelectable(false).withEnabled(false)
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        int id = (int) drawerItem.getIdentifier();
                        FragmentManager fragmentManager = getSupportFragmentManager();


                        if (id == 1) {
                            // fragmentManager.beginTransaction().replace(R.id.fragmetcontainer, new HomeFragment()).commit();
                        } else if (id == 2) {
                            // fragmentManager.beginTransaction().replace(R.id.fragmetcontainer, new NewsFragment()).commit();
                        } else if (id == 3) {

                        }
                        return false;
                    }
                })
                .build();

        drawer.setSelection(1);

        ArrayList<String> categoreList = new ArrayList<>();
        categoreList.add("Sport");
        categoreList.add("Economy");
        categoreList.add("Technik");
        categoreList.add("Politik");


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        DynamicPagerAdapterNewsCategre dynamicPagerAdapterNewsCategre = new DynamicPagerAdapterNewsCategre(getSupportFragmentManager(), categoreList);
        viewPager.setAdapter(dynamicPagerAdapterNewsCategre);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }


}
