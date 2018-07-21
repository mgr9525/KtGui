
import com.kotlint.stdui.mgr.*
import com.kotlint.stdui.kui.*

class MainWindow:KUIBaseWindow("main.json"){

}

fun main(args:Array<String>){
    println("hello world!${KotlinVersion.CURRENT.toString()}")
    val mgr=getWindowManager()
    mgr.create(0)
    MainWindow().create()
    mgr.update()
}