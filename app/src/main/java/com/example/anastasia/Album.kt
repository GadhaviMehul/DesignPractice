package com.example.anastasia

data class Album(
    val image: Int
) {
    companion object {
        fun albumList(): List<Album> {
            return listOf(
                Album(R.drawable.img_2),
                Album(R.drawable.img_5),
                Album(R.drawable.img_1),
                Album(R.drawable.img_3),
                Album(R.drawable.img_4),
                Album(R.drawable.a1),
                Album(R.drawable.a2),
                Album(R.drawable.a3),
                Album(R.drawable.a4),
                Album(R.drawable.a5)

            )
        }
    }
}