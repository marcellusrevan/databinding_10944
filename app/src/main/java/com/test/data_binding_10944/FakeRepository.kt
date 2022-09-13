package com.test.data_binding_10944

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

object FakeRepository {
    private val fruitNames: List<String> = listOf(
            "Apel","Mangga","Pisang","Anggur","Strawberry","Jambu","Rasberri","Bambu","Kiwi","Pir"
    )
    private val _currentRandomFruitName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
    get() = _currentRandomFruitName
    init{
        _currentRandomFruitName.value= fruitNames.first()
    }
    fun getRandomfruitName(): String{
        val random = Random.nextInt(fruitNames.size)
        return fruitNames[random]
    }
    fun changeCurrentRandomFruitName(){
        _currentRandomFruitName.value = getRandomfruitName()
    }
}