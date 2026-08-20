# Intake (Roller / Compliant Wheel) — Parts yang Perlu Dibeli

Musim ini game piece-nya bola, jadi jenis intake yang dipakai adalah **Roller / Compliant Wheel Intake** (lihat penjelasan lengkap jenisnya di repo `Dasar-Dasar-FTC`, folder `mechanisms/intake/01_roller.md`).

## Yang Sudah Dimiliki (Nggak Perlu Beli Lagi)

Cek `../Parts We Own/parts_we_have.md` — untuk roller intake, part inti berikut ini SUDAH ADA di inventaris CK:

- 4x REV Flap Wheel - 5mm Hex Bore - Medium - 4 Pack (REV-41-2702-PK4) — roller compliant utama
- 4x REV 1in Grip Wheel - 5mm Hex Bore - Soft (Light Gray) - 4 Pack (REV-41-2150-PK4) — alternatif roller, lebih grippy
- 2x Core Hex Motor (REV-41-1300) — motor siap pakai
- 6x UltraPlanetary Gearbox Kit & HD Hex Motor (REV-41-1600) — motor + gearbox yang rasionya bisa diatur sendiri
- Hex shaft berbagai ukuran, bearing/pillow block, sprocket, #25 chain — semua sudah ada untuk merakit rangka roller

Jadi secara teori, **CK bisa mulai prototipe roller intake tanpa beli apa pun** — tinggal pakai Flap Wheel/Grip Wheel yang sudah ada dan salah satu motor yang sudah dimiliki.

## Perbandingan Motor untuk Roller Intake

Kamu minta dibandingkan 4 opsi motor 12V DC berikut. Ini datanya:

```text
Motor                                   Speed Bebas   Torsi Stall    Arus Stall   Poros Output              Harga        Status
---------------------------------------------------------------------------------------------------------------------------------------
goBILDA Matrix 12V DC Motor (mentah)    ~6000 RPM     Rendah*        ~10 A        Butuh gearbox/pulley luar  ~US$32-35    Belum punya
AndyMark NeveRest Motor Only (mentah)   6000 RPM      0.062 N-m*     11.5 A       Bulat 3.175mm (BUKAN hex)  US$9-25      Belum punya
REV Core Hex Motor (REV-41-1300)        125 RPM       3.2 N-m        4.4 A        5mm hex female (72:1)     US$32        Sudah punya (2x)
REV HD Hex Motor — UltraPlanetary Kit   Bisa diatur   Bisa diatur    Bisa diatur  5mm hex male               ~US$60       Sudah punya (6x)
(REV-41-1600)                           (1-3 stage)   (1-3 stage)    (1-3 stage)
```
*Angka torsi/arus untuk goBILDA Matrix dan AndyMark NeveRest adalah motor MENTAH tanpa gearbox — dalam kondisi asli, torsinya kecil sekali dan butuh reduksi gigi/pulley di luar motor supaya bisa dipakai buat roller.

### Penjelasan Tiap Motor

**goBILDA Matrix 12V DC Motor** — Motor mentah (cell RS-555) berkecepatan sangat tinggi, sering dipakai sebagai "jantung" dari gearbox Yellow Jacket goBILDA. Bagus kalau kamu mau bikin roller yang berputar sangat cepat (misalnya lewat reduksi pulley/sprocket kecil ke besar), tapi karena nggak ada gearbox bawaan, kamu harus rakit sendiri sistem reduksinya. Perlu dicek lagi harga & ketersediaan terbaru di gobilda.com karena beberapa varian SKU sempat discontinued.

**AndyMark NeveRest Motor Only** — Paling murah dari semua opsi, dan legal FTC (pakai motor dasar am-3104 yang ada di daftar motor legal FTC). Tapi poros outputnya bulat 3.175mm, BUKAN hex 5mm seperti standar REV/goBILDA — jadi butuh adapter atau hub tambahan supaya bisa nyambung ke hex shaft/roller yang CK pakai. Torsi mentahnya juga sangat kecil, wajib pakai reduksi luar.

**REV Core Hex Motor** — Sudah dimiliki, tinggal pakai. Plug-and-play karena sudah ada gearbox 72:1 built-in dan poros hex 5mm female. Tapi RPM-nya cuma 125 — buat roller intake ini agak lambat, biasanya perlu step-up (bukan step-down) lewat sprocket kalau mau roller berputar lebih cepat dari 125 RPM.

**REV HD Hex Motor (UltraPlanetary Kit)** — Sudah dimiliki 6 unit. Ini yang paling fleksibel: gearbox-nya modular, kamu bisa pasang cuma 1 stage (rasio kecil seperti 3:1 atau 4:1) supaya RPM output jadi tinggi dan cocok buat roller intake yang butuh putaran cepat. Nggak perlu beli apa-apa, tinggal rakit ulang salah satu kit yang sudah ada dengan konfigurasi rasio rendah.

