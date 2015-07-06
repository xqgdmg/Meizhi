package me.drakeet.meizhi

import org.litepal.LitePalApplication
import org.litepal.tablemanager.Connector

/**
 * Created by drakeet on 7/3/15.
 */
class App : LitePalApplication() {

    override fun onCreate() {
        super.onCreate()
        val db = Connector.getDatabase()
    }
}