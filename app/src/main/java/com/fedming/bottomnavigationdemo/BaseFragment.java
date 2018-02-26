package com.fedming.bottomnavigationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alamkanak.weekview.WeekView;

/**
 * Created by bruce on 2016/11/1.
 * BaseFragment
 */

public class BaseFragment extends Fragment {
    private WeekView mWeekView;
    public static BaseFragment newInstance(String info) {
        Bundle args = new Bundle();
        BaseFragment fragment = new BaseFragment();
        args.putString("info", info);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=null;
//        通过不同的newInstance传入的参数控制Fragment的布局信息。
//        注意信息的重复刷新。
//        信息的重复获取是本次毕业设计的最大的难点。
//        以及包括服务器的设计和架设。
//        这里将会是项目结构逻辑最复杂的实习地方。
//        写于2018/2/25   航海楼
//        学习fragment的笔记。


        if (getArguments().getString("info")!="聊天"){
            view= inflater.inflate(R.layout.fragment_base, null);
            TextView tvInfo = (TextView) view.findViewById(R.id.textView);
            tvInfo.setText(getArguments().getString("info"));
        }else{
            view=view= inflater.inflate(R.layout.testlayout, null);
        }
        return view;
    }
}
