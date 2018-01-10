package com.example.misparking.oldtest.activity;

import android.Manifest;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.misparking.oldtest.utils.Constants;
import com.example.misparking.oldtest.R;

public class MainActivity extends MPermissionsActivity {

    private TextView mTextViewOne, mTextViewTwo;
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initTestFontSize();


    }

    private void init() {
        mTextViewOne = (TextView) this.findViewById(R.id.textView_one);
        mTextViewTwo = (TextView) this.findViewById(R.id.textView_two);

        Log.e(TAG,getPackageName());

    }
    /**
     * 打电话
     *
     * @param view
     */
    public void onClick_phone(View view) {
        requestPermission(new String[]{Manifest.permission.RECORD_AUDIO}, Constants.PERMISSION_CALL_PHONE);
    }

    /**
     * 写SD卡
     *
     * @param view
     */
    public void onClick_sd(View view) {
        requestPermission(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, Constants.PERMISSION_EXTERNAL_STORAGE);
    }

    /**
     * 拍照
     *
     * @param view
     */
    public void onClick_camera(View view) {
        requestPermission(new String[]{Manifest.permission.CAMERA}, Constants.PERMISSION_CAMERA);
    }
    /**
     * 定位
     *
     * @param view
     */
    public void onClick_location(View view) {
        requestPermission(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, Constants.PERMISSION_LOCATION);
    }





    private void initTestFontSize() {
        Resources res = getResources();
        float fontSize = res.getDimension(R.dimen.font_size);

        Log.e("size", "-->" + fontSize);
        Log.e("size", "-->" + fontSize);
    }
}
