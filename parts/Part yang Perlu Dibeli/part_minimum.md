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

**Rencananya bangun 2 robot**, dan itu menentukan berapa banyak wheel yang masih perlu dibeli. Ada dua rencana yang lagi dipertimbangkan:

- **Rencana A** — 2 robot yang SAMA PERSIS, masing-masing pakai 4 omni wheel. Total butuh 8 omni wheel; CK cuma punya 4 (2x REV-41-1190-PK2, tiap pack isi 2). **Kurang 4 omni wheel.**
- **Rencana B** — 2 robot yang SAMA PERSIS, masing-masing pakai 4 mecanum wheel. Mecanum belum punya sama sekali. **Kurang 8 mecanum wheel** (2 set).

Pilih SATU rencana — belinya beda tergantung mana yang dipakai:

**Kalau Rencana A (2 robot omni):**

```text
SKU              Nama Part                                                          Jml  Harga            Link                                      
----------------------------------------------------------------------------------------------------------------------------------------------------
REV-41-1190-PK2  REV 90mm Omni Wheel - 2 Pack (tambahan, buat genapkan ke 8 wheel)  2    ~US$31.00 /pack  https://www.revrobotics.com/rev-41-1190/  
```

**Kalau Rencana B (2 robot mecanum):**

```text
Nama Part       Jml  Harga                
------------------------------------------
Mecanum Wheels  12   12 buah = Rp2.400.000  
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

**Motor: 0 dibeli — sudah lengkap.** Punya 2x Core Hex Motor (REV-41-1300), satu buat masing-masing robot. Intake tiap robot pakai 1x Core Hex Motor. Semuanya sudah cukup buat 2 robot, nggak perlu beli motor lagi buat sekarang.

**Filament: perlu beli 1 roll filament yang fleksibel tapi kuat** (misal TPU) buat cetak part-part Pengambil yang butuh lentur tanpa gampang patah.

## Pelontar

**Wajib beli 4x HD Hex Motor.** Pelontar rencananya pakai 2x HD Hex Motor per robot (ini terpisah dari motor drivetrain di bab Penggerak) — 2 robot x 2 motor = 4 motor. Karena 6x HD Hex Motor yang sudah dimiliki sepenuhnya dialokasikan buat Penggerak, keempat motor buat Pelontar ini HARUS dibeli baru semua.

```text
SKU          Nama Part                                                      Jml  Harga           Link                                      
-------------------------------------------------------------------------------------------------------------------------------------------
REV-41-1600  UltraPlanetary Gearbox Kit & HD Hex Motor (2 per bot x 2 bot)  4    US$50.00 /unit  https://www.revrobotics.com/rev-41-1600/  
```

Sudah ditambahkan ke `daftar_belanja.md` (link ke Google Sheets live).

## Sensor

**0 dibeli.** Logitech C270 HD Webcam yang sudah dimiliki cukup buat deteksi AprilTag/vision dasar.
