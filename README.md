# Katalon---Final-API---Nova-Aditya-Utami


Pengujian pada API menggunkan https://restful-booker.herokuapp.com/ 
Langkah Test yang dilakukan sebagai berikut:

1. Membuat Object Repository
- Pada object repository dibuat menjadi 3 file
a. Auth : POST - Create Bookin
b. Booking : 
POST - Create Booking
Del - Delete Booking
Get : Book ID, Booking
Patch : Partial Update
PUT : Update Booking
c. Ping : Ping - Health check

2. Membuat Test Case :
Test case yang dilakukan pengujian hanya menggunakan beberapa methode : POST, PUT, Delete, Ping
Pengujian pada TC :
- Melakukan create token
- Create booking
- Update booking menggunakan Chainning
- Delete booking menggunakan chainning
- dan melakukan ping untuk pengecekan


3. Test suite : Test Suite terbagi menjadi 2 yaitu Create dan Chainning
Create : Create token, booking dan Ping
Chainning : Update dan delete

Semua pengujian dilakukan status nya sudah PASS dan berjalan sesuai dengan data yg dijalankan pada object repository




