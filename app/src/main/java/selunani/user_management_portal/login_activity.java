package selunani.user_management_portal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        TextView registerScreen = (TextView) findViewById(R.id.link_to_register);
        final EditText Email = findViewById(R.id.email);
        final EditText password = findViewById(R.id.pass);
        Button login = findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("admin".equals(password.getText().toString()) && "admin".equals(Email.getText().toString())){
                    Intent i = new Intent(login_activity.this,listtActivity.class);
                    startActivity(i);
                }
                else{

                    Toast.makeText(login_activity.this,Email.getText().toString() , Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Listening to register new account link
        registerScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                 //Switching to Register screen
                Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}
