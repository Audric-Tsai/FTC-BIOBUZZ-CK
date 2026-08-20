# Part Minimum yang Perlu Dibeli

Cuma part yang BENAR-BENAR wajib dibeli sekarang, dengan asumsi CK pakai part yang sudah dimiliki (lihat `../Part yang Dimiliki/part_yang_dimiliki.md`) buat semua yang lain. Untuk opsi upgrade/alternatif, lihat `part_tambahan.md`.

**Total minimum:** tergantung kombinasi rencana Penggerak (Rencana A ~US$162 atau Rencana B ~US$269.99, untuk wheel + motor) dan opsi Odometri (US$159.90 - US$559.94, sudah dikali 2 robot) yang dipilih — lihat detail di masing-masing bab. Cuma bab Penggerak + Odometri yang butuh beli.

## Daftar Isi

- [Sasis](#sasis)
- [Penggerak](#penggerak)
- [Odometri](#odometri)
- [Pengambil](#pengambil)
- [Pelontar](#pelontar)
- [Sensor](#sensor)

## Sasis

**Rangka utama: 0 dibeli.** Extrusion/C-Channel aluminium 6061-T6 dari 2x Starter Kit V3.1 sudah cukup buat rangka dasar. Beli lagi cuma kalau kepanjangan yang dimiliki sudah habis.

**Panel/cover: perlu beli material lembaran.** Ketebalan polikarbonat yang paling umum dipakai tim FTC adalah **~3mm (1/8 inci)** — dipakai buat drivetrain plate, intake collector box, dan panel pelindung, karena cukup kuat menahan beban tapi masih gampang dipotong. Ini pilihan utama, plus alternatif material serupa kalau butuh sifat lain (lebih licin, lebih tahan gesekan, dll). Semua link di bawah dari listing teratas Tokopedia/Shopee saat dicari:

```text
Material                Ketebalan/Ukuran    Link Beli
--------------------------------------------------------------------------------------------------------------------------------------
Polikarbonat (Lexan)    3mm (paling umum)   https://shopee.co.id/Polycarbonate-Sheet-3mm-Padat-Bening-Polikarbonat-Lembaran-Clear-i.358312392.3683120743
Polikarbonat (Lexan)    2mm x 122x244cm     https://www.tokopedia.com/amankaryateknik/polikarbonat-lembaran-polycarbonate-sheet-2-mm-x-122-cm-x-244-cm
Delrin / Acetal (POM)   6mm (lembaran kecil) https://shopee.co.id/POM-Polyacetal-6mm-15x25cm-(Sheet-Lembaran)-Delrin-i.43613792.2387340703
HDPE                    6mm, 100x200cm      https://shopee.co.id/Nylon-PE-6mm-x-100cm-x-200cm-Lembaran-(-PolyEthylene-Sheet-HDPE-Plate-)-i.1247310023.49657775429
UHMW-PE                 12mm, 100x200cm     https://shopee.co.id/UHMWPE-12mm-100cm-x-200cm-Sheet-Lembaran-(-Polyethylene-)-i.43613792.9246365358
Akrilik (Acrylic)       5mm, 100x200cm      https://shopee.co.id/MIKA-AKRILIK-LEMBARAN-ACRYLIC-SHEET-5MM-X-100CM-X-200CM-i.1277418402.27123815875
Nylon (PA6)             Rod dia. 25mm x 1m  https://shopee.co.id/Nylon-PA6-Putih-Batangan-(-PA6-Rod-White-)-Dia.-25-mm-x-1000-mm-i.68029486.1409073974
```

Jumlah beli buat masing-masing (2 meter per material) ada di `daftar_belanja.xlsx`, sheet "Daftar Belanja". CATATAN: Delrin biasanya nggak dijual dalam lembaran 2m (biasanya lembaran kecil 15-25cm atau batangan), jadi kalau butuh panjang 2m, kemungkinan harus beli beberapa lembar kecil digabung atau cari penjual custom-cut.

## Penggerak

**Rencananya bangun 2 robot**, dan itu menentukan berapa banyak wheel yang masih perlu dibeli. Ada dua rencana yang lagi dipertimbangkan:

- **Rencana A** — 2 robot yang SAMA PERSIS, masing-masing pakai 4 omni wheel. Total butuh 8 omni wheel; CK cuma punya 4 (2x REV-41-1190-PK2, tiap pack isi 2). **Kurang 4 omni wheel.**
- **Rencana B** — 2 robot BEDA jenis, satu pakai 4 omni wheel, satu lagi pakai 4 mecanum wheel. Omni wheel yang dipunya (4 buah) udah pas buat robot pertama. Mecanum belum punya sama sekali. **Kurang 4 mecanum wheel** (1 set).

Pilih SATU rencana — belinya beda tergantung mana yang dipakai:

**Kalau Rencana A (2 robot omni):**

```text
SKU              Nama Part                                                          Jml  Harga            Link                                      
----------------------------------------------------------------------------------------------------------------------------------------------------
REV-41-1190-PK2  REV 90mm Omni Wheel - 2 Pack (tambahan, buat genapkan ke 8 wheel)  2    ~US$31.00 /pack  https://www.revrobotics.com/rev-41-1190/  
```

**Kalau Rencana B (1 robot omni + 1 robot mecanum):**

```text
SKU             Nama Part                                                 Jml  Harga      Link                                                                                     
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3213-3606-0002  goBILDA 96mm Mecanum Wheel Set (70A Durometer, 4 wheels)  1    US$169.99  https://www.gobilda.com/96mm-mecanum-wheel-set-70a-durometer-bearing-supported-rollers/  
```

**Motor penggerak (berlaku buat kedua rencana):** tiap robot butuh 4 motor DC (satu per wheel), jadi 2 robot = 8 motor. CK cuma punya 6x UltraPlanetary Gearbox Kit & HD Hex Motor. **Kurang 2 motor.**

```text
SKU          Nama Part                                  Jml  Harga           Link                                      
-----------------------------------------------------------------------------------------------------------------------
REV-41-1600  UltraPlanetary Gearbox Kit & HD Hex Motor  2    US$50.00 /unit  https://www.revrobotics.com/rev-41-1600/  
```

## Odometri

**Wajib beli** — CK belum punya sensor odometri apa pun. Karena rencananya bangun 2 robot, dan robot kedua harus punya part yang sama dengan robot pertama, semua jumlah di bawah ini SUDAH DIKALIKAN 2 (bukan cuma buat 1 robot). Pilih SATU dari tiga opsi berikut — urutan sesuai peringkat popularitas di komunitas FTC (lihat `part_tambahan.md` buat penjelasan lengkap kenapa urutannya begitu):

**Opsi 1 — Paling Umum Dipakai: Dead Wheel DIY pakai REV Through Bore Encoder V2** (2 encoder per robot x 2 robot = 4 unit; gabungkan dengan IMU bawaan Control Hub buat heading)

```text
SKU          Nama Part                                        Jml  Harga           Link                                      
-----------------------------------------------------------------------------------------------------------------------------
REV-11-3174  REV Through Bore Encoder V2 (2 per bot x 2 bot)  4    US$48.00 /unit  https://www.revrobotics.com/rev-11-3174/  
```
Subtotal: 4 x US$48.00 = **US$192.00**

**Opsi 2 — Kedua Paling Umum: goBILDA Pinpoint V2 + Swingarm Odometry Pod** (1 Pinpoint + 2 pod per robot x 2 robot)

```text
SKU             Nama Part                                                  Jml  Harga           Link                                                                                           
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3110-0002-0002  goBILDA Pinpoint V2 Odometry Computer (1 per bot x 2 bot)  2    US$79.99 /unit  https://www.gobilda.com/pinpoint-v2-odometry-computer-imu-sensor-fusion-for-2-wheel-odometry/  
3110-0001-0001  goBILDA Swingarm Odometry Pod 48mm (2 per bot x 2 bot)     4    US$99.99 /unit  https://www.gobilda.com/swingarm-odometry-pod-48mm-wheel/                                      
```
Subtotal: (2 x US$79.99) + (4 x US$99.99) = **US$559.94**

**Opsi 3 — Paling Sederhana Dipasang (tapi paling jarang dipakai): SparkFun OTOS** (1 sensor per robot x 2 robot)

```text
SKU        Nama Part                          Jml  Harga           Link                                                                                     
------------------------------------------------------------------------------------------------------------------------------------------------------------
PAA5160E1  SparkFun OTOS (1 per bot x 2 bot)  2    US$79.95 /unit  https://www.sparkfun.com/sparkfun-optical-tracking-odometry-sensor-paa5160e1-qwiic.html  
```
Subtotal: 2 x US$79.95 = **US$159.90**

Kalau belum tahu mau pilih yang mana: Opsi 3 (OTOS) paling murah dan paling gampang dipasang buat mulai. Opsi 1 (dead wheel DIY) yang paling umum dipakai komunitas FTC, part-nya murah tapi butuh paling banyak kerja rakit + tuning kode. Opsi 2 (Pinpoint) paling presisi tapi juga paling mahal karena butuh 2 pod per robot.

## Pengambil

**0 dibeli.** Sudah punya REV Flap Wheel + REV Grip Wheel (roller compliant) dan Core Hex Motor/HD Hex Motor (motor) yang cukup buat prototipe roller intake musim ini.

## Pelontar

**0 dibeli.** Sudah punya REV 90mm Traction Wheel dan HD Hex Motor yang bisa langsung dites sebagai flywheel sebelum upgrade ke part lain.

## Sensor

**0 dibeli.** Logitech C270 HD Webcam yang sudah dimiliki cukup buat deteksi AprilTag/vision dasar.
