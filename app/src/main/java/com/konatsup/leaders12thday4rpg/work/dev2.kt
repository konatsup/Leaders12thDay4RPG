//package dev2
//
///**
// * Dev2
// * 複数のスライムの作成
// * nameの違うスライムを作成する
// * コンストラクタ
// */
//
///*
//戦闘開始!!
//勇者 が現れた!!
//スライム1 のターン
//スライム2 のターン
// */
//
//fun main() {
//    println("戦闘開始!!")
//    val hero: Hero = Hero()
//    println("${hero.name} が現れた!!")
//
//    // [Work] スライム1の生成(インスタンス化)
//
//    println("${slime1.name} のターン")
//
//    // [Work] スライム2の生成(インスタンス化)
//
//    println("${slime2.name} のターン")
//}
//
//// [Work] コンストラクタを追加する
//class Slime {
//    val name: String = "スライム"
//    val color: String = "BLUE"
//    var hp: Int = 10
//    val attackPoint: Int = 5
//    val defensePoint: Int = 2
//}
//
//class Hero {
//    val name: String = "勇者"
//    var hp: Int = 30
//}