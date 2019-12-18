Feature: membuat data pelanggan

  Scenario: Mengisi data pelanggan
    Given menampilkan form data pelanggan
    When saya mengisi form data pelanggan "nama", "no_hp", "alamat"
    Then mencatat form data pelanggan "nama", "no_hp", "alamat"