package com.example.popupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {
    Button btnpopup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnpopup = (Button) findViewById(R.id.button_menu);
        btnpopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu();
            }
        });
    }
    private void ShowMenu(){
        PopupMenu popupMenu = new PopupMenu(this,btnpopup);
        popupMenu.getMenuInflater().inflate(R.menu.menu_popup,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menuThêm: btnpopup.setText("Menu Them");
                        break;
                    case R.id.menu_Sửa: btnpopup.setText("Menu Sửa");
                        break;
                    case R.id.menuXoa: btnpopup.setText("Menu xoá");
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
}
