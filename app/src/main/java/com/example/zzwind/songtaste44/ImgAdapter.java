package com.example.zzwind.songtaste44;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lidroid.xutils.BitmapUtils;

import java.util.List;

/**
 * Created by zzwind on 2014/9/30.
 */
public class ImgAdapter extends BaseAdapter {

    private List<Music> musiclist;
    private Context context;
    private BitmapUtils bitmapUtils;
    public ImgAdapter(Context ct,List<Music> mlist)
    {
        this.musiclist = mlist;
        this.context = ct;
        bitmapUtils = new BitmapUtils(this.context);
}
    @Override
    public int getCount() {
        return musiclist.size();
    }

    @Override
    public Music getItem(int position) {
        return musiclist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View viewroot = LayoutInflater.from(this.context).inflate(R.layout.list_item2,null);
        ImageView ItemImage  = (ImageView)viewroot.findViewById(R.id.ItemImage);
        TextView ItemTitle = (TextView)viewroot.findViewById(R.id.ItemTitle);
        TextView ItemText = (TextView)viewroot.findViewById(R.id.ItemText);
        Music bean = getItem(position);
        ItemTitle.setText(bean.getName());
        ItemText.setText(bean.getSinger());
        bitmapUtils.display(ItemImage,bean.getUpUIcon());
        return viewroot;
    }
}
