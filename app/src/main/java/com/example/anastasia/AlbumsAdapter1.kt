package com.example.anastasia

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class AlbumsAdapter1 : RecyclerView.Adapter<AlbumsAdapter1.AlbumViewHolder>() {

    private val albumList = Album1.albumList()
    private val roundAlbum = Album.albumList()
    class AlbumViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val imageView: ImageView = itemView.findViewById(R.id.pictures)
        private val imageView1: ImageView =itemView.findViewById(R.id.imageView)
        fun bind(album1: Album1) {
            Glide.with(imageView.context).load(album1.image).into(imageView)
        }
        fun bind1(album: Album) {
            Glide.with(imageView.context).load(album.image).into(imageView1)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AlbumViewHolder {
        return AlbumViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.picture_single, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album1: Album1 = albumList[position]
        holder.bind(album1)
        val roundAlbum: Album = roundAlbum[position]
        holder.bind1(roundAlbum)
    }
    override fun getItemCount() = albumList.size
}