# 🏷️ Barcode Generator (QR Code Generator in Java)

**Barcode Generator** is a simple Java program that generates QR codes from text or URLs.  
It uses the **ZXing (Zebra Crossing)** library to encode data into a QR code and saves it as a PNG image.

---

## 📌 Features

- Generate QR codes from text or URLs  
- Saves QR code as a PNG file (`barcode.png`)  
- Configurable QR code size (default: 400x400 pixels)  
- Lightweight and easy to use  

---

## 🛠️ Technologies Used

- Java (JDK 8 or higher)  
- ZXing Core library ([GitHub](https://github.com/zxing/zxing))  
- ZXing Java SE extensions  

---

## 🚀 Getting Started

### Prerequisites

- Java JDK installed  
- ZXing libraries added to the project classpath  

---

### ▶️ How to Run

1. Clone or download the repository.  
2. Compile the Java file (assuming ZXing JARs are in your classpath):

```bash
javac -cp .:core-3.4.1.jar:javase-3.4.1.jar com/example/BarcodeGenerator.java
