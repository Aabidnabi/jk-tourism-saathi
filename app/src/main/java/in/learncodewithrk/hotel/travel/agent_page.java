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

public class agent_page extends AppCompatActivity {
    ListView listView;

    String arrname[] = {"A.H Holidays", "Aapi Kashmir Tour & Travels ", "Aashish Tour & Travel" ,"Aay  Bee Aay Tours","Abode Travels","ADAF Tour & Travels","Adeel Tour & Travels","Adventure N Holidays Tour and Travel","Aearaf Tour & Travels","Agility Tour & Travel","Ahlan India Tour & Travels.","Aiman Tour & Travela","Al-Ahmad Tour & Travel","Al-Fayaz Tour & Travels","Al-Jumeirah Tour & Travels","Al-Kaiwan Tour & Travels","Al-Khalifah Tour & Travels","All Season Tour & Travels","All Seasons Holiday","Alliez Tour & Travels"};

    String arrmessage[] = {"Shafat Ahmad Banday\nBotabagh, HDFC Lane, Hazratbal, Srinagar.","Parveez Sajad Bhat\nNai Sarak, Habba Kadal, Srinagar.","Mehboob Hussain Ganie & Ashiq Hussain Ganie\nAlamgari Bazar, near Health centre, Srinagar","Mr.Ramzan Bhat/ Mohd Amin Dar\nAbullah Bridge, Rajbagh, Srinagar.","Deeba Aslam Khan\nKursu, Rajbagh, Srinagar","Musadiq Afzal Masoodi/Mohammad Tajamul Masoodi\n2ndFloor, Seven Square Complex, Hyderpora, Srinagar. ","Shaheena Malik\nAbi Guzar, The Bund near Hotel Fayaz, Srinagar","Waseem Ahmad Nanda\nBoulvard Road, Gagribal, Srinagar.","Nazir Ahmad Mattoo\nKawdara Main Chowk Near Ziayarat Sharief, Srinagar.","Nazir Ahmad Mattoo\nKawdara Main Chowk Near Ziayarat Sharief, Srinagar.","Mohmmad Yaqoob Chiken\nGMC, Road Karan Nagar, Srinagar","Mr.Mohammed Mouzum Bazaz\nShala Kadal, Habba Kadal, Srinagar.","Naseer Ahmad Wani\nBehind Shalimar Garden","Abdul Qayoom Mir\nMehtab Market Bagi-i-Methtab near Railway Bridge , Sgr","Asiya Fayaz /Mir Rameer Fayaz\nPrime Colony, Sheikh Pora, Budgam.","Sahid Iqbal Mattoo,Majid Hussain Mattoo,\nHabib Complex, Karan Nagar, Srinagar.","Nargis Khatoon\nBudgam ","Tanveer Ahmad Bhat\nQamarwari Chowk, Srinagar.","Idris Hussain Raja\nBuchwara, Masjid Sharief, Srinagar.","Shameema\nShop No. 2, Gunderpora Chowk, Srinagar.","Arbal, Shalimar, Srinagar."};

    int arrimage[] = { R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_page);
        listView = findViewById(R.id.listview);
        agent_page.myadapter adapter = new agent_page.myadapter(this, arrname, arrmessage, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(agent_page.this, agent_page_profile.class);
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