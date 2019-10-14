package com.bryan1.laptoparena.model;

import com.bryan1.laptoparena.R;

import java.util.ArrayList;

public class LaptopData
{
    private static String[] laptopNames = {
            "ACER E5476G",
            "Acer Nitro 5",
            "Acer Swift 3",
            "ASUS ROG SCAR",
            "Asus Rog Zephyrus",
            "Asus Tuf fx505",
            "Asus Tuf fx505",
            "Asus Vivobook S14 s410",
            "LenovoIdepad320",
            "MSI GL62"
    };

    private static String[] laptopDetails = {
            "Dibekali dengan prosesor Intel Generasi ke-8, Aspire E5 476 series pun mampu memberikan performa hingga 49% lebih baik dari prosesor Intel generasi sebelumnya. Hal ini juga ditunjang dengan adanya grafis NVDIA GeForce MX 150 yang semakin mempercepat kinerja notebook dengan kenaikan performa hingga 62% dari generasi sebelumnya, hal ini berguna untuk bermain game, editing video atau editing foto menggunakan aplikasi yang cukup berat seperti Adobe Photoshop.",
            "Notebook Acer 15.6 yang cocok digunakan untuk casual gamer, ditenagai prosesor Intel Core i7 gen ke-7 atau AMD FX-series, serta model GPU NVIDIA GeForce GTX 1050/1050 Ti AMD Radeon RX550, dibekali RAM 8GB hingga 32GB dan HDD 1TB, SSD 128GB.",
            "Swift 3 Air (SF313-51) merupakan notebook 13” yang  praktis dengan ukuran kompak dengan bobot hanya 1,3kg dan ketipisan 15.9 mm menjadikan Swift 3 Air notebook paling tipis dan ringan di kelasnya. Memiliki tampilan layar 13 inci, Swift 3 Air juga memiliki layar dengan resolusi Full HD yang dapat menampilkan gambar dengan detail yang tinggi. Dilengkapi bezel yang dirancang sangat tipis untuk memaksimalkan pengalaman menonton, sama seperti yang dihadirkan dalam laptop Swift 3 Infinity.",
            "Dengan pilihan grafis hingga NVIDIA® GeForce RTX™ 2070 terbaru dan prosesor Intel® Core™ i7 Generasi ke-8, ROG Strix SCAR II menghadirkan performa dan gaya yang lebih besar lagi untuk gaming esport FPS",
            "Gaming laptop dengan refresh rate layar yang ekstrem sejatinya sudah menjadi senjata andalan Asus sejak lama. Mereka adalah yang pertama merilis laptop dengan layar IPS 120 Hz di tahun 2016, demikian pula untuk laptop berlayar 144 Hz, hingga akhirnya mereka mencatatkan rekor terbaru lewat laptop berlayar 240 Hz di event Computex kemarin.",
            "ASUS TUF Gaming FX505 laptop gaming dengan keyboard RGB-backlit, highlighted tombol WASD, layar berteknologi NanoEdge Display refresh rate hingga 144Hz, laptop tahan banting di segala kondisi dengan sertifikat MIL-STD-810G.",
            "ZenBook Pro Duo adalah notebook berlayar ganda yang menampilkan ASUS ScreenPad Plus 4K, yang dipadukan dengan layar utama OLED 4K UHD, dan juga terintegrasi dengan LED-backlit NumberPad.",
            "Di bulan Februari kemarin, Asus menunjuk dua model VivoBook yang mereka pilih sebagai andalannya berkompetisi di tahun 2018: Flip 14 TP410 serta S14 S410. Tak lama dari momen itu, saya diberi kesempatan langsung untuk menjajal tipe terakhir. VivoBook S14 S410 menyuguhkan pendekatan desain clamshell tradisional, namun meski masuk ke kategori entry-level, ada banyak sentuhan premium yang produsen bubuhkan di sana.",
            "Untuk sebuah laptop murah 5 jutaan, Lenovo IdeaPad 320 14ISK ini terlihat lumayan menjanjikan. Berbekal spesifikasi yang mumpuni dan desain yang bagus dan kokoh, rasanya tidak terlalu sulit untuk menjatuhkan pilihan padanya.",
            "MSI Gaming GL62 hadir dengan mengusung bentang layar berukuran 15.6 inch beresolusi 1920 x 1080 pixel. Bodinya berdimensi 383 x 260 x 27-29 mm dan untuk bobotnya seberat 2.3 kg. Untuk desainnya sendiri terlihat cukup tangguh, khas laptop gaming kebanyakan."
    };

    private static int[] laptopImages = {
            R.drawable.gambar_satu,
            R.drawable.gambar_dua,
            R.drawable.gambar_tiga,
            R.drawable.gambar_empat,
            R.drawable.gambar_lima,
            R.drawable.gambar_enam,
            R.drawable.gambar_tujuh,
            R.drawable.gambar_delapan,
            R.drawable.gambar_sembilan,
            R.drawable.gambar_sepuluh
    };

    public static ArrayList<Laptop> getListData()
    {
        ArrayList<Laptop> list = new ArrayList<>();
        for (int position = 0 ; position < laptopNames.length; position++)
        {
            Laptop laptop = new Laptop();
            laptop.setName(laptopNames[position]);
            laptop.setDetail(laptopDetails[position]);
            laptop.setPhoto(laptopImages[position]);
            list.add(laptop);
        }
        return list;
    }
}
