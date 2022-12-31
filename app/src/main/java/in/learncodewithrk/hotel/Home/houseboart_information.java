package in.learncodewithrk.hotel.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import in.learncodewithrk.hotel.R;
import in.learncodewithrk.hotel.travel.a_category_page;
import in.learncodewithrk.hotel.travel.b_category_page;
import in.learncodewithrk.hotel.travel.c_category_page;
import in.learncodewithrk.hotel.travel.d_category_page;

public class houseboart_information extends AppCompatActivity {
    CardView a_category, b_category, c_category, d_category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_houseboart_information);

        a_category = (CardView) findViewById(R.id.a_category);
        a_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(houseboart_information.this, a_category_page.class);
                startActivity(streamIntent);
            }
        });

        b_category = (CardView) findViewById(R.id.b_category);
        b_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(houseboart_information.this, b_category_page.class);
                startActivity(streamIntent);
            }
        });

        c_category = (CardView) findViewById(R.id.c_category);
        c_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(houseboart_information.this, c_category_page.class);
                startActivity(streamIntent);
            }
        });

        d_category = (CardView) findViewById(R.id.d_category);
        d_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(houseboart_information.this, d_category_page.class);
                startActivity(streamIntent);
            }
        });
    }
}
