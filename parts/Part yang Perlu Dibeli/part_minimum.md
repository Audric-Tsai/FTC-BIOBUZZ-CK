# Part Minimum yang Perlu Dibeli

## Daftar Isi

- [Sasis](#sasis)
- [Penggerak](#penggerak)
- [Odometri](#odometri)
- [Pengambil](#pengambil)
- [Pelontar](#pelontar)
- [Sensor](#sensor)

## Sasis

**Rangka utama: 0 dibeli.** Extrusion/C-Channel aluminium 6061-T6 dari 2x Starter Kit V3.1 sudah cukup buat rangka dasar. Beli lagi cuma kalau kepanjangan yang dimiliki sudah habis.

## Penggerak

**Rencananya bangun 2 robot**, dan itu menentukan berapa banyak wheel yang masih perlu dibeli. Ada empat rencana yang lagi dipertimbangkan:

- **Rencana A** — 2 robot yang SAMA PERSIS, masing-masing pakai 4 omni wheel. Total butuh 8 omni wheel; CK cuma punya 4 (2x REV-41-1190-PK2, tiap pack isi 2). **Kurang 4 omni wheel.**
- **Rencana B** — 2 robot yang SAMA PERSIS, masing-masing pakai 4 mecanum wheel. Mecanum belum punya sama sekali. **Kurang 8 mecanum wheel** (2 set).
- **Rencana C** — 1 robot pakai 4 omni wheel, 1 robot pakai 4 mecanum wheel. Omni wheel yang dipunya (4 buah) udah pas buat robot pertama, **0 kurang**. Mecanum belum punya sama sekali. **Kurang 4 mecanum wheel** (1 set).
- **Rencana D** — 2 robot SAMA-SAMA omni, tapi beda ukuran wheel: robot pertama pakai omni wheel besar, robot kedua pakai omni wheel kecil. Wheel besar yang dipunya (4x REV 90mm) udah pas buat robot pertama, **0 kurang**. Wheel kecil belum punya sama sekali. **Kurang 4 omni wheel kecil** (1 set).

Pilih SATU rencana — belinya beda tergantung mana yang dipakai:

**Kalau Rencana A (2 robot omni):**

```text
SKU              Nama Part                                                          Jml  Harga            Link                                      
----------------------------------------------------------------------------------------------------------------------------------------------------
REV-41-1190-PK2  REV 90mm Omni Wheel - 2 Pack (tambahan, buat genapkan ke 8 wheel)  2    ~US$31.00 /pack  https://www.revrobotics.com/rev-41-1190/  
```

**Kalau Rencana B (2 robot mecanum):** Mecanum — by Audric.

**Kalau Rencana C (1 robot omni + 1 robot mecanum):** robot omni sudah 0 kurang (pakai 4 wheel yang dipunya). Mecanum — by Audric.

**Kalau Rencana D (2 robot omni, beda ukuran — besar + kecil):** robot wheel besar sudah 0 kurang (pakai 4x REV 90mm yang dipunya). Omni kecil 70mm — by Audric.

**Motor penggerak (berlaku buat semua rencana):** tiap robot butuh 4 motor DC (satu per wheel), jadi 2 robot = 8 motor. CK cuma punya 6x UltraPlanetary Gearbox Kit & HD Hex Motor. **Kurang 2 motor.**

```text
SKU          Nama Part                                  Jml  Harga           Link                                      
-----------------------------------------------------------------------------------------------------------------------
REV-41-1600  UltraPlanetary Gearbox Kit & HD Hex Motor  2    US$50.00 /unit  https://www.revrobotics.com/rev-41-1600/  
```

## Odometri

**Wajib beli** — CK belum punya sensor odometri apa pun. Karena rencananya bangun 2 robot, dan robot kedua harus punya part yang sama dengan robot pertama, semua jumlah di bawah ini SUDAH DIKALIKAN 2 (bukan cuma buat 1 robot).

**Dead Wheel DIY pakai REV Through Bore Encoder V2** (2 encoder per robot x 2 robot = 4 unit; gabungkan dengan IMU bawaan Control Hub buat heading)

```text
SKU          Nama Part                                        Jml  Harga           Link                                      
-----------------------------------------------------------------------------------------------------------------------------
REV-11-3174  REV Through Bore Encoder V2 (2 per bot x 2 bot)  4    US$48.00 /unit  https://www.revrobotics.com/rev-11-3174/  
```
Subtotal: 4 x US$48.00 = **US$192.00**

## Pengambil

**Motor: 0 dibeli — sudah lengkap.** Punya 2x Core Hex Motor (REV-41-1300), satu buat masing-masing robot. Intake tiap robot pakai 1x Core Hex Motor. Semuanya sudah cukup buat 2 robot, nggak perlu beli motor lagi buat sekarang.

**Filament: beli TPU 90A** buat cetak part-part Pengambil yang butuh lentur tanpa gampang patah. Lagi diskon 12% jadi Rp368.720 di Tokopedia — cek sebelum diskonnya habis: https://tk.tokopedia.com/ZSV5cGaJ4/

## Pelontar

**Wajib beli 4x HD Hex Motor.** Pelontar rencananya pakai 2x HD Hex Motor per robot (ini terpisah dari motor drivetrain di bab Penggerak) — 2 robot x 2 motor = 4 motor. Karena 6x HD Hex Motor yang sudah dimiliki sepenuhnya dialokasikan buat Penggerak, keempat motor buat Pelontar ini HARUS dibeli baru semua.

```text
SKU          Nama Part                                                      Jml  Harga           Link                                      
-------------------------------------------------------------------------------------------------------------------------------------------
REV-41-1600  UltraPlanetary Gearbox Kit & HD Hex Motor (2 per bot x 2 bot)  4    US$50.00 /unit  https://www.revrobotics.com/rev-41-1600/  
```

Sudah ditambahkan ke `daftar_belanja.md` (link ke Google Sheets live).

## Sensor

Logitech C270 HD Webcam yang sudah dimiliki cukup buat deteksi AprilTag/vision dasar.

Kalau nanti butuh tambahan, sensor yang paling umum dipakai tim FTC lain (opsional, belum wajib dibeli):

```text
SKU          Nama Part                                    Kegunaan Umum                                  Link                                      
--------------------------------------------------------------------------------------------------------------------------------------------------
-            IMU (built-in di Control Hub)                Heading/orientasi robot, sudah gak perlu beli   -                                          
REV-31-1505  REV 2m Distance Sensor (ToF)                  Ukur jarak ke objek/dinding, alignment         https://www.revrobotics.com/rev-31-1505/  
REV-31-1462  REV Magnetic Limit Switch                     Batasi gerakan mekanisme (slide, arm, dll)     https://www.revrobotics.com/rev-31-1462/  
```
