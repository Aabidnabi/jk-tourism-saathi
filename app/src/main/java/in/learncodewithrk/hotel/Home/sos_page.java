package in.learncodewithrk.hotel.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import in.learncodewithrk.hotel.R;

public class sos_page extends AppCompatActivity {

    TextView call_100,call_102,what_call,feedback;
    Button call;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos_page);




        call_100 = (TextView) findViewById(R.id.call_100);
        call_100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+91 100"));
                startActivity(callIntent);

            }
        });
        call_102 = (TextView) findViewById(R.id.call_102);
        call_102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+91 102"));
                startActivity(callIntent);

            }
        });

        what_call = findViewById(R.id.what_call);


        what_call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gotoUrl("https://api.whatsapp.com/send?phone=7780940427&text=can%20i%20help%20you%20sir");


            }
        });


        feedback = (TextView) findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                String uriText = "mailto:" + Uri.encode("tantryinfo98@gmail.com") + "?subject=" +
                        Uri.encode("your email id ") + "&body=" + Uri.encode("");

                Uri uri = Uri.parse(uriText);
                intent.setData(uri);
                startActivity(Intent.createChooser(intent, "Send Email"));

            }
        });
       // Location.setOnClickListener(new View.OnClickListener(){
      //      @Override
         //   public void onClick(View v) {
         //       gotoUrl("https://goo.gl/maps/fHLoFSHs5PEzW4H1A");


          //  }
       // });











    }

    private void gotoUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}