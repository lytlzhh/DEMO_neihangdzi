package adapter.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.llw.demo_neihangdzi.Ben;
import com.example.llw.demo_neihangdzi.MainActivity;
import com.example.llw.demo_neihangdzi.R;

import java.util.List;

/**
 * Created by llw on 2016/8/2.
 */
public class Listviewadapter extends BaseAdapter {
    public Context context;
    List<Ben> list = null;
    LayoutInflater layoutInflater = null;

    public Listviewadapter(MainActivity mainActivity, List<Ben> list) {
        this.context = mainActivity;
        this.list = list;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) view.findViewById(R.id.imageview_id);
            viewHolder.textView = (TextView) view.findViewById(R.id.textview_id);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }


        viewHolder.imageView.setBackgroundResource(list.get(i).getImages());
        viewHolder.textView.setText(list.get(i).getSrt());
        return view;
    }


    public class ViewHolder {
        public ImageView imageView;
        public TextView textView;
    }
}
