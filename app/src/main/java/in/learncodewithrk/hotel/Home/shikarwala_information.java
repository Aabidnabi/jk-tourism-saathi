package in.learncodewithrk.hotel.Home;

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
import in.learncodewithrk.hotel.travel.shikarwala_information_profile;

public class shikarwala_information extends AppCompatActivity {

    ListView listView;

    String arrname[] = {"Ali Palace","Sameer Palace","Sajad Palace","Prince Of Valle","Rafiqa Palace","Dabloo Palace","White House","Prince Of Bombay","Langoo Palace","Winter Palace","afzal palace","Guchoo  Express","Chinar"};

    String arrmessage[] = {"Reg/3719/TS/TD/L1/P3\nNigeen\n08/11/2004","Reg/3420/DT/L1/P4\nNigeen\n14/03/2005","Reg/3429/DT/L1/P5\nNigeen\n14/03/2005","Reg/1732/9/1624/19/L1/P6\nNigeen\n15/12/1990","Reg/1734/9/1626/34/L1/P7\nNigeen\n15/12/1990","Reg/3417/DT/L1/P9\nNigeen\n14.02.2005","Reg/1735/L1/P10\nNigeen\n15.12.1990","Reg/146/44/5/L1/P11\nNigeen Lake\n22/02/1980","Reg/2970/DT/L2/12\nNigeen Lake\n17/12/2004","Reg/2079/ST/L1/P14\nNigeen Ghat\n23/02/1988 ","Reg/2946/TSL1/P15\nNigeen\n02/12/2004","Reg/3513/TS/L1/p16\nNigeen\n17/12/2003","Reg/2678/75/34/L1/P17\nNigeen Lake\n12.09.2003"};

    int arrimage[] = {R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shikarwala_information);
        listView = findViewById(R.id.listview);
        shikarwala_information.myadapter adapter = new shikarwala_information.myadapter(this, arrname, arrmessage, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(shikarwala_information.this, shikarwala_information_profile.class);
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