package adapter.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.llw.demo_neihangdzi.Drawer_two;
import com.example.llw.demo_neihangdzi.R;

import java.util.List;

import myactivity.com.TwoActivity;

/**
 * Created by llw on 2016/8/2.
 */
public class Drawer_two_adapter extends BaseAdapter {
    public Context context;
    public LayoutInflater layoutInflater;
    public List<Drawer_two> list;

    public Drawer_two_adapter(TwoActivity thread, List<Drawer_two> list) {
        this.context = thread;
        this.list = list;
        layoutInflater = LayoutInflater.from(context);
    }

    public void adapterchanaged(Context mycontext, List<Drawer_two> list) {
        this.list = list;
        this.context = mycontext;
        this.notifyDataSetChanged();
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
            viewHolder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.drawer_one, null, false);

            viewHolder.textView_one = (TextView) view.findViewById(R.id.text_one);
            viewHolder.textView_two = (TextView) view.findViewById(R.id.text_two);
            viewHolder.textView_three = (TextView) view.findViewById(R.id.text_three);
            viewHolder.textView_four = (TextView) view.findViewById(R.id.text_fourt);
            viewHolder.imageView = (ImageView) view.findViewById(R.id.imageview_one);

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.textView_one.setText(list.get(i).getTextView_one());
        viewHolder.textView_two.setText(list.get(i).getTextView_two());
        viewHolder.textView_three.setText(list.get(i).getTextView_three());
        viewHolder.textView_four.setText(list.get(i).getTextView_four());
        viewHolder.imageView.setImageResource(list.get(i).getImage());
        return view;
    }


    public class ViewHolder {
        public ImageView imageView;
        public TextView textView_one;
        public TextView textView_two;
        public TextView textView_three;
        public TextView textView_four;
    }
}
