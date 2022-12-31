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

public class agent_page_list extends AppCompatActivity {
    ListView listView;

    String arrname[] = {"AAZIYA TOUR AND TRAVEL", "Ahanger Hobo", "Aizah Tours and Travels" ,"AL MEEQAT","AL SAALIM TOUR AND TRAVELS","AL- Baseer Tour and Travels","AL-FARDAN TOUR AND TRAVELS","ALBARQ TOUR AND TRAVELS","ALJALEEL TOUR AND TRAVEL","ANSHARA TRAVELS","Auspicious Kashmir Tour and Travels","Avion Travels"};

    String arrmessage[] = {"KADI KADAL SRINAGAR\nJKEA00001111\n24-04-2022\n31-12-2022","kanipora\nJKEA00000946\n19-01-2022\n31-12-2022","Shah Mohalla Nawab bazar\nJKEA00000707\n7/10/2021\n31-12-2021","NALABAL NOWSHERA\nJKEA00001036\n9/3/2022\n31-12-2022","Budgam\nJKEA00001077\n9/3/2022\n31-12-2022","Budgam\nJKEA00001077\n5/4/2022\n31-12-2022","HARWAN SRINAGAR\nJKEA00000990\n7/2/2022\n31-12-2022","BATMALOO\nJKEA00000542\n20-08-2021\n31-12-2022","ZAMPA KADAL\nJKEA00000964\n25-01-2022\n31-12-2022","Srinagar\nJKEA00000783\n22-11-2021\n31-12-2022","Habba Kadal Srinagar\nJKEA00000780\n22-11-2021\n31-12-2022","Zoonimar\nJKEA00000961\n25-01-2022\n31-12-2022"};

    int arrimage[] = { R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_page_list);


        listView = findViewById(R.id.listview);
        agent_page_list.myadapter adapter = new agent_page_list.myadapter(this, arrname, arrmessage, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(agent_page_list.this, profile_agent_online.class);
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