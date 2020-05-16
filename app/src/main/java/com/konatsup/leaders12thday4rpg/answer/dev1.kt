package answer.dev1

/**
 * Dev1
 * スライムの生成
 * スライムの持っているプロパティを表示する
 */

/*
戦闘開始!!
勇者 が現れた!!
スライム のターン
スライムの色: BLUE
スライムのHP: 10
スライムの攻撃力: 5
スライムの防御力: 2
 */

fun main() {
    println("戦闘開始!!")
    val hero: Hero = Hero()
    println("${hero.name} が現れた!!")

    // スライムの生成(インスタンス化)
    val slime1: Slime = Slime()
    println("${slime1.name} のターン")

    println("${slime1.name}の色: ${slime1.color}")
    println("${slime1.name}のHP: ${slime1.hp}")
    println("${slime1.name}の攻撃力: ${slime1.attackPoint}")
    println("${slime1.name}の防御力: ${slime1.defensePoint}")
}

// Slimeクラスの定義
class Slime {
    val name: String = "スライム"
    val color: String = "BLUE"
    var hp: Int = 10
    val attackPoint: Int = 5 // 攻撃力
    val defensePoint: Int = 2 // 防御力
}

class Hero {
    val name: String = "勇者"
    var hp: Int = 30
}
