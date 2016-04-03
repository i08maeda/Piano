package app.naoyuki.piano;

import android.app.Activity;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Naoyuki on 2016/04/03.
 */
public class MusicPracticeActivity extends Activity implements View.OnTouchListener {
    final int MAX_SOUND_NUM=5;  //同時になる最大音数
    SoundPool sound_bool;
    int[][] sound_ids;
    int[] stop_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_practice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //音源の用意
        stop_id=new int[15];
        sound_bool=new SoundPool(MAX_SOUND_NUM, AudioManager.STREAM_MUSIC, 0);
        sound_ids=new int[1][15];
        sound_ids[0][0]=sound_bool.load(this, R.raw.p_c, 1);
        sound_ids[0][1]=sound_bool.load(this, R.raw.p_d, 1);
        sound_ids[0][2]=sound_bool.load(this, R.raw.p_e, 1);
        sound_ids[0][3]=sound_bool.load(this, R.raw.p_f, 1);
        sound_ids[0][4]=sound_bool.load(this, R.raw.p_g, 1);
        sound_ids[0][5]=sound_bool.load(this, R.raw.p_a, 1);
        sound_ids[0][6]=sound_bool.load(this, R.raw.p_h, 1);
        sound_ids[0][7]=sound_bool.load(this, R.raw.p_high_c, 1);
        sound_ids[0][8]=sound_bool.load(this, R.raw.p_high_d, 1);
        sound_ids[0][9]=sound_bool.load(this, R.raw.p_high_e, 1);
        sound_ids[0][10]=sound_bool.load(this, R.raw.p_high_f, 1);
        sound_ids[0][11]=sound_bool.load(this, R.raw.p_high_g, 1);
        sound_ids[0][12]=sound_bool.load(this, R.raw.p_high_a, 1);
        sound_ids[0][13]=sound_bool.load(this, R.raw.p_high_h, 1);
        sound_ids[0][14]=sound_bool.load(this, R.raw.p_d_high_c, 1);

        //各鍵盤がクリックされたときの動作
        findViewById(R.id.c).setOnTouchListener(this);
        findViewById(R.id.d).setOnTouchListener(this);
        findViewById(R.id.e).setOnTouchListener(this);
        findViewById(R.id.f).setOnTouchListener(this);
        findViewById(R.id.g).setOnTouchListener(this);
        findViewById(R.id.a).setOnTouchListener(this);
        findViewById(R.id.h).setOnTouchListener(this);
        findViewById(R.id.high_c).setOnTouchListener(this);
        findViewById(R.id.high_d).setOnTouchListener(this);
        findViewById(R.id.high_e).setOnTouchListener(this);
        findViewById(R.id.high_f).setOnTouchListener(this);
        findViewById(R.id.high_g).setOnTouchListener(this);
        findViewById(R.id.high_a).setOnTouchListener(this);
        findViewById(R.id.high_h).setOnTouchListener(this);
        findViewById(R.id.high_d_c).setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(v!=null){
            switch (v.getId()){
                case R.id.c:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[0]=sound_bool.play(sound_ids[0][0], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[0]);
                    }
                    break;
                case R.id.d:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[1]=sound_bool.play(sound_ids[0][1], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[1]);
                    }
                    break;
                case R.id.e:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[2]=sound_bool.play(sound_ids[0][2], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[2]);
                    }
                    break;
                case R.id.f:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[3]=sound_bool.play(sound_ids[0][3], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[3]);
                    }
                    break;
                case R.id.g:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[4]=sound_bool.play(sound_ids[0][4], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[4]);
                    }
                    break;
                case R.id.a:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[5]=sound_bool.play(sound_ids[0][5], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[5]);
                    }
                    break;
                case R.id.h:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[6]=sound_bool.play(sound_ids[0][6], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[6]);
                    }
                    break;
                case R.id.high_c:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[7]=sound_bool.play(sound_ids[0][7], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[7]);
                    }
                    break;
                case R.id.high_d:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[8]=sound_bool.play(sound_ids[0][8], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[8]);
                    }
                    break;
                case R.id.high_e:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[9]=sound_bool.play(sound_ids[0][9], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[9]);
                    }
                    break;
                case R.id.high_f:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[10]=sound_bool.play(sound_ids[0][10], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[10]);
                    }
                    break;
                case R.id.high_g:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[11]=sound_bool.play(sound_ids[0][11], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[11]);
                    }
                    break;
                case R.id.high_a:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[12]=sound_bool.play(sound_ids[0][12], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[12]);
                    }
                    break;
                case R.id.high_h:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[13]=sound_bool.play(sound_ids[0][13], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[13]);
                    }
                    break;
                case R.id.high_d_c:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[14]=sound_bool.play(sound_ids[0][14], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[14]);
                    }
                    break;
                default:
                    break;
            }
        }
        return false;
    }
}