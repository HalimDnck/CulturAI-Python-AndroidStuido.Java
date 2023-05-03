package com.example.culturai.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.example.culturai.R;

import java.util.Arrays;
import java.util.List;

public class PlannerActivity extends AppCompatActivity {

    CheckBox summer, winter, sea, skiing, nature, historical, outdoor, architecture, gastro, spa;
    ImageView infoBtn,goBackBtn;
    Button getPlan;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);

        if (!Python.isStarted())
            Python.start(new AndroidPlatform(this));

        Python py = Python.getInstance();
        final PyObject pyobj = py.getModule("main");

        int[] plannerList = {1, 1, 0, 1, 1, 0, 0, 0, 0, 1};

        summer = (CheckBox)findViewById(R.id.summer);
        winter = (CheckBox)findViewById(R.id.winter);
        sea = (CheckBox)findViewById(R.id.sea);
        skiing = (CheckBox)findViewById(R.id.skiing);
        nature = (CheckBox)findViewById(R.id.nature);
        historical = (CheckBox)findViewById(R.id.historical);
        outdoor = (CheckBox)findViewById(R.id.outdoor);
        architecture = (CheckBox)findViewById(R.id.architecture);
        gastro = (CheckBox)findViewById(R.id.gastro);
        spa = (CheckBox)findViewById(R.id.spa);


        getPlan = findViewById(R.id.getPlan);
        getPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(summer.isChecked()){
                    plannerList[0] = 1;
                }else{
                    plannerList[0] = 0;
                }
                if(winter.isChecked()){
                    plannerList[1] = 1;
                }else{
                    plannerList[1] = 0;
                }
                if(sea.isChecked()){
                    plannerList[2] = 1;
                }else{
                    plannerList[2] = 0;
                }
                if(skiing.isChecked()){
                    plannerList[3] = 1;
                }else{
                    plannerList[3] = 0;
                }
                if(nature.isChecked()){
                    plannerList[4] = 1;
                }else{
                    plannerList[4] = 0;
                }
                if(historical.isChecked()){
                    plannerList[5] = 1;
                }else{
                    plannerList[5] = 0;
                }
                if(outdoor.isChecked()){
                    plannerList[6] = 1;
                }else{
                    plannerList[6] = 0;
                }
                if(architecture.isChecked()){
                    plannerList[7] = 1;
                }else{
                    plannerList[7] = 0;
                }
                if(gastro.isChecked()){
                    plannerList[8] = 1;
                }else{
                    plannerList[8] = 0;
                }
                if(spa.isChecked()){
                    plannerList[9] = 1;
                }else{
                    plannerList[9] = 0;
                }

                int a = plannerList[0];
                int b = plannerList[1];
                int c = plannerList[2];
                int d = plannerList[3];
                int e = plannerList[4];
                int f = plannerList[5];
                int g = plannerList[6];
                int h = plannerList[7];
                int j = plannerList[8];
                int k = plannerList[9];

                /*PyObject obj = pyobj.callAttr("tripPlanner", 1, 1, 0, 0, 0, 1, 0, 1, 0, 1);*/
                PyObject obj = pyobj.callAttr("tripPlanner", a, b, c, d, e, f, g, h, j, k);
                String city = obj.toString();

                if(city.equals("adana")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.adana);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_adana);
                    startActivity(intent);
                }
                if(city.equals("antalya")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.antalya);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_antalya);
                    startActivity(intent);
                }
                if(city.equals("adiyaman")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.adiyaman);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_adiyaman);
                    startActivity(intent);
                }
                if(city.equals("afyonkarahisar")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.afyonkarahisar);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_afyon);
                    startActivity(intent);
                }
                if(city.equals("aksaray")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.aksaray);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_aksaray);
                    startActivity(intent);
                }
                if(city.equals("amasya")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.amasya);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_amasya);
                    startActivity(intent);
                }
                if(city.equals("ankara")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.ankara);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_ankara);
                    startActivity(intent);
                }
                if(city.equals("ardahan")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.ardahan);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_ardahan);
                    startActivity(intent);
                }
                if(city.equals("artvin")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.artvin);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_artvin);
                    startActivity(intent);
                }
                if(city.equals("aydin")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.aydin);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_aydin);
                    startActivity(intent);
                }
                if(city.equals("agri")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.agri);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_agri);
                    startActivity(intent);
                }
                if(city.equals("balikesir")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.balikesir);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_balikesir);
                    startActivity(intent);
                }
                if(city.equals("bartin")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.bartin);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_bartin);
                    startActivity(intent);
                }
                if(city.equals("batman")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.batman);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_batman);
                    startActivity(intent);
                }

                if(city.equals("bayburt")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.bayburt);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_bayburt);
                    startActivity(intent);
                }
                if(city.equals("bilecik")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.bilecik);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_bilecik);
                    startActivity(intent);
                }
                if(city.equals("bingol")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.bingol);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_bingol);
                    startActivity(intent);
                }
                if(city.equals("bitlis")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.bitlis);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_bitlis);
                    startActivity(intent);
                }

                if(city.equals("bolu")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.bolu);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_bolu);
                    startActivity(intent);
                }
                if(city.equals("burdur")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.burdur);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_burdur);
                    startActivity(intent);
                }
                if(city.equals("bursa")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.bursa);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_bursa);
                    startActivity(intent);
                }
                if(city.equals("canakkale")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.canakkale);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_canakkale);
                    startActivity(intent);
                }

                if(city.equals("cankiri")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.cankiri);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_cankiri);
                    startActivity(intent);
                }
                if(city.equals("corum")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.corum);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_corum);
                    startActivity(intent);
                }
                if(city.equals("denizli")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.denizli);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_denizli);
                    startActivity(intent);
                }
                if(city.equals("diyarbakir")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.diyarbakir);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_diyarbakir);
                    startActivity(intent);
                }
                if(city.equals("duzce")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.duzce);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_duzce);
                    startActivity(intent);
                }

                if(city.equals("edirne")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.edirne);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_edirne);
                    startActivity(intent);
                }
                if(city.equals("elazig")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.elazig);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_elazig);
                    startActivity(intent);
                }
                if(city.equals("erzincan")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.erzincan);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_erzincan);
                    startActivity(intent);
                }
                if(city.equals("erzurum")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.erzurum);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_erzurum);
                    startActivity(intent);
                }
                if(city.equals("eskisehir")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.eskisehir);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_eskisehir);
                    startActivity(intent);
                }

                if(city.equals("gaziantep")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.gaziantep);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_gaziantep);
                    startActivity(intent);
                }
                if(city.equals("giresun")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.giresun);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_giresun);
                    startActivity(intent);
                }
                if(city.equals("gumushane")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.gumushane);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_gumushane);
                    startActivity(intent);
                }
                if(city.equals("hakkari")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.hakkari);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_hakkari);
                    startActivity(intent);
                }
                if(city.equals("hatay")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.hatay);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_hatay);
                    startActivity(intent);
                }

                if(city.equals("igdir")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.igdir);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_igdir);
                    startActivity(intent);
                }
                if(city.equals("isparta")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.isparta);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_isparta);
                    startActivity(intent);
                }
                if(city.equals("izmir")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.izmir);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_izmir);
                    startActivity(intent);
                }
                if(city.equals("kahramanmaras")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.kahramanmaras);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_kahramanmaras);
                    startActivity(intent);
                }
                if(city.equals("karabuk")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.karabuk);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_karabuk);
                    startActivity(intent);
                }
                if(city.equals("karaman")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.karaman);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_karaman);
                    startActivity(intent);
                }

                if(city.equals("kars")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.kars);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_kars);
                    startActivity(intent);
                }
                if(city.equals("kastamonu")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.kastamonu);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_kastamonu);
                    startActivity(intent);
                }
                if(city.equals("kayseri")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.kayseri);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_kayseri);
                    startActivity(intent);
                }
                if(city.equals("kirklareli")){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.kirklareli);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_kirklareli);
                    startActivity(intent);
                }

                if (city.equals("kirsehir"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.kirsehir);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_kirsehir);
                    startActivity(intent);}

                if (city.equals("kilis"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.kilis);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_kilis);
                    startActivity(intent);}

                if (city.equals("kocaeli"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.kocaeli);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_kocaeli);
                    startActivity(intent);}

                if (city.equals("kutahya"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.kutahya);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_kutahya);
                    startActivity(intent);}

                if (city.equals("malatya"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.malatya);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_malatya);
                    startActivity(intent);}


                if (city.equals("manisa"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.manisa);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_manisa);
                    startActivity(intent);}


                if (city.equals("mardin"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.mardin);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_mardin);
                    startActivity(intent);}


                if (city.equals("mersin"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.mersin);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_mersin);
                    startActivity(intent);}


                if (city.equals("mugla"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.mugla);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_mugla);
                    startActivity(intent);}

                if (city.equals("mus"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.mus);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_mus);
                    startActivity(intent);}

                if (city.equals("nevsehir"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.nevsehir);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_nevsehir);
                    startActivity(intent);}



                if (city.equals("nigde"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.nigde);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_nigde);
                    startActivity(intent);}


                if (city.equals("ordu"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.ordu);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_ordu);
                    startActivity(intent);}

                if (city.equals("osmaniye"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.osmaniye);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_osmaniye);
                    startActivity(intent);}

                if (city.equals("rize"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.rize);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_rize);
                    startActivity(intent);}


                if (city.equals("sakarya"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.sakarya);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_sakarya);
                    startActivity(intent);}



                if (city.equals("samsun"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.samsun);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_samsun);
                    startActivity(intent);}


                if (city.equals("siirt"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.siirt);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_siirt);
                    startActivity(intent);}


                if (city.equals("sinop"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.sinop);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_sinop);
                    startActivity(intent);}


                if (city.equals("sanliurfa"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.sanliurfa);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_sanliurfa);
                    startActivity(intent);}


                if (city.equals("sirnak"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.sirnak);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_sirnak);
                    startActivity(intent);}


                if (city.equals("tekirdag"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.tekirdag);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_tekirdag);
                    startActivity(intent);}


                if (city.equals("tokat"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.tokat);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_tokat);
                    startActivity(intent);}

                if (city.equals("trabzon"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.trabzon);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_trabzon);
                    startActivity(intent);}


                if (city.equals("tunceli"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.tunceli);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_tunceli);
                    startActivity(intent);}


                if (city.equals("usak"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.usak);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_usak);
                    startActivity(intent);}

                if (city.equals("van"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.van);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_van);
                    startActivity(intent);}

                if (city.equals("yalova"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.yalova);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_yalova);
                    startActivity(intent);}

                if (city.equals("yozgat"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.yozgat);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_yozgat);
                    startActivity(intent);}

                if (city.equals("zonguldak"))
                {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.zonguldak);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_zonguldak);
                    startActivity(intent);}
            }

        });













