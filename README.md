# Tugas-Pertemuan-3
Repository ini berisi tugas mata kuliah Pemrograman Berorientasi Objek (PBO) pada pertemuan ke-3.
# 1. Overload dan Override
-Overloading adalah kemampuan sebuah class untuk memiliki beberapa method dengan nama yang sama, tetapi berbeda pada jumlah atau tipe parameternya.

-Overriding adalah kemampuan subclass untuk membuat ulang method dari superclass dengan implementasi yang berbeda.
# 2. Abstract Class
Abstract class adalah jenis kelas dalam Java yang tidak bisa dibuat objeknya secara langsung. Di dalamnya biasanya terdapat satu atau lebih abstract method, yaitu method yang hanya ditulis deklarasinya tanpa isi. Meskipun begitu, abstract class juga bisa memiliki atribut dan method yang sudah lengkap implementasinya.
Fungsinya adalah sebagai cetakan atau kerangka dasar yang harus diikuti oleh kelas turunannya, dengan cara mengisi atau melengkapi method-method abstrak tersebut.
# 3. Perbedaan Abstract Class dan Interface
Interface digunakan untuk menetapkan aturan atau perilaku yang harus dimiliki oleh kelas yang mengikutinya. Satu kelas bisa mengikuti banyak interface sekaligus, karena interface hanya berisi implementasi method tanpa isi. Ini berbeda dengan abstract class, di mana satu kelas hanya bisa mewarisi satu abstract class.

Perbedaan utamanya ada pada fleksibilitas dan tujuan penggunaannya:

-Abstract class bisa punya data (atribut) dan method yang sudah diisi, serta hanya mendukung satu jalur pewarisan.

-Interface hanya berisi method (tanpa isi), tapi bisa digunakan oleh banyak kelas sekaligus untuk meniru perilaku yang sama.
