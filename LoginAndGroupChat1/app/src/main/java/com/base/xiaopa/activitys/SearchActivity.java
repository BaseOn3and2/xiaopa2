package com.base.xiaopa.activitys;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


import com.xiaopa.android.R;

/**
 * Created by Ivan on 2017/11/13.
 */

public class SearchActivity extends AppCompatActivity{
    ImageView mSearch;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }
}
