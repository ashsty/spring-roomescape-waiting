# 기능 요구사항

## 패어와 정한 컨벤션

- 클래스를 정의한 뒤 다음 줄은 공백으로 한다.
- @DisplayName ➡️ @Test 순으로 작성한다.
- final 키워드는 필드에만 적용한다.

## 1단계 JPA 전환

- [x] gradle 의존성 추가
    - as is: spring-boot-stater-jdbc
    - to be: spring-boot-starter-data-jpa
- [x] 다른 클래스를 의존하지 않는 클래스 엔티티 설정
  - [x] Member
  - [x] Theme
  - [x] TimeSlot
- [x] Reservation 클래스 엔티티 설정

## 2단계 - 내 예약 목록 조회 기능

- [x] 2단계 클라이언트 코드 추가
  - reservation-mine.html
  - reservation-mine.js
- [x] 내 예약 조회 페이지 응답 추가
- [x] 내 예약 조회 API 추가

## 3단계 - 예약 대기 기능 추가

- [x] 3단계 클라이언트 코드 추가
  - reservation.html
  - user-reservation.js
- [x] 예약 대기 생성 API 추가
  - [x] 중복 예약은 허용하지 않는다.
    - 동일한 시간대에 두 개 이상의 예약을 잡을 수 없다.(e.g. 테마 2, 테마 3을 동일 날짜 동일 시간에 예약할 수 없다)
    - 자신이 이미 예약한 테마에는 예약 대기를 걸 수 없다.
    - 자신이 이미 예약 대기를 걸어놓은 테마에는 예약 대기를 걸 수 없다.
    - 이외의 상황은 모두 허락한다.
      - 자신이 예약한 시간대와 동일한 시간대에 예약 대기를 걸 수 있다. (e.g. 10:00에 테마 1 예약, 동시에 테마 2 예약 대기)
      - 자신이 예약 대기를 걸어놓은 시간대와 동일한 시간대에 다른 테마의 예약 대기를 걸 수 있다. (e.g. 10:00에 테마 1, 2 예약 대기)
      - 자신이 예약 대기를 걸어놓은 시간대와 동일한 시간대에 다른 테마를 예약할 수 있다.
- [x] 예약 대기 조회 API 추가
  - [x] 예약 > 예약대기 (날짜 오름차순) 순으로 정렬된다.
  - [x] (심화) 몇 번째 대기인지 표시한다.
- [x] 예약 대기 삭제 API 추가

## 4단계 - 관리자 예약 대기 관리 기능 추가

- [x] 4단계 클라이언트 코드 추가
  - waiting.html
  - waiting.js
- [x] 어드민 예약 대기 조회 페이지 응답 추가
- [x] 예약 대기 관리 API 추가
  - [x] 예약 대기 목록 조회 
  - [x] 예약 대기 취소
- [x] 예약 대기 승인 기능 추가
  - [x] 예약 취소 발생 시 우선순위에 따라 예약 대기가 자동으로 승인된다
