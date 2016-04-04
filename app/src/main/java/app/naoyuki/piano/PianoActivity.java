package app.naoyuki.piano;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Naoyuki on 2016/04/03.
 */
public class PianoActivity extends Activity implements View.OnTouchListener {
    final int MAX_SOUND_NUM=5;  //同時になる最大音数
    SoundPool sound_bool;
    int[][] sound_ids;
    int[] stop_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piano);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //音源の用意
        stop_id=new int[25];
        sound_bool=new SoundPool(MAX_SOUND_NUM, AudioManager.STREAM_MUSIC, 0);
        sound_ids=new int[1][25];
        //白鍵の音源
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
        //黒鍵の音源
        sound_ids[0][15]=sound_bool.load(this, R.raw.p_cis, 1);
        sound_ids[0][16]=sound_bool.load(this, R.raw.p_es, 1);
        sound_ids[0][17]=sound_bool.load(this, R.raw.p_fis, 1);
        sound_ids[0][18]=sound_bool.load(this, R.raw.p_as, 1);
        sound_ids[0][19]=sound_bool.load(this, R.raw.p_b, 1);
        sound_ids[0][20]=sound_bool.load(this, R.raw.p_high_cis, 1);
        sound_ids[0][21]=sound_bool.load(this, R.raw.p_high_es, 1);
        sound_ids[0][22]=sound_bool.load(this, R.raw.p_high_fis, 1);
        sound_ids[0][23]=sound_bool.load(this, R.raw.p_high_as, 1);
        sound_ids[0][24]=sound_bool.load(this, R.raw.p_high_b, 1);

        //各鍵盤がクリックされたときの動作
        //白鍵
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
        //黒鍵
        findViewById(R.id.cis).setOnTouchListener(this);
        findViewById(R.id.dis).setOnTouchListener(this);
        findViewById(R.id.fis).setOnTouchListener(this);
        findViewById(R.id.gis).setOnTouchListener(this);
        findViewById(R.id.ais).setOnTouchListener(this);
        findViewById(R.id.high_cis).setOnTouchListener(this);
        findViewById(R.id.high_dis).setOnTouchListener(this);
        findViewById(R.id.high_fis).setOnTouchListener(this);
        findViewById(R.id.high_gis).setOnTouchListener(this);
        findViewById(R.id.high_ais).setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(v!=null){
            switch (v.getId()){
                //白鍵が押されたとき
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
                //黒鍵が押されたとき
                case R.id.cis:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[15]=sound_bool.play(sound_ids[0][15], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[15]);
                    }
                    break;
                case R.id.dis:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[16]=sound_bool.play(sound_ids[0][16], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[16]);
                    }
                    break;
                case R.id.fis:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[17]=sound_bool.play(sound_ids[0][17], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[17]);
                    }
                    break;
                case R.id.gis:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[18]=sound_bool.play(sound_ids[0][18], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[18]);
                    }
                    break;
                case R.id.ais:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[19]=sound_bool.play(sound_ids[0][19], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[19]);
                    }
                    break;
                case R.id.high_cis:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[20]=sound_bool.play(sound_ids[0][20], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[20]);
                    }
                    break;
                case R.id.high_dis:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[21]=sound_bool.play(sound_ids[0][21], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[21]);
                    }
                    break;
                case R.id.high_fis:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[22]=sound_bool.play(sound_ids[0][22], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[22]);
                    }
                    break;
                case R.id.high_gis:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[23]=sound_bool.play(sound_ids[0][23], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[23]);
                    }
                    break;
                case R.id.high_ais:
                    if(event.getAction()==MotionEvent.ACTION_DOWN){     //鍵盤が押下されているとき
                        stop_id[24]=sound_bool.play(sound_ids[0][24], 1.0F, 1.0F, 1, 0, 1.0F);
                    }else if(event.getAction()==MotionEvent.ACTION_UP){ //鍵盤から指が離れたとき
                        sound_bool.stop(stop_id[24]);
                    }
                    break;
                default:
                    break;
            }
        }
        return false;
    }
}