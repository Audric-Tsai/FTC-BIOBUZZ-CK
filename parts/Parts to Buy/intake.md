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
Motor                                                                      Speed Bebas  Torsi Stall  Arus Stall   Poros Output               Harga      Status            
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
goBILDA Matrix 12V DC Motor (mentah)                                       ~6000 RPM    Rendah*      ~10 A        Butuh gearbox/pulley luar  ~US$32-35  Belum punya       
AndyMark NeveRest Motor Only (mentah)                                      6000 RPM     0.062 N-m*   11.5 A       Bulat 3.175mm (BUKAN hex)  US$9-25    Belum punya       
REV Core Hex Motor (REV-41-1300)                                           125 RPM      3.2 N-m      4.4 A        5mm hex female (72:1)      US$32      Sudah punya (2x)  
REV HD Hex Motor - UltraPlanetary Kit (REV-41-1600), 1 stage rasio rendah  Bisa diatur  Bisa diatur  Bisa diatur  5mm hex male               ~US$60     Sudah punya (6x)  
```
*Angka torsi/arus untuk goBILDA Matrix dan AndyMark NeveRest adalah motor MENTAH tanpa gearbox — dalam kondisi asli, torsinya kecil sekali dan butuh reduksi gigi/pulley di luar motor supaya bisa dipakai buat roller.

### Rekomendasi

**Pakai REV HD Hex Motor (UltraPlanetary Kit) yang sudah dimiliki, dikonfigurasi 1 stage rasio rendah (3:1 atau 4:1).** Ini pilihan paling murah (nggak perlu beli motor baru sama sekali) dan paling fleksibel karena rasionya bisa disetel ulang kalau ternyata kurang/kelebihan RPM setelah dites.

Kalau CK tetap mau motor terpisah/khusus buat intake supaya nggak "pinjam" dari drivetrain/mekanisme lain:
- Pilih **goBILDA Matrix** kalau butuh RPM tinggi dan nggak keberatan rakit sistem reduksi sendiri.
- Hindari **AndyMark NeveRest Motor Only** kecuali CK juga beli adapter poros bulat-ke-hex, karena bakal butuh part tambahan yang nggak ada di ekosistem REV DUO yang sudah dipakai.
- **REV Core Hex Motor** paling gampang dipasang tapi paling lambat — cuma cocok kalau strategi CK nggak butuh roller super cepat.

## Part Non-Motor untuk Eksperimen Roller di Luar Ekosistem FTC

Ini KHUSUS bagian non-motor dan non-sensor — roller karet, shaft, hub, bearing, collar — buat CK coba rakit versi intake sendiri di luar part resmi REV/goBILDA, sekadar untuk eksperimen dan perbandingan desain. (Motor tetap harus dari salah satu dari 4 opsi di tabel perbandingan di atas — nggak dicari alternatif di luar itu.)

Catatan: part struktural/mekanis (bukan motor, bukan sensor) nggak kena aturan "motor legal FTC" di atas — sepanjang bentuk akhirnya nggak melanggar batasan ukuran/material robot di Game Manual, part generik untuk roller/shaft/bearing boleh dipakai di robot kompetisi. Tetap double-check ke mentor/wasit kalau ragu.

### Shaft 5mm Hex Asli (langsung kompatibel REV, sumber non-REV tapi resmi)

ServoCity adalah perusahaan induk goBILDA — shaft & hub 5mm hex mereka memang dirancang kompatibel dengan sistem hex REV/goBILDA, jadi nggak perlu adaptasi:

- [5mm x 150mm Stainless Steel Precision Shafting](https://www.servocity.com/5mm-x-150mm-stainless-steel-precision-shafting/) — ServoCity
- [5mm x 200mm Stainless Steel Precision Shafting](https://www.servocity.com/5mm-x-200mm-stainless-steel-precision-shafting/) — ServoCity
- [5mm x 250mm Stainless Steel Precision Shafting](https://www.servocity.com/5mm-x-250mm-stainless-steel-precision-shafting/) — ServoCity
- [5mm x 300mm Stainless Steel Precision Shafting](https://www.servocity.com/5mm-x-300mm-stainless-steel-precision-shafting/) — ServoCity
- [1310 Series Hyper Hub (5mm Hex Bore)](https://www.servocity.com/1310-series-hyper-hub-5mm-hex-bore/) — ServoCity, hub heavy-duty buat pasang komponen goBILDA ke shaft hex REV
- [1309 Series Sonic Hub (5mm Hex Bore)](https://www.servocity.com/1309-series-sonic-hub-5mm-hex-bore/) — ServoCity
- [5mm Hex Clamping Hub](https://www.servocity.com/5mm-hex-clamping-hub/) — ServoCity, buat pasang roller/roda custom ke shaft hex tanpa las/bor tambahan
- [5mm Hex Bore Couplers](https://www.servocity.com/5mm-hex-bore-couplers/) — ServoCity, kategori coupler bore hex 5mm (banyak varian)

### Shaft Collar & Coupler (round-to-round, buat gabung shaft campuran)

- [2920 Series Steel Set-Screw Collar (5mm Bore) - 2 Pack](https://www.servocity.com/2920-series-steel-set-screw-collar-5mm-bore-2-pack/) — ServoCity, ~US$4.99, fungsi sama seperti REV Shaft Collar
- [5mm to 6mm Set-Screw Shaft Coupler](https://www.servocity.com/5mm-to-6mm-set-screw-shaft-coupler/) — ServoCity, ~US$4.99, buat sambung shaft 5mm ke part 6mm (kalau pakai bearing/roller generik yang bore-nya 6mm)
- [4mm to 5mm Set-Screw Shaft Coupler](https://www.servocity.com/4mm-to-5mm-set-screw-shaft-coupler/) — ServoCity, ~US$4.99
- [0.250" to 5mm Set-Screw Shaft Coupler](https://www.servocity.com/0-250-to-5mm-set-screw-shaft-coupler/) — ServoCity, ~US$4.99, buat sambung ke shaft ukuran inci

### Hub Adapter Hex ke Roda Generik

- [5mm Metal Combiner Wheel Hub Hex Adapter](https://www.aliexpress.com/item/1005001950511773.html) — AliExpress, adapter hub metal hex 5mm buat pasang roda RC/generik ke shaft hex

### Bearing Generik (murah, TAPI bore-nya BUKAN hex — perlu housing/collar tambahan)

- [Bearing Lakher 608 RS](https://www.tokopedia.com/venny-vioren-etdrgds/bearing-lakher-608-rs-inline-skate-skateboard-sepatu-roda-1730197308122694698) — Tokopedia, bearing 608 umum (8x22x7mm), sangat murah
- [Ceramic Ball Bearing 608](https://www.tokopedia.com/tokokerabit/fashion-ceramic-ball-bearing-608-skateboard-black-finger-fidget-spinner-toy-replacement-1732090656167199905) — Tokopedia
- [Pro 608 ZZ (ABEC-7) — isi 10 pcs](https://www.tokopedia.com/zay-yana/alm1-8-10-pieces-pro-608-zz-abec-7-roller-skate-bearing) — Tokopedia
- [Laher/Bearing 608 Z](https://www.tokopedia.com/rivajayamotor/laher-bearing-608-z) — Tokopedia

### Roller/Roda Karet untuk Eksperimen Compliant Wheel

- [iSeeRobot Silicone Wheel Set 18x40mm](https://www.tokopedia.com/isee/silicone-wheel-set-18-x-40mm-roda-silikon-karet-anti-slip-roda-line-tracer-roda-robot-sumo-silicone-only-7edaf) — Tokopedia, roda silikon anti-slip (awalnya buat robot sumo/line-tracer)
- [iSeeRobot Silicone Wheel Set 24x20mm](https://www.tokopedia.com/isee/silicone-wheel-set-24-x-20mm-roda-silikon-karet-anti-slip-roda-line-tracer-roda-robot-sumo-silicone-only-fb9ce) — Tokopedia
- [Roda Karet ABU Troli Kastor Caster (3/4/5 inch, dengan bearing)](https://www.tokopedia.com/inspiretech/roda-karet-abu-troli-kastor-caster-trolley-mati-hidup-rem-bahan-tebal-heavy-duty-dengan-bearing-tatakan-3-4-5inch-1731271202333099147) — Tokopedia, roda karet troli, sudah ada bearing bawaan
- [Roda Karet 4" (100mm) tanpa rumah](https://www.tokopedia.com/esihsalsihh/roda-karet-4-roda-saja-roda-troli-4-inci-roda-tanpa-rumah-4-inch-100mm) — Tokopedia
- [Roller Roda Karet Kecil (multifungsi, logam)](https://www.tokopedia.com/jual-grosir-perabot-lokal/original-roller-roda-karet-alat-bantu-pemasangan-multifungsi-logam-1729606582922675329) — Tokopedia
- [Roda Karet 4 Inchi 1 Set Roda Miniatur](https://www.tokopedia.com/alluneedsshop/roda-karet-4-inchi-1-set-roda-miniatur-roda-as-1729946318723451047) — Tokopedia
- [Rubber Coated Conveyor Belt Roller](https://www.aliexpress.com/item/1005008987356216.html) — AliExpress
- [2" Small Rubber Roller with Shaft](https://www.aliexpress.com/item/32668436059.html) — AliExpress, sudah termasuk shaft-nya sendiri
- Surgical Tubing 3mm yang dililit ke hub/roller polos — Sudah dimiliki (2x) — cara termurah, bungkus tubing karet ke hub plastik/metal biar permukaannya jadi compliant, mirip roller pabrikan

### Kesimpulan

Yang dari **ServoCity** (bagian shaft/hub/coupler di atas) langsung kompatibel dengan sistem hex 5mm REV — bisa dipakai tanpa modifikasi karena memang satu ekosistem sama goBILDA. Yang dari **Tokopedia/AliExpress** (bearing 608, roda karet/silikon) jauh lebih murah tapi hampir semua bore-nya BUKAN hex 5mm — jadi tetap butuh salah satu hub/coupler adapter (dari daftar ServoCity di atas, atau print custom) supaya nyambung ke shaft yang CK pakai. Cocok buat eksperimen desain roller (bentuk, durometer, pola alur) dengan biaya murah sebelum commit ke part resmi buat robot final.
