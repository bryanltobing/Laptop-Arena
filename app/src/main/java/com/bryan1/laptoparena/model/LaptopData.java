package com.bryan1.laptoparena.model;

import com.bryan1.laptoparena.R;

import java.util.ArrayList;

public class LaptopData
{
    private static String[] laptopNames = {
            " Acer E5476G",
            " Acer Nitro 5",
            " Acer Swift 3",
            " ASUS ROG SCAR",
            " Asus Rog Zephyrus",
            " Asus Tuf fx505",
            " Zenbook Pro",
            " Asus VivoS14",
            " LenovoIdepad320",
            " MSI GL62"
    };

    private static String[] laptopPrices = {
            " Rp 7.372.004 ",
            " Rp 10.500.000 ",
            " Rp5.509.100 ",
            " Rp 28.888.000 ",
            " Rp 31.599.000 ",
            " Rp 9.553.000 ",
            " Rp 61.999.000 ",
            " Rp 10.299.000 ",
            " Rp 7.800.0000 ",
            " Rp 12.989.000 "
    };

    private static String[] laptopDetails = {
            //ACER E5476G
            "Dibekali dengan prosesor Intel Generasi ke-8, Aspire E5 476 series pun mampu memberikan performa hingga 49% lebih baik dari prosesor Intel generasi sebelumnya. Hal ini juga ditunjang dengan adanya grafis NVDIA GeForce MX 150 yang semakin mempercepat kinerja notebook dengan kenaikan performa hingga 62% dari generasi sebelumnya, hal ini berguna untuk bermain game, editing video atau editing foto menggunakan aplikasi yang cukup berat seperti Adobe Photoshop.\n\n"+
            "Spesifikasi\n" +
                    "Acer Aspire E5-476G (Rp. 7.999.000,-)\n" +
                    "Processor\tIntel Core i5 8250U (Base 1,6 GHz/Turbo Boost 3,4 GHz)\n" +
                    "Motherboard\tIntel Kaby Lake-U + iHDCP 2.2 Premium PCH\n" +
                    "Memory\t4 GB (1x 4 GB) DDR4 @2400 MHz (Single Channel)\n" +
                    "Graphics\tIGP: Intel UHD Graphics 620\n" +
                    "Discrete: GeForce MX150 2 GB GDDR5\n" +
                    "Display\t14 inch @1366 x 768 pixels @60 Hz\n" +
                    "Storage\t1 TB HDD 5400 RPM SATA III 6 Gbps\n" +
                    "Wireless\t802.11a/b/g/n/ac & Bluetooth V4.2 (by Intel Dual Band Wireless-AC 3168)\n" +
                    "USB 2.0/1.1\t1\n" +
                    "USB 3.0/2.0\t2 (Type-A Connector)\n" +
                    "USB 3.1\t0\n" +
                    "eSATA/USB 3.0 Combo\t0\n" +
                    "Display Port\t0\n" +
                    "HDMI\t1\n" +
                    "DVI\t0\n" +
                    "D-Sub\t1\n" +
                    "Ethernet/RJ45\t1 (by RealTek RTL8168/8111)\n" +
                    "Audio In/Out\tHeadphone Microphone Combo Jack\n" +
                    "Optical Drive\tDVD Writer\n" +
                    "Battery\t40 Wh\n" +
                    "Operating System\tTested On Windows 10 Creator Update\n" +
                    "Dimensions (mm)\t343 x 248 x 30 (Width x Depth x Height)\n" +
                    "Weight (grams)\t1986 (Notebook) \n" +
                    "323 (Charger)",
            // ACER NITRO 5
            "Notebook Acer 15.6 yang cocok digunakan untuk casual gamer, ditenagai prosesor Intel Core i7 gen ke-7 atau AMD FX-series, serta model GPU NVIDIA GeForce GTX 1050/1050 Ti AMD Radeon RX550, dibekali RAM 8GB hingga 32GB dan HDD 1TB, SSD 128GB.\n\n"
            + "Spesifikasi Lengkap\n" +
                    "Berikut spesifikasi lengkap dari unit laptop Acer Nitro 5 2019, Model AN515-43-R1PB / Part number NH.Q5XSN.007.\n" +
                    "\n" +
                    "Prosesor: AMD Ryzen 5 3550H\n" +
                    "GPU, Integrated/IGP : Radeon Vega 8 Graphics IGP\n" +
                    "GPU, Discrete/dGPU: Radeon RX 560X 4GB \n" +
                    "RAM: 1x8GB DDR4-2400 (Upgradeable, 2-Slot DIMM Max. 32GB)\n" +
                    "Storage: 1TB HDD (Upgradeable, 2-slot M.2)\n" +
                    "Adapter: 135W \n" +
                    "Display: 15.6″ FULL HD(1920×1080), IPS, 60 Hz\n" +
                    "OS: Windows 10 Home\n" +
                    "Garansi: 2 Tahun\n\n"
            + "[Cooling & Upgradeability]–\n" +
                    "\n" +
                    "Kelebihan yang menonjol dari Acer Nitro 5 2019 ini ada pada aspek Cooling, dan juga Upgradeability.\n" +
                    "Melihat kapabilitas sistem pendingin yang diberikan padanya, nampak wajar jika Prosesor Ryzen 5 3550H-nya diberikan konfigurasi TDP yang sedikit lebih tinggi (42W ‘Long’ Boost, 50W ‘Short’ Boost), mengizinkan prosesor ini untuk boost lebih lama, sembari mempertahankan clockspeed tinggi.\n" +
                    "Acer memberikan slot upgrade cukup melimpah, ada 2x SODIMM Slot (1 sudah terisi 1 keping DDR4), dan ada 2x M.2 (1x M.2 SATA, 1x M.2 PCIe/NVMe )\n" +
                    "SANGAT disarankan untuk upgrade RAM, setidaknya dengan menambah satu keping RAM 4GB, membuat sistem berjalan dengan mode 8 + 4 GB Dual-channel.\n" +
                    "Kalau Anda membeli unit dengan HDD sebagai storage utama,  Penambahan SSD juga disarankan untuk membuat sistem lebih responsif (ada slot M.2 nvme Gen 3 x4 untuk opsi storage high-performance)",
            // ACER SWIFT 3 AIR
            "Swift 3 Air (SF313-51) merupakan notebook 13” yang  praktis dengan ukuran kompak dengan bobot hanya 1,3kg dan ketipisan 15.9 mm menjadikan Swift 3 Air notebook paling tipis dan ringan di kelasnya. Memiliki tampilan layar 13 inci, Swift 3 Air juga memiliki layar dengan resolusi Full HD yang dapat menampilkan gambar dengan detail yang tinggi. Dilengkapi bezel yang dirancang sangat tipis untuk memaksimalkan pengalaman menonton, sama seperti yang dihadirkan dalam laptop Swift 3 Infinity."
            +"Dari segi penampilan, Acer Swift 3 (SF314-52G) memang tidak menawarkan perubahan signifikan di desain bodi dibandingkan pendahulunya. Seperti laptop tipis lainnya, Acer Swift 3 (SF314-52G) menggunakan bodi dari bahan logam sehingga tetap kokoh saat digunakan. Permukaan di sekitar area keyboard dan belakang layar diberikan sentuhan metal brush finish yang membuat penampilan terasa elegan sekaligus mewah.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Bodi tipis menjadi salah satu daya tarik yang ditawarkan oleh Acer Swift 3 (SF314-52G). Dibandingkan baterai AA (14.5 mm), ketebalan Acer Swift 3 (SF314-52G) saat layar ditutup hanya berbeda 4,5 mm saja.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Sementara untuk sisi panjang dan lebar, Acer Swift 3 (SF314-52G) memiliki ukuran bodi sebesar 33,81 x 23,39 cm yang membuatnya mudah dimasukkan ke dalam tas ukuran sedang. Bahkan dengan bobot sekitar 1,7 kg, Acer Swift 3 (SF314-52G) tergolong ringan dibawa saat bepergian.\n\n"
            +"Acer Swift 3 (SF314-52G) menggunakan layar LCD LED ukuran 14 inci dengan resolusi Full HD/1920 x 1080 piksel dan tingkat kepadatan piksel mencapai 157 PPI. Layar Acer Swift 3 (SF314-52G) telah menggunakan panel IPS (In-Plane Switching) yang dikenal luas mampu menampilkan warna lebih kaya dan akurat serta memiliki viewing angle sangat luas hingga 170 °.\n" +
                    "\n" +
                    "Meskipun tidak menggunakan layar sentuh, permukaan layar Acer Swift 3 (SF314-52G) diperkuat lapisan Corning Gorilla Glass yang memperkuat sekaligus melindungi layar dari resiko kerusakan. Cukup disayangkan, lapisan Corning Gorilla Glass membuat layar laptop menjadi reflektif yang dapat mengganggu kenyamanan pakai akibat bayangan lingkungan sekitar. Menaikkan tingkat kecerahan layar hingga maksimal dapat mengurangi meskipun tidak menghilangkannya sama sekali.\n\n"
            +"Keyboard Acer Swift 3 (SF314-52G) mengadopsi desain tombol chiclet dengan ukuran penampang luas (kecuali tombol di deretan paling atas dan pojok kanan bawah) sehingga siap untuk pengguna dengan jari besar sekalipun. Setiap tombol ditempatkan dengan jarak cukup lebar sehingga mengurangi resiko kesalahan tekan. Keyboard terasa empuk saat ditekan dengan jarak penekanan pendek seperti laptop tipis lainnya dan juga senyap saat dioperasikan.\n\n",
            // ASUS ROG SCAR
            "Dengan pilihan grafis hingga NVIDIA® GeForce RTX™ 2070 terbaru dan prosesor Intel® Core™ i7 Generasi ke-8, ROG Strix SCAR II menghadirkan performa dan gaya yang lebih besar lagi untuk gaming esport FPS\n\n"
            +"Spesifikasi\n" +
                    "ASUS ROG STRIX GL504GS Scar II \n" +
                    "Processor\tIntel Core i7 8750H (Base 2,2 GHz/Turbo Boost 4,1 GHz)\n" +
                    "Motherboard\tIntel HM370 Chipset-based\n" +
                    "Memory\t32 GB (2x 16 GB) DDR4 @2666 MHz (Dual Channel)\n" +
                    "Graphics\tNVIDIA GeForce GTX 1070 8 GB GDDR5\n" +
                    "Display\t15,6 inch 1920 x 1080 pixels 144 Hz\n" +
                    "Storage\t256 GB SSD PCIe 3.0 x4 NVMe\n" +
                    "1 TB SSHD 5400 RPM SATA III 6 Gbps\n" +
                    "Wireless\t802.11a/b/g/n/ac with MU-MIMO & Bluetooth V5\n" +
                    "(by Intel Dual Band Wireless-AC 9560)\n" +
                    "\n" +
                    "USB 2.0/1.1\t0\n" +
                    "USB 3.1 Gen 1 (5 Gbps)\t2 (Type-A Connector)\n" +
                    "USB 3.1 Gen 2 (10 Gbps)\t1 (Type-A Connector)\n" +
                    "1 (Type-C Connector)\n" +
                    "\n" +
                    "USB 3.1 Gen 2/Thunderbolt 3\t0\n" +
                    "eSATA/USB 3.0 Combo\t0\n" +
                    "Display Port\t1 (Mini Connector)\n" +
                    "HDMI\t1\n" +
                    "DVI\t0\n" +
                    "D-Sub\t0\n" +
                    "Ethernet/RJ45\t1 (by RealTek RTL8168/8111)\n" +
                    "Audio In/Out\tMicrophone Headphone Combo Jack\n" +
                    "Optical Drive\tN/A\n" +
                    "Battery\t64,7 Wh\n" +
                    "Operating System\tWindows 10 Build 1803\n" +
                    "Dimensions (mm)\t361 x 262 x 26,1 (Width x Depth x Height)\n" +
                    "Weight (grams)\t2457 (Notebook) 797 (Charger)",
            // ASUS ROG ZEPHYRUS
            "Gaming laptop dengan refresh rate layar yang ekstrem sejatinya sudah menjadi senjata andalan Asus sejak lama. Mereka adalah yang pertama merilis laptop dengan layar IPS 120 Hz di tahun 2016, demikian pula untuk laptop berlayar 144 Hz, hingga akhirnya mereka mencatatkan rekor terbaru lewat laptop berlayar 240 Hz di event Computex kemarin.\n\n"
            +"\tASUS ROG Zephyrus M (GU502)\n" +
                    "Processor\tIntel Core i7 9750H (Base 2.6 GHz/Turbo Boost 4.5 GHz)\n" +
                    "Memory\tDDR4-2666 MHz up to 32 GB\n" +
                    "Graphics\tNVIDIA GeForce GTX 1660 Ti\n" +
                    "Display\t15.6 inch | 1920 x 1080 pixel | IPS | 144 Hz | 100% sRGB, Pantone Validated\n" +
                    "Storage\tM.2 SSD PCIe NVMe up to 1 TB\n" +
                    "USB Port\t3x USB 3.0, 1x USB 3.1 Type C\n" +
                    "Display Output\tHDMI, Display Port via USB Type C\n" +
                    "Ethernet\t1\n" +
                    "Audio In/Out\tHeadphone Jack\n" +
                    "Microphone Jack\n" +
                    "Operating System\tWindows 10 Build 1809\n" +
                    "Dimensions (cm)\t36 x 25 x 1.89 (Width x Depth x Height)\n" +
                    "Weight (kg)\t1.9 (Notebook)\n\n"
            +"Laptop baru ini hadir dengan dua hal baru yang tentu saja menarik, yaitu prosesor Core i7-9750H dan GPU GeForce GTX 1660 Ti. Core i7-9750H mengusung konfigurasi core yang sama dengan Core i7-8750H, pendahulunya, tetapi dengan clock yang lebih tinggi. Intel menyebutkan bahwa prosesor ini memiliki base clock 2.6 GHz, dengan single core max. frequency di 4.5 GHz. Bila dibandingkan dengan pendahulunya, prosesor ini menawarkan base clock 400 MHz lebih tinggi.\n" +
                    "\n" +
                    "Sementara untuk GPU, GeForce GTX 1660 Ti menggunakan arsitektur Turing, arsitektur yang sama dengan yang digunakan di GeForce RTX, tetapi tanpa dibekali dengan RT Core dan Tensor Core. Sebelumnya, NVIDIA telah merilis GeForce GTX 1660 Ti ini untuk desktop, dan kini mereka membawanya ke laptop untuk mengisi posisi di kelas menengah. GPU ini mengusung 1536 CUDA Core, sama seperti versi desktop, dan mengusung base clock 1455 serta boost clock 1590 MHz, di bawah yang ditawarkan versi desktop.",
            // ASUS TUF FX505
            "ASUS TUF Gaming FX505 laptop gaming dengan keyboard RGB-backlit, highlighted tombol WASD, layar berteknologi NanoEdge Display refresh rate hingga 144Hz, laptop tahan banting di segala kondisi dengan sertifikat MIL-STD-810G.\n\n"
            +"Ada kabar gembira untuk Anda yang memiliki anggaran terbatas tetapi ingin memiliki sebuah Laptop Gaming. ASUS akan menghadirkan sebuah tipe Laptop Gaming menggunakan basis TUF Gaming FX505 dengan harga jual 10 juta rupiah “kecil”. Belum diketahui pastinya tetapi mengindikasikan harganya akan di bawah 10,5 juta rupiah. Bahkan mungkin saja ada toko akan yang menjualnya dengan harga sedikit dibawah 10 juta rupiah.\n" +
                    "\n" +
                    "Dengan harga jual serendah itu, terlebih datang dari merk ASUS, siapa menyangka jika spesfikasi yang ditawarkan masih menarik. Untuk prosesor menggunakan prosesor 4-Core/8-Thread Ryzen 5 3550H, RAM 8 GB, dan Storage 1 TB HDD. Untuk kartu grafis ia menggunakan GeForce GTX 1050 3 GB GDDR5 yang secara mengejutkan pada pengujian awal kami performanya ada di atas GTX 1050 4 GB/2 GB GDDR5. Jika berkaca pada pengujian FX505DY kami terdahulu, performa Ryzen 5 3550H Laptop Gaming ini juga seharusnya sangat baik dan mampu menawarkan performa konstan tanpa mengalami gejala Throttling yang berarti.\n" +
                    "\n" +
                    "Untuk TUF Gaming FX505 juga akan tersedia dalam pilihan Ryzen 7 3750H dengan pilihan kartu grafis GTX 1650 4 GB GDDR5 dan GTX 1660 Ti 6 GB GDDR6. Semua varian akan menggunakan layar IPS dengan tingkat Color Gamut 100% sRGB.",
            // ASUS ZENBOOK PRO DUO
            "ZenBook Pro Duo adalah notebook berlayar ganda yang menampilkan ASUS ScreenPad Plus 4K, yang dipadukan dengan layar utama OLED 4K UHD, dan juga terintegrasi dengan LED-backlit NumberPad.\n\n"
            +"ZenBook Pro Duo: Senjata Utama Para Kreator Konten\n" +
                    "Mengusung 2 layar beresolusi super tinggi, dan memiliki performa ekstra kencang, membuat ZenBook Pro Duo menjadi pilihan terbaik untuk para kreator konten. Mari kita perhatikan sejenak, spesifikasi laptop super-canggih ini.\n" +
                    "\n" +
                    "Prosesor: Maksimum, Intel Core i9 Generasi ke-9\n" +
                    "\n" +
                    "Sistem grafis: Maksimum, NVIDIA RTX 2060\n" +
                    "\n" +
                    "RAM: Maksimum 32GB DDR4 Dual Channel\n" +
                    "\n" +
                    "Storage: Maksimum SSD 1TB PCIe 3.0 x4\n" +
                    "\n" +
                    "Layar utama: 15” OLED 4K (3840×2160, 16:9), Touchscreen, 100% DCI-P3, HDR, dengan bezel Nano Edge\n" +
                    "\n" +
                    "Layar kedua: 14” ScreenPad Plus “4K” (3840×1100, 32:9) IPS, touch screen\n" +
                    "\n" +
                    "Konektivitas: Wifi 6 (802.11ax) dan Bluetooth 5.0\n" +
                    "\n" +
                    "Bobot: 2,5 Kg\n" +
                    "\n" +
                    "ScreenPad Plus: Membuat pola kerja berubah\n" +
                    "Oke, kita memang tidak bisa melupakan bahwa layar 15” pada ZenBook Pro Duo ini menggunakan layar OLED touchscreen dengan profile DCI-P3 100% (standar profesional dunia perfilman) dan dukung tampilan HDR. Akan tetapi, hal yang paling menarik sebenarnya adalah ScreenPad Plus. Layar kedua ini bisa digunakan untuk menampilkan beragam aplikasi sebagaimana layaknya layar kedua saja.\n\n"
            +"Performa terbaik, menjadi titik utama ZenBook Pro Duo. Tapi ini membuat mobilitasnya terasa seperti sebuah laptop gaming. Itu sebabnya, ASUS pun memperkenalkan ZenBook Duo, pilhan yang lebih ringkas dan ringan.\n" +
                    "\n" +
                    "Prosesor: Maksimum, Intel Core i7\n" +
                    "\n" +
                    "Sistem grafis: Maksimum, NVIDIA GeForce MX250\n" +
                    "\n" +
                    "RAM: Maksimum 16GB DDR3 Dual Channel\n" +
                    "\n" +
                    "Storage: Maksimum SSD 1TB PCIe 3.0 x4\n" +
                    "\n" +
                    "Layar utama: 14” IPS FHD (1920×1080), Touchscreen, 100%, dengan bezel Nano Edge\n" +
                    "\n" +
                    "Layar kedua: 12,6” ScreenPad Plus (FHD) IPS, touch screen\n" +
                    "\n" +
                    "Konektivitas: Wifi 6 (802.11ax) dan Bluetooth 5.0\n" +
                    "\n" +
                    "Bobot: 1,8 Kg",
            // ASUS VIVOBOOK S14
            "Di bulan Februari kemarin, Asus menunjuk dua model VivoBook yang mereka pilih sebagai andalannya berkompetisi di tahun 2018: Flip 14 TP410 serta S14 S410. Tak lama dari momen itu, saya diberi kesempatan langsung untuk menjajal tipe terakhir. VivoBook S14 S410 menyuguhkan pendekatan desain clamshell tradisional, namun meski masuk ke kategori entry-level, ada banyak sentuhan premium yang produsen bubuhkan di sana.\n\n"
            +"ASUS VivoBook S14 S430UN pun tampil menawan dengan layar NanoEdge Display dengan tebal bingkai layar hanya beberapa milimeter sehingga membuat laptop 14 inci ini terasa seperti laptop 13 inci dengan tingkat Screen to Body Ratio mencapai 84 %. Layar pun menggunakan panel IPS dengan permukaan Anti-Glare yang memanjakan mata penggunanya. Tebal bodi laptop ini pun tergolong tipis dengan hanya 18 mm saja dan bobot sekitar 1,4-1,5 kg. Membuat mobilitas pengguna sehari-hari menjadi lebih mudah dan nyaman.\n\n"
            +"Di balik penampilan cantiknya, ASUS VivoBook S14 S430UN ternyata menyimpan kemampuan yang tidak dapat dipandang remeh. Untuk komponen prosesor tersedia pilihan Core i7 8550U dan Core i5 8250U yang keduanya merupakan CPU Quad-Core/Octa-Thread. Kapasitas RAM sebesar 8 GB yang dapat ditingkatkan hingga 16 GB. Sementara untuk media penyimpanan data menggunakan Storage SSD 256 GB yang membuat laptop gesit dan responsif saat digunakan serta dipadukan dengan HDD 1 TB. Sementara komponen pengolah grafis menggunakan GeForce MX150 2 GB GDDR5 yang masih mumpuni untuk memainkan game ringan.\n" +
                    "\n" +
                    "Di wilayah Indonesia ASUS VivoBook S14 S430UN dijual pada kisaran harga Rp. 15.099.000,- untuk varian Core i7 dan Rp. 12.799.000,- untuk varian Core i5. Lalu seperti apa performanya? Simak lebih lengkap di video berikut ini. Kami pun merasa terkejut laptop setipis ini memiliki kemampuan seperti itu.",
            // LENOVO IDEAPAD 320
            "Untuk sebuah laptop murah 5 jutaan, Lenovo IdeaPad 320 14ISK ini terlihat lumayan menjanjikan. Berbekal spesifikasi yang mumpuni dan desain yang bagus dan kokoh, rasanya tidak terlalu sulit untuk menjatuhkan pilihan padanya.\n\n"
            +"Yang terlihat pertama kali sebagai keunggulan atau kelebihan Lenovo IdeaPad 320 14ISK adalah pada kapasitas HDD yang sudah 1TB itu. Soal processor Intel Core i3-6006U yang digabungkan dengan RAM 4GB, itu sudah jamak. Maksudnya, rata-rata laptop dengan harga di bawah 6 jutaan saat ini memang membawa spesifikasi seperti itu juga.\n" +
                    "\n" +
                    "Hal baru yang juga dibawa Lenovo 320 14ISK adalah keberadaan port USB Type-C yang sekarang semakin banyak saja yang pakai.\n" +
                    "\n" +
                    "Sementara GPU diskrit NVIDIA GeForce GT 920MX dengan kapasitas 2GB pasti juga akan disyukuri anda yang ingin sedikit bermain game-game 3D dengan agak leluasa atau juga bekerja dengan software yang memang memerlukan tenaga GPU yang agak lebih, seperti mengedit foto dan video, atau merender kerjaan grafis yang akan dengan mudah membuat laptop tanpa GPU diskrit segera megap-megap.\n" +
                    "\n" +
                    "Ok, sebelum kita lihat apa saja kelebihan dan kekurangan Lenovo IdeaPad 320 14ISK lebih lanjut, ada baiknya Review Laptop ID sampaikan juga bahwa laptop ini punya saudara kembar identik yaitu Lenovo IdeaPad 320 14KBN.\n" +
                    "\n" +
                    "Perbedaan terbesar keduanya terletak pada processor yang digunakan. Lenovo IdeaPad 320 14KBN menggunakan Intel Core i5-7200U.",
            // MSI GL62
            "MSI Gaming GL62 hadir dengan mengusung bentang layar berukuran 15.6 inch beresolusi 1920 x 1080 pixel. Bodinya berdimensi 383 x 260 x 27-29 mm dan untuk bobotnya seberat 2.3 kg. Untuk desainnya sendiri terlihat cukup tangguh, khas laptop gaming kebanyakan.\n\n"+
                    "Laptop MSI ini memiliki bentang layar seluas 15.6 inchi beresolusi full HD 1920 X 1080 piksel. Desain laptop ini cukup garang dengan warna dominan hitam dan sedikit corak berwarna merah.\n" +
                    "\n" +
                    "Dari sektor performa, laptop ini memilki prosesor Intel Core i7 yang dikawinkan dengan RAM berkapasitas 4 GB. Selain itu terdapat juga kartu grafis dari Nvidia GTX 950M yang memiliki kecepatan memori 2 GB. Sementara itu dari media penyimpanan telah disediakan harddisk berkapasitas 1 TB.\n\n"
            +"MSI GL62 6QE Gaming\n" +
                    "MSI GL62 6QE salah satu rekomendasi laptop gaming terbaik bagi anda yang belum memiliki budget setinggi langit. Spesifikasi yang mumpuni serta fitur yang ada sudah cukup bagi kamu seorang pecinta game sejati.\n"
    };

    private static int[] laptopImages = {
            R.drawable.gambar_satu,
            R.drawable.gambar_yang_kedua,
            R.drawable.gambar_yang_ke_tiga,
            R.drawable.gambar_yang_keempat,
            R.drawable.gambar_yang_kelima,
            R.drawable.gambar_yang_ke_enam,
            R.drawable.gambar_yang_ketujuh,
            R.drawable.gambar_yang_kedelapan,
            R.drawable.gambar_yang_ke_sembilan,
            R.drawable.gambar_yang_ke_sepuluh
    };

    public static ArrayList<Laptop> getListData()
    {
        ArrayList<Laptop> list = new ArrayList<>();
        for (int position = 0 ; position < laptopNames.length; position++)
        {
            Laptop laptop = new Laptop();
            laptop.setName(laptopNames[position]);
            laptop.setPrices(laptopPrices[position]);
            laptop.setDetail(laptopDetails[position]);
            laptop.setPhoto(laptopImages[position]);
            list.add(laptop);
        }
        return list;
    }
}
