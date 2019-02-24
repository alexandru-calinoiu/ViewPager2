package agilefreaks.com.viewpage2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cheeses = arrayOf("Abbaye de Timadeuc", "Baladi", "Paesanella Caciotta")
        view_pager.adapter = CheesePagerAdapter(cheeses)
        view_pager.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}
