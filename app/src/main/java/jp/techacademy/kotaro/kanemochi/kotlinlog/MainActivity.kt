package jp.techacademy.kotaro.kanemochi.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import jp.techacademy.taro.kirameki.kotlinlog.Dog
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
//
//        dog.move()

        val human1 = Human("taro", 18, "tennis")
        human1.say()
        human1.think()

        val human2 = Human("jiro", 17, "soccer")
        human2.say()
        human2.think()



//        dog.say()
//        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")
//
//        val bigdog = BigDog("ヨーゼフ", 15)     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る
//
//        bigdog.say()
//        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")
    }

}
