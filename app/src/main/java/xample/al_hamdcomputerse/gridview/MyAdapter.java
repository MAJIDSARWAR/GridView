package xample.al_hamdcomputerse.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by AL-HAMD COMPUTERS on 3/18/2018.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    int image[];

    public MyAdapter(Context context, int[] image) {
        this.context = context;
        this.image = image;
    layoutInflater =(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

     view=layoutInflater.inflate(R.layout.custom_layout,null);
        ImageView imageView=(ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(image[i]);


        return view;
    }
}