/*


        int summer_var = 0;
        int winter_var = 0;
        int sea_var = 0;
        int skiing_var = 0;
        int nature_var = 0;
        int history_var = 0;
        int advanture_var = 0;
        int architecture_var = 0;
        int gastro_var = 0;
        int spa_var = 0;

*/

/*
                if(summer.isChecked()){
                    int summer_var = 1;
                }else{
                    int summer_var = 0;
                }
                if(winter.isChecked()){
                    int winter_var = 1;
                }else{
                    int winter_war = 0;
                }
                if(sea.isChecked()){
                    int sea_var = 1;
                }else{
                    int sea_var = 0;
                }
                if(skiing.isChecked()){
                    int skiing_var = 1;
                }else{
                    int skiing_var = 0;
                }
                if(nature.isChecked()){
                    int nature_var = 1;
                }else{
                    int nature_var = 0;
                }
                if(history.isChecked()){
                    int history_var = 1;
                }else{
                    int history_var = 0;
                }
                if(advanture.isChecked()){
                    int advanture_var = 1;
                }else{
                    int advanture_var = 0;
                }
                if(architecture.isChecked()){
                    int architecture_var = 1;
                }else{
                    int architecture_var = 0;
                }
                if(gastro.isChecked()){
                    int gastro_var = 1;
                }else{
                    int gastro_var = 0;
                }
                if(spa.isChecked()){
                    int spa_var = 1;
                }else{
                    int spa_var = 0;
                }*/
