package com.example.mainactivity.asmaul_husna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.mainactivity.R;

public class Asmaul_Husna_Main extends AppCompatActivity {

    private ListView lvlisthusna;

    String[] indohusna ={
            " Allah\n"+
            "\t\n" +
             "Allah"               ," Ar Rahman\n" +
            "\t\n" +
            "Allah Yang Maha Pengasih"            ," Ar Rahiim\n" +
            "\t\n" +
            "Allah Yang Maha Penyayang"            ," Al Malik\n" +
            "\t\n" +
            "Allah Yang Maha Merajai (bisa di artikan Raja dari semua Raja)"            ," Al Quddus\n" +
            "\t\n" +
            "Allah Yang Maha Suci"            ," As Salaam\n" +
            "\t\n" +
            "Allah Yang Maha Memberi Kesejahteraan"            ," Al Mu`min\n" +
            "\t\n" +
            "Allah Yang Maha Memberi Keamanan"            ," Al Muhaimin\n" +
            "\t\n" +
            "Allah Yang Maha Mengatur"            ," Al `Aziiz\n" +
            "\t\n" +
            "Allah Yang Maha Perkasa"            ,"Al Jabbar\n" +
            "\t\n" +
            "Allah Yang Memiliki Mutlak Kegagahan"            ," Al Mutakabbir\n" +
            "\t\n" +
            "Allah Yang Maha Megah, Yang Memiliki Kebesaran"            ," Al Khaliq\n" +
            "\t\n" +
            "Allah Yang Maha Pencipta"            ," Al Baari`\n" +
            "\t\n" +
            "Allah Yang Maha Melepaskan (Membuat, Membentuk, Menyeimbangkan)"            ," Al Mushawwir\n" +
            "\t\n" +
            "Allah Yang Maha Membentuk Rupa (makhluknya)"            ," Al Ghaffaar\n" +
            "\t\n" +
            "Allah Yang Maha Pengampun"            ," Al Qahhaar\n" +
            "\t\n" +
            "Allah Yang Maha Menundukkan / Menaklukkan Segala Sesuatu"            ," Al Wahhaab\n" +
            "\t\n" +
            "Allah Yang Maha Pemberi Karunia"            ," Ar Razzaaq\n" +
            "\t\n" +
            "Allah Yang Maha Pemberi Rezeki"            ," Al Fattaah\n" +
            "\t\n" +
            "Allah Yang Maha Pembuka Rahmat"            ," Al `Aliim\n" +
            "\t\n" +
            "Allah Yang Maha Mengetahui (Memiliki Ilmu)"            ," Al Qaabidh\n" +
            "\t\n" +
            "Allah Yang Maha Menyempitkan (makhluknya)"            ," Al Baasith\n" +
            "\t\n" +
            "Allah Yang Maha Melapangkan (makhluknya)"            ," Al Khaafidh\n" +
            "\t\n" +
            "Allah Yang Maha Merendahkan (makhluknya)"            ," Ar Raafi`\n" +
            "\t\n" +
            "Allah Yang Maha Meninggikan (makhluknya)"            ," Al Mu`izz\n" +
            "\t\n" +
            "Allah Yang Maha Memuliakan (makhluknya)"            ," Al Mudzil\n" +
            "\t\n" +
            "Allah Yang Maha Menghinakan (makhluknya)"            ," Al Samii`\n" +
            "\t\n" +
            "Allah Yang Maha Mendengar"            ," Al Bashiir\n" +
            "\t\n" +
            "Allah Yang Maha Melihat"            ," Al Hakam\n" +
            "\t\n" +
            "Allah Yang Maha Menetapkan"            ," Al `Adl\n" +
            "\t\n" +
            "Allah Yang Maha Adil"            ," Al Lathiif\n" +
            "\t\n" +
            "Allah Yang Maha Lembut"            ," Al Khabiir\n" +
            "\t\n" +
            "Allah Yang Maha Mengenal"            ," Al Haliim\n" +
            "\t\n" +
            "Allah Yang Maha Penyantun"            ," \t\n" +
            "Al `Azhiim\n" +
            "\t\n" +
            "Allah Yang Maha Agung"            ," Al Ghafuur\n" +
            "\t\n" +
            "Allah Yang Maha Memberi Pengampunan"            ," As Syakuur\n" +
            "\t\n" +
            "Allah Yang Maha Pembalas Budi (Menghargai)"            ," Al `Aliy\n" +
            "\t\n" +
            "Allah Yang Maha Tinggi"            ," Al Kabiir\n" +
            "\t\n" +
            "Allah Yang Maha Besar"            ," Al Hafizh\n" +
            "\t\n" +
            "Allah Yang Maha Memelihara"            ," Al Muqiit\n" +
            "\t\n" +
            "Allah Yang Maha Pemberi Kecukupan"            ," Al Hasiib\n" +
            "\t\n" +
            "Allah Yang Maha Membuat Perhitungan"          ,"Al Jaliil\n" +
            "\t\n" +
            "Allah Yang Maha Luhur"  ,"Al Kariim\n"+
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Pemurah"   ,"Ar Raqiib\n"+
            "\t\n" +
           "Yang Memiliki Mutlak sifat Maha Mengawasi"  ,"Al Mujiib\n"+
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Mengabulkan"      ," Al Waasi'\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Luas"      ," Al Hakiim \n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maka Bijaksana"        ,"Al Waduud\n" +
            "\t\n" +
            "ang Memiliki Mutlak sifat Maha Pencinta"       ," Al Majiid\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Mulia"        ," Al Baa'its\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Membangkitkan"        ," As Syahiid\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Menyaksikan"     ," Al Haqq\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Benar"      ,"Al Wakiil\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Memelihara"        ," Al Qawiyyu\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Kuat"         ," Al Matiin\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Kokoh)"        ," Al Waliyy\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Melindungi"      ," Al Hamiid\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Terpuji"      ," Al Mushii\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Mengkalkulasi"        ," Al Mubdi'\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Memulai"   ," Al Mu'iid\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Mengembalikan Kehidupan"            ," Al Muhyii\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Menghidupkan" ,"Al Mumiitu\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Mematikan"            ,"Al Hayyu\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Hidup"            ," Al Qoyyuum\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Mandiri"            ," Al Waajid\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Penemu"            ," Al Maajid\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Mulia"            ," Al Waahid\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Tunggal"            ," Al Ahad\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Esa"            ,"As Shomad\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Dibutuhkan, Tempat Meminta"            ," Al Qaadir\n" +
            "\t\n" +
            "AYang Memiliki Mutlak sifat Maha Menentukan, Maha Menyeimbangkan"  ," Al Muqtadir \n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Berkuasa"    ," Al Muqaddim\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Mendahulukan"       ,"Al Mu'akkhir\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Mengakhirkan"   ," Al Awwal\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Awal"   ," Al Aakhir\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Akhir"       ," Al Zhaahir\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Nyata"      ," Az Baathin\t\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Ghaib"            ," Al Waali\n" +
            "\t\n" +
            "YYang Memiliki Mutlak sifat Maha Memerintah"         ," Al Muta'aalii\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Tinggi"     ," Al Barri\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Penderma"        ,"At Tawwaab\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Penerima Tobat"      ," Al Muntaqim\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Penuntut Balas"  ," Al Afuww\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Pemaaf"   ," Ar Ra'uuf\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Pengasih"          ,"Malikul Mulk\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Penguasa Kerajaan (Semesta)"   ,"Dzul Jalaali Wal Ikraam\n"+
            "\t\n" +
            "Yang Memiliki Mutlak sifat Pemilik Kebesaran dan Kemuliaan"   ,"Al Muqsith\n"+
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Adil"  ,"Al Jamii'\n"+
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Mengumpulkan"       ,"Al Ghoniyy\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Berkecukupan"   ," Al Mughnii\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Memberi Kekayaan"   ," Al Maani'\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Mencegah"   ," Ad Dhaar\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Memberi Derita"      ," An Nafii'\t\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Memberi Manfaat"     ," An Nuur\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Bercahaya (Menerangi, Memberi Cahaya)"     ,"Al Haadii\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Pemberi Petunjuk"     ," Al Badii'\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Pencipta"        ,"Al Baaqii\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Kekal"      ," Al Waarits\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Pewaris"  ,"Ar Rasyiid\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Pandai"   ," As Shobuur\n" +
            "\t\n" +
            "Yang Memiliki Mutlak sifat Maha Sabar"


    };

