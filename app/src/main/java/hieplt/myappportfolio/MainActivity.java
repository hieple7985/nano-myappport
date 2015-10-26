package hieplt.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mMediaStreamer = null;
    Button mSuperDou1 = null;
    Button mSuperDou2 = null;
    Button mAntTerminator = null;
    Button mMaterialize = null;
    Button mCapstone = null;

    Context mContext = null;

    // Toast Settings
    int mDuration;
    String mToastBase = "This button will launch my ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = getApplicationContext();
        mDuration = Toast.LENGTH_SHORT;

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        mMediaStreamer = (Button) findViewById(R.id.media_streamer);
        mMediaStreamer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast toast = Toast.makeText(mContext, mToastBase + getString(R.string.media_streamer) + "!", mDuration);
                toast.show();
            }
        });

        mSuperDou1 = (Button) findViewById(R.id.super_dou1);
        mSuperDou1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast toast = Toast.makeText(mContext, mToastBase + getString(R.string.super_dou1) + "!", mDuration);
                toast.show();
            }
        });

        mSuperDou2 = (Button) findViewById(R.id.super_dou2);
        mSuperDou2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast toast = Toast.makeText(mContext, mToastBase + getString(R.string.super_dou2) + "!", mDuration);
                toast.show();
            }
        });

        mAntTerminator = (Button) findViewById(R.id.ant_terminator);
        mAntTerminator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast toast = Toast.makeText(mContext, mToastBase + getString(R.string.ant_terminator) + "!", mDuration);
                toast.show();
            }
        });

        mMaterialize = (Button) findViewById(R.id.materialize);
        mMaterialize.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast toast = Toast.makeText(mContext, mToastBase + getString(R.string.materialize) + "!", mDuration);
                toast.show();
            }
        });

        mCapstone = (Button) findViewById(R.id.capstone);
        mCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast toast = Toast.makeText(mContext, mToastBase + getString(R.string.capstone) + "!", mDuration);
                toast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
