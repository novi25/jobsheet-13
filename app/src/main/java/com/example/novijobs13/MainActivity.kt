package com.example.novijobs13
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.jobsheet13_mita.R

class MainActivity : AppCompatActivity() {
    private lateinit var namaEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var nisEdit: EditText
    private lateinit var submitBtn: Button
    private val NAME_KEY: String = "nama"
    private val AGE_KEY: String = "kelas"
    private val Nis_KEY: String = "nis"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaEdit = findViewById(R.id.namaEdit)
        kelasEdit = findViewById(R.id.kelasEdit)
        nisEdit = findViewById(R.id.NisEdit)
        submitBtn = findViewById(R.id.submitBtn)
        submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(AGE_KEY, kelasEdit.text.toString())
            startActivity(intent)
        }
    }
