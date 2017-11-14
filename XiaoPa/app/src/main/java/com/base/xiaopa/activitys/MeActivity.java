package com.base.xiaopa.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.base.xiaopa.base.BaseFragment;
import com.base.xiaopa.model.UserModel;
import com.xiaopa.android.R;

import butterknife.OnClick;
import cn.bmob.newim.BmobIM;

/**
 * Created by Ivan on 2017/10/10.
 */

public class MeActivity extends Fragment implements View.OnClickListener {
    View v;
    private  Button bt_unlogin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.activity_me,container,false);
        bt_unlogin = (Button)v.findViewById(R.id.bt_unlogin);
        bt_unlogin.setOnClickListener(this);
        return v;
    }


    public void unlogin() {
        UserModel.getInstance().logout();
        //TODO 连接：3.2、退出登录需要断开与IM服务器的连接
        BmobIM.getInstance().disConnect();
        getActivity().finish();
        Intent i=new Intent(getContext(),Log_RegActivity.class);
        startActivity(i);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bt_unlogin:
                unlogin();
                break;
            default :
                break;
        }
    }
}

