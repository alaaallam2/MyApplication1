package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemClickListener
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView

class MainActivity6  : AppCompatActivity() {


    var images = intArrayOf(
        R.drawable.one,
        R.drawable.two,
        R.drawable.three,
        R.drawable.four,
        R.drawable.five,
        R.drawable.six
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        val sliderView = findViewById<com.smarteist.autoimageslider.SliderView>(R.id.image_slider)

        val sliderAdapter = SliderAdapter(images)
        sliderView.setSliderAdapter(sliderAdapter)
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM)
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION)
        sliderView.startAutoCycle()
        val listView = findViewById<View>(R.id.list_view) as ListView
        val search = findViewById<SearchView>(R.id.search)
        val values = arrayOf(
            "marijuana", "opium", "heroin", "ketamine ", "LSD", "ecstasy pills",
            "Cocaine",
            "amphetamine"
        )
        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, values
        )

        listView.setAdapter(adapter)
        listView.adapter = adapter
        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                search.clearFocus()
                if (values.contains(query)) {
                    adapter.filter.filter(query)


                } else {
                    Toast.makeText(applicationContext, "the drug not found", Toast.LENGTH_LONG)
                        .show()
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }
        }
        )

        listView.setOnItemClickListener(OnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                val myintent = Intent(view.context, MainActivity7::class.java)
                startActivityForResult(myintent, 0)
            }
            if (position == 1) {
                val myintent = Intent(view.context, MainActivity8::class.java)
                startActivityForResult(myintent, 0)
            }
            if (position == 2) {
                gotoUrl("https://www.drugabuse.gov/publications/drugfacts/heroin")
            }
            if (position == 3) {
                gotoUrl("https://www.rxlist.com/ketamine-hydrochloride-side-effects-drug-center.htm#overview")
            }
            if (position == 4) {
                gotoUrl("https://www.verywellmind.com/the-effects-of-lsd-on-the-brain-67496")
            }
            if (position == 5) {
                gotoUrl("https://www.mydr.com.au/addictions/ecstasy-effects-on-the-body/")
            }
            if (position == 6) {
                gotoUrl("https://www.drugabuse.gov/publications/research-reports/cocaine/what-are-short-term-effects-cocaine-use")
            }
            if (position == 7) {
                gotoUrl("https://www.healthline.com/health/drugs/amphetamine-oral-tablet")
            }
        })

    }
    private fun gotoUrl(s: String) {
        val uri = Uri.parse(s)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }
}