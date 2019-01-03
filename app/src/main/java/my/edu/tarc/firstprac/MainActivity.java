package my.edu.tarc.firstprac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TextViewMsg; //TextView = a class
                                  //textViewMsg = instance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate() = main() function
        super.onCreate(savedInstanceState);
        //Display UI
        //R = resource class
        //layout = is a folder
        setContentView(R.layout.activity_main);


        //Link UI to program
        TextViewMsg = (TextView) findViewById(R.id.TextViewMessage);
    }

    public void showMessage(View view){
        TextViewMsg.setText("Hello, I am Wong Yong Xian");
    }

    public void clearMessage(View view){
        TextViewMsg.setText("");
    }

}

