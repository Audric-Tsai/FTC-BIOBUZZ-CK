# Part Minimum yang Perlu Dibeli

Cuma part yang BENAR-BENAR wajib dibeli sekarang, dengan asumsi CK pakai part yang sudah dimiliki (lihat `../Part yang Dimiliki/part_yang_dimiliki.md`) buat semua yang lain. Untuk opsi upgrade/alternatif, lihat `part_tambahan.md`.

**Total minimum:** ~US$241.95 (Rencana A: omni wheel + motor + odometri) atau ~US$349.94 (Rencana B: mecanum wheel + motor + odometri) — tergantung rencana penggerak yang dipilih. Cuma bab Penggerak + Odometri yang butuh beli.

## Daftar Isi

- [Sasis](#sasis)
- [Penggerak](#penggerak)
- [Odometri](#odometri)
- [Pengambil](#pengambil)
- [Pelontar](#pelontar)
- [Sensor](#sensor)

## Sasis

**0 dibeli.** Extrusion/C-Channel aluminium 6061-T6 dari 2x Starter Kit V3.1 sudah cukup buat rangka dasar. Beli lagi cuma kalau kepanjangan yang dimiliki sudah habis.

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

**Wajib beli** — CK belum punya sensor odometri apa pun. SparkFun OTOS dipilih karena paling sederhana dipasang (1 sensor, nggak perlu roda/pegas tambahan) — meskipun secara popularitas komunitas FTC ini bukan yang paling umum dipakai (lihat peringkat popularitas di `part_tambahan.md`), OTOS tetap yang paling masuk akal buat mulai karena minim kerja rakit.

```text
SKU        Nama Part                                          Kategori  Harga     Link                                                                                     
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
PAA5160E1  SparkFun OTOS (Optical Tracking Odometry Sensor)  Odometri  US$79.95  https://www.sparkfun.com/sparkfun-optical-tracking-odometry-sensor-paa5160e1-qwiic.html  
```

## Pengambil

**0 dibeli.** Sudah punya REV Flap Wheel + REV Grip Wheel (roller compliant) dan Core Hex Motor/HD Hex Motor (motor) yang cukup buat prototipe roller intake musim ini.

## Pelontar

**0 dibeli.** Sudah punya REV 90mm Traction Wheel dan HD Hex Motor yang bisa langsung dites sebagai flywheel sebelum upgrade ke part lain.

## Sensor

**0 dibeli.** Logitech C270 HD Webcam yang sudah dimiliki cukup buat deteksi AprilTag/vision dasar.
