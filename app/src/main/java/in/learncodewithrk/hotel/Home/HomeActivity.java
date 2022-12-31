package in.learncodewithrk.hotel.Home;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import in.learncodewithrk.hotel.Booking_page;
import in.learncodewithrk.hotel.Login.LoginandregisterActivity;
import in.learncodewithrk.hotel.R;
import in.learncodewithrk.hotel.travel.hotel_page2;
import in.learncodewithrk.hotel.travel.hotel_page3;
import in.learncodewithrk.hotel.travel.hotel_page4;
import in.learncodewithrk.hotel.travel.hotel_page5;
import in.learncodewithrk.hotel.travel.hotel_page6;
import in.learncodewithrk.hotel.travel.hotel_page7;
import in.learncodewithrk.hotel.travel.hotel_page8;
import in.learncodewithrk.hotel.travel.Travel_Agents_page;
import in.learncodewithrk.hotel.travel.hotel1_page;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    FirebaseAuth mAuth;

    private View headerView;
    Button btn;
    ImageView Emergency_sos;
    Button hotel,houseboart,shikarwala,Travel_Agents;

    CardView card1,card2,card3,card4,card5,card6,card7,card8,card9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Emergency_sos = (ImageView) findViewById(R.id.Emergency_sos);
        Emergency_sos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, sos_page.class);
                startActivity(streamIntent);
            }
        });

        hotel = (Button) findViewById(R.id.hotel);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, hotel_information.class);
                startActivity(streamIntent);
            }
        });


        houseboart = (Button) findViewById(R.id.houseboart);
        houseboart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, houseboart_information.class);
                startActivity(streamIntent);
            }
        });

        shikarwala = (Button) findViewById(R.id.shikarwala);
        shikarwala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, shikarwala_information.class);
                startActivity(streamIntent);
            }
        });

        Travel_Agents = (Button) findViewById(R.id.Travel_Agents);
        Travel_Agents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, Travel_Agents_page.class);
                startActivity(streamIntent);
            }
        });


        card1 = (CardView) findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, hotel1_page.class);
                startActivity(streamIntent);
            }
        });

        card2 = (CardView) findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, hotel_page2.class);
                startActivity(streamIntent);
            }
        });

        card3 = (CardView) findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, hotel_page3.class);
                startActivity(streamIntent);
            }
        });

        card4 = (CardView) findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, hotel_page4.class);
                startActivity(streamIntent);
            }
        });


        card5 = (CardView) findViewById(R.id.card5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, hotel_page5.class);
                startActivity(streamIntent);
            }
        });

        card6 = (CardView) findViewById(R.id.card6);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, hotel_page6.class);
                startActivity(streamIntent);
            }
        });

        card7 = (CardView) findViewById(R.id.card7);
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, hotel_page7.class);
                startActivity(streamIntent);
            }
        });

        card8 = (CardView) findViewById(R.id.card8);
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(HomeActivity.this, hotel_page8.class);
                startActivity(streamIntent);
            }
        });




        // setup UI
        CoordinatorLayout coordinatorLayout = findViewById(R.id.coordinatorLayout);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mAuth = FirebaseAuth.getInstance();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mAuth = FirebaseAuth.getInstance();



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        headerView = navigationView.getHeaderView(0);
        TextView drawerUsername = headerView.findViewById(R.id.drawer_name);
        TextView drawerAccount = headerView.findViewById(R.id.drawer_email);
        navigationView.setNavigationItemSelectedListener(this);
    }
    private void nearbyHotelIntent() {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=Hotel");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.about) {


            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(String.format("%1$s", getString(R.string.about1)));
            builder.setMessage(getResources().getText(R.string.about_text));
            builder.setPositiveButton("OK", null);
            builder.setIcon(R.mipmap.ic_launcher);
            AlertDialog welcomeAlert = builder.create();
            welcomeAlert.show();
            ((TextView) welcomeAlert.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());


        } else if (id == R.id.Booking) {

           Intent paymentIntent = new Intent(HomeActivity.this, Booking_page.class);
          startActivity(paymentIntent);


        } else if (id == R.id.location) {
            nearbyHotelIntent();



        } else if (id == R.id.help_line_Number) {

            if(Build.VERSION.SDK_INT<23){
                Intent in=new Intent(Intent.ACTION_CALL, Uri.parse("tel:+91" + "7780940427"));

                try{
                    startActivity(in);
                }catch (android.content.ActivityNotFoundException ex){
                    Toast.makeText(getApplicationContext(), "yourActivity is not founded", Toast.LENGTH_SHORT).show();
                }

            }else{
                int REQUEST_CODE_ASK_PERMISSIONS = 123;

                int hasWriteContactsPermission = checkSelfPermission(Manifest.permission.CALL_PHONE);
                if (hasWriteContactsPermission != PackageManager.PERMISSION_GRANTED) {
                    requestPermissions(new String[] {Manifest.permission.CALL_PHONE},
                            REQUEST_CODE_ASK_PERMISSIONS);

                }

                Intent in=new Intent(Intent.ACTION_CALL, Uri.parse("tel:+91" + "+7780940427"));

                try{
                    startActivity(in);
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(), "Permissions required", Toast.LENGTH_SHORT).show();
                }

            }

            return true;



        } else if (id == R.id.nav_share) {

            Intent shareintent = new Intent();
            shareintent.setAction(Intent.ACTION_SEND);
            shareintent.putExtra(Intent.EXTRA_TEXT, "your application link");
            shareintent.setType("text/plain");
            startActivity(Intent.createChooser(shareintent, " Share Your App"));

        } else if (id == R.id.nav_logout)
            mAuth.signOut();
        if (mAuth.getCurrentUser() == null) {
            startActivity(new Intent(getApplicationContext(), LoginandregisterActivity.class));
            finish();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;



    }
}
