package com.example.hw.carmultimedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class MainActivity extends AppCompatActivity {
    /**
     * 底部菜单按钮
     */
    FloatingActionMenu floatingActionMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMenus();
    }

    private void initMenus() {
        ImageView menuimg = (ImageView) findViewById(R.id.menu_img);
        SubActionButton.Builder rLSubBuilder = new SubActionButton.Builder(this);
        ImageView rlIcon1 = new ImageView(this);


        ImageView imagMusi = new ImageView(this);
        ImageView imagPicture = new ImageView(this);
        ImageView imagVideo = new ImageView(this);
        ImageView imagExit = new ImageView(this);


//        rlIcon1.setImageDrawable(getResources().getDrawable(R.drawable.action_edit_light));
        imagMusi.setImageDrawable(getResources().getDrawable(R.drawable.regist_smile_green));
        imagPicture.setImageDrawable(getResources().getDrawable(R.drawable.m_btn_pic_normal));
        imagVideo.setImageDrawable(getResources().getDrawable(R.drawable.m_btn_video_zoom));
        imagExit.setImageDrawable(getResources().getDrawable(R.drawable.abc_ic_clear_search_api_holo_light));

        SubActionButton rlSub1 = rLSubBuilder.setContentView(imagMusi).build();
        SubActionButton rlSub2 = rLSubBuilder.setContentView(imagPicture).build();
        SubActionButton rlSub3 = rLSubBuilder.setContentView(imagVideo).build();
        SubActionButton rlSub4 = rLSubBuilder.setContentView(imagExit).build();
   /*     rlIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //添加
                showAddVideoItemDialog();
            }
        });*/

        imagMusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "imagMusi点击");
            }
        });

        imagPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "imagPicture点击");
            }
        });

        imagVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "imagVideo点击");
            }
        });

        imagExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //退出
                floatingActionMenu.close(true);
            }
        });

        floatingActionMenu = new FloatingActionMenu.Builder(this)
                .setStartAngle(180)//设置扩展菜单的开始结束位置
                .setEndAngle(270)
                .addSubActionView(rlSub1)
                .addSubActionView(rlSub2)
                .addSubActionView(rlSub3)
                .addSubActionView(rlSub4)
                .attachTo(menuimg)
                .build();
    }


}
