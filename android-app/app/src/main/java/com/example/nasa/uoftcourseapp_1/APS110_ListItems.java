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

public class APS110_ListItems extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_listitem);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        if (position == 0) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.ece.utoronto.ca/wp-content/uploads/" +
                            "2015/05/APS104S-syllabus-winter-2015.pdf"));
            startActivity(browserIntent);
        }
        else if (position == 1) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=y" +
                            "j5BP6sNPd0&t=13s&list=PL966575B7C0028E82&index=1"));
            startActivity(browserIntent);
        }
        else if (position == 2) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=KPp8ES5wABA&list=" +
                            "PL966575B7C0028E82&index=2"));
            startActivity(browserIntent);
        }
        else if (position == 3) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=_NLAgSnqNOE&list=" +
                            "PL966575B7C0028E82&index=3"));
            startActivity(browserIntent);
        }
        else if (position == 4) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=fucyI7Ouj2c&list=" +
                            "PL966575B7C0028E82&index=9"));
            startActivity(browserIntent);
        }
        else if (position == 5) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=qh29mj6uXoM&index=3&list=" +
                            "PLA7DE84EFB0E7860B"));
            startActivity(browserIntent);
        }
        else if (position == 6) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=045Zy1hBENg&index=12&list=" +
                            "PLA7DE84EFB0E7860B"));
            startActivity(browserIntent);
        }
        else if (position == 7) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=WHBl7JKP8hI&index=17&list=" +
                            "PLA7DE84EFB0E7860B"));
            startActivity(browserIntent);
        }
        else if (position == 8) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=_KnH1jfjlvU&index=27&list=" +
                            "PLA7DE84EFB0E7860B"));
            startActivity(browserIntent);
        }
        else if (position == 9) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://courses.skule.ca/course/?q=APS104H1"));
            startActivity(browserIntent);
        }





        // Here we turn your string.xml in an array
        /*String[] myKeys = getResources().getStringArray(R.array.sections);

        TextView myTextView = (TextView) findViewById(R.id.my_textview);
        myTextView.setText(myKeys[position]);*/


    }


}

