package andy319.io.exploresourcecode;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    public void test() {


        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray.valueAt(i);
        }
    }


}
