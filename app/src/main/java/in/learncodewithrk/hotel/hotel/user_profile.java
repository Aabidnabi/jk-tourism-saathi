package in.learncodewithrk.hotel.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;
import in.learncodewithrk.hotel.R;

public class user_profile extends AppCompatActivity {

    ImageView image;

    TextView username1,usermessage1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);



        image=findViewById(R.id.image);
      //  username1=findViewById(R.id.username1);
        usermessage1=findViewById(R.id.usermessage1);

        Intent intent=this.getIntent();

       // String username2=intent.getStringExtra("name");
        String usermessage2=intent.getStringExtra("message");
        int imageid=intent.getIntExtra("image",R.drawable.logo1);

       // username1.setText(username2);
        usermessage1.setText(usermessage2);
        image.setImageResource(imageid);


    }
}