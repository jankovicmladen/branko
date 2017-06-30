package mladen.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import mladen.myapplication.R;
import mladen.myapplication.model.Vest;

/**
 * Created by Mladen on 6/29/2017.
 */

public class Adapter extends BaseAdapter
{

    private Context mContext;
    private ArrayList<Vest> mList;

    public Adapter(Context context, ArrayList<Vest> vesti){
        mList = vesti;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Vest getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0){
            return 0;
        }else {
            return 1;
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = convertView;
        ViewHolder viewHolder = new ViewHolder();

        if(convertView == null) {

            if(getItemViewType(position) == 1) {
                view = inflater.inflate(R.layout.list_item, parent, false);

                viewHolder.title = (TextView) view.findViewById(R.id.title);
                viewHolder.content = (TextView) view.findViewById(R.id.content);

            }else {

            }

            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.title.setText(getItem(position).getTitle());
        viewHolder.content.setText(getItem(position).getContent());

        return view;
    }

    private class ViewHolder{
        TextView title;
        TextView content;
    }
}
