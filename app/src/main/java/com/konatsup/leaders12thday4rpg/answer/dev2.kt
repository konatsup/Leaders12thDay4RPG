package answer.dev2

/**
 * Dev2
 * 複数のスライムの作成
 * nameの違うスライムを作成する
 * コンストラクタ
 */

/*
戦闘開始!!
勇者 が現れた!!
スライム1 のターン
スライム2 のターン
 */

fun main() {
    println("戦闘開始!!")
    val hero: Hero = Hero()
    println("${hero.name} が現れた!!")

    // スライム1の生成(インスタンス化)
    val slime1: Slime = Slime("スライム1")
    println("${slime1.name} のターン")

    // スライム2の生成(インスタンス化)
    val slime2: Slime = Slime("スライム2")
    println("${slime2.name} のターン")

}

// コンストラクタを追加する
class Slime(val name: String) {
    val color: String = "BLUE"
    var hp: Int = 10
    val attackPoint: Int = 5 // 攻撃力
    val defensePoint: Int = 2 // 防御力
}

class Hero {
    val name: String = "勇者"
    var hp: Int = 30
}