package com.example.fibonaccirv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.MainActivity.databinding.ActivityMainBinding
import com.example.fibonaccirv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        fibonacciNumbers()

    }
    fun fibonacciNumbers(){
        var a = 0
        var b = 1
        var d: Int

//        println("Fibonacci numbers up to 200:")
//        print("$a, $b")
        var numbers_list= mutableListOf<Int>(a,b)
        while (true) {

            d = a + b
            if (d > 100)
                break

            numbers_list.add(d)

            a = b
            b = d
        }
        binding.rvfibonacci.layoutManager=LinearLayoutManager(this)
        var numbersAdapter=RVfibonacci(numbers_list)
        binding.rvfibonacci.adapter=numbersAdapter
    }


}

