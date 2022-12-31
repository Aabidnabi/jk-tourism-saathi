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

public class b_category_page extends AppCompatActivity {
    ListView listView;

    String arrname[] = {"Daisy", "Devdar", "Happy Loin" ,"Little Majestic","Maple Leaf","New Maple Leaf","New Ritz","New Vanda","Peacock","Ramzana","Washington D.C.","Young Kabul"};

    String arrmessage[] = {"Reg/991/5/Reg/2818/DT/43/L-1\\n19/10/84","Reg/579/4CS/9136/CT/64/L-1\\n23/12/82","Reg/6498-6500/\n21/10/82","Reg/CS/11098/CT/29/L-1\n23/03/83","Reg/CS/4624/CT/146/13/L-2\n12/01/82","Reg/CS/1396/CT/50/L-1\n28/02/82","Reg/598/4CS/2022-80/CT/22/L-1\n05/10/82","Reg/CS/6799-6805/CT/16/L-2\n27/11/82","Reg/647/4CS/2022-80/CT/22/L-2\n05/10/82","Reg/130/1CS/2167-2266/CT/42/L-1\n09/10/82","Reg/CS/2022-80/CT/75/L-1\n15/10/82","Reg/684/4CS/11135/DT/87/L-1\n28/03/83"};

    int arrimage[] = { R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcategory_page);


        listView = findViewById(R.id.listview);
        b_category_page.myadapter adapter = new b_category_page.myadapter(this, arrname, arrmessage, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(b_category_page.this, b_category_page_profile.class);
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