### Rekomendasi

**Pakai REV HD Hex Motor (UltraPlanetary Kit) yang sudah dimiliki, dikonfigurasi 1 stage rasio rendah (3:1 atau 4:1).** Ini pilihan paling murah (nggak perlu beli motor baru sama sekali) dan paling fleksibel karena rasionya bisa disetel ulang kalau ternyata kurang/kelebihan RPM setelah dites.

Kalau CK tetap mau motor terpisah/khusus buat intake supaya nggak "pinjam" dari drivetrain/mekanisme lain:
- Pilih **goBILDA Matrix** kalau butuh RPM tinggi dan nggak keberatan rakit sistem reduksi sendiri.
- Hindari **AndyMark NeveRest Motor Only** kecuali CK juga beli adapter poros bulat-ke-hex, karena bakal butuh part tambahan yang nggak ada di ekosistem REV DUO yang sudah dipakai.
- **REV Core Hex Motor** paling gampang dipasang tapi paling lambat — cuma cocok kalau strategi CK nggak butuh roller super cepat.

## Part Non-Motor untuk Eksperimen Roller di Luar Ekosistem FTC

Ini KHUSUS bagian non-motor dan non-sensor — roller karet, shaft, dan part struktural lain — buat CK coba rakit versi intake sendiri di luar part resmi REV/goBILDA, sekadar untuk eksperimen dan perbandingan desain. (Motor tetap harus dari salah satu dari 4 opsi di tabel perbandingan di atas — nggak dicari alternatif di luar itu.)

Catatan: part struktural/mekanis (bukan motor, bukan sensor) nggak kena aturan "motor legal FTC" di atas — sepanjang bentuk akhirnya nggak melanggar batasan ukuran/material robot di Game Manual, part generik untuk roller/shaft/bearing boleh dipakai di robot kompetisi. Tetap double-check ke mentor/wasit kalau ragu.

```text
Kategori          Contoh Part                                                          Sumber                    Catatan
--------------------------------------------------------------------------------------------------------------------------------------------------------------
Roller karet      Silicone Wheel Set 18x40mm / 24x20mm (roda silikon anti-slip)        Tokopedia (iSeeRobot)     Awalnya buat robot line-tracer/sumo, tapi bentuknya
                                                                                                                   silinder karet lunak — bisa dites sebagai roller
                                                                                                                   compliant kalau bore-nya dibubut/diadaptasi ke shaft CK
Roller karet      "rubber wheels for robot" / "robot silicone wheel"                   AliExpress                Banyak varian diameter & durometer, tapi cek dulu ukuran
                                                                                                                   bore-nya — kemungkinan besar nggak match 5mm hex REV,
                                                                                                                   perlu adapter/print custom
Roller DIY        Surgical Tubing 3mm yang dililit ke hub/roller polos                 Sudah dimiliki (2x)       Cara termurah: bungkus tubing karet ke hub plastik/metal
                                                                                                                   biar permukaannya jadi compliant, mirip roller pabrikan
Shaft             As/poros besi atau aluminium bulat (BUKAN hex) diameter 5mm          Toko onderdil/bubut lokal, Lebih murah dari hex shaft REV, tapi HARUS pakai hub/set
                                                                                       Tokopedia "as besi 5mm"    screw karena nggak ada sisi datar buat gigit torsi —
                                                                                                                   berisiko selip kalau torsinya besar
Bearing           Bearing 608 (umum dipakai di skateboard/inline skate)                Toko onderdil/hardware     Sangat murah & mudah dicari di mana saja, tapi ukurannya
                                                                                       lokal, Tokopedia          nggak match hex bore REV — perlu housing/pillow block custom
Bearing/pillow    "pillow block bearing for shaft 5mm"                                  Banggood, AliExpress      Lebih dekat ke spek REV (bore 5mm), tapi bentuk pillow
block                                                                                                             block-nya beda pola lubang mounting, perlu bracket adaptasi
Shaft collar      Collar set-screw generik ukuran 5mm/6mm/8mm                           Toko hardware/bearing     Fungsinya sama seperti REV Shaft Collar, harga jauh lebih
                                                                                       lokal, Tokopedia          murah, biasanya cocok tanpa modifikasi
```

**Kesimpulan:** Part roller karet dan bearing generik gampang ditemukan dan murah, tapi hampir semua nggak punya bore hex 5mm seperti standar REV DUO — jadi tetap butuh kerja tambahan (adaptasi/bubut/print adapter) supaya nyambung ke sistem shaft yang CK sudah pakai. Ini cocok buat eksperimen desain roller (bentuk, durometer, pola alur) dengan biaya murah sebelum commit ke part resmi buat robot final.
