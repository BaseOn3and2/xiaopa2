package com.base.xiaopa.activitys;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.base.xiaopa.Adapter.GroupAdapter;
import com.base.xiaopa.Adapter.TrendsAdapter;
import com.base.xiaopa.constant.GroupBean;
import com.base.xiaopa.constant.TrendsBean;
import com.base.xiaopa.util.GroupUtils;
import com.base.xiaopa.util.TrendsUtils;
import com.base.xiaopa.view.SearchView;
import com.xiaopa.android.R;

import java.util.ArrayList;

/**
 * Created by Ivan on 2017/11/13.
 */

public class CompeteActivity  extends Fragment {

    private ListView lv_compete;
    Context mcontext;
    View v;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.activity_chat,container,false);
        mcontext = getContext();
        lv_compete = (ListView)v.findViewById(R.id.lv_compete);

        //获取群组数据用list封装
        ArrayList<TrendsBean> allGroup = TrendsUtils.getAllCompete(getContext());
        //创建Adapter设置给listView
        TrendsAdapter TrendsAdapter = new TrendsAdapter(getContext(),allGroup);
        lv_compete.setAdapter(TrendsAdapter);
        return v;
    }
}
