package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity5 : AppCompatActivity() {
    private lateinit var newRecyclerView :RecyclerView
    private lateinit var newArrayList :ArrayList<news>
    lateinit var imageId :Array<Int>
    lateinit var heading :Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        imageId = arrayOf(
            R.drawable.drugs,
            R.drawable.a,
            R.drawable.b,
            R.drawable.f,
        )
        heading= arrayOf(
            "type of drug from A_Z",
            "Frequently  questions about drugs",
            "True Stories of Addiction Recovery ",
            "Ranking of people recovering from addiction"

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

                    val myintent = Intent(this@MainActivity5, MainActivity6::class.java)
                    startActivityForResult(myintent, 0)
                }

                if (position ==1) {

                    val myintent = Intent(this@MainActivity5, MainActivity9::class.java)
                    startActivityForResult(myintent, 0)
                }
                if (position ==2) {

                    val myintent = Intent(this@MainActivity5, MainActivity22::class.java)
                    startActivityForResult(myintent, 0)
                }
                if (position ==3) {

                    val myintent = Intent(this@MainActivity5, MainActivity20::class.java)
                    startActivityForResult(myintent, 0)
                }

            }

        })
    }
    }
