package answer.dev0

/**
 * Dev0
 * 最初のコード
 * 勇者(Hero) をインスタンス化し、そのオブジェクトを使ってprintする
 * クラス, インスタンス化
 */

fun main() {
    println("戦闘開始!!")
    // [Work] Heroのインスタンスを生成
    val hero: Hero = Hero()
    println("${hero.name} が現れた!!")
}

class Hero {
    val name: String = "勇者"
    var hp: Int = 30
}
