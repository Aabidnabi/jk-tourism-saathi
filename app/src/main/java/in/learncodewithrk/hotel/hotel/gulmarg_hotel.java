package in.learncodewithrk.hotel.hotel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;
import in.learncodewithrk.hotel.R;

public class gulmarg_hotel extends AppCompatActivity {
    ListView listView;

    String arrname[] = {"Hotel Apharwat","Highland Park","Hotel Nedous","Hotel New Zum-Zum","Hotel Pine Palace","Hotel Poshwan","Kolahoi Green Heights","Hotel Welcome","Shano Ladge","Mahajan Hotel (Tangmarg)","Hotel Hilltop","Hotel Rose wood","Hotel Dawat","Hotel Pine View Tangmarg","Hotel Down Hill","Hotel City View Gulmarg","Hotel Royal Park","Hotel Zahgeer","Hotel Vintage","Hotel Fluorscenc"};

    String arrmessage[] = {"Gulmarg\nREG/2/ADTG\n","Gulmarg\nREG/3/ADTG\n","Gulmarg\nREG/4/ADTG\n","Gulmarg\nREG/14/ADTG\n","Gulmarg\nREG/17/ADTG\n","Gulmarg\nREG/18/ADTG\n","Gulmarg\nREG/74/ADTG\n","Gulmarg\nREG/21/ADTG\n","Gulmarg\nREG/24/ADTG\n","Tangmarg\nREG/7/ADTG\n","Gulmarg\nREG/27/ADTG\n","Gulmarg\nREG/25/ADTG\n","Baramulla\nREG/30/ADTG\n","Tangmarg\nREG/32/ADTG\n","Tangmarg\nREG/33/ADTG \n","Gulmarg\nREG/31/ADTG\n","Gulmarg\nREG/35/ADTG\n","Gulmarg\nREG/36/ADTG \n","Gulmarg\nREG/37/ADTG\n","Gulmarg\nREG/38/ADTG\n"};

    int arrimage[] = { R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2,R.drawable.background2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulmarg_hotel);
        listView = findViewById(R.id.listview);
        gulmarg_hotel.myadapter adapter = new gulmarg_hotel.myadapter(this, arrname, arrmessage, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(gulmarg_hotel.this, gulmarg_profile.class);
                intent.putExtra("naem",arrname[position]);
                intent.putExtra("message",arrmessage[position]);
                intent.putExtra("image",arrimage[position]);
                startActivity(intent);

            }
        });


    }

    class myadapter extends ArrayAdapter<String> {

        Context context;
        String rname[];
        String rmsg[];
        int rimg[];

        public myadapter( Context context, String[] rname, String[] rmsg, int[] rimg) {
            super(context,R.layout.row,R.id.imageView,rname);

            this.rname = rname;
            this.rmsg = rmsg;
            this.rimg = rimg;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.row,parent,false);

            CircleImageView img=view.findViewById(R.id.imageView);
            TextView username=view.findViewById(R.id.name);
            TextView usermessage=view.findViewById(R.id.message);

            username.setText(rname[position]);
            usermessage.setText(rmsg[position]);
            img.setImageResource(rimg[position]);

            return view;
        }
    }

}