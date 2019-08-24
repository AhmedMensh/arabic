package com.example.mostafa.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class AboutActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        initToolbar();
        findViewById(R.id.gmail_iv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                String[] recipients={"infoalkesaey@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        //        intent.putExtra(Intent.EXTRA_SUBJECT,"Subject text here...");
             //   intent.putExtra(Intent.EXTRA_TEXT,"Body of the content here...");
             //   intent.putExtra(Intent.EXTRA_CC,"mailcc@gmail.com");
                intent.setType("text/html");
                intent.setPackage("com.google.android.gm");
                startActivity(Intent.createChooser(intent, "Send mail"));
            }
        });

        findViewById(R.id.phone_iv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setAlertPhoneDialog();



            }
        });

        findViewById(R.id.facebook_iv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity( newFacebookIntent(getPackageManager(),"https://www.facebook.com/alkesaay/"));
            }
        });

    }


    public static Intent newFacebookIntent(PackageManager pm, String url) {
        Uri uri = Uri.parse(url);
        try {
            ApplicationInfo applicationInfo = pm.getApplicationInfo("com.facebook.katana", 0);
            if (applicationInfo.enabled) {
                // http://stackoverflow.com/a/24547437/1048340
                uri = Uri.parse("fb://facewebmodal/f?href=" + url);
            }
        } catch (PackageManager.NameNotFoundException ignored) {
        }
        return new Intent(Intent.ACTION_VIEW, uri);
    }


    private void initToolbar() {


        mToolbar=findViewById(R.id.main_page_toolbar);
        mToolbar.setTitle(R.string.about_us);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void setAlertPhoneDialog(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = getLayoutInflater().inflate(R.layout.phone_dialog,null);

        TextView wePhoneNumber = view.findViewById(R.id.we_phone_number_tv);
        TextView orangePhoneNumber = view.findViewById(R.id.orange_phone_number_tv);

        wePhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makePhoneCall(getResources().getString(R.string.we_phone_number));
            }
        });

        orangePhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makePhoneCall(getResources().getString(R.string.orange_phone_number));
            }
        });
        builder.setView(view);


        AlertDialog dialog = builder.create();
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        dialog.show();
    }

    private void makePhoneCall(String phoneNumber){
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" +phoneNumber));
        if (ActivityCompat.checkSelfPermission(AboutActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
