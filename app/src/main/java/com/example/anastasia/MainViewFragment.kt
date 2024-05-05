package com.example.anastasia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView

class MainViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_main_view, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerViewProfile: RecyclerView = view.findViewById(R.id.recycler_view)
        val adapter = AlbumsAdapter()
        recyclerViewProfile.adapter = adapter

        val recyclerView: RecyclerView = view.findViewById(R.id.picture_recycler_view)
        val adapterPicture = AlbumsAdapter1()
        recyclerView.adapter=adapterPicture

      /*  recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                // if the recycler view is scrolled
                // above hide the FAB
                if (dy > 10 && recyclerViewProfile.isShown) {
                   recyclerViewProfile.
                }

                // if the recycler view is
                // scrolled above show the FAB
                if (dy < -10 && !recyclerViewProfile.isShown) {
                    recyclerViewProfile.show()
                }

                // of the recycler view is at the first
                // item always show the FAB
                if (!recyclerView.canScrollVertically(-1)) {
                    recyclerViewProfile.show()
                }
            }
        })*/
    }
}