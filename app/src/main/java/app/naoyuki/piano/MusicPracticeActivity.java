package app.naoyuki.piano;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Naoyuki on 2016/04/05.
 */
public class MusicPracticeActivity extends Activity implements View.OnClickListener {
    ImageView score1, score2;
    ImageView metronome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_practice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //楽譜
        score1=(ImageView)findViewById(R.id.score1);
        score1.setImageResource(R.drawable.kaerunouta_1);
        score2=(ImageView)findViewById(R.id.score2);
        score2.setImageResource(R.drawable.kaerunouta_2);

        //メトロノーム
        metronome=(ImageView)findViewById(R.id.metronome);

        findViewById(R.id.frog).setOnClickListener(this);
        findViewById(R.id.lullaby).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v!=null){
            switch (v.getId()){
                //曲選択
                case R.id.frog:
                    score1.setImageResource(R.drawable.kaerunouta_1);
                    score2.setImageResource(R.drawable.kaerunouta_2);
                    break;
                case R.id.lullaby:
                    score1.setImageResource(R.drawable.komoriuta_1);
                    score2.setImageResource(R.drawable.komoriuta_2);
                    break;
                default:
                    break;
            }
        }
    }
}
