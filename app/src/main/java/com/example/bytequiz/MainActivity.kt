package com.example.bytequiz

import android.animation.ObjectAnimator
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val progressBar: ProgressBar = findViewById(R.id.progressBar)
        val color = ContextCompat.getColor(this, R.color.violet)
        val colorStateList = ColorStateList.valueOf(color as Int)
        progressBar.setProgressTintList(colorStateList)
        progressBar.max = 500
        val currentProgress = 600

        ObjectAnimator.ofInt(progressBar, "progress", currentProgress)
            .setDuration(2000)
            .start()

    }
}

class ContextCompat {
    companion object {
        fun getColor(mainActivity: MainActivity, customProgressColor: Any) {

        }
    }

}
