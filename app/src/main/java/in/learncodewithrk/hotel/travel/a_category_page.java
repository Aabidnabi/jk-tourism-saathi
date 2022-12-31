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

public class a_category_page extends AppCompatActivity {
    ListView listView;

    String arrname[] = {"Bilquis", "Chillan", "Claudia Palace" ,"Cler Mount","Clifton","Dinning Boat ","Doreen","Empress of India","Jackson Heights","Khush Dil","Lady of Shelot","Lanka Shiree","Little Cressingham","Lord Place","Memosa","Moon Shine","New Erin","New Kolhoi","New Lucky Kashmir","New Peacock" };

    String arrmessage[] = {"Reg/CS/4423/CT/34/L-1\n16/12/81","Reg/CS/1570/CT/58/L-2\n18/08/82","Reg/1164/Reg/387-95/DT/79/L-2\n02/02/91","Reg/CS/1568/CT/57/L-2\n18/08/82","Reg/327/M-I/2167-2266/CT/35/L-2\n09/10/82","Reg/CS/1567/CT/56/L-2\n18/08/82","Reg/CS/2022-80/CT/9/L-1\n05/10/82","Reg/CS/217-300/1064/28/L-2\n31/03/04","Reg/CS/6498-6000/CT/86/L-1\n21/10/82","Reg/CS/1566/DT/55/L-2\n18/08/82","Reg/46/1CS/2009-51/CT/91/L-1\n25/09/82","Reg/154/MI/Reg/3008/CT/29/L-2\n03/12/84","Reg/CS/1569/CT/54/L-2\n18/08/82","Reg/681/CS/9874/17/L-1\n17/02/83","Reg/279/M-II/2267-2366/CT/77/L-2\n19/10/82","Reg/CS/2167-2266/Misc/81/L-2\n09/10/82","Reg/646/4CS/2022-80/CT/5/L-1\n05/01/82","Reg/1088/217-300/192/37/L-1\n02/01/91","Reg/255/IICS/2009-57/CT/51/L-1\n25/09/82","Reg/1042/5/Reg/1062/DT/41/L-2\n26/09/88"};

    int arrimage[] = { R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1,R.drawable.background2, R.drawable.contact1, R.drawable.background2, R.drawable.contact1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acategory_page);
        listView = findViewById(R.id.listview);
        a_category_page.myadapter adapter = new a_category_page.myadapter(this, arrname, arrmessage, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(a_category_page.this, a_category_page_profile.class);
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