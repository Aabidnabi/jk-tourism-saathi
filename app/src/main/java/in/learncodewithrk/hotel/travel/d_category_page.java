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

public class d_category_page extends AppCompatActivity {
    ListView listView;

    String arrname[] = {"Alberg", "Bijoo", "Gurkha (palace)" ,"Gurkha Inn","Green Chinar","Nigeen Heritage","House of Common","Kay-2","Mamamian","Mughal Suit","New Floora","New Hayat","New Martins","Shab Rose","Wangnoo Paradise"};

    String arrmessage[] = {"Reg/1101/217-300/84/L-1\n02/01/91","Reg/243/MII/CS/2267-2366/CT/12/L-1\n09/10/82","Reg/217-300/DT/3/L-4\n02/01/91","Reg/217-300/57/4/L-4\n02/01/91","Reg/190-CS/4543/CT/83/L-2\n04/01/82","Reg/217-300/DT/10/L-4\n02/01/91","Reg/1134/6/301-14/DT/52/L-1\n31/03/99","Reg/1022/5CS/2267-2366/CT/6/L-3\n09/10/82","Reg/410-14/DT/74/L-3\n09/02/91","Reg554/3CS//6844-45/CT/128/57/L-3\n29/11/82","Reg/CS/5521/CT/206/150/3/L-1\n18/03/82","Reg/6/Asstt/344-50/DT/65/L-3\n15/01/91","Reg/9062/5CS/2761/DT/169/20/L-3\n03/12/83","Reg/1143/Reg/332-37/DT/277/76/L-2\n12/01/91","Reg/1045/Reg/177/TD/301/35/L-3\n20/08/90"};

    int arrimage[] = {R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcategory_page);

        listView = findViewById(R.id.listview);
        d_category_page.myadapter adapter = new d_category_page.myadapter(this, arrname, arrmessage, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(d_category_page.this, d_category_page_profile.class);
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
