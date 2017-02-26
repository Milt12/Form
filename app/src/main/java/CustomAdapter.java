import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HP on 30/07/2016.
 */
public class CustomAdapter extends ArrayAdapter<Object> {
Context context;
    List list;

    public CustomAdapter(Context context, int resource, List<Object> objects) {
        super(context, resource, objects);
        this.context=context;
        this.list=list;

    }

    public static class holder{
        public TextView txtv;
        public ImageView iv;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      // return super.getView(position, convertView, parent);
        View v=convertView;
        holder h;

        }



}
