package kr.hs.emirim.xqnstk.friendsimulator.kimseoyoon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG="김서윤:Main";
    private ImageView mImageViewFriendVisual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate 메소드 호출-");
        setContentView(R.layout.activity_main);
        mImageViewFriendVisual=(ImageView)findViewById(R.id.freind_visual);
        Log.d(TAG,"activity_main 레이아웃 세팅-");

    }
    void onClick(View view){
        Log.d(TAG,"onClick 메소드 호출-");
        Log.d(TAG,"클릭된 뷰 id :"+view.getId());

        switch (view.getId()){
            case R.id.button1:
                Log.d(TAG,"버튼 1 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.fri1);
                Toast.makeText(this, "잠시만 이 쪽으로 와주시겠습니까", Toast.LENGTH_SHORT).show();
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