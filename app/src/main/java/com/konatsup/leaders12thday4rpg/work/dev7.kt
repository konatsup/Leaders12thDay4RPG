//package dev7
//
///**
// * Dev7
// * ドラゴンとオーガの技を特殊技としてまとめる
// * DragonとOgreはSpecialSkillを実装する
// * specialSkill()というメソッド名でそれぞれの特殊技を発動する
// * インターフェース, オーバーライド
// */
//
///*
//戦闘開始!!
//勇者 が現れた!!
//勇者のHP: 100
//スライム1 の攻撃!!
//勇者のHP: 95
//スライム2 の攻撃!!
//勇者のHP: 90
//デーモン の攻撃!!
//勇者のHP: 80
//ドラゴン の攻撃!!
//勇者のHP: 60
//オーガ の攻撃!!
//勇者のHP: 50
//ドラゴン は火を吹いた!!
//勇者のHP: 10
//オーガ のスラッシュ!!
//勇者のHP: -20
// */
//
//import kotlin.random.Random
//
//fun main() {
//    println("戦闘開始!!")
//    val hero: Hero = Hero()
//    println("${hero.name} が現れた!!")
//
//    // 勇者のHPの表示
//    println("${hero.name}のHP: ${hero.hp}")
//
//    // モンスターのインスタンスを生成
//    val slime1: Slime = Slime("スライム1")
//    val slime2: Slime = Slime("スライム2")
//    val demon: Demon = Demon("デーモン")
//    val dragon: Dragon = Dragon("ドラゴン")
//    val ogre: Ogre = Ogre("オーガ")
//
//    // モンスターのリストを作成
//    val monsters: Array<Monster> = arrayOf(slime1, slime2, demon, dragon, ogre)
//
//    // モンスターのリストから1体ずつ攻撃していく
//    for (monster: Monster in monsters) {
//        println("${monster.name} の攻撃!!")
//        monster.attack(hero)
//        println("${hero.name}のHP: ${hero.hp}")
//    }
//
//    // ドラゴンの特殊技を発動する
//    dragon.specialSkill(hero)
//    println("${hero.name}のHP: ${hero.hp}")
//
//    // オーガの必殺技で勇者を攻撃する
//    ogre.specialSkill(hero)
//    println("${hero.name}のHP: ${hero.hp}")
//
//}
//
//abstract class Monster {
//    abstract val name: String
//    abstract var hp: Int
//    abstract val attackPoint: Int
//    abstract val defensePoint: Int
//
//    fun attack(target: Hero) {
//        target.hp = target.hp - attackPoint
//    }
//
//    fun guard(): Boolean {
//        return Random.nextBoolean()
//    }
//}
//
//class Slime(override val name: String) : Monster() {
//    override var hp: Int = 10
//    override val attackPoint: Int = 5
//    override val defensePoint: Int = 2
//    val color: String = "BLUE"
//}
//
//class Demon(override val name: String) : Monster() {
//    override var hp: Int = 5
//    override val attackPoint: Int = 10
//    override val defensePoint: Int = 2
//}
//
//// [Work] DragonクラスにSpecialSkillというインターフェースを実装
//class Dragon(override val name: String) : Monster() {
//    override var hp: Int = 50
//    override val attackPoint: Int = 20
//    override val defensePoint: Int = 10
//
//    // [Work] 特殊技を実装する
//
//
//}
//
//// [Work] OgreクラスにSpecialSkillというインターフェースを実装
//class Ogre(override val name: String) : Monster() {
//    override var hp: Int = 50
//    override val attackPoint: Int = 10
//    override val defensePoint: Int = 20
//
//    // [Work] 特殊技を実装する
//
//
//}
//
//// [Work] SpecialSkillというインターフェースの宣言
//
//
//class Hero {
//    val name: String = "勇者"
//    var hp: Int = 100
//}