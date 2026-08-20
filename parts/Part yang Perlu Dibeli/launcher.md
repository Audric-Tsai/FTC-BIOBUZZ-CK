# Launcher (Flywheel Shooter) — Saran Roda, Cara Build, dan Referensi

Motor sudah diputuskan (pakai yang sudah dimiliki — lihat bagian bawah). Fokus dokumen ini: **wheel yang cocok**, **cara/tips build**, dan **link referensi (guide + video)** buat CK mulai rakit launcher.

## Motor (Sudah Ada, Nggak Perlu Beli)

- 6x UltraPlanetary Gearbox Kit & HD Hex Motor (REV-41-1600) — dikonfigurasi 1 stage rasio rendah (misalnya 3:1) buat RPM tinggi, sama seperti strategi di `intake.md`.

## Saran Roda

- **2x REV 90mm Traction Wheel (REV-41-1354-PK2)** — sudah dimiliki. REV sendiri menyebut wheel keras/traction cocok dipakai untuk shooter, bukan cuma drivetrain. Coba ini duluan sebagai roda flywheel, nggak perlu beli apa pun.
- **4x REV 1in Grip Wheel Soft (REV-41-2150-PK4)** — sudah dimiliki, durometer 30A (lunak). Menurut dokumentasi REV bisa juga dipakai di shooter, tapi transfer energinya nggak akan sekencang wheel keras. Cocok buat baseline perbandingan "lunak vs keras" sebelum upgrade.
- **goBILDA GripForce Wheel (40A Durometer)** — kalau setelah tes Traction Wheel yang dimiliki masih kurang keras/kurang jauh lontarannya, ini opsi upgrade. [Link produk](https://www.gobilda.com/gripforce-mecanum-wheel-set-o104mm-40a-durometer-rollers/) (varian mecanum — cek juga varian traction/non-mecanum di katalog goBILDA kalau tersedia).
- **Prinsip umum:** semakin keras (durometer tinggi) wheel-nya, semakin banyak energi yang tersalur ke game piece saat kontak — ini prinsip dasar yang dipakai buat pilih/upgrade wheel launcher, kebalikan dari wheel intake yang justru harus lunak/compliant.

## Cara Build — Hal-Hal Penting

1. **Jarak "squeeze" antar wheel dan dinding (atau antar dua flywheel)** — semakin ketat jepitannya, semakin besar gaya gesek yang tersalur ke game piece, tapi juga semakin besar beban motor. Ini parameter yang paling sering di-tuning ulang setelah tes lapangan pertama.
2. **RPM adalah variabel utama buat atur jarak tembak** — biasanya di-adjust dari kode (bukan diubah fisik) supaya bisa disesuaikan tanpa bongkar robot.
3. **Pakai kontrol PID buat jaga RPM tetap stabil** — tanpa PID, flywheel gampang overshoot/undershoot RPM setiap kali menembak, bikin akurasi nggak konsisten. Ini rekomendasi kuat dari semua sumber referensi di bawah.
4. **Uji spin-up time** — catat berapa lama flywheel butuh waktu sampai RPM target sebelum menembak; ini penting buat strategi timing waktu pertandingan.

## Link Panduan Build

- [REV Robotics — Flywheel Launcher (FTC Kickoff Concepts)](https://docs.revrobotics.com/ftc-kickoff-concepts/ultimate-goal-2020-2021/shooter) — penjelasan desain double flywheel dari REV sendiri, termasuk kenapa motor kedua mempercepat lagi setelah motor pertama
- [Game Manual 0 — Common Mechanisms](https://gm0.org/en/latest/docs/common-mechanisms/index.html) — panduan umum mekanisme FTC (termasuk shooter), sumber referensi paling lengkap dan sering dipakai tim FTC
- [Purdue SIGBots Wiki — Flywheel](https://wiki.purduesigbots.com/hardware/shooting-mechanisms/flywheel) — penjelasan fisika & desain flywheel yang detail (dari komunitas VEX, tapi prinsipnya sama persis buat FTC)
- [YETI Robotics Wiki — Shooter Designs](https://wiki.yetirobotics.org/books/design-process/page/shooter-designs) — perbandingan desain shooter dari tim FRC berpengalaman
- [Instructables — Servo Powered Catapult](https://www.instructables.com/Servo-Powered-Catapult/) — kalau CK mau coba jenis catapult juga sebagai perbandingan

## Link Video YouTube

- [Shooter Part 1 - FTC Ultimate Goal 2020-2021 Prototyping](https://www.youtube.com/watch?v=eHVtErHj9lg) — proses prototipe shooter REV dari nol, langkah demi langkah
- [How To Make Flywheel Shooters](https://www.youtube.com/watch?v=Q_BKq6YykDY) — tutorial umum bikin flywheel shooter
- [FIRST Global Flywheel Shooter Tutorial](https://www.youtube.com/watch?v=An3xoJgk2uI) — tutorial flywheel dari kompetisi FIRST Global, prinsipnya sama dipakai di FTC
- [Functional ChooChoo Catapult: FTC Decode](https://www.youtube.com/shorts/7JoVEDv8vUE) — contoh catapult musim FTC DECODE, buat perbandingan kalau nggak jadi pakai flywheel
- [Reliable Shooter With Servo Launcher — Team 24909 StarLight](https://www.youtube.com/shorts/9El5UcekiR0) — servo launcher dari tim FTC musim DECODE, dibuat dalam waktu singkat (Robot in 30 Hours)

## Legalitas

Semua wheel (REV Traction/Grip Wheel, goBILDA GripForce) dan motor (HD Hex Motor yang sudah dimiliki) ada di ekosistem resmi FTC, jadi aman dipakai di robot kompetisi.
