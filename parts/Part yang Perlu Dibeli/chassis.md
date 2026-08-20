# Chassis — Material yang Perlu Dipertimbangkan/Dibeli

Perbandingan material buat CK mempertimbangkan rangka/panel robot: kelebihan, kekurangan, biaya, massa, dan link beli konkret.

## Yang Sudah Dimiliki

Semua part struktural dari 2x Starter Kit V3.1 (C-Channel, extrusion 15mm, plat bracket — lihat `../Part yang Dimiliki/parts_we_have.md`) sudah aluminium 6061-T6. Kalau butuh tambahan panjang extrusion/C-Channel, tinggal beli lagi part REV dengan SKU yang sama (REV-41-1762, REV-41-1568, dst — cek katalog REV FTC).

## Perbandingan Biaya & Massa (Estimasi)

```text
Material                 Contoh Produk                             Harga (perkiraan)                    Massa/Densitas   Sumber Beli                             
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
Aluminium 6061-T6        REV Extrusion/C-Channel (sudah dipakai)   ~US$3.5-6/kg (bahan baku)            2.70 g/cm3       revrobotics.com/ftc/ (part resmi)       
Carbon Fiber (hobi)      Plat carbon fiber 3mm, 40x50cm            ~Rp900rb - 1.6jt                     1.55-1.60 g/cm3  Tokopedia (cari "plat carbon fiber")    
Carbon Fiber (industri)  DragonPlate Economy 1/32" 6x6in           US$15 s/d ribuan US$ (lembar besar)  1.55-1.60 g/cm3  dragonplate.com                         
PETG/ABS (filamen 3D)    Filamen 1kg                               ~US$18-30/kg (~Rp300-500rb/kg)       1.04-1.27 g/cm3  Tokopedia/Shopee (toko filamen lokal)   
Polikarbonat (Lexan)     Lembaran 3mm, 40x40cm                     ~Rp340rb                             1.20 g/cm3       Tokopedia (cari "polycarbonate sheet")  
Polikarbonat (Lexan)     Lembaran 3mm, 122x244cm (1 lembar besar)  ~Rp1.17jt                            1.20 g/cm3       Tokopedia                               
Polikarbonat (Lexan)     Lembaran 2mm, 122x244cm                   ~Rp850-925rb                         1.20 g/cm3       Tokopedia                               
```

Harga carbon fiber & polikarbonat di atas hasil pencarian listing Tokopedia saat ini (bisa berubah, cek langsung sebelum beli). Harga aluminium & carbon fiber industri dari data harga global (bahan mentah, belum termasuk ongkos potong custom).

## Aluminium 6061-T6

Material standar industri FTC — REV DUO Build System (C-Channel, extrusion 15mm, plat) yang CK sudah punya semuanya dibuat dari aluminium 6061-T6. Ini paduan (alloy) yang diberi perlakuan panas (T6 temper) supaya kekuatannya jauh lebih baik dari aluminium murni, tapi masih cukup lunak untuk dipotong, dibor, dan ditap dengan alat biasa.

**Kelebihan:**
- Kuat dan kaku — cukup menahan beban chassis, motor, dan mekanisme tanpa melentur berlebihan.
- Mudah dikerjakan — bisa dipotong, dibor, ditap ulir pakai alat tangan/mesin sederhana, nggak butuh alat khusus.
- Sudah jadi standar ekosistem FTC — pola lubang/ukuran REV DUO dan goBILDA memang dirancang untuk material ini, jadi nggak perlu adaptasi.
- Tahan lama dan bisa dipakai ulang — part aluminium biasanya masih bisa dipakai ulang di robot musim berikutnya.
- Harganya paling murah per kilogram dibanding carbon fiber.

**Kekurangan:**
- Paling berat dibanding carbon fiber untuk kekuatan yang setara — kontributor berat terbesar kalau robot mepet batas berat maksimum FTC.
- Bisa penyok kalau kena benturan keras (tabrakan antar robot), meski jarang sampai patah.
- Konduktif listrik — harus hati-hati soal short circuit kalau ada kabel terkelupas menyentuh rangka.

## Carbon Fiber (Serat Karbon)

Material komposit dari serat karbon dianyam lalu direkatkan resin (epoxy), dibentuk jadi lembaran/tabung/batangan. Rasio kekuatan-terhadap-berat sangat tinggi, umum dipakai industri pesawat dan otomotif balap.

**Kelebihan:**
- Sangat ringan — densitas ~1.55-1.60 g/cm3, hampir separuh aluminium (2.70 g/cm3) untuk kekuatan tarik yang sebanding/lebih baik di beberapa aspek.
- Sangat kaku — nggak gampang melentur, cocok untuk bagian panjang seperti lengan linear slide yang harus tetap presisi meski diperpanjang jauh.
- Terlihat premium, sering dipakai tim kompetitif top sebagai "upgrade" di bagian kritis.

