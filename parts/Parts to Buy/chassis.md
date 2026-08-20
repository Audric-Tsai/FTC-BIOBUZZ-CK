# Chassis — Material yang Perlu Dipertimbangkan/Dibeli

Perbandingan material buat CK mempertimbangkan rangka/panel robot. Penjelasan lengkap tiap material (kelebihan/kekurangan) ada di repo `Dasar-Dasar-FTC`, folder `mechanisms/chassis/`. Di sini fokusnya cuma **biaya, massa, dan link beli konkret**.

## Yang Sudah Dimiliki

Semua part struktural dari 2x Starter Kit V3.1 (C-Channel, extrusion 15mm, plat bracket — lihat `../Parts We Own/parts_we_have.md`) sudah aluminium 6061-T6. Kalau butuh tambahan panjang extrusion/C-Channel, tinggal beli lagi part REV dengan SKU yang sama (REV-41-1762, REV-41-1568, dst — cek katalog REV FTC).

## Perbandingan Biaya & Massa (Estimasi)

```text
Material                    Contoh Produk                          Harga (perkiraan)         Massa/Densitas        Sumber Beli
------------------------------------------------------------------------------------------------------------------------------------------------
Aluminium 6061-T6            REV Extrusion/C-Channel (sudah dipakai) ~US$3.5-6 / kg (bahan baku) 2.70 g/cm3           revrobotics.com/ftc/ (part resmi, sudah dipakai CK)
Carbon Fiber (plat, hobi)    Plat carbon fiber 3mm, 40x50cm          ~Rp900.000 - 1.600.000     1.55-1.60 g/cm3      Tokopedia (mis. toko "Rapid Resin", cari "plat carbon fiber")
Carbon Fiber (industri)      DragonPlate Economy sheet 1/32" 6x6in   ~US$15 (kecil), s/d         1.55-1.60 g/cm3      dragonplate.com
                                                                      ribuan US$ (lembar besar)
PETG/ABS (filamen 3D print)  Filamen 1kg                             ~US$18-30 / kg (~Rp300rb-   1.04-1.27 g/cm3      Tokopedia/Shopee, banyak toko filamen lokal
                                                                      500rb/kg)
Polikarbonat (Lexan)         Lembaran 3mm, 40x40cm                   ~Rp340.000                  1.20 g/cm3           Tokopedia (mis. toko "Mitra Perkasa Teknindo", "SM
                             Lembaran 3mm, 122x244cm (1 lembar besar) ~Rp1.170.000                                    Packing Gasket", cari "polycarbonate sheet")
                             Lembaran 2mm, 122x244cm                 ~Rp850.000-925.000
```

Harga carbon fiber & polikarbonat di atas hasil pencarian listing Tokopedia saat ini (bisa berubah, cek langsung sebelum beli). Harga aluminium & carbon fiber industri dari data harga global (bahan mentah, belum termasuk ongkos potong custom).

## Rekomendasi

1. **Tetap pakai aluminium 6061-T6 untuk seluruh chassis dasar** — sudah dimiliki banyak dari Starter Kit, murah kalau perlu restock, dan seluruh ekosistem REV DUO memang dirancang untuk material ini.
2. **JANGAN beli carbon fiber dulu** kecuali sudah ada kebutuhan spesifik (misalnya lengan linear slide yang butuh sangat ringan & kaku) — harganya per lembar kecil saja sudah setara jutaan rupiah, jauh lebih mahal dari budget material chassis biasa.
3. **Polikarbonat cukup terjangkau** untuk panel penutup/pelindung — kalau CK butuh menutup mekanisme dari benturan game piece atau robot lawan, lembaran 3mm ukuran kecil-menengah (~Rp340rb) sudah cukup untuk beberapa panel.
4. **Plastik cetak 3D** cuma perlu dipertimbangkan kalau CK punya akses printer 3D — untuk bracket kecil/adapter custom (termasuk yang dibahas di `intake.md` untuk adaptasi part non-FTC), bukan untuk struktur utama.
