//Berfungsi sebagai pemanggil paket com.example.happybirthday
package com.example.happybirthday;
//Berfungsi untuk import kelas androidx.appcompat.appAppCompatActivity
import androidx.appcompat.app.AppCompatActivity;
//Berfungsi untuk impor kelas android.os.Bundle
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}