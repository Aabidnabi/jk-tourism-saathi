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

public class sonamarg_hotel_page extends AppCompatActivity {

    ListView listView;
    String arrname[] = {"International Himalayan", "Vishansar Camping", "Sonamarg Glacier","Glacier Heights","Sonamarg Palace","Snow Land","Rah-villas","Namrose Resorts (Camp Hotel)","Sindh Resorts Hotel & Rest","Snow Land Resort Hotel & Rest.","Sun Shine Resort","Divine Inn","Barzman","Tranquil Retreat","Villa Himaliya","Iqbal Hotel","Thajwas Glacier"};

    String arrmessage[] = {"Sonamarg\nreg/cs/760/20/53/79/L-3\n5/22/1980\n","Sonamarg\nReg/1704/dt/56/L-4\n10/23/1985\n","Sonamarg\n Reg/1021/DT/L2/31\n6/27/1997\n","Sonamarg\nReg/593/174/80/L-1\n9/30/1997\n","Sonamarg\nReg.221/DT/L2/64\n5/26/2004\n","Sonamarg\nReg/3276/DT/17/L-1\n7/14/2004\n","Kullan Sonamarg\nReg/493/dt/28/L-5\n8/10/2011\n","Sonamarg\nREG/73/DT/41/l-5\n4/5/2013\n","Sonamarg\nREG/71/DT/39/l-5\n4/5/2013\n","Mamer Sonamarg\nREG/72/DT/40/l-5\n4/5/2013\n","Sonamarg\nREG/345/DTK/43/l-5\n5/23/2013\n","Sonamarg\nREG/777/DT/49/l-5\n7/25/2013\n","Sonamarg\nREG/H/605/575-77/DTK/60/l-5\n10/10/2013\n","Sonamarg\nREG/H/647/180/DTK/64/l-5\n5/5/2014\n","Kullan Zurpora\nReg/1049/206/L7/40/DTK\n6/29/2016\n","Kullan\nReg/1247/611/DTK/L5/P 97 Ddated \n2/21/2018\n","Sonamarg\nReg/646/DTK \n10/23/2020\n"};

    int arrimage[] = { R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2,R.drawable.background2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonamarg_hotel_page);
        listView = findViewById(R.id.listview);
        sonamarg_hotel_page.myadapter adapter = new sonamarg_hotel_page.myadapter(this, arrname, arrmessage, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(sonamarg_hotel_page.this, sonamarg_profile_page.class);
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