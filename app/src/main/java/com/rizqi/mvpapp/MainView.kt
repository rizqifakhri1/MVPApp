package com.rizqi.mvpapp

interface MainView {

    // Method untuk menampilkan pesan toast
    fun showMessage(message : String)

    // Method untuk menampilkan data yang telah diproses pada presenter
    fun showData(data:String)

    // Method untuk clear edittext
    fun clearField()
}