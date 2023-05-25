package com.ycjung.schedule.constants;

/**
 * 애플리케이션에서 사용될 상수 클래스입니다.
 */
public final class Default {
    public static final String LOG_KEY = "[Application]";
    
    // 생성자를 private으로 만들어 이 클래스가 인스턴스화되는 것을 방지합니다.
    private Default() {
        throw new UnsupportedOperationException("This is a constant class and cannot be instantiated");
    }
}
