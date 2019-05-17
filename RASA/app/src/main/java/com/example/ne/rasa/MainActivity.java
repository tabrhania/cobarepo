package com.example.ne.rasa;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    HomeFragment homeFragment = new HomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.container, homeFragment);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_dashboard:
                    DashboardFragment dashboardFragment = new DashboardFragment();
                    FragmentTransaction fragmentDashTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentDashTransaction.replace(R.id.container, dashboardFragment);
                    fragmentDashTransaction.commit();
                    return true;
                case R.id.navigation_notifications:
                    NotificationsFragment notificationsFragment = new NotificationsFragment();
                    FragmentTransaction fragmentNotifTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentNotifTransaction1.replace(R.id.container, notificationsFragment);
                    fragmentNotifTransaction1.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment homeFragment = new HomeFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, homeFragment);
        fragmentTransaction.commit();

        BottomNavigationView navView = findViewById(R.id.nav_view);
//        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
