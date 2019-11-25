package jp.techacademy.kotaro.kanemochi.kotlinlog

import android.util.Log
import jp.techacademy.taro.kirameki.kotlinlog.Movable

open class Human: Animal, Thinkable {
    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    //プロパティ
    override fun say() {
        Log.d("kotlintest","私の名前は" + this.name +"です。" + "年は" + this.age + "歳です。")
    }

    var hobby = "テニス"
    override fun think() {
        Log.d("kotlintest","私は" + this.hobby +"について考える")

    }
}
