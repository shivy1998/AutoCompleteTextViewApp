package lockdown.org.actvapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    AutoCompleteTextView actv;
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        actv = findViewById(R.id.actv);

        ArrayList al = new ArrayList();
        al.add("Python ");
        al.add("PHP ");
        al.add("PERL ");
        al.add("Android ");
        al.add("Apple ");
        ArrayAdapter aa = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,al);
        actv.setAdapter(aa);
        actv.setThreshold(1);
    }
}
