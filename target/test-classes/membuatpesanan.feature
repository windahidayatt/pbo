Feature: Membuat Pesanan

  Scenario: Memilih jenis order
    Given Menampilkan jenis order
    When Saya memilih jenis order "2"
    Then Mencatat keterangan order "take away"
#    When Saya memilih take away
#    Then Mencatat keterangan "take away"

  Scenario: Memilih makanan
    Given Menampilkan menu makanan
    When Saya memilih "nasi goreng" sebanyak 2 dengan harga 10000
    Then Menghitung total bayar
