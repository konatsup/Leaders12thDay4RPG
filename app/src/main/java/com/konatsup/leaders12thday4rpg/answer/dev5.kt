package answer.dev5

/**
 * Dev5
 * 大量のモンスターが攻撃してくる(slime1, slime2, demonの3体)
 * 共通の要素を取り出し、抽象化する
 * Monsterクラスを作成し、SlimeとDemonはそれを継承する
 * 継承, 抽象クラス, オーバーライド
 */

/*
戦闘開始!!
勇者 が現れた!!
勇者のHP: 30
スライム の攻撃!!
勇者のHP: 25
スライム2 の攻撃!!
勇者のHP: 20
デーモン の攻撃!!
勇者のHP: 10
 */

import kotlin.random.Random

fun main() {
    println("戦闘開始!!")
    val hero: Hero = Hero()
    println("${hero.name} が現れた!!")

    // 勇者のHPの表示
    println("${hero.name}のHP: ${hero.hp}")

    // モンスターのインスタンスを生成
    val slime1: Slime = Slime("スライム")
    val slime2: Slime = Slime("スライム2")
    val demon: Demon = Demon("デーモン")

    // モンスターのリストを作成
    val monsters: Array<Monster> = arrayOf(slime1, slime2, demon)

    // モンスターのリストから1体ずつ攻撃していく
    for (monster: Monster in monsters) {
        println("${monster.name} の攻撃!!")
        monster.attack(hero)
        println("${hero.name}のHP: ${hero.hp}")
    }

}

// Monsterクラスの定義
abstract class Monster {
    abstract val name: String
    abstract var hp: Int
    abstract val attackPoint: Int
    abstract val defensePoint: Int

    fun attack(target: Hero) {
        target.hp = target.hp - attackPoint
    }

    fun guard(): Boolean {
        return Random.nextBoolean()
    }
}

// Monsterクラスを継承したSlimeクラス
class Slime(override val name: String) : Monster() {
    override var hp: Int = 10
    override val attackPoint: Int = 5
    override val defensePoint: Int = 2
    val color: String = "BLUE"
}

// Monsterクラスを継承したDemonクラス
class Demon(override val name: String) : Monster() {
    override var hp: Int = 5
    override val attackPoint: Int = 10
    override val defensePoint: Int = 2
}

class Hero {
    val name: String = "勇者"
    var hp: Int = 30
}