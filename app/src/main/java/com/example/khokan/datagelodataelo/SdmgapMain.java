package com.example.khokan.datagelodataelo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

public class SdmgapMain extends AppCompatActivity {
    ListView listView;
    LinearLayout fahim_section,sajib_section;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdmgap_main2);

        listView = findViewById(R.id.member_list);
        fahim_section=findViewById(R.id.fahim_section);
        sajib_section=findViewById(R.id.sajib_section);

        fahim_section.animate().translationX((20f)).setDuration(1000).alpha(1f).setDuration(2000).scaleY(1f).setDuration(3000).scaleX(1f).setDuration(4000).rotationX(360f).setDuration(5000).rotationYBy(16200f).setDuration(80000);
        sajib_section.animate().translationX((-20f)).setDuration(1000).alpha(1f).setDuration(2000).scaleY(1f).setDuration(3000).scaleX(1f).setDuration(4000).rotationX(360f).setDuration(5000).rotationYBy(16200f).setDuration(80000);

        int []images={R.drawable.khokan,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background
        };

        String []names = {
                "Md.khokanuzzaman",
                "Bulbul Ahmed",
                "Ranu akter",
                "Md.Nafiul Alam",
                "Subha Shil",
                "Md Hafiz Al Shadiq",
                "Md.Hasan Mia",
                "Md.Rakibul Islam",
                "Tamim Akter Tonni",
                "Md.Hasibur Rahman",
                "Md.Rakibul Hasan",
                "Tawhid Ahmed Ratul",
                "Kh.Solaiman",
                "Ashis Kumar",
                "Md.Rasel Ahmed",
                "Kh.Sadia Afrin",
                "Md.Murad Hassan",
                "Rashiduzzaman Dip",
                "Habullah Anik",
                "Nasrin Rabu"

        };

        String []registration = {
                "0000",
                "1185",
                "9020",
                "1380",
                "1400",
                "1419",
                "1510",
                "1602",
                "1611",
                "1430",
                "1665",
                "1810",
                "2046",
                "2064",
                "1857",
                "6187",
                "2892",
                "2733",
                "4116",
                "0000"

        };

        String []phone = {
                "01679544628",
                "01558953396",
                "01721975242",
                "01687110333",
                "01792650521",
                "01688910756",
                "01747892323",
                "01515606629",
                "01767948860",
                "01621522140",
                "01987938993",
                "01680834998",
                "01516394193",
                "01521447439",
                "01756646035",
                "01676153233",
                "01558952209",
                "01685385745",
                "01626875878",
                "01234567890"
        };


        ShowMemberList showMemberList = new ShowMemberList(this,images,names,registration,phone);
        listView.setAdapter(showMemberList);
    }
}
