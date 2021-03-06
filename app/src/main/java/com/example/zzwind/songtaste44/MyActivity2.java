package com.example.zzwind.songtaste44;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;


public class MyActivity2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity2);

        //int[] images = new int[]{ R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher};
        String[] images = new String[]{"http://image.songtaste.com/images/usericon/s/12/4160512.jpeg","http://image.songtaste.com/images/usericon/s/21/4675321.jpg","http://image.songtaste.com/images/usericon/s/61/39361.jpg","http://image.songtaste.com/images/usericon/s/70/8276770.jpg","http://image.songtaste.com/images/usericon/s/95/5263795.jpg"};
        //String[] images = new String[]{"http://www.baidu.com/img/bdlogo.png","http://www.baidu.com/img/bdlogo.png","http://www.baidu.com/img/bdlogo.png","http://www.baidu.com/img/bdlogo.png","http://www.baidu.com/img/bdlogo.png"};
        //
        final ListView listView = (ListView)findViewById(R.id.list);
        HttpUtils http = new HttpUtils();
        http.send(HttpRequest.HttpMethod.GET,
                "http://songtaste.com/api/android/rec_list.php?p=1&n=20&tmp=0.13986661564558744",
                new RequestCallBack<String>() {


                    @Override
                    public void onSuccess(ResponseInfo<String> responseInfo) {
                        Gson gson = new Gson();
                        MusicResult music = gson.fromJson(responseInfo.result,MusicResult.class);
                         listView.setAdapter(new ImgAdapter(MyActivity2.this,music.getData()));
                    }

                    @Override
                    public void onFailure(HttpException error, String msg) {
                        Toast.makeText(MyActivity2.this, "onFailure",
                                Toast.LENGTH_SHORT).show();
                        Log.i("zz","onFailure");
                    }
                });

//        try {
//            JSONObject jsonObject = new JSONObject();
//            Log.i("zz",jsonObject.getInt("code") + "");
//            JSONArray jsonArray = jsonObject.getJSONArray("data");
//            for(int i=0;i<jsonArray.length();i++)
//            {
//                Log.i("zz",jsonArray.get(i) + "");
//            }
//
//        }catch (JSONException e)
//        {
//            Log.i("zz","error");
//        }




//http://image.songtaste.com/images/usericon/s/12/4160512.jpeg














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


