package com.example.nasa.uoftcourseapp_1;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.text.method.LinkMovementMethod;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import 	android.widget.ListView;
import 	android.util.Log;
import android.app.Activity;


/**
 * Created by Anurag on 1/21/2017.
 */

public class APS100_ListItems extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_listitem);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        if (position == 0) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=9ebJlcZMx3c&list="
                            + "PLTXjbOhu_VFy6zHxc8ug8A2-vPK5A0xDH&index=3"));
            startActivity(browserIntent);
        }
        else if (position==1) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=VQKt58kuEnk&index=4&list=PL"
                            + "TXjbOhu_VFy6zHxc8ug8A2-vPK5A0xDH"));
            startActivity(browserIntent);
        }
        else if (position==2) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=O96fE1E-rf8&list=" +
                            "PLTXjbOhu_VFy6zHxc8ug8A2-vPK5A0xDH&index=5"));
            startActivity(browserIntent);
        }
        else if (position==3) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=arj7oStGLkU&index=6&list=" +
                            "PLTXjbOhu_VFy6zHxc8ug8A2-vPK5A0xDH"));
            startActivity(browserIntent);
        }
        else if (position==4) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=RcGyVTAoXEU&list=" +
                            "PLTXjbOhu_VFy6zHxc8ug8A2-vPK5A0xDH&index=7"));
            startActivity(browserIntent);
        }
    }
        // Here we turn your string.xml in an array
        /*String[] myKeys = getResources().getStringArray(R.array.sections);

        TextView myTextView = (TextView) findViewById(R.id.my_textview);
        myTextView.setText(myKeys[position]);*/


}

