package selunani.user_management_portal;
/**
 * Created by LENOVO V310 on 10/26/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import selunani.user_management_portal.R;

public class adapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public adapter(Context context, String[] values) {
        super(context, R.layout.activity_main, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.activity_listt
                , parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
        textView.setText(values[position]);

        // Change icon based on name
        String s = values[position];

        System.out.println(s);

        if (s.equals("julius")) {
            imageView.setImageResource(R.drawable.avatar1);
        } else if (s.equals("joel")) {
            imageView.setImageResource(R.drawable.avatar2);
        } else if (s.equals("makori")) {
            imageView.setImageResource(R.drawable.avatar3);
        } else {
            imageView.setImageResource(R.drawable.avatar6);
        }

        return rowView;
    }
}
