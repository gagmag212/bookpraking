package buu.informatics.s59160631.bookparking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        //var name1 = ""
        //var number1 = ""
        //var brand1 = ""



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var prak11 = ""
        var prak21 = ""
        var prak31 = ""

        if(prak11 == ""){
            prak1.setText("ว่าง")
        }
        if(prak21 == ""){
            prak2.setText("ว่าง")
        }
        if(prak31 == ""){
            prak3.setText("ว่าง")
        }
    }
}
