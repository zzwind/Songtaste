package com.example.zzwind.songtaste44;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.loopj.android.image.SmartImageView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //String[] data = { " 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill"," 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill"," 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill"," 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill"," 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill"," 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill"," 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill"," 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill"," 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill"," 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill"," 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill"," 蝶恋 哀鸣大提琴", "心情 钢琴曲", "Change Churchill" };

        //ListView listView = (ListView) findViewById(R.id.list);

        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_item, data);

        //listView.setAdapter(arrayAdapter);
        SmartImageView testImg = (SmartImageView) findViewById(R.id.testImg);
        testImg.setImageUrl("http://image.songtaste.com/images/usericon/s/12/4160512.jpeg");
        ((Button)findViewById(R.id.jump)).setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this, MyActivity2.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
