package com.example.meashall

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.jvm.internal.Intrinsics

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setSupportActionBar(toolbar)
        supportActionBar?.title="A H M E D"
        navigation.setNavigationItemSelectedListener(this)

        val actionToggle = ActionBarDrawerToggle(this,Drawer,toolbar,R.string.drawer_open,R.string.drawer_close)
        Drawer.addDrawerListener(actionToggle)

        actionToggle.syncState()

    }


    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
      val item=   p0.title
        var about = Intent(this, About::class.java)
        var comu = Intent(this,Comunication::class.java)

        when(item){
            "About Ahmed Hamed"-> startActivity(about)
            "Comunicate with me"-> startActivity(comu)
            "work"-> Toast.makeText(this,"work",Toast.LENGTH_LONG).show()
            "blog"-> Toast.makeText(this,"blog",Toast.LENGTH_LONG).show()
        }
        close()
        onBackPressed()
        return true
    }

    //يقفل القائمة
    //New Apps
    @SuppressLint("WrongConstant")
    private fun close()
    {
        Drawer.closeDrawer(Gravity.START)
    }

    override fun onBackPressed() {
        if(Drawer.isDrawerOpen(GravityCompat.START)){
            close()
        }
        else
        super.onBackPressed()

    }


}
