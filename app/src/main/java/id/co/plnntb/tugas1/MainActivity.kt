package id.co.plnntb.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnlogin.setOnClickListener {
            val userName = username.text.toString()
            val passwd = password.text.toString()


            //cek username dan password sudah benar apa tidak
            if(userName.equals("admin") && passwd.equals("admin")){
                //jika sudah benar, start HomeActivity
                val intentHome = Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
                finish()
            }else{
                Toast.makeText(this, "Username atau password yang anda masukkan salah!!", LENGTH_LONG).show()
            }

        }
    }
}
