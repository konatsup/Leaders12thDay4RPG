package answer.dev3

/**
 * Dev3
 * attackとguardメソッドをスライムに増やす
 * attackメソッドはスライムの攻撃力分だけ勇者にダメージを与える
 * guardメソッドは乱数でtrueかfalseを返す
 */

/*
戦闘開始!!
勇者 が現れた!!
勇者のHP: 30
スライム のターン
スライム の攻撃!!
勇者のHP: 25
スライム は防御した!!
防御成功！！
 */

import kotlin.random.Random

fun main() {
    println("戦闘開始!!")
    val hero: Hero = Hero()
    println("${hero.name} が現れた!!")

    // 勇者のHPの表示
    println("${hero.name}のHP: ${hero.hp}")

    val slime1: Slime = Slime("スライム")
    println("${slime1.name} のターン")

    // スライムが勇者を攻撃する
    println("${slime1.name} の攻撃!!")
    slime1.attack(hero)

    // 勇者のHPの表示
    println("${hero.name}のHP: ${hero.hp}")

    // スライムの防御の結果を表示する
    println("${slime1.name} は防御した!!")
    val result: Boolean = slime1.guard()
    if (result) {
        println("防御成功！！")
    } else {
        println("防御失敗...")
    }

}

class Slime(val name: String) {
    val color: String = "BLUE"
    var hp: Int = 10
    val attackPoint: Int = 5 // 攻撃力
    val defensePoint: Int = 2 // 防御力

    // attackメソッドの宣言
    fun attack(target: Hero) {
        target.hp = target.hp - attackPoint
    }

    // guardメソッドの宣言(返り値の型はBoolean, Random.nextBoolean()を使用、kotlin.random.Randomをimport)
    fun guard(): Boolean {
        return Random.nextBoolean()
    }
}

class Hero {
    val name: String = "勇者"
    var hp: Int = 30
}
