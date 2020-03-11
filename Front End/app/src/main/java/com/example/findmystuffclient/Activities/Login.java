package com.example.findmystuffclient.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.findmystuffclient.AppSingleton;
import com.example.findmystuffclient.R;

import org.json.JSONException;
import org.json.JSONObject;

public class Login extends AppCompatActivity {

    private EditText Username_Tag;
    private EditText Password_Tag;
    private Button loginButton;
    private Button forgotPassword;
    private Button createNewAccount;
    private EditText displayInfo;

    @Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getSupportActionBar().setTitle("Find My Stuff");
        Username_Tag =findViewById(R.id.Username_Tag);
        Password_Tag = findViewById(R.id.Password_Tag);
        loginButton = findViewById(R.id.Login_Button);
        forgotPassword = findViewById(R.id.Forgot_Password);
        createNewAccount = findViewById(R.id.Create_New_Account);


        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                //Input checking before HTTP requests
                loginRequest();
            }
        });
    }

    public void loginRequest()
    {
        final JSONObject request = new JSONObject();
        try{
            request.put("username", Username_Tag.getText().toString());
            request.put("password", Password_Tag.getText().toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest loginRequest = new JsonObjectRequest(Request.Method.POST, getString(R.string.database_url) + "/user/login", request,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {

                    }
                });
        AppSingleton.requestQueue.add(loginRequest);
    }
}
