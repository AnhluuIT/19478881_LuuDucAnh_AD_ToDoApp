package com.example.a19478881_luuducanh_ad_todoapp

class ModelActivity {
    companion object Factory{
        fun createList(): ModelActivity = ModelActivity()
    }
    var UID : String? = null
    var itemDataText : String? = null
    var done : Boolean? = false
}