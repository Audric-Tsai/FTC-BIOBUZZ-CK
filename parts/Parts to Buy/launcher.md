# Launcher (Flywheel Shooter) — Part yang Perlu Dibeli

Rekomendasi ini untuk mekanisme launcher jenis flywheel (lihat jenis-jenisnya di repo `Dasar-Dasar-FTC`, folder `mechanisms/launcher/`). Fokusnya di dua hal yang paling menentukan performa: **wheel yang keras/high-durometer** (biar transfer energi maksimal) dan **motor RPM tinggi**.

## Yang Sudah Dimiliki (Bisa Dites Dulu Sebelum Beli)

- 2x REV 90mm Traction Wheel (REV-41-1354-PK2) — REV sendiri menyebut wheel keras/traction cocok dipakai untuk shooter, bukan cuma drivetrain. Ini bisa langsung dites sebagai roda flywheel pertama tanpa beli apa pun.
- 4x REV 1in Grip Wheel Soft (REV-41-2150-PK4) — durometer 30A (lunak), menurut dokumentasi REV bisa juga dipakai di shooter, tapi karena lunak, transfer energinya nggak akan sekencang wheel keras. Cocok buat baseline perbandingan "lunak vs keras".
- 6x UltraPlanetary Gearbox Kit & HD Hex Motor (REV-41-1600) — bisa dikonfigurasi 1 stage rasio rendah (misalnya 3:1) buat RPM tinggi, sama seperti strategi di `intake.md`. Ini opsi motor gratis (nggak perlu beli) untuk mulai prototipe flywheel.

## Part yang Direkomendasikan untuk Dibeli

```text
SKU               Nama Part                                                             Jml  Link Beli
-----------------------------------------------------------------------------------------------------------------------------------------------------------
5204-8002-0003    goBILDA Yellow Jacket Planetary Gear Motor (3.7:1, 1620 RPM, 8mm REX)   1    https://www.gobilda.com/5204-series-yellow-jacket-planetary-gear-motor-3-7-1-ratio-80mm-length-8mm-rex-shaft-1620-rpm-3-3-5v-encoder/
NA                goBILDA GripForce Mecanum/Traction Wheel (40A Durometer) — cek varian    1    https://www.gobilda.com/gripforce-mecanum-wheel-set-o104mm-40a-durometer-rollers/
                  non-mecanum kalau tersedia, atau pakai Traction Wheel biasa yang lebih keras
```

### Penjelasan

**goBILDA Yellow Jacket 3.7:1 (1620 RPM)** — RPM bebasnya jauh lebih tinggi dari REV HD Hex Motor konfigurasi standar, cocok buat flywheel yang butuh kecepatan lontar tinggi. CATATAN PENTING: shaft-nya 8mm REX (standar goBILDA), BUKAN hex 5mm REV — jadi WAJIB pakai hub/adapter goBILDA-ke-REV atau ganti sistem mounting roda supaya nyambung ke wheel REV yang CK punya. Harga $56.99, stok tersedia saat dicek.

**Wheel durometer keras (GripForce/Traction 40A ke atas)** — Studica (partner resmi REV/goBILDA) mengonfirmasi "harder wheels transfer more energy" untuk shooter. REV Traction Wheel yang sudah dimiliki (durometer medium-hard) adalah titik awal yang bagus; kalau butuh lebih keras lagi/upgrade setelah tes, cek varian GripForce atau Traction Wheel durometer tertinggi dari REV/goBILDA.

### Rekomendasi

**Coba dulu pakai part yang sudah dimiliki** — REV Traction Wheel + HD Hex Motor (1 stage rasio rendah) — sebelum beli apa pun. Kalau setelah dites RPM-nya masih kurang buat jarak tembak yang diinginkan, baru pertimbangkan beli goBILDA Yellow Jacket 3.7:1 (paling gampang didapat & harganya wajar), dengan catatan siapkan adapter shaft 8mm REX ke hex 5mm REV.

## Legalitas

Semua part di atas (goBILDA Yellow Jacket, REV Traction/Grip Wheel) ada di ekosistem resmi FTC, jadi aman dipakai di robot kompetisi — beda dengan bagian marketplace generik yang dibahas di `intake.md` (yang cuma untuk part non-motor/eksperimen).
