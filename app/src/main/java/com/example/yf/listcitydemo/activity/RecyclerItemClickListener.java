package com.example.yf.listcitydemo.activity;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by yf on 02/05/2017.
 * 城市列表的点击事件
 */

public class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {

    private OnItemClickListener clickListener;

    public interface OnItemClickListener {
        /**
         * 点击时的回调
         *
         * @param view
         * @param position 点击的位置
         */
        void onItemClick(View view, int position);
    }

    public RecyclerItemClickListener(OnItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
