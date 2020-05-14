//package dev4
//
///**
// * Dev4
// * ドラゴンの生成
// * スライムと同じくname, hp, attackPoint, defencePoint, attack(), guard()を持っている
// * しかし、colorは持っていない
// * class, インスタンス化
// */
//
///*
//戦闘開始!!
//勇者 が現れた!!
//勇者のHP: 30
//スライム のターン
//スライム の攻撃!!
//勇者のHP: 25
//ドラゴン のターン
//ドラゴン の攻撃!!
//勇者のHP: 5
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
//    val slime1: Slime = Slime("スライム")
//    println("${slime1.name} のターン")
//
//    // スライムが勇者を攻撃する
//    println("${slime1.name} の攻撃!!")
//    slime1.attack(hero)
//
//    // 勇者のHPの表示
//    println("${hero.name}のHP: ${hero.hp}")
//
//    // [Work] ドラゴンの生成
//
//    println("${dragon.name} のターン")
//
//    // ドラゴンが勇者を攻撃する
//    println("${dragon.name} の攻撃!!")
//    dragon.attack(hero)
//
//    // 勇者のHPの表示
//    println("${hero.name}のHP: ${hero.hp}")
//
//}
//
//class Slime(val name: String) {
//    val color: String = "BLUE"
//    var hp: Int = 10
//    val attackPoint: Int = 5 // 攻撃力
//    val defensePoint: Int = 2 // 防御力
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
//// [Work] Dragonクラスの定義(hp: 50, attackPoint: 20, defensePoint: 10)
//class Dragon(val name: String) {
//    var hp: Int = 50
//    val attackPoint: Int = 20 // 攻撃力
//    val defensePoint: Int = 10 // 防御力
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
//class Hero {
//    val name: String = "勇者"
//    var hp: Int = 30
//}
//
//
