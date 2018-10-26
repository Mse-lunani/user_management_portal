package selunani.user_management_portal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Update_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_user);
        String name="";
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                String newString = null;
            } else {
                name = extras.getString("mydata");
            }
        } else {
             name = (String) savedInstanceState.getSerializable("mydata");
        }
        ImageButton imageView = findViewById(R.id.imageButton);
        TextView name2 = findViewById(R.id.textView3);
        name2.setText(name);
        if (name.equals("julius")) {
            imageView.setImageResource(R.drawable.avatar1);
        }
        if (name.equals("makori")) {
            imageView.setImageResource(R.drawable.avatar2);
        }
        if (name.equals("joel")) {
            imageView.setImageResource(R.drawable.avatar3);
        }
        else{
            //imageView.setImageResource(R.drawable.avatar6);
        }
    }


}
