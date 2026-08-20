# Odometry — Sensor, Wheel, dan Setup yang Direkomendasikan

Penjelasan konsep odometry (apa itu, jenis-jenisnya, kenapa penting) ada di repo `Dasar-Dasar-FTC`, folder `mechanisms/odometry/`. Di sini fokusnya rekomendasi part konkret buat CK.

## Perbandingan Opsi Sensor

```text
Produk                          SKU              Harga     Cara Kerja                          Link
------------------------------------------------------------------------------------------------------------------------------------------------------------------
goBILDA Pinpoint V2              3110-0002-0002   US$79.99  Coprocessor fusion IMU + 2 dead     https://www.gobilda.com/pinpoint-v2-odometry-computer-imu-sensor-fusion-for-2-wheel-odometry/
Odometry Computer                                            wheel pod, update 1500Hz
SparkFun OTOS                    PAA5160E1        US$79.95  1 sensor optik tunggal, baca gerakan https://www.sparkfun.com/sparkfun-optical-tracking-odometry-sensor-paa5160e1-qwiic.html
(Optical Tracking Odometry                                   dari lantai langsung, sudah ada IMU
Sensor)                                                       6-axis built-in, nggak perlu dead wheel
REV Through Bore Encoder V2      REV-11-3174      US$48.00  Encoder generik buat bikin dead     https://www.revrobotics.com/rev-11-3174/
                                                              wheel pod sendiri (DIY), butuh 2-3 unit
```

## Wheel untuk Dead Wheel Odometry

- [goBILDA Swingarm Odometry Pod (48mm Wheel)](https://www.gobilda.com/swingarm-odometry-pod-48mm-wheel/) — SKU 3110-0001-0001, US$99.99, in stock. Wheel + encoder (2000 CPR) + lengan pegas jadi satu unit, tinggal pasang. Ini yang dipasangkan dengan Pinpoint V2 (butuh 2 unit) ATAU bisa dipakai langsung dengan Through Bore Encoder/port encoder biasa.
- Alternatif DIY lebih murah: REV Through Bore Encoder V2 + wheel omni kecil yang sudah dimiliki (contoh: sisa dari REV 90mm Omni Wheel di inventaris) + mounting pegas custom (cetak 3D atau beli per komponen) — lebih murah tapi butuh waktu rakit & desain sendiri.

## Setup yang Direkomendasikan

### Opsi A — Paling Sederhana: SparkFun OTOS (1 sensor, tanpa roda tambahan)

Pasang 1 unit OTOS menghadap lantai di ketinggian yang sesuai spesifikasi (cek datasheet). Nggak perlu dead wheel, nggak perlu pegas, nggak perlu trackwidth presisi. Paling cocok kalau CK ingin odometry presisi tapi ruang di chassis terbatas atau mau instalasi cepat.

### Opsi B — Presisi Tinggi: goBILDA Pinpoint V2 + 2x Swingarm Odometry Pod

1x Pinpoint V2 Odometry Computer + 2x Swingarm Odometry Pod (1 pod dipasang menghadap arah maju-mundur/parallel, 1 pod menghadap arah kiri-kanan/perpendicular/strafe). Pinpoint menggabungkan data 2 pod ini dengan IMU internalnya buat hasil paling presisi dan update rate tertinggi (1500Hz). Total biaya: ~US$279.97 (1x Pinpoint + 2x Pod). Ini setup yang lebih "berat" secara instalasi (butuh ruang 2 pod + kalibrasi trackwidth) tapi jadi standar tim FTC kompetitif yang serius soal presisi autonomous.

### Opsi C — Paling Hemat: 2-3x REV Through Bore Encoder V2 (DIY dead wheel, tanpa coprocessor)

Beli 2-3x REV Through Bore Encoder V2, pasang masing-masing ke wheel kecil + mounting pegas custom, baca datanya langsung lewat port encoder Expansion/Control Hub (nggak perlu beli coprocessor tambahan). Kalau pakai 2 encoder, gabungkan dengan IMU bawaan Control Hub buat heading (mirip prinsip `mechanisms/odometry/04_sensor_fusion_imu.md`, tapi dihitung manual lewat kode sendiri, bukan pakai coprocessor Pinpoint). Paling murah tapi paling banyak kerja rakit + tuning kode.

## Rekomendasi

Untuk CK, **mulai dari Opsi A (SparkFun OTOS)** — instalasinya paling sederhana, harganya mirip dengan 1x Through Bore Encoder + belum termasuk wheel/mounting, dan langsung dapat data posisi + heading dari 1 sensor. Kalau ternyata akurasinya kurang cocok buat strategi autonomous CK (misalnya karena tekstur lantai lapangan spesifik musim ini), baru upgrade ke Opsi B (Pinpoint V2 + dead wheel pods).

## Legalitas

Semua produk di atas (goBILDA Pinpoint, SparkFun OTOS, REV Through Bore Encoder) adalah sensor — bukan motor — jadi nggak kena aturan "daftar motor legal FTC" yang dibahas di `intake.md`. Sensor secara umum legal dipakai di robot kompetisi FTC selama nggak melanggar batasan lain di Game Manual (ukuran, berat, dll).
