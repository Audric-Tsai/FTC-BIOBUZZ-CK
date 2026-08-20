# Part Tambahan yang Bisa Dibeli

Part opsional/upgrade — nggak wajib, tapi bisa dipertimbangkan kalau part di `part_minimum.md` ternyata kurang setelah dites di robot beneran. Urutan bab sama dengan file minimum: Sasis, Penggerak, Odometri, Pengambil, Pelontar, Sensor.

## Daftar Isi

- [Sasis](#sasis)
- [Penggerak](#penggerak)
- [Odometri](#odometri)
- [Pengambil](#pengambil)
- [Pelontar](#pelontar)
- [Sensor](#sensor)

## Sasis

Perbandingan material kalau butuh alternatif dari aluminium (yang sudah dipakai buat rangka utama):

```text
Material                 Contoh Produk                            Harga (perkiraan)                    Massa/Densitas   Sumber Beli                            
---------------------------------------------------------------------------------------------------------------------------------------------------------------
Aluminium 6061-T6        REV Extrusion/C-Channel (sudah dipakai)  ~US$3.5-6/kg (bahan baku)            2.70 g/cm3       revrobotics.com/ftc/ (part resmi)      
Carbon Fiber (hobi)      Plat carbon fiber 3mm, 40x50cm           ~Rp900rb - 1.6jt                     1.55-1.60 g/cm3  Tokopedia (cari "plat carbon fiber")   
Carbon Fiber (industri)  DragonPlate Economy 1/32" 6x6in          US$15 s/d ribuan US$ (lembar besar)  1.55-1.60 g/cm3  dragonplate.com                        
PETG/ABS (filamen 3D)    Filamen 1kg                              ~US$18-30/kg (~Rp300-500rb/kg)       1.04-1.27 g/cm3  Tokopedia/Shopee (toko filamen lokal)  
```

**Aluminium 6061-T6** — Kuat, mudah dikerjakan (dipotong/dibor/ditap alat biasa), standar ekosistem FTC, paling murah per kg. Kekurangan: paling berat, bisa penyok kena benturan, konduktif listrik.

**Carbon Fiber** — Sangat ringan (~separuh aluminium) dan sangat kaku, cocok buat lengan panjang seperti linear slide. Kekurangan: SANGAT MAHAL (15-30x aluminium per kg), sulit dipotong (butuh alat khusus + masker, debunya berbahaya), rapuh terhadap beban titik/baut, konduktif juga.

**Plastik Cetak 3D (PETG/ABS/Nylon)** — Bisa cetak bentuk custom apa saja (bracket, adapter), murah per part, cepat iterasi, ringan. Kekurangan: nggak sekuat logam buat beban besar berulang, butuh akses printer 3D, toleransi dimensi kurang presisi, sensitif suhu.

**Rekomendasi:** Jangan beli carbon fiber dulu kecuali ada kebutuhan spesifik (lengan ringan & kaku). Plastik cetak 3D cuma kalau punya akses printer, buat bracket kecil/adapter — bukan struktur utama. Buat material panel/cover (polikarbonat dan alternatifnya), lihat bab Sasis di `part_minimum.md`.

## Penggerak

Alternatif kalau nggak jadi pakai goBILDA 96mm (di file minimum) — pilih SATU, bukan dua-duanya:

```text
SKU          Nama Part                                                    Harga      Link                                      
-------------------------------------------------------------------------------------------------------------------------------
REV-45-1655  REV 75mm Mecanum Wheel Set (4 wheels: 2L/2R + hex adapters)  US$160.00  https://www.revrobotics.com/rev-45-1655/  
```

**REV 75mm Mecanum Wheel Set** — Profil lebih rendah (75mm vs 96mm goBILDA), lebih banyak ruang di bawah sasis buat intake/mekanisme lain. Native fit ke sistem hex 5mm REV DUO (nggak perlu adapter). Pilih ini kalau desain penggerak CK terbatas ruang vertikalnya; goBILDA 96mm (di file minimum) tetap pilihan default yang lebih umum/terbukti di komunitas FTC.

## Odometri

### Peringkat Popularitas di Komunitas FTC

Nggak ada survei resmi/statistik pasti soal ini (FIRST nggak merilis data penggunaan part per tim), jadi ini berdasarkan konsensus komunitas (forum, dokumentasi resmi, thread build tim) — bukan angka statistik keras:

1. **Dead wheel generik + encoder (REV Through Bore Encoder, DIY)** — paling umum/paling lama dipakai di FTC. Ini metode default yang diasumsikan hampir semua tutorial & library odometry (termasuk RoadRunner) sejak bertahun-tahun, sebelum ada produk odometry "siap pakai".
2. **goBILDA Pinpoint** — makin populer belakangan karena menyederhanakan setup (nggak perlu hitung sendiri pose exponential) sambil tetap pakai dead wheel yang akurat. Banyak tim yang tadinya pakai dead wheel generik pindah ke ini sebagai upgrade.
3. **SparkFun OTOS** — paling baru dari tiga opsi ini, masih dianggap "opsi baru/emerging" di komunitas. Adopsinya lebih sedikit dibanding dua di atas, meskipun secara instalasi paling sederhana (makanya tetap direkomendasikan di file minimum buat CK yang baru mulai).

Upgrade dari SparkFun OTOS (di file minimum) kalau butuh presisi lebih tinggi, atau opsi paling hemat kalau mau rakit sendiri:

```text
SKU             Nama Part                                                  Harga           Link                                                                                           
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3110-0002-0002  goBILDA Pinpoint V2 Odometry Computer                      US$79.99        https://www.gobilda.com/pinpoint-v2-odometry-computer-imu-sensor-fusion-for-2-wheel-odometry/  
3110-0001-0001  goBILDA Swingarm Odometry Pod (48mm Wheel) - butuh 2x      US$99.99 /pod   https://www.gobilda.com/swingarm-odometry-pod-48mm-wheel/                                      
REV-11-3174     REV Through Bore Encoder V2 (DIY dead wheel) - butuh 2-3x  US$48.00 /unit  https://www.revrobotics.com/rev-11-3174/                                                       
```

**Opsi B — Presisi Tinggi: Pinpoint V2 + 2x Swingarm Odometry Pod** — 1 pod menghadap maju-mundur, 1 pod menghadap kiri-kanan, digabung Pinpoint (fusion IMU, update 1500Hz). Total ~US$279.97. Setup lebih "berat" secara instalasi (butuh ruang 2 pod + kalibrasi trackwidth) tapi jadi standar tim FTC kompetitif yang serius soal presisi — dan ini yang paling banyak dipakai kedua di komunitas.

**Opsi C — Paling Hemat & Paling Umum: 2-3x REV Through Bore Encoder V2 (DIY)** — Pasang ke wheel kecil + mounting pegas custom, baca lewat port encoder Expansion/Control Hub langsung (nggak perlu beli coprocessor). Kalau 2 encoder, gabungkan dengan IMU bawaan Control Hub buat heading. Paling murah, paling banyak kerja rakit + tuning kode, tapi ini justru metode yang PALING UMUM dipakai secara historis di komunitas FTC.

## Pengambil

Perbandingan motor kalau nggak jadi pakai HD Hex Motor yang sudah dimiliki (opsi di file minimum adalah $0):

```text
Motor                                                                      Speed Bebas  Torsi Stall  Arus Stall   Poros Output               Harga      Status            
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
goBILDA Matrix 12V DC Motor (mentah)                                       ~6000 RPM    Rendah*      ~10 A        Butuh gearbox/pulley luar  ~US$32-35  Belum punya       
AndyMark NeveRest Motor Only (mentah)                                      6000 RPM     0.062 N-m*   11.5 A       Bulat 3.175mm (BUKAN hex)  US$9-25    Belum punya       
REV Core Hex Motor (REV-41-1300)                                           125 RPM      3.2 N-m      4.4 A        5mm hex female (72:1)      US$32      Sudah punya (2x)  
REV HD Hex Motor - UltraPlanetary Kit (REV-41-1600), 1 stage rasio rendah  Bisa diatur  Bisa diatur  Bisa diatur  5mm hex male               ~US$60     Sudah punya (6x)  
```
*Angka torsi/arus goBILDA Matrix & AndyMark NeveRest adalah motor MENTAH tanpa gearbox — torsinya kecil sekali, butuh reduksi gigi/pulley luar.

Kalau mau motor terpisah/khusus buat intake (nggak "pinjam" dari mekanisme lain): pilih **goBILDA Matrix** kalau butuh RPM tinggi dan mau rakit sistem reduksi sendiri. Hindari **AndyMark NeveRest Motor Only** kecuali juga beli adapter poros bulat-ke-hex. **REV Core Hex Motor** paling gampang dipasang tapi paling lambat.

### Part Non-Motor untuk Eksperimen Roller di Luar Ekosistem FTC

Khusus roller karet, shaft, hub, bearing, collar — buat coba rakit versi intake sendiri di luar part resmi REV/goBILDA. Part struktural/mekanis (bukan motor/sensor) nggak kena aturan "motor legal FTC", tapi tetap double-check ke mentor/wasit kalau ragu.

**Shaft 5mm Hex Asli (ServoCity, kompatibel langsung REV):**
- [5mm x 150mm Stainless Steel Precision Shafting](https://www.servocity.com/5mm-x-150mm-stainless-steel-precision-shafting/)
- [5mm x 200mm Stainless Steel Precision Shafting](https://www.servocity.com/5mm-x-200mm-stainless-steel-precision-shafting/)
- [5mm x 250mm Stainless Steel Precision Shafting](https://www.servocity.com/5mm-x-250mm-stainless-steel-precision-shafting/)
- [5mm x 300mm Stainless Steel Precision Shafting](https://www.servocity.com/5mm-x-300mm-stainless-steel-precision-shafting/)
- [1310 Series Hyper Hub (5mm Hex Bore)](https://www.servocity.com/1310-series-hyper-hub-5mm-hex-bore/)
- [1309 Series Sonic Hub (5mm Hex Bore)](https://www.servocity.com/1309-series-sonic-hub-5mm-hex-bore/)
- [5mm Hex Clamping Hub](https://www.servocity.com/5mm-hex-clamping-hub/)
- [5mm Hex Bore Couplers](https://www.servocity.com/5mm-hex-bore-couplers/)

**Shaft Collar & Coupler:**
- [2920 Series Steel Set-Screw Collar (5mm Bore) - 2 Pack](https://www.servocity.com/2920-series-steel-set-screw-collar-5mm-bore-2-pack/) — ~US$4.99
- [5mm to 6mm Set-Screw Shaft Coupler](https://www.servocity.com/5mm-to-6mm-set-screw-shaft-coupler/) — ~US$4.99
- [4mm to 5mm Set-Screw Shaft Coupler](https://www.servocity.com/4mm-to-5mm-set-screw-shaft-coupler/) — ~US$4.99
- [0.250" to 5mm Set-Screw Shaft Coupler](https://www.servocity.com/0-250-to-5mm-set-screw-shaft-coupler/) — ~US$4.99

**Hub Adapter Hex ke Roda Generik:**
- [5mm Metal Combiner Wheel Hub Hex Adapter](https://www.aliexpress.com/item/1005001950511773.html) — AliExpress

**Bearing Generik (murah, bore BUKAN hex):**
- [Bearing Lakher 608 RS](https://www.tokopedia.com/venny-vioren-etdrgds/bearing-lakher-608-rs-inline-skate-skateboard-sepatu-roda-1730197308122694698) — Tokopedia
- [Ceramic Ball Bearing 608](https://www.tokopedia.com/tokokerabit/fashion-ceramic-ball-bearing-608-skateboard-black-finger-fidget-spinner-toy-replacement-1732090656167199905) — Tokopedia
- [Pro 608 ZZ (ABEC-7) — isi 10 pcs](https://www.tokopedia.com/zay-yana/alm1-8-10-pieces-pro-608-zz-abec-7-roller-skate-bearing) — Tokopedia
- [Laher/Bearing 608 Z](https://www.tokopedia.com/rivajayamotor/laher-bearing-608-z) — Tokopedia

**Roller/Roda Karet untuk Eksperimen Compliant Wheel:**
- [iSeeRobot Silicone Wheel Set 18x40mm](https://www.tokopedia.com/isee/silicone-wheel-set-18-x-40mm-roda-silikon-karet-anti-slip-roda-line-tracer-roda-robot-sumo-silicone-only-7edaf) — Tokopedia
- [iSeeRobot Silicone Wheel Set 24x20mm](https://www.tokopedia.com/isee/silicone-wheel-set-24-x-20mm-roda-silikon-karet-anti-slip-roda-line-tracer-roda-robot-sumo-silicone-only-fb9ce) — Tokopedia
- [Roda Karet ABU Troli Kastor Caster (3/4/5 inch, dengan bearing)](https://www.tokopedia.com/inspiretech/roda-karet-abu-troli-kastor-caster-trolley-mati-hidup-rem-bahan-tebal-heavy-duty-dengan-bearing-tatakan-3-4-5inch-1731271202333099147) — Tokopedia
- [Roda Karet 4" (100mm) tanpa rumah](https://www.tokopedia.com/esihsalsihh/roda-karet-4-roda-saja-roda-troli-4-inci-roda-tanpa-rumah-4-inch-100mm) — Tokopedia
- [Roller Roda Karet Kecil (multifungsi, logam)](https://www.tokopedia.com/jual-grosir-perabot-lokal/original-roller-roda-karet-alat-bantu-pemasangan-multifungsi-logam-1729606582922675329) — Tokopedia
- [Roda Karet 4 Inchi 1 Set Roda Miniatur](https://www.tokopedia.com/alluneedsshop/roda-karet-4-inchi-1-set-roda-miniatur-roda-as-1729946318723451047) — Tokopedia
- [Rubber Coated Conveyor Belt Roller](https://www.aliexpress.com/item/1005008987356216.html) — AliExpress
- [2" Small Rubber Roller with Shaft](https://www.aliexpress.com/item/32668436059.html) — AliExpress
- Surgical Tubing 3mm dililit ke hub/roller polos — sudah dimiliki (2x), cara termurah bikin compliant surface

**Kesimpulan:** Part ServoCity langsung kompatibel hex 5mm REV tanpa modifikasi. Part Tokopedia/AliExpress jauh lebih murah tapi hampir semua bore-nya BUKAN hex 5mm — butuh hub/coupler adapter (dari daftar ServoCity di atas, atau print custom).

## Pelontar

Upgrade motor & wheel kalau part yang sudah dimiliki (di file minimum) kurang kencang/kurang jauh:

```text
SKU             Nama Part                                                                  Harga        Link                                                                                                                                   
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
5204-8002-0003  goBILDA Yellow Jacket Planetary Gear Motor (3.7:1, 1620 RPM, 8mm REX)      US$56.99     https://www.gobilda.com/5204-series-yellow-jacket-planetary-gear-motor-3-7-1-ratio-80mm-length-8mm-rex-shaft-1620-rpm-3-3-5v-encoder/  
NA              goBILDA GripForce Wheel (40A Durometer) - cek varian traction non-mecanum  cek katalog  https://www.gobilda.com/gripforce-mecanum-wheel-set-o104mm-40a-durometer-rollers/                                                      
```

**goBILDA Yellow Jacket 3.7:1 (1620 RPM)** — RPM bebas jauh lebih tinggi dari HD Hex Motor standar. CATATAN: shaft 8mm REX (goBILDA), BUKAN hex 5mm REV — wajib adapter.

**Wheel durometer keras (GripForce 40A+)** — semakin keras wheel-nya, semakin banyak energi tersalur ke game piece saat kontak (kebalikan dari wheel intake yang harus lunak).

**Cara Build — Hal Penting:**
1. Jarak "squeeze" antar wheel dan dinding/flywheel lain adalah parameter utama yang di-tuning setelah tes lapangan.
2. RPM diatur dari kode buat kontrol jarak tembak, bukan diubah fisik.
3. Pakai kontrol PID buat jaga RPM stabil — tanpa ini gampang overshoot/undershoot dan akurasi nggak konsisten.
4. Catat spin-up time (waktu sampai RPM target) buat strategi timing pertandingan.

**Link Panduan:**
- [REV Robotics — Flywheel Launcher](https://docs.revrobotics.com/ftc-kickoff-concepts/ultimate-goal-2020-2021/shooter)
- [Game Manual 0 — Common Mechanisms](https://gm0.org/en/latest/docs/common-mechanisms/index.html)
- [Purdue SIGBots Wiki — Flywheel](https://wiki.purduesigbots.com/hardware/shooting-mechanisms/flywheel)
- [YETI Robotics Wiki — Shooter Designs](https://wiki.yetirobotics.org/books/design-process/page/shooter-designs)
- [Instructables — Servo Powered Catapult](https://www.instructables.com/Servo-Powered-Catapult/)

**Video YouTube:**
- [Shooter Part 1 - FTC Ultimate Goal 2020-2021 Prototyping](https://www.youtube.com/watch?v=eHVtErHj9lg)
- [How To Make Flywheel Shooters](https://www.youtube.com/watch?v=Q_BKq6YykDY)
- [FIRST Global Flywheel Shooter Tutorial](https://www.youtube.com/watch?v=An3xoJgk2uI)
- [Functional ChooChoo Catapult: FTC Decode](https://www.youtube.com/shorts/7JoVEDv8vUE)
- [Reliable Shooter With Servo Launcher — Team 24909 StarLight](https://www.youtube.com/shorts/9El5UcekiR0)

## Sensor

Upgrade dari kamera Logitech C270 yang sudah dimiliki (di file minimum $0):

```text
SKU          Nama Part               Harga     Link                                      
-----------------------------------------------------------------------------------------
REV-31-1557  REV Color Sensor V3     US$20.75  https://www.revrobotics.com/rev-31-1557/  
REV-31-1505  REV 2m Distance Sensor  US$31.50  https://www.revrobotics.com/rev-31-1505/  
REV-31-1425  REV Touch Sensor        US$8.75   https://www.revrobotics.com/rev-31-1425/  
```

**REV Color Sensor V3** — Berguna buat deteksi warna game piece (kalau musim ini ada sortir berdasarkan warna) atau deteksi garis lapangan.

**REV 2m Distance Sensor** — Berguna buat auto-align ke dinding/game piece, atau deteksi jarak ke robot lain/elemen lapangan.

**REV Touch Sensor** — Limit switch buat referensi posisi mekanisme (misalnya indexer launcher yang dibahas di `mechanisms/launcher/03_indexer_flywheel.md`), murah dan sering dianggap "wajib" di banyak tim FTC buat homing mekanisme.
