package edu.temple.diceroll

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

class DiceViewModel : ViewModel() {
    private val _diceValue = MutableLiveData<Int>()
    val diceValue: LiveData<Int> = _diceValue

    fun rollDice(sides:Int){
        _diceValue.value = Random.nextInt(1,sides+1)
    }
}