**Kekurangan:**
- SANGAT MAHAL — bisa 15-30x lebih mahal per kilogram dibanding aluminium. Untuk budget tim FTC rata-rata, cuma masuk akal dipakai di part kecil, bukan seluruh chassis.
- Sulit dikerjakan — motong butuh alat khusus (mata gergaji diamond/carbide), debunya berbahaya kalau terhirup — WAJIB pakai masker dan exhaust.
- Rapuh terhadap beban titik (point load) — gampang retak/delaminasi di titik yang menahan baut atau benturan tajam, beda dengan aluminium yang cenderung penyok dulu sebelum patah.
- Konduktif juga (serat karbon menghantarkan listrik), tetap perlu hati-hati soal short circuit.
- Nggak fleksibel untuk desain iteratif — begitu dipotong dan dibentuk, sulit dimodifikasi ulang dibanding aluminium.

## Plastik Cetak 3D (PETG / ABS / Nylon)

Material yang dicetak lapis demi lapis pakai printer 3D FDM, berdasarkan desain CAD sendiri. Paling umum: PETG (kombinasi kekuatan & kemudahan cetak yang baik), ABS (lebih ringan, tapi lebih rapuh & bisa warping saat dicetak), Nylon (paling kuat & fleksibel, tapi paling sulit dicetak).

**Kelebihan:**
- Bisa cetak bentuk apa saja — bracket custom, dudukan sensor, adapter antar sistem (termasuk adapter hex REV ke shaft generik yang dibahas di `intake.md`) yang nggak ada di katalog manapun.
- Murah per part — begitu punya akses printer 3D, biaya materialnya sangat rendah dibanding beli part custom-machined.
- Cepat iterasi — desain salah/kurang pas tinggal edit file CAD dan cetak ulang.
- Ringan — PETG (1.27 g/cm3) dan ABS (1.04 g/cm3) keduanya lebih ringan dari aluminium.

**Kekurangan:**
- Nggak sekuat logam — untuk bagian yang menahan beban besar berulang (dudukan motor drivetrain), bisa retak di lapisan cetakannya (layer lines = titik lemah struktural).
- Butuh printer 3D — kalau nggak ada akses, jadi bergantung jasa print luar yang menambah waktu tunggu dan biaya.
- Toleransi dimensi kurang presisi dibanding part logam machined — lubang baut kadang perlu direamer/dikikir manual.
- Sensitif suhu — PETG dan ABS bisa melunak/berubah bentuk kalau kepanasan (kelamaan kena matahari langsung, dekat komponen panas).

## Polikarbonat (Lexan)

Lembaran plastik transparan/tembus pandang yang sangat tahan benturan — merek dagang terkenalnya "Lexan". Sering dipakai FRC/FTC untuk panel penutup (bumper cover, panel pelindung mekanisme, penutup elektronik).

**Kelebihan:**
- Sangat tahan benturan — jauh lebih tahan pecah dibanding akrilik/plastik kaca biasa.
- Ringan — densitas ~1.20 g/cm3, jauh lebih ringan dari aluminium.
- Bisa transparan — berguna kalau ingin panel penutup yang tetap memperlihatkan mekanisme di dalamnya.
- Mudah dipotong dan dibentuk — gergaji biasa atau cutter untuk lembaran tipis, nggak butuh alat industri khusus.
- Harganya terjangkau dibanding carbon fiber.

**Kekurangan:**
- Bukan untuk struktur penahan beban utama — cenderung melentur di bawah beban berat, nggak cocok jadi rangka utama atau dudukan motor.
- Gampang tergores, terutama yang transparan — mempengaruhi penampilan meski nggak mempengaruhi kekuatan.
- Perlu baut dengan washer besar/grommet saat dipasang — kalau baut terlalu kencang langsung ke lembaran tipis, bisa retak di sekitar lubang.

## Rekomendasi

1. **Tetap pakai aluminium 6061-T6 untuk seluruh chassis dasar** — sudah dimiliki banyak dari Starter Kit, murah kalau perlu restock, dan seluruh ekosistem REV DUO memang dirancang untuk material ini.
2. **JANGAN beli carbon fiber dulu** kecuali sudah ada kebutuhan spesifik (misalnya lengan linear slide yang butuh sangat ringan & kaku) — harganya per lembar kecil saja sudah setara jutaan rupiah, jauh lebih mahal dari budget material chassis biasa.
3. **Polikarbonat cukup terjangkau** untuk panel penutup/pelindung — kalau CK butuh menutup mekanisme dari benturan game piece atau robot lawan, lembaran 3mm ukuran kecil-menengah (~Rp340rb) sudah cukup untuk beberapa panel.
4. **Plastik cetak 3D** cuma perlu dipertimbangkan kalau CK punya akses printer 3D — untuk bracket kecil/adapter custom, bukan untuk struktur utama.
