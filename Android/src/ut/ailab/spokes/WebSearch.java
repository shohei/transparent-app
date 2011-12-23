package ut.ailab.spokes;

import android.app.Activity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.widget.EditText;


public class WebSearch extends Activity {
	private EditText et;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		et = (EditText)findViewById(R.id.EditText01);    
    }

    public void browseMethod(View v){
    	//et = setText()
    	
    	//System.out.println(kwd);
    }




}