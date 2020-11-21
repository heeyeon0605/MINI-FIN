package com.example.kustim_v01;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.kustim_v01.popup.PopupActivity;
import com.example.kustim_v01.popup.PopupActivity2;
import com.example.kustim_v01.popup.PopupActivity3;
import com.example.kustim_v01.popup.PopupActivity4;
import com.example.kustim_v01.popup.PopupActivity5;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_option)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
















    }

    //버튼
    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, PopupActivity.class);
        startActivityForResult(intent, 1);
    }

    public void mOnPopupClick2(View v) {
        Log.e("User.a는 뭔데 : ",User.a);
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, PopupActivity2.class);
        startActivityForResult(intent, 1);
    }
    public void mOnPopupClick3(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, PopupActivity3.class);
        startActivityForResult(intent, 1);
    }
    public void mOnPopupClick4(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, PopupActivity4.class);
        startActivityForResult(intent, 1);
    }
    public void mOnPopupClick5(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, PopupActivity5.class);
        startActivityForResult(intent, 1);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Intent intent = new Intent(this, ConfigActivity.class);
                startActivity(intent);
                return true;
            default :
                return super.onOptionsItemSelected(item) ;
        }
    }
    @Override public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}