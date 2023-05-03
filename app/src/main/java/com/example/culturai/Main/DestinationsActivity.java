package com.example.culturai.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.culturai.R;

public class DestinationsActivity extends AppCompatActivity {

    ImageView goBackBtn, infoBtn;


    ImageView antalya,
            zonguldak,
            adana,
            adiyaman,
            afyonkarahisar,
            aksaray,
            amasya,
            ankara,
            ardahan,
            artvin,
            aydin,
            agri,
            balikesir,
            bartin,
            batman,
            bayburt,
            bilecik,
            bingol,
            bitlis,
            bolu,
            burdur,
            bursa,
            canakkale,
            cankiri,
            corum,
            denizli,
            diyarbakir,
            duzce,
            edirne,
            elazig,
            erzincan,
            erzurum,
            eskisehir,
            gaziantep,
            giresun,
            gumushane,
            hakkari,
            hatay,
            igdir,
            isparta,
            izmir,
            kahramanmaras,
            karabuk,
            karaman,
            kars,
            kastamonu,
            kayseri,
            kirklareli,
            kirikkale,
            kirsehir,
            kilis,
            kocaeli,
            konya,
            kutahya,
            malatya,
            manisa,
            mardin,
            mersin,
            mugla,
            mus,
            nevsehir,
            nigde,
            ordu,
            osmaniye,
            istanbul,
            rize,
            sakarya,
            samsun,
            siirt,
            sinop,
            sivas,
            sanliurfa,
            sirnak,
            tekirdag,
            tokat,
            trabzon,
            tunceli,
            usak,
            van,
            yalova,
            yozgat
    ;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations);

        goBackBtn = findViewById(R.id.go_back_btn);
        goBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        infoBtn = findViewById(R.id.main_info);
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });

        adana= findViewById(R.id.adana);
        adana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.adana);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_adana);
                startActivity(intent);
            }
        });


        antalya= findViewById(R.id.antalya);
        antalya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.antalya);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_antalya);
                startActivity(intent);
            }
        });


        adiyaman= findViewById(R.id.adiyaman);
        adiyaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.adiyaman);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_adiyaman);
                startActivity(intent);
            }
        });

        afyonkarahisar= findViewById(R.id.afyonkarahisar);
        afyonkarahisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.afyonkarahisar);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_afyon);
                startActivity(intent);
            }
        });

        aksaray= findViewById(R.id.aksaray);
        aksaray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.aksaray);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_aksaray);
                startActivity(intent);
            }
        });

        amasya= findViewById(R.id.amasya);
        amasya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.amasya);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_amasya);
                startActivity(intent);
            }
        });

        ankara= findViewById(R.id.ankara);
        ankara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.ankara);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_ankara);
                startActivity(intent);
            }
        });

        ardahan= findViewById(R.id.ardahan);
        ardahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.ardahan);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_ardahan);
                startActivity(intent);
            }
        });

        artvin= findViewById(R.id.artvin);
        artvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.artvin);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_artvin);
                startActivity(intent);
            }
        });

        aydin= findViewById(R.id.aydin);
        aydin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.aydin);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_aydin);
                startActivity(intent);
            }
        });

        agri= findViewById(R.id.agri);
        agri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.agri);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_agri);
                startActivity(intent);
            }
        });

        balikesir= findViewById(R.id.balikesir);
        balikesir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.balikesir);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_balikesir);
                startActivity(intent);
            }
        });

        bartin= findViewById(R.id.bartin);
        bartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.bartin);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_bartin);
                startActivity(intent);
            }
        });

        batman= findViewById(R.id.batman);
        batman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.batman);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_batman);
                startActivity(intent);
            }
        });

        bayburt= findViewById(R.id.bayburt);
        bayburt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.bayburt);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_bayburt);
                startActivity(intent);
            }
        });

        bingol= findViewById(R.id.bingol);
        bingol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.bingol);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_bingol);
                startActivity(intent);
            }
        });

        bitlis= findViewById(R.id.bitlis);
        bitlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.bitlis);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_bitlis);
                startActivity(intent);
            }
        });

        bolu= findViewById(R.id.bolu);
        bolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.bolu);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_bolu);
                startActivity(intent);
            }
        });

        burdur= findViewById(R.id.burdur);
        burdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.burdur);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_burdur);
                startActivity(intent);
            }
        });

        bursa= findViewById(R.id.bursa);
        bursa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.bursa);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_bursa);
                startActivity(intent);
            }
        });

        canakkale= findViewById(R.id.canakkale);
        canakkale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.canakkale);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_canakkale);
                startActivity(intent);
            }
        });

        cankiri= findViewById(R.id.cankiri);
        cankiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.cankiri);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_cankiri);
                startActivity(intent);
            }
        });

        corum= findViewById(R.id.corum);
        corum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.corum);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_corum);
                startActivity(intent);
            }
        });
        denizli= findViewById(R.id.denizli);
        denizli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.denizli);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_denizli);
                startActivity(intent);
            }
        });
        diyarbakir= findViewById(R.id.diyarbakir);
        diyarbakir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.diyarbakir);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_diyarbakir);
                startActivity(intent);
            }
        });
        duzce= findViewById(R.id.duzce);
        duzce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.duzce);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_duzce);
                startActivity(intent);
            }
        });

        edirne= findViewById(R.id.edirne);
        edirne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.edirne);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_edirne);
                startActivity(intent);
            }
        });

        elazig= findViewById(R.id.elazig);
        elazig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.elazig);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_elazig);
                startActivity(intent);
            }
        });

        erzincan= findViewById(R.id.erzincan);
        erzincan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.erzincan);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_erzincan);
                startActivity(intent);
            }
        });
        erzurum= findViewById(R.id.erzurum);
        erzurum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.erzurum);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_erzurum);
                startActivity(intent);
            }
        });

        eskisehir= findViewById(R.id.eskisehir);
        eskisehir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.eskisehir);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_eskisehir);
                startActivity(intent);
            }
        });

        gaziantep= findViewById(R.id.gaziantep);
        gaziantep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.gaziantep);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_gaziantep);
                startActivity(intent);
            }
        });

        giresun= findViewById(R.id.giresun);
        giresun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.giresun);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_giresun);
                startActivity(intent);
            }
        });

        gumushane= findViewById(R.id.gumushane);
        gumushane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.gumushane);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_gumushane);
                startActivity(intent);
            }
        });

        hakkari= findViewById(R.id.hakkari);
        hakkari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.hakkari);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_hakkari);
                startActivity(intent);
            }
        });

        hatay= findViewById(R.id.hatay);
        hatay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.hatay);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_hatay);
                startActivity(intent);
            }
        });

        igdir= findViewById(R.id.igdir);
        igdir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.igdir);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_igdir);
                startActivity(intent);
            }
        });

        isparta= findViewById(R.id.isparta);
        isparta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.isparta);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_isparta);
                startActivity(intent);
            }
        });

        izmir= findViewById(R.id.izmir);
        izmir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.izmir);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_izmir);
                startActivity(intent);
            }
        });

        kahramanmaras= findViewById(R.id.kahramanmaras);
        kahramanmaras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.kahramanmaras);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_kahramanmaras);
                startActivity(intent);
            }
        });

        karabuk= findViewById(R.id.karabuk);
        karabuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.karabuk);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_karabuk);
                startActivity(intent);
            }
        });

        karaman= findViewById(R.id.karaman);
        karaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.karaman);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_karaman);
                startActivity(intent);
            }
        });

        kars= findViewById(R.id.kars);
        kars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.kars);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_kars);
                startActivity(intent);
            }
        });

        kastamonu= findViewById(R.id.kastamonu);
        kastamonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.kastamonu);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_kastamonu);
                startActivity(intent);
            }
        });
        kayseri= findViewById(R.id.kayseri);
        kayseri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.kayseri);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_kayseri);
                startActivity(intent);
            }
        });

        kirklareli= findViewById(R.id.kirklareli);
        kirklareli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.kirklareli);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_kirklareli);
                startActivity(intent);
            }
        });

        kirikkale= findViewById(R.id.kirikkale);
        kirikkale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.kirikkale);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_kirikkale);
                startActivity(intent);
            }
        });

        kirsehir= findViewById(R.id.kirsehir);
        kirsehir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.kirsehir);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_kirsehir);
                startActivity(intent);
            }
        });

        kilis= findViewById(R.id.kilis);
        kilis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.kilis);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_kilis);
                startActivity(intent);
            }
        });

        kocaeli= findViewById(R.id.kocaeli);
        kocaeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.kocaeli);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_kocaeli);
                startActivity(intent);
            }
        });

        konya= findViewById(R.id.konya);
        konya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.konya);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_konya);
                startActivity(intent);
            }
        });
        kutahya= findViewById(R.id.kutahya);
        kutahya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.kutahya);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_kutahya);
                startActivity(intent);
            }
        });

        malatya= findViewById(R.id.malatya);
        malatya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.malatya);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_malatya);
                startActivity(intent);
            }
        });

        manisa= findViewById(R.id.manisa);
        manisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.manisa);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_manisa);
                startActivity(intent);
            }
        });
        mardin= findViewById(R.id.mardin);
        mardin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.mardin);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_mardin);
                startActivity(intent);
            }
        });

        mersin= findViewById(R.id.mersin);
        mersin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.mersin);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_mersin);
                startActivity(intent);
            }
        });

        mugla= findViewById(R.id.mugla);
        mugla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.mugla);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_mugla);
                startActivity(intent);
            }
        });

        mus= findViewById(R.id.mus);
        mus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.mus);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_mus);
                startActivity(intent);
            }
        });
        nevsehir= findViewById(R.id.nevsehir);
        nevsehir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.nevsehir);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_nevsehir);
                startActivity(intent);
            }
        });
        nigde= findViewById(R.id.nigde);
        nigde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.nigde);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_nigde);
                startActivity(intent);
            }
        });

        ordu= findViewById(R.id.ordu);
        ordu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.ordu);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_ordu);
                startActivity(intent);
            }
        });

        osmaniye= findViewById(R.id.osmaniye);
        osmaniye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.osmaniye);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_osmaniye);
                startActivity(intent);
            }
        });

        rize= findViewById(R.id.rize);
        rize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.rize);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_rize);
                startActivity(intent);
            }
        });

        sakarya= findViewById(R.id.sakarya);
        sakarya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.sakarya);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_sakarya);
                startActivity(intent);
            }
        });

        samsun= findViewById(R.id.samsun);
        samsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.samsun);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_samsun);
                startActivity(intent);
            }
        });

        siirt= findViewById(R.id.siirt);
        siirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.siirt);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_siirt);
                startActivity(intent);
            }
        });

        sinop= findViewById(R.id.sinop);
        sinop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.sinop);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_sinop);
                startActivity(intent);
            }
        });

        sivas= findViewById(R.id.sivas);
        sivas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.sivas);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_sivas);
                startActivity(intent);
            }
        });

        sanliurfa= findViewById(R.id.sanliurfa);
        sanliurfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.sanliurfa);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_sanliurfa);
                startActivity(intent);
            }
        });


        sirnak= findViewById(R.id.sirnak);
        sirnak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.sirnak);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_sirnak);
                startActivity(intent);
            }
        });

        tekirdag= findViewById(R.id.tekirdag);
        tekirdag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.tekirdag);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_tekirdag);
                startActivity(intent);
            }
        });

        tokat= findViewById(R.id.tokat);
        tokat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.tokat);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_tokat);
                startActivity(intent);
            }
        });

        trabzon= findViewById(R.id.trabzon);
        trabzon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.trabzon);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_trabzon);
                startActivity(intent);
            }
        });

        tunceli= findViewById(R.id.tunceli);
        tunceli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.tunceli);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_tunceli);
                startActivity(intent);
            }
        });

        usak= findViewById(R.id.usak);
        usak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.usak);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_usak);
                startActivity(intent);
            }
        });

        van= findViewById(R.id.van);
        van.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.van);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_van);
                startActivity(intent);
            }
        });

        yalova= findViewById(R.id.yalova);
        yalova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.yalova);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_yalova);
                startActivity(intent);
            }
        });

        yozgat= findViewById(R.id.yozgat);
        yozgat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.yozgat);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_yozgat);
                startActivity(intent);
            }
        });

        zonguldak= findViewById(R.id.zonguldak);
        zonguldak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationsActivity.this, PlaceActivity.class);
                String[] str = getResources().getStringArray(R.array.zonguldak);
                intent.putExtra("city", str[0]);
                intent.putExtra("day_one", str[1]);
                intent.putExtra("day_two", str[2]);
                intent.putExtra("image", R.drawable.place_zonguldak);
                startActivity(intent);
            }
        });


    }
}