package com.example.a19478881_luuducanh_ad_todoapp

interface DeleteAndUpdate{
    fun modifyItem(itemUID : String , isDone : Boolean)
    fun onItemDelete(itemUID : String)

}