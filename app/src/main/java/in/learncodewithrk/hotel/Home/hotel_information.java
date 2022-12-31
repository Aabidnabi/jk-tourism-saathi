package in.learncodewithrk.hotel.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import in.learncodewithrk.hotel.R;
import in.learncodewithrk.hotel.hotel.budgam_hotel_page;
import in.learncodewithrk.hotel.hotel.gulmarg_hotel;
import in.learncodewithrk.hotel.hotel.sonamarg_hotel_page;
import in.learncodewithrk.hotel.hotel.srinagar_hotel;

public class hotel_information extends AppCompatActivity {
CardView budgam_hotel,hotel1,hotel2,hotel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_information);

        budgam_hotel = (CardView) findViewById(R.id.budgam_hotel);
        budgam_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(hotel_information.this, budgam_hotel_page.class);
                startActivity(streamIntent);
            }
        });

        hotel1 = (CardView) findViewById(R.id.hotel1);
        hotel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(hotel_information.this, gulmarg_hotel.class);
                startActivity(streamIntent);
            }
        });


        hotel2 = (CardView) findViewById(R.id.hotel2);
        hotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(hotel_information.this, sonamarg_hotel_page.class);
                startActivity(streamIntent);
            }
        });
        hotel3 = (CardView) findViewById(R.id.hotel3);
        hotel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(hotel_information.this, srinagar_hotel.class);
                startActivity(streamIntent);
            }
        });


    }
}