/*

*/






        infoBtn = findViewById(R.id.main_info);
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlannerActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });

        goBackBtn = findViewById(R.id.go_back_btn);
        goBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



/*
        getPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (summer.isChecked() && sea.isChecked() && historical.isChecked()) {
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.antalya);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_antalya);
                    startActivity(intent);
                }
                else if(winter.isChecked() && skiing.isChecked()){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.erzurum);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_erzurum);
                    startActivity(intent);
                }
                else if(summer.isChecked() && winter.isChecked() && historical.isChecked()){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.canakkale);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_canakkale);
                    startActivity(intent);
                }
                else if(summer.isChecked() && winter.isChecked() && spa.isChecked()){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.denizli);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_denizli);
                    startActivity(intent);
                }
                else if(summer.isChecked() && winter.isChecked() && gastro.isChecked() || historical.isChecked()){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.gaziantep);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_gaziantep);
                    startActivity(intent);
                }
                else if(summer.isChecked() || winter.isChecked() && sea.isChecked() && historical.isChecked()){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.antalya);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_antalya);
                    startActivity(intent);
                }
                else if(summer.isChecked() || winter.isChecked() || nature.isChecked() && historical.isChecked()){
                    Intent intent = new Intent(PlannerActivity.this, PlaceActivity.class);
                    String[] str = getResources().getStringArray(R.array.rize);
                    intent.putExtra("city", str[0]);
                    intent.putExtra("day_one", str[1]);
                    intent.putExtra("day_two", str[2]);
                    intent.putExtra("image", R.drawable.place_rize);
                    startActivity(intent);
                }


            }
        });
        */
    }
}