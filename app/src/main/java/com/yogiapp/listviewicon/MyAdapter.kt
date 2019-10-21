package com.yogiapp.listviewicon

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MyAdapter (var mCtx:Context, var resources:Int, var items:List<Model>):
    ArrayAdapter<Model>(mCtx, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView:ImageView = view.findViewById(R.id.image)
        val titleTextView:TextView = view.findViewById(R.id.textView1)
        val descritionTextView:TextView = view.findViewById(R.id.textView2)

        var mItem:Model = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title
        descritionTextView.text = mItem.description


        return view
    }
}