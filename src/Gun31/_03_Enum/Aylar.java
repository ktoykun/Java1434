package Gun31._03_Enum;

public enum Aylar {
    OCAK (1, 31, "OCAK"),
    ŞUBAT (2, 28, "ŞUBAT"),
    MART (3, 31, "MART"),
    NISAN (4, 30, "NISAN"),
    MAYIS (5, 31, "MAYIS"),
    HAZIRAN (6, 30, "HAZIRAN"),
    TEMMUZ (7, 31, "TEMMUZ"),
    AGUSOTS (8, 31, "AGUSTOS"),
    EYLUL (9, 30, "EYLUL"),
    EKİM (10, 31, "EKIM"),
    KASIM (11, 30, "KASIM"),
    ARALIK (12, 31, "KASIM");

    int ayNo;
    int GunMiktar;
    String ayAd;


    Aylar (int ayNo, int gunMiktar, String ayAd) {
    this.ayNo=ayNo;
    this.ayAd=ayAd;
    this.GunMiktar=gunMiktar;

    }
}
