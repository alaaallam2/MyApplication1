package com.example.myapplication

import android.os.Bundle

import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity10 : AppCompatActivity() {
    var menuItem: MenuItem? = null
    // badge text view
    var badgeCounter: TextView? = null

    // change the number to see badge in action
    var pendingNotifications = 7
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        getMenuInflater().inflate(R.menu.menu_notification, menu)
        menuItem = menu.findItem(R.id.nav_notification)
        // check if any pending notification
        if (pendingNotifications == 0) {
            // if no pending notification remove badge
            menuItem?.setActionView(null)
        } else {

            // if notification than set the badge icon layout
            menuItem?.setActionView(R.layout.notification_badge)
            // get the view from the nav item
            val view = menuItem?.getActionView()
            // get the text view of the action view for the nav item
            badgeCounter = view?.findViewById(R.id.badge_counter)
            // set the pending notifications value
            badgeCounter?.setText(pendingNotifications.toString())
        }
        return super.onCreateOptionsMenu(menu)
    }
}
