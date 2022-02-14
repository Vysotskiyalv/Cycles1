package ru.netology.sqr;

public class SQRService {
    public int setSqrCalculate() {
        for (int i = 10; i < 100; i++) {
            if (i * i > 200 && i * i < 300) {
                return i;
            }
        }
return 0;
    }
}
