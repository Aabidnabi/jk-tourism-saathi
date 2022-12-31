package in.learncodewithrk.hotel.travel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import in.learncodewithrk.hotel.R;

public class Travel_Agents_page extends AppCompatActivity {
    CardView agent, agent1, agent2, agent3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_agents_page);


        agent = (CardView) findViewById(R.id.agent);

        agent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(Travel_Agents_page.this, agent_page.class);
                startActivity(streamIntent);
            }
        });

        agent1 = (CardView) findViewById(R.id.agent1);

        agent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(Travel_Agents_page.this, agent_page_list.class);
                startActivity(streamIntent);
            }
        });
        agent2 = (CardView) findViewById(R.id.agent2);

        agent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(Travel_Agents_page.this, agent2_page.class);
                startActivity(streamIntent);
            }
        });

    }
}
