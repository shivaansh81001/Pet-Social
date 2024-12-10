package com.example.petsocial;

import android.animation.ObjectAnimator;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private SwipeRefreshLayout swipeRefreshLayout;
    private ImageView search_;
    private ImageView cross_;
    private ImageView profile_;
    private ImageView saved_;
    private ImageView notifications_;
    private ImageView homeButton_;
    private ImageView addPost_;
    private LinearLayout searchBar_;
    private Boolean isSearchBarvisible=false;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeView();

        swipeRefreshLayout.setOnRefreshListener(this);
        search_.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(!isSearchBarvisible) {
                   searchBar_.setVisibility(View.VISIBLE);
                   isSearchBarvisible = true;
               }else{
                   searchBar_.setVisibility(View.GONE);
                   isSearchBarvisible = false;
               }
           }
       });
    }

    @Override
    public void onRefresh() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(false);
            }
        },3000);
    }

    private void initializeView(){
        swipeRefreshLayout=findViewById(R.id.swipe_refresh);
        search_=findViewById(R.id.search);
        cross_=findViewById(R.id.clear_search_button);
        profile_=findViewById(R.id.profile);
        saved_=findViewById(R.id.saved_posts);
        notifications_=findViewById(R.id.notifications);
        homeButton_=findViewById(R.id.home_button);
        addPost_=findViewById(R.id.add_post);
        searchBar_=findViewById(R.id.search_bar);

    }


}
