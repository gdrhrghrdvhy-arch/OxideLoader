package com.oxide.cheat;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            System.loadLibrary("oxide_cheat");
            Toast.makeText(this, "Чит загружен!", Toast.LENGTH_SHORT).show();
        } catch (Throwable e) {
            Toast.makeText(this, "Ошибка: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
        try {
            Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.catsbit.oxidesurvivalisland");
            if (launchIntent != null) startActivity(launchIntent);
        } catch (Exception e) {}
        finish();
    }
}
