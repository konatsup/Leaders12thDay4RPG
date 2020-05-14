package answer.dev4

/**
 * Dev4
 * デーモンの生成
 * スライムと同じくname, hp, attackPoint, defencePoint, attack(), guard()を持っている
 * しかし、colorは持っていない
 * class, インスタンス化
 */

/*
戦闘開始!!
勇者 が現れた!!
勇者のHP: 30
スライム のターン
スライム の攻撃!!
勇者のHP: 25
デーモン のターン
デーモン の攻撃!!
勇者のHP: 15
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

    // デーモンの生成
    val demon: Demon = Demon("デーモン")
    println("${demon.name} のターン")

    // デーモンが勇者を攻撃する
    println("${demon.name} の攻撃!!")
    demon.attack(hero)

    // 勇者のHPの表示
    println("${hero.name}のHP: ${hero.hp}")

}

class Slime(val name: String) {
    val color: String = "BLUE"
    var hp: Int = 10
    val attackPoint: Int = 5
    val defensePoint: Int = 2

    fun attack(target: Hero) {
        target.hp = target.hp - attackPoint
    }

    fun guard(): Boolean {
        return Random.nextBoolean()
    }
}

// Demonクラスの定義(hp: 5, attackPoint: 10, defensePoint: 2)
class Demon(val name: String) {
    var hp: Int = 5
    val attackPoint: Int = 10
    val defensePoint: Int = 2

    fun attack(target: Hero) {
        target.hp = target.hp - attackPoint
    }

    fun guard(): Boolean {
        return Random.nextBoolean()
    }
}

class Hero {
    val name: String = "勇者"
    var hp: Int = 30
}


