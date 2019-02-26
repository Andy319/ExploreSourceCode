package andy319.io.exploresourcecode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.SparseArray;

import okhttp3.Call;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    public void test(){


        SparseArray sparseArray=new SparseArray();
        for(int i=0;i<sparseArray.size();i++){
            sparseArray.valueAt(i);
        }
    }



}
