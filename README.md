# Online-Shopping-System-2


## 📌 Alur Program

Berikut ini adalah alur kerja dari sistem **Online Shopping System**:

### 1. Inisialisasi Objek Produk
Program dimulai dari kelas `MainApp`.  
Di dalamnya, dua objek dibuat:
- Satu objek dari kelas `Electronics`
- Satu objek dari kelas `Clothing`

### 2. Penggunaan Constructor dan Encapsulation
- Setiap objek dibuat dengan memanggil konstruktor yang mengisi atribut seperti `name`, `price`, dan `productId`.
- Semua atribut bersifat `private` (enkapsulasi) dan hanya dapat diakses melalui method `get` dan `set`.

### 3. Pewarisan (Inheritance)
Kelas `Electronics` dan `Clothing` merupakan subclass dari `Product`.  
Mereka mewarisi atribut umum dari `Product` dan menambahkan atribut spesifik:
- 🖥️ **Electronics** → memiliki atribut tambahan `Specification` sebagai inner class
- 👕 **Clothing** → memiliki atribut tambahan `Size` (menggunakan Enum)

### 4. Polymorphism & Interface
- Method `getCategory()` merupakan abstract method yang dioverride.
- `Electronics` dan `Clothing` mengimplementasikan interface `Discountable`.

### 5. Shopping Cart
- Kelas `ShoppingCart` menyimpan item belanja dalam list.
- Setiap item mencatat kuantitas dan menghitung harga diskon.
- Tanggal dan waktu produk ditampilkan secara terpisah dan rapi.

### 6. Output ke Konsol
- Program akan mencetak informasi semua item dalam keranjang belanja.
- Harga setelah diskon dan subtotal diformat hingga 2 digit desimal tanpa huruf `E`.

### 7. Struktur Berkas
Proyek terdiri dari 7 berkas utama:
- `Product.java` → Kelas induk produk (abstract)
- `Electronics.java` → Subclass dengan inner class + implementasi Discountable
- `Clothing.java` → Subclass menggunakan enum Size + implementasi Discountable
- `Size.java` → Enum ukuran
- `Discountable.java` → Interface diskon
- `ShoppingCart.java` → Menyimpan dan menampilkan isi belanja
- `MainApp.java` → Menjalankan program dan menerima input user

## Daftar Produk
- **Electronics**: Laptop, HP, TV, Kipas Angin
- **Clothing**: Baju Polos, Knit, Gamis, Celana, Rok

## Anggota:
-Tiarasyani Junia Bahri (51424335)
-Naisya Putri Abdullah (51424000)
-Freya Inezra Pardosi (50424474)
-Aulia Tifani (50424209)