    String [] arabhusna ={
            "اَللّهُ"
            ,"الرَّحْمَنُ"
            ,"الرَّحِيمُ"
            ,"الْمَلِكُ"
            ,"الْقُدُّوسُ"
            ,"السَّلاَمُ"
            ,"الْمُؤْمِنُ"
            ,"الْمُهَيْمِنُ"
            ,"الْعَزِيزُ"
            ,"الْجَبَّارُ"
            ,"الْمُتَكَبِّرُ"
            ,"الْخَالِقُ"
            ,"الْبَارِئُ"
            ,"الْمُصَوِّرُ"
            ,"الْغَفَّارُ"
            ,"الْقَهَّارُ"
            ," الْوَهَّابُ"
            ,"الرَّزَّاقُ"
            ,"الْفَتَّاحُ"
            ,"اَلْعَلِيْمُ"
            ,"الْقَابِضُ"
            ,"الْبَاسِطُ"
            ,"الْخَافِضُ"
            ,"الرَّافِعُ"
            ,"الْمُعِزُّ"
            ,"المُذِلُّ"
            ,"السَّمِيعُ"
            ,"الْبَصِيرُ"
            ,"الْحَكَمُ"
            ,"الْعَدْلُ"
            ,"اللَّطِيفُ"
            ,"الْخَبِيرُ"
            ,"الْحَلِيمُ"
            ,"الْعَظِيمُ"
            ,"الْغَفُورُ"
            ,"الشَّكُورُ"
            ,"الْعَلِيُّ"
            ,"الْكَبِيرُ"
            ,"الْحَفِيظُ"
            ,"المُقيِت"
            ,"الْحسِيبُ"
            ,"الْجَلِيلُ"
            ,"الْكَرِيمُ"
            ,"الرَّقِيبُ"
            ,"الْمُجِيبُ"
            ,"الْوَاسِعُ"
            ,"الْحَكِيمُ"
            ,"الْوَدُود"
            ,"الْمَجِيد"
            ,"الْبَاعِث"
            ,"الشَّهِيد"
           ,"الْحَق"
           , "الْوَكِيل"
           , "الْقَوِي"
            ,"الْمَتِين"
           , "الْوَلِي"
            ,"الْحَمِيد"
            ,"الْمُحْصِي"
           , "الْمُبْدِئ"
           , "الْمُعِيد"
           , "الْمُحْيِي"
           , "اَلْمُمِيت"
           , "الْحَي"
           , "الْقَيُّوم"
           , "الْوَاجِد"
           , "الْمَاجِد"
           , "الْواحِد"
           , "اَلاَحَد"
           , "الصَّمَد"
           , "الْقَادِر"
           , "الْمُقْتَدِر"
           , "الْمُقَدِّم"
           , "الْمُؤَخِّر"
           , "الأوَّل"
           , "الآخِر"
           , "الظَّاهِر"
           , "الْبَاطِن"
           , "الْوَالِي"
           , "الْمُتَعَالِي"
           , "الْبَرُّ"
           , "التَّوَابُ"
           , "الْمُنْتَقِم"
           , "العَفُوُ"
           , "الرَّؤُوفُ"
           , "مَالِك الْمُلْك"
           , "ذُوالْجَلاَل وَالإكْرَام"
           , "الْمُقْسِط"
           , "الْجَامِع"
           , "الْغَنِي"
           , "الْمُغْنِي"
           , "اَلْمَانِع"
           , "الضَّارَّ"
           ,"النَّافِع"
           , "النُّور"
           , "الْهَادِي"
           , "الْبَدِيع"
           , "اَلْبَاقِي"
           , "الْوَارِث"
           , "الرَّشِيد"
           , "الصَّبُور"


    };

    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaul__husna__main);

        lvlisthusna = (ListView)findViewById(R.id.lvlisthusna);
        AsmaulAdapter asmaulAdapter = new AsmaulAdapter(this, indohusna, arabhusna);
        lvlisthusna.setAdapter(asmaulAdapter);
    }
}
