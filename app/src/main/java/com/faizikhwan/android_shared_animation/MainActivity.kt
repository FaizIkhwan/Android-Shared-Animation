package com.faizikhwan.android_shared_animation

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.util.Pair
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_layout.setOnClickListener {
            val intent = Intent(this, FollowMeActivity::class.java)

            val p1 = Pair.create<View, String>(iv_profile_pic_small, "imageTransition")
            val p2 = Pair.create<View, String>(tv_title, "nameTransition")
            val p3 = Pair.create<View, String>(tv_desc, "descTransition")

            val option = ActivityOptions.makeSceneTransitionAnimation(this, p1, p2, p3)
            startActivity(intent, option.toBundle())
        }
    }
}
