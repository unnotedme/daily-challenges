import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Challenge5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge5)

        Challenge5().aspectRatio("https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png")
    }
}