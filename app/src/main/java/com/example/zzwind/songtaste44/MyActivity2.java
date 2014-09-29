package com.example.zzwind.songtaste44;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.loopj.android.image.SmartImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MyActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity2);

        //int[] images = new int[]{ R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher};
        String[] images = new String[]{"http://image.songtaste.com/images/usericon/s/12/4160512.jpeg","http://image.songtaste.com/images/usericon/s/21/4675321.jpg","http://image.songtaste.com/images/usericon/s/61/39361.jpg","http://image.songtaste.com/images/usericon/s/70/8276770.jpg","http://image.songtaste.com/images/usericon/s/95/5263795.jpg"};
        //String[] images = new String[]{"http://www.baidu.com/img/bdlogo.png","http://www.baidu.com/img/bdlogo.png","http://www.baidu.com/img/bdlogo.png","http://www.baidu.com/img/bdlogo.png","http://www.baidu.com/img/bdlogo.png"};
        //


//http://image.songtaste.com/images/usericon/s/12/4160512.jpeg

        List<HashMap<String,Object>> data = new ArrayList<HashMap<String, Object>>();
        for(int i =0; i < 5; i++){
            HashMap<String,Object> map = new HashMap<String, Object>();
            map.put("ItemImage", images[i]);
            map.put("ItemTitle", "This is Title" + i);
            map.put("ItemText", "This is text" + i);
            data.add(map);
        }

        ListView listView = (ListView)findViewById(R.id.list);




        String[] from = new String[]{"ItemImage","ItemTitle","ItemText"};

        int[] to = new int[] { R.id.ItemImage,R.id.ItemTitle, R.id.ItemText };

        SimpleAdapter adapter = new SimpleAdapter(this,data,R.layout.list_item2,from,to);

        adapter.setViewBinder(new SimpleAdapter.ViewBinder() {
            @Override
            public boolean setViewValue(View view, Object data, String textRepresentation) {
                if(view instanceof SmartImageView){
                    ((SmartImageView)view).setImageUrl(data.toString());
                    Log.e("zzz",data.toString());

                    return true;
                }
                return false;
            }
        });

        listView.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_activity2, menu);
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
