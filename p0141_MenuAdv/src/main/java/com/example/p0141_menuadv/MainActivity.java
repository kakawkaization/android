package com.example.p0141_menuadv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    CheckBox chb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        chb = (CheckBox) findViewById(R.id.chbExtMenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "add");
        menu.add(0, 2, 0, "edit");
        menu.add(0, 3, 0, "delete");
        menu.add(1, 4, 0, "copy");
        menu.add(1, 5, 0, "paste");
        menu.add(1, 6, 0, "build");
        menu.add(1, 7, 0, "run");
        menu.add(1, 8, 0, "exit");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.setGroupVisible(1, chb.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        StringBuilder sb = new StringBuilder();

        sb.append("Item Menu");
        sb.append("\r\n groupId: " + String.valueOf(item.getGroupId()));
        sb.append("\r\n itemId: " + String.valueOf(item.getItemId()));
        sb.append("\r\n order: " + String.valueOf(item.getOrder()));
        sb.append("\r\n title: " + String.valueOf(item.getTitle()));
        tv.setText(sb.toString());

        return super.onOptionsItemSelected(item);
    }
}
