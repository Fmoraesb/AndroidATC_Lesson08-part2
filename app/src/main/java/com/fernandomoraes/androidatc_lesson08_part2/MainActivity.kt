package com.fernandomoraes.androidatc_lesson08_part2

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Faz as bordas da Web View serem transparentes
        MyWebView.setBackgroundColor(Color.TRANSPARENT)

        //Permite a Web View usar JavaScript
        MyWebView.settings.javaScriptEnabled = true

        //Carrega automaticamente as imagens dos sites
        MyWebView.settings.loadsImagesAutomatically = true

        //Permite scrollar
        MyWebView.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY

        //Mostra qual será a primeira url a ser visitada
        MyWebView.loadUrl("https://stackoverflow.com/")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.lb_Item01 -> {
                Toast.makeText(
                    this, "$item is selected",
                    Toast.LENGTH_SHORT
                ).show()
            }
            R.id.lb_Item02 -> {
                Toast.makeText(
                    this, "$item is selected",
                    Toast.LENGTH_SHORT
                ).show()
            }
            R.id.lb_Item03 -> {
                Toast.makeText(
                    this, "$item is selected",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        return true;
    }
}