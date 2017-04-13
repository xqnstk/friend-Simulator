package kr.hs.emirim.xqnstk.friendsimulator.kimseoyoon;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG="김서윤:Main";
    private ImageView mImageViewFriendVisual;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate 메소드 호출-");
        setContentView(R.layout.activity_main);
        mImageViewFriendVisual=(ImageView)findViewById(R.id.freind_visual);
        Log.d(TAG,"activity_main 레이아웃 세팅-");
        mMediaPlayer = MediaPlayer.create(this, R.raw.음성녹음00003);
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();
        //mVib = (Vibrator) getSystemService(VIBRATOR_SERVICE);
       // mVib = Vibrate(500);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMediaPlayer.pause();
        mMediaPlayer.stop();
    }

    void onClick(View view){
        Log.d(TAG,"onClick 메소드 호출-");
        Log.d(TAG,"클릭된 뷰 id :"+view.getId());

        if(mMediaPlayer.isPlaying()) {
            mMediaPlayer.pause();
        }

        switch (view.getId()){
            case R.id.button1:
                Log.d(TAG,"버튼 1 클릭");
                Intent intent = new Intent(this, ResponceActivity.class);
                startActivity(intent);
//                mImageViewFriendVisual.setImageResource(R.drawable.fri1);
//                Toast.makeText(this, "오늘 밥 뭐 나와", Toast.LENGTH_SHORT).show();
//                mMediaPlayer = MediaPlayer.create(this, R.raw.음성녹음00003);
//                mMediaPlayer.start();
                break;
            case R.id.button2:
                Log.d(TAG,"버튼 2 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.fri2);
                Toast.makeText(this, "마자마자", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Log.d(TAG,"버튼 3 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.fri3);
                Toast.makeText(this, "갠자나 갠자나", Toast.LENGTH_SHORT).show();
                break;

            default :
                Log.e(TAG,"모르는 녀석 클릭");
                Toast.makeText(this, "뭐라하는지 모르겠어용", Toast.LENGTH_SHORT).show();
                break;
        }
        Log.d(TAG,"onClick 메소드 무사히 종료");

    }
}