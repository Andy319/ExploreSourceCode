package andy319.io.exploresourcecode;

import android.app.Activity;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.SparseArray;


public class MainActivity extends Activity {

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
