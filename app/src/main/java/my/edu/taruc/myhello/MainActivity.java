package my.edu.taruc.myhello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewMessage;
    ImageView imageViewunSad;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //show UI
        setContentView(R.layout.activity_main);

        // Link UI to program
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
        imageViewunSad = (ImageView)findViewById(R.id.imageView);
    }

    public void showMessage(View view){
        textViewMessage.setText("Welcome to Android.");
    }

    public void backMessage(View view){
        textViewMessage.setText("Hehe, U r back!");
        imageViewunSad.setVisibility(View.VISIBLE);
    }

    public void hidePicture(View view){

        if(count%2 == 0){
            imageViewunSad.setVisibility(View.INVISIBLE);
        }else{
            imageViewunSad.setVisibility(View.VISIBLE);
        }
        count++;
    }
}
