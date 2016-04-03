package app.naoyuki.piano;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by Naoyuki on 2016/04/03.
 */
public class MusicPracticeActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_practice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        Button c_key=(Button)findViewById(R.id.c);
        Button d_key=(Button)findViewById(R.id.d);
        Button e_key=(Button)findViewById(R.id.e);
        Button f_key=(Button)findViewById(R.id.f);
        Button g_key=(Button)findViewById(R.id.g);
        Button a_key=(Button)findViewById(R.id.a);
        Button h_key=(Button)findViewById(R.id.h);
        Button high_c_key=(Button)findViewById(R.id.high_c);
        Button high_d_key=(Button)findViewById(R.id.high_d);
        Button high_e_key=(Button)findViewById(R.id.high_e);
        Button high_f_key=(Button)findViewById(R.id.high_f);
        Button high_g_key=(Button)findViewById(R.id.high_g);
        Button high_a_key=(Button)findViewById(R.id.high_a);
        Button high_h_key=(Button)findViewById(R.id.high_h);
        Button high_d_c_key=(Button)findViewById(R.id.high_d_c);
    }
}