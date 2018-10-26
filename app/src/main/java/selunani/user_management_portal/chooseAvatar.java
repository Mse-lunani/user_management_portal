package selunani.user_management_portal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class chooseAvatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_avatar);
        TextView message = (TextView) findViewById(R.id.label);

        String strname= "mydata";

        String info= String.valueOf(message.getText());

        Intent ii = new Intent(chooseAvatar.this,Update_user.class);
        ii.putExtra(strname,info);
        startActivity(ii);
        startActivity(ii);
    }
}
