package chap24;

import java.time.*;

public class Ex1 {
    public static void main(String[] args) {
        // LocalDate : 인수에 년, 월, 일을 지정
        LocalDate.of(2018, 7, 12);
        System.out.println(LocalDate.of(2018, 7, 12));

        // LocalDateTime : 인수에 연, 월, 일, 시, 분, 초, 초 이하를 지정
        LocalDateTime.of(2018, 7, 12, 13, 30, 45, 250);
        System.out.println(LocalDateTime.of(2018, 7, 12, 13, 30, 45, 250));

        // LocalTime : 인수에 시분초초 이하를 지정
        LocalTime.of(13, 30, 45, 250);
        System.out.println(LocalTime.of(13, 30, 45, 250));

        // ZoneOffset : 시차를 나타냄 (여기에서는 시차 +09:00)
        // ZoneOffset 클래스의 상세내용에 대해서는 후술
        ZoneOffset offset = ZoneOffset.ofHours(9);
        System.out.println(offset);

        // OffsetDateTime : 인수에 연, 월, 일, 시, 분, 초, 초 이하 시차를 지정
        OffsetDateTime.of(2018, 8, 11, 13, 30, 45, 250, offset);
        System.out.println(OffsetDateTime.of(2018, 8, 11, 13, 30, 45, 250, offset));

        // OffsetTime : 인수에 시, 분, 초, 초 이하 시차 지정
        OffsetTime.of(13, 30, 45, 250, offset);
        System.out.println(OffsetTime.of(13, 30, 45, 250, offset));

        // ZoneId : 시간대 나타냄 (여기에서는 "Asia/Seoul" = 서울)
        // ZoneId 클래스에 대한 자세한 내용은 나중에 설명
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println(zoneId.toString());

        // ZonedDateTime : 인수에 연, 월, 일, 시, 분, 초, 초이하 시간대를 지정
        ZonedDateTime.of(2018, 8, 11, 13, 30, 45, 250, zoneId);
        System.out.println(ZonedDateTime.of(2018, 8, 11, 13, 30, 45, 250, zoneId));
    }
}
