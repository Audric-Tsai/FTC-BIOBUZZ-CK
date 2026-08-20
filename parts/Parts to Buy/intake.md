# Intake (Roller / Compliant Wheel) — Parts yang Perlu Dibeli

Musim ini game piece-nya bola, jadi jenis intake yang dipakai adalah **Roller / Compliant Wheel Intake** (lihat penjelasan lengkap jenisnya di repo `Dasar-Dasar-FTC`, folder `mechanisms/intake/01_roller.md`).

## Yang Sudah Dimiliki (Nggak Perlu Beli Lagi)

Cek `parts_we_have.md` — untuk roller intake, part inti berikut ini SUDAH ADA di inventaris CK:

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

## Sumber Alternatif di Luar Merek Resmi (Shopee, Tokopedia, Taobao)

**PERINGATAN LEGALITAS:** Peraturan FTC (Game Manual bagian motor legal) mewajibkan motor 12V yang dipakai di robot KOMPETISI harus dari daftar motor yang diizinkan (REV Robotics, goBILDA/Modern Robotics Matrix, AndyMark NeveRest, Tetrix, dan beberapa lagi). Motor DC gearbox generik dari Shopee/Tokopedia/Taobao — meskipun secara elektrik mirip (12V, hex shaft, encoder) — **KEMUNGKINAN BESAR TIDAK LEGAL** dipakai di robot yang bertanding, karena bukan dari merek yang ada di daftar resmi FIRST.

Part semacam ini cuma aman dipakai untuk:
- Robot latihan/prototipe non-kompetisi
- Belajar mekanisme sebelum pindah ke part resmi
- Bukan untuk robot yang akan dibawa ke pertandingan resmi

Yang ditemukan di marketplace lokal/China (hasil pencarian, harga & stok bisa berubah, cek langsung sebelum beli):

- **Tokopedia** — banyak listing "Motor DC Gearbox Planetary 12V" dengan hex shaft dan encoder (mis. seri "Dinamo DC Motor Gearbox Planetary 12V", atau reseller part robotika lokal). Umumnya generik/tidak bermerek, harga jauh lebih murah dari REV/goBILDA tapi TIDAK ADA di daftar motor legal FTC.
- **Shopee Indonesia** — pencarian spesifik untuk "compliant wheel" atau "roller intake" FTC nggak ketemu listing yang relevan; kemungkinan besar part-part khusus FTC (compliant wheel dengan hex bore 5mm) memang nggak umum dijual di sini, karena pasarnya niche banget. Kalau ada, biasanya reseller yang re-jual produk REV/goBILDA/AndyMark asli dengan markup, bukan alternatif murah.
- **Taobao** — ada banyak "Planetary Gear Motor" seri 7203/7204 mengklaim kompatibel goBILDA/Tetrix/REV/FTC (hex shaft 8mm, encoder 3.3-5V), harga jauh lebih murah. Ini kemungkinan clone/tiruan komponen goBILDA — kualitas dan konsistensi spek nggak terjamin, dan tetap TIDAK ADA di daftar motor legal FIRST meskipun mengklaim "FTC compatible".

**Saran:** Part-part di atas boleh dipakai untuk eksperimen/robot latihan supaya CK bisa uji rasio dan desain roller dengan biaya murah, tapi robot yang dibawa ke kompetisi resmi WAJIB pakai motor dari daftar legal (REV Core Hex, REV HD Hex/UltraPlanetary, goBILDA Matrix/Yellow Jacket, atau AndyMark NeveRest) — dan ketiganya sudah ada perbandingannya di tabel di atas.
