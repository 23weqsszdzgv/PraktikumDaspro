
Pseuducode Latihan Pemilihan
Soal 1
Sistem perpustakaan kampus memberikan izin masuk dengan dua syarat:
• Jika mahasiswa membawa kartu mahasiswa, atau sudah melakukan registrasi
online, maka boleh masuk.
• Jika tidak memenuhi salah satu dari dua syarat tersebut, maka ditolak masuk.
Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

Start
    Deklarasi variabel:
        kartuMahasiswa : boolean
        registrasiOnline : boolean

    "Apakah membawa kartu mahasiswa? (true/false): "
    Input kartuMahasiswa

    "Apakah sudah melakukan registrasi online? (true/false): "
    Input registrasiOnline

    Jika (kartuMahasiswa == true) atau (registrasiOnline == true) maka
        Tampilkan "Izin masuk diberikan"
    Jika false
        Tampilkan "Izin masuk ditolak"
End 


Soal 2
Di kampus tersedia layanan WiFi gratis yang hanya bisa diakses oleh civitas
akademika. Sistem hotspot kampus akan melakukan pengecekan sebagai berikut:
• Jika jenis pengguna adalah dosen, maka tampilkan “Akses WiFi diberikan (dosen)”.
• Jika jenis pengguna adalah mahasiswa, maka sistem akan memeriksa jumlah SKS
yang diambil:
o Jika SKS ≥ 12, maka tampilkan “Akses WiFi diberikan (mahasiswa aktif)”.
o Jika SKS < 12, maka tampilkan “Akses ditolak, SKS kurang dari 12”.
• Jika bukan mahasiswa maupun dosen, maka tampilkan “Akses ditolak”.
Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

Start
    Deklarasi variabel:
        jenisPengguna : string
        sks : integer

    "Masukkan jenis pengguna (dosen/mahasiswa/lainnya): "
    Input jenisPengguna

    Jika jenisPengguna = "dosen" maka
        Tampilkan "Akses WiFi diberikan (dosen)"
    Jika tidak, jika jenisPengguna = "mahasiswa" maka
        Tampilkan "Masukkan jumlah SKS yang diambil: "
        Input sks
        Jika sks >= 12 maka
            Tampilkan "Akses WiFi diberikan (mahasiswa aktif)"
        Jika tidak
            Tampilkan "Akses ditolak, SKS kurang dari 12"
    Jika tidak
        Tampilkan "Akses ditolak"
End




![Flowchart Sistem Perpustakaan Kampus](https://github.com/username/repo-name/blob/main/7f314ea0-8ebb-4cf5-ac85-92ae70ceaffe.png?raw=true)








