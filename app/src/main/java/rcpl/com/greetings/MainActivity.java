package rcpl.com.greetings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView)findViewById(R.id.textView);
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("HH");
        String formattedDate = df.format(c.getTime());
        int time=Integer.parseInt(formattedDate);
        if(time>=6&&time<12)
            s="Good Moring, Vaibhav!";
        else if(time>=12&&time<17)
            s="Good Afternoon Vaibhav!";
        else if(time>=17&&time<21)
            s="Good Evening, Vaibhav!";
        else if(time>=21&&time<6)
            s="Good Night, Vaibhav!";
        tv.setText(s);
    }
}
