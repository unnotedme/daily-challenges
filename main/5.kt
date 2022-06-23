/*
#5 - ratio aspect of an image
difficulty: hard

create a program that is responsible for calculating the ratio aspect of an image from url.
note: this quiz cannot be solved with kotlin online playground. android studio is required.
by ratio we refer, for example, to "16:9" of an image 1920*1080px
*/

import android.graphics.BitmapFactory
import java.net.URL
import kotlin.math.roundToInt

class Challenge5() {

    fun aspectRatio(url: String) {

        Thread {
            var aspectRationStr: String? = null

            val url = URL(url)
            val bitmap = BitmapFactory.decodeStream(url.openStream())

            val height = bitmap.height
            val width = bitmap.width
            val aspectRatio = rationalAspectRatio(height.toDouble() / width.toDouble())
            aspectRationStr = "${aspectRatio.second}:${aspectRatio.first}"

            aspectRationStr?.let { ratio ->
                println("${ratio} is the ratio aspect.")
            } ?: run {
                println("the ratio aspect is not possible to be calculated.")
            }
        }.start()
    }

    data class Quadruple(val h1: Int, val k1: Int, val h: Int, val k: Int)

    private fun rationalAspectRatio(aspectRatio: Double): Pair<Int, Int> {
        val precision = 1.0E-6
        var x = aspectRatio
        var a = x.roundToInt()
        var q = Quadruple(1, 0, a, 1)

        while (x - a > precision * q.k.toDouble() * q.k.toDouble()) {
            x = 1.0 / (x - a)
            a = x.roundToInt()
            q = Quadruple(q.h, q.k, q.h1 + a * q.h, q.k1 + a * q.k)
        }
        return Pair(q.h, q.k)
    }

}