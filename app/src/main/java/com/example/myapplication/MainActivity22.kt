package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity22 : AppCompatActivity() {
    private lateinit var newRecyclerView :RecyclerView
    private lateinit var newArrayList :ArrayList<news>
    lateinit var imageId :Array<Int>
    lateinit var heading :Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main22)
        imageId = arrayOf(
            R.drawable.re1,
            R.drawable.re2,
            R.drawable.re3,
            R.drawable.r4,
        )
        heading= arrayOf(
            "Esraa\n" + "recovering from heroin addiction",
            "Nehal\n" +
                    "Jumana\n" +
                    "Recovering from cocaine addiction",
            "Sandra\n" +
                    "recovering from heroin addiction ",
            "Mohammed\n" +
                    "recovering from heroin LSD"

        )
        newRecyclerView=findViewById(R.id.rcyclerview)
        newRecyclerView.layoutManager=LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf<news>()
        getUserdata()

    }

    private fun getUserdata() {
        for (i in imageId.indices){
            val news=news(imageId[i],heading[i])
            newArrayList.add(news)
        }
        var adapter=MyAdapter(newArrayList)
        newRecyclerView.adapter=adapter
        adapter.setOnItemClickListener(object :MyAdapter.onItemCLickListener{
            override fun onItemClick(position: Int ) {

                if (position == 0) {

                    val myintent = Intent(this@MainActivity22, MainActivity23::class.java)
                    startActivityForResult(myintent, 0)
                }

                if (position ==1) {

                    val myintent = Intent(this@MainActivity22, MainActivity24::class.java)
                    startActivityForResult(myintent, 0)
                }
                if (position ==2) {

                    val myintent = Intent(this@MainActivity22, MainActivity25::class.java)
                    startActivityForResult(myintent, 0)
                }
                if (position ==3) {

                    val myintent = Intent(this@MainActivity22, MainActivity27::class.java)
                    startActivityForResult(myintent, 0)
                }

            }

        })
    }
}
