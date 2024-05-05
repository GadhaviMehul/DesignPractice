package com.example.anastasia

data class Album1(
    val image: Int
) {
    companion object {
        fun albumList(): List<Album1> {
            return listOf(
                Album1(R.drawable.girl),
                Album1(R.drawable.girls1),
                Album1(R.drawable.brochure),
                Album1(R.drawable.namecard),
                Album1(R.drawable.poster),
                Album1(R.drawable.sticker)

            )
        }
    }
}