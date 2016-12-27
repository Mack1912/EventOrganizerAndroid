package mack.planner.com.partyplanner;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Response;

import org.json.JSONException;
import org.json.JSONObject;

public class HomePageFirstVisit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_first_visit);

        final Button bGetPin = (Button) findViewById(R.id.bGetVerificationPin);
        final EditText etPhone = (EditText) findViewById(R.id.etPhone);

        bGetPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int phone = Integer.parseInt(etPhone.getText().toString());

                AlertDialog.Builder builder = new AlertDialog.Builder(HomePageFirstVisit.this);
                builder.setMessage("Gotcha")
                        .setNegativeButton("Retry", null)
                        .create()
                        .show();
                /*Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            //System.out.println("hello woerld");
                            AlertDialog.Builder builder = new AlertDialog.Builder(HomePageFirstVisit.this);
                            builder.setMessage("Gotcha")
                                    .setNegativeButton("Retry", null)
                                    .create()
                                    .show();
                            /*JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                RegisterActivity.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Register Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }*/
                      /*  } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }*/
                //};

                //RegisterRequest registerRequest = new RegisterRequest(name, username, age, password, responseListener);
                //RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                //queue.add(registerRequest);
            }
        });
    }


}
