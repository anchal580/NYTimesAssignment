package com.nytimes.Adapter

import Results
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nytimes.Activities.DetailActivity
import com.nytimes.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layout_list.view.*

//Adapter Class for Article Listing View

class ListAdapter(private val arrList: Array<Results>) : RecyclerView.Adapter<CustomViewHolder>() {

    override fun getItemCount() = arrList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellRow = layoutInflater.inflate(R.layout.layout_list, parent, false)
        return CustomViewHolder(cellRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindItems(arrList[position])
    }
}

//viewholder class
class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bindItems(results: Results) {
        try {

            itemView.title.text = results.title
            itemView.name.text = results.byline
            itemView.date.text = results.published_date

            Picasso.get().load(results.media?.get(0)?.mediametadata?.get(0)?.url).into(itemView.profile_image)


            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra("detail", results)
                itemView.context.startActivity(intent)
            }


        } catch (e: Exception) {
            println(e.message)
        }
    }

}


