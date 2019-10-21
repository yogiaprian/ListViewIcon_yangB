package com.yogiapp.listviewicon

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview =  findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ruby", "Ruby is an open-source and fully object-oriented programming language.", R.drawable.ruby))
        list.add(Model("Rails", "Ruby on Rails is a server-side web application development framework written in Ruby language.", R.drawable.rails))
        list.add(Model("Python", "Python is interpreted scripting and object-oriented programming language.", R.drawable.pyton))
        list.add(Model("JavaScript", "JavaScript is an object-based scripting language.", R.drawable.java))
        list.add(Model("PHP", "PHP is an interpreted language, i.e., there is no need for compilation", R.drawable.php))

        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0 ){
                Toast.makeText(this@MainActivity, "Anda Memilih Ruby", Toast.LENGTH_LONG).show()
            }
            if (position == 1 ){
                Toast.makeText(this@MainActivity, "Anda Memilih Rails", Toast.LENGTH_LONG).show()
            }
            if (position == 2 ){
                Toast.makeText(this@MainActivity, "Anda Memilih Python", Toast.LENGTH_LONG).show()
            }
            if (position == 3 ){
                Toast.makeText(this@MainActivity, "Anda Memilih JavaScript", Toast.LENGTH_LONG).show()
            }
            if (position == 4 ){
                Toast.makeText(this@MainActivity, "Anda Memilih PHP", Toast.LENGTH_LONG).show()
            }
        }
    }
}
