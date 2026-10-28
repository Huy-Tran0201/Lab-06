# Exercise 5.11 – Bộ test cho `BiCardSource`

Bài tập 11, chương 5 của *Introduction to Software Design with Java* (M. P. Robillard):
viết bộ test cho các phương thức public của `BiCardSource`, đạt 100% branch coverage,
dùng **stub** để cô lập hành vi cần kiểm thử.

## Cấu trúc

```
src/main/java/chapter4/   Card, CardSource, Rank, Suit (lớp phụ trợ)
src/main/java/e11/        BiCardSource (đã sửa lỗi seeded bug)
src/test/java/e11/        Exercise11 (bộ test + stub)
```

## Yêu cầu

- JDK 17 trở lên
- Maven 3.8+ (có kết nối Internet lần đầu để tải JUnit, JaCoCo)

## Chạy

```bash
mvn test      # chạy 7 test, sinh báo cáo coverage ở target/site/jacoco/index.html
mvn verify    # như trên + kiểm tra BiCardSource phải đạt 100% branch coverage
```

## Lỗi cài sẵn (seeded bug)

Trong `draw()` của đề bài, hai nhánh bị đảo: khi nguồn 1 *không rỗng* lại rút từ nguồn 2.
Bản trong repo này đã được sửa. Để tái hiện lỗi, đảo lại `aSource1.draw()` và
`aSource2.draw()` trong `BiCardSource.draw()`; 3 test `testDraw_*` sẽ thất bại.
