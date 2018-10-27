package selunani.user_management_portal;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class listtActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listt);
        String[] values = new String[] { "julius", "kevin", "joel",
                "makori"};
        // use your custom layout
        adapter Adapter = new adapter(this, values);
        setListAdapter(Adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView message = (TextView) view.findViewById(R.id.label);

                String strname= "mydata";

                String info= String.valueOf(message.getText());

                Intent ii = new Intent(listtActivity.this,Update_user.class);
                ii.putExtra(strname,info);
                startActivity(ii);
            }
        });


}
}
