# Getting Started

Selamat datang di dunia pengembangan Java menggunakan Visual Studio Code (VS Code). Panduan ini dirancang untuk membantu Anda memulai perjalanan menulis kode Java dengan mudah dan efisien.

## Struktur Folder Proyek

Secara default, workspace akan memiliki struktur folder berikut:

- **`src`**: Tempat menyimpan file sumber (source code).
- **`lib`**: Tempat menyimpan file dependensi proyek.
- **`bin`**: Tempat menyimpan hasil kompilasi secara otomatis.

Jika ingin menyesuaikan struktur folder, buka file `.vscode/settings.json` dan perbarui pengaturannya sesuai kebutuhan.

## Mengelola Dependensi Proyek

VS Code menyediakan tampilan **JAVA PROJECTS** yang memungkinkan Anda menambah, menghapus, atau mengatur dependensi proyek dengan mudah.  
Informasi lebih lengkap tersedia pada dokumentasi resmi [di sini](https://code.visualstudio.com/docs/java/java-project).

## Panduan Membuat Proyek Java Baru

### 1. Instalasi JDK

1. **Unduh dan Instal JDK**:  
   Pilih salah satu distribusi JDK berikut:
   - [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html)  
   - [OpenJDK](https://openjdk.org/)

2. **Verifikasi Instalasi**:  
   Setelah instalasi selesai, jalankan perintah berikut di terminal untuk memastikan JDK terpasang dengan benar:
   ```bash
   java -version
   ```
   Anda seharusnya melihat versi JDK yang telah terinstal.

### 2. Menginstal Visual Studio Code

1. **Unduh VS Code**:  
   Dapatkan aplikasi ini dari situs resminya: [Download VS Code](https://code.visualstudio.com).

2. **Ikuti Panduan Instalasi**:  
   Setelah diunduh, ikuti instruksi instalasi hingga selesai.

### 3. Menambahkan Ekstensi Java di VS Code

1. **Buka Extensions View**:  
   Klik ikon Extensions di sisi kiri atau tekan `Ctrl+Shift+X`.

2. **Cari dan Instal**:  
   Ketik Java Extension Pack di kotak pencarian, lalu klik Install.  
   Ekstensi ini mencakup:
   - Language Support for Java(TM) by Red Hat
   - Debugger for Java
   - Java Test Runner
   - Maven for Java
   - Visual Studio IntelliCode  



## Create New Project

### 1. Membuat Proyek Java Baru

1. **Buka Command Palette**:  
   Tekan `Ctrl+Shift+P` untuk membuka Command Palette, kemudian ketik `Java: Create Java Project...` dan pilih opsi tersebut.

2. **Pilih Tipe Proyek**:  
   Anda akan diberikan beberapa opsi untuk memilih tipe proyek yang akan dibuat. Pilih sesuai kebutuhan Anda:
   - **No build tools**: Proyek sederhana tanpa menggunakan alat manajemen dependensi seperti Maven atau Gradle.
   - **Maven**: Proyek dengan penggunaan Maven untuk manajemen dependensi.
   - **Gradle**: Proyek dengan penggunaan Gradle untuk manajemen dependensi.
   - **Spring Boot**: Proyek yang menggunakan framework Spring Boot untuk aplikasi Java berbasis web.
   - **JavaFX**: Untuk pengembangan aplikasi Java berbasis GUI.

3. **Pilih Lokasi Penyimpanan**:  
   Tentukan lokasi folder tempat proyek Java Anda akan disimpan. Anda dapat memilih folder yang sudah ada atau membuat folder baru.

4. **Beri Nama Proyek**:  
   Masukkan nama proyek Java Anda dan tekan `Enter`. Proyek baru Anda akan dibuat.



## Menulis dan Menjalankan Kode Java

### 1. Membuat File Java Baru

1. **Buat File Java**:  
   Di dalam folder `src`, buat file baru dengan ekstensi `.java`, misalnya `HelloWorld.java`.

2. **Tulis Kode Java**:  
   Ketik kode berikut dalam file `HelloWorld.java`:
   ```java
   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```
3. **Jalankan Program:a**:  
   Tekan `Ctrl+F5` atau klik tombol Run di sudut kanan atas editor untuk menjalankan program.  
   Anda akan melihat output "Hello, World!" di terminal.  



## Debugging dan Pengelolaan Proyek

### 1. Debugging Kode Java

1. **Mulai Debugging**:  
    Anda dapat menggunakan ekstensi **Debugger for Java** yang sudah terpasang untuk memulai debugging. Klik pada bagian kiri Run and Debug di toolbar atau tekan `F5`.
2. **Set Breakpoints**:  
    Tempatkan breakpoints di bagian kode yang ingin Anda periksa. Ketika eksekusi program mencapai titik tersebut, proses debugging akan dimulai.

### 2. Mengelola Proyek Java

1. **Mengelola Dependensi**:  
    Jika Anda menggunakan Maven atau Gradle, Anda dapat mengelola dependensi melalui tampilan **JAVA PROJECTS** di VS Code. Klik kanan pada proyek Anda dan pilih **Add Dependency** untuk menambah atau menghapus dependensi sesuai kebutuhan.

2. **Menambahkan Library**:  
    Jika proyek Anda membutuhkan library tambahan, Anda dapat menambahkannya melalui **pom.xml** (untuk Maven) atau **build.gradle** (untuk Gradle) sesuai dengan tipe proyek Anda.        
---

<h3 align="left">Socials</h3>
<p align="center"> 
  <a href="https://www.github.com/Rafly1818" target="_blank" rel="noreferrer"> 
    <picture> 
      <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/github-dark.svg" /> 
      <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/github.svg" /> 
      <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/github.svg" width="32" height="32" alt="GitHub" /> 
    </picture> 
  </a> 
  <a href="http://www.instagram.com/flyyr_" target="_blank" rel="noreferrer"> 
    <picture> 
      <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/instagram-dark.svg" /> 
      <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/instagram.svg" /> 
      <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/instagram.svg" width="32" height="32" alt="Instagram" /> 
    </picture> 
  </a>
</p>