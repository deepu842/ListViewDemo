package in.flatlet.listviewdemo;

import android.app.Activity;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=(ListView)findViewById(R.id.list_item);
        listView.setOnItemClickListener(this);
    }


        public void onItemClick(AdapterView<?> arg0,View arg1,int arg2,long arg3){
            String str=listView.getItemAtPosition(arg2).toString();
            Toast.makeText(this,"you clicked at "+str,Toast.LENGTH_LONG).show();

        }

    }

