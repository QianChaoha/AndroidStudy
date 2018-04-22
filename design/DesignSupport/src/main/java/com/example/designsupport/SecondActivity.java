package com.example.designsupport;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cqian on 2018/4/15.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final TextView textView=findViewById(R.id.textView);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) textView.getLayoutParams();
        SwipeDismissBehavior<TextView> behavior=new SwipeDismissBehavior<>();
        layoutParams.setBehavior(behavior);

        behavior.setListener(new SwipeDismissBehavior.OnDismissListener() {
            @Override
            public void onDismiss(View view) {
                textView.setVisibility(View.GONE);
            }

            @Override
            public void onDragStateChanged(int i) {

            }
        });
    }
}
