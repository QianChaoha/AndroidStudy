package com.example.designsupport;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cqian on 2018/4/16.
 */

public class ThirdActivity extends AppCompatActivity {
    List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        mList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            mList.add("111" + i);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(new MyAdapter());

        Toolbar toolbar=findViewById(R.id.toolBar);
        toolbar.setTitle("AppBarLayout");
    }

    class MyAdapter extends RecyclerView.Adapter {

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view=View.inflate(ThirdActivity.this,R.layout.third_item,null);
            return new Holder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            Holder holder= (Holder) viewHolder;
            holder.mTextView.setText(mList.get(i));
        }

        @Override
        public int getItemCount() {
            return mList.size();
        }
        class Holder extends RecyclerView.ViewHolder{
            TextView mTextView;
            public Holder(View itemView) {
                super(itemView);
                mTextView=itemView.findViewById(R.id.text_view);
            }
        }
    }
}
