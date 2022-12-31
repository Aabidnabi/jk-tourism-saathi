package in.learncodewithrk.hotel.travel;

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

public class agent2_page extends AppCompatActivity {
    ListView listView;

    String arrname[] = {"A.A.Tour Travels", "A.B.S.India Tour & Travels", "A.L.S. Tour " ,"A.M.Prince Tour & Travels","A-Salam Tour & Travels","Aala Tours &Travels","Aar Eye Tour & Travels","Adventure Silk Route Journeys","Adventure Starts Here First","Aero Care Tours & Travels","Aero Tours & Travels","Ahmer Tour & Travels","Ahsaan Tour &Travels","Air Links Tour & Travels"};

    String arrmessage[] = {"Syed Mir Masood-ul- Hassan\nShaheed Gunj, Govt Shopping Complex, Srinagar.","Ali Mohd. Baktoo\nNigeen, Srinagar.","Miss Sabina Akhter\nJawahar Nagar,opp.Gurdwara,Srinagar.","Abdul Majid Sofi\nBatmaloo, Srinagar.","Fayaz Ahmad Wangnoo\nNageen Bagh, Srinagar","Anayat Hussain Sheikh\nSaida Kadal, Srinagar.","Ms. Nazia\nRanger Stop, Khanyar, Srinagar.","Javaid Akhter\nKhidmat Complex, The Bund Abi Guzar, Srinagar","Mubarik Ali Badyari\nBadyari Chowk, Dalgate, Srinagar","Basharat Ahmad Hakim\nKaka Sarai, Karan Nagar, Srinagar.","Muhammad Azhar Khan\nGogji Bagh, Srinagar.","M.Saadiq  Baqal\nGonikhan, L.D.Road, Srinagar.","Nissar Ahmad Sheikh\nBudshah Chowk, Srinagar.","Zahoor Qari\n2nd Floor Mattoo Complex, Red Cross Road, Srinagar."};

    int arrimage[] = {R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent2_page);

        listView = findViewById(R.id.listview);
        agent2_page.myadapter adapter = new agent2_page.myadapter(this, arrname, arrmessage, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(agent2_page.this, d_category_page_profile.class);
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