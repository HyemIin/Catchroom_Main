# 파이널 프로젝트 : 무료 예약 취소 불가한 숙소의 양도/거래 서비스

## 🎢 서비스 실행 링크

- [서비스 실행 링크](https://dev.dhlbrqe2v28e4.amplifyapp.com/home)

## 💡 프로젝트 주제

- **숙소의 양도/거래 서비스 API 서버 개발**
- **취소 수수료 발생 숙박매물을 고객간에 거래할 수 있는 중개거래 플랫폼 제작**

## 📝 프로젝트 요약
- 개인적 사유로 인해 야놀자 구매 숙박 예약권에 대한 취소 수수료가 발생하는 경우 발생하는 유저의 불만 및 탈퇴를 방지하는 것이 최우선 목표.
- 해당 숙박권에 대한 중고거래 플랫폼을 제공함으로써 안전하고 신속한 거래 기능 제공.
- 예약 취소 수수료 발생을 최소화하는 것에 초점을 맞추어 기능 개발 진행. 

## ⭐️ 핵심 기능

### 회원

- 회원 가입을 통해 각자 고유의 아이디를 생성하여 로그인을 진행한다.
- JWT 토큰을 이용하여 인증,인가를 진행하며 인가 시간이 초과한 경우 재로그인을 해야 한다.
- 아이디와,비밀번호를 통하여 인증을 진행하며 일치하지 않을 경우 서비스 사용을 할 수 없다.
- 회원 가입시 회원의 비밀번호는 암호화하여 저장한다.

### 마이페이지

- 사용자 별 구매 및 판매 내역을 리스트 형태로 확인할 수 있다.
- 찜 목록 중 삭제하고 싶은 찜 목록을 삭제할 수 있다.
- 서비스 후기에 대한 리뷰를 구매/판매 내역에 작성할 수 있다.

### 찜

- 각 사용자별 찜 목록은 리스트 형태로 마이페이지에서 조회할 수 있다.
- 찜 목록 내 삭제하고자 하는 찜을 삭제할 수 있다.
- 물품 조회에서 찜을 클릭시 찜 목록에 상품이 추가된다.

### 리뷰
- 마이페이지 내 판매/구매 내역에서 사용 리뷰를 작성할 수 있다.
- 거래한 상품 기준 구매/판매자가 리뷰를 작성할 수 있으며 리뷰 미작성 시 "리뷰 작성 가능" 형태로 게시된다.
- 구매/판매 시점으로부터 14일이 지나면 "리뷰 기한 만료"로 게시된다.
- 리뷰 삭제시 "리뷰 삭제 완료"로 뜨며 리뷰를 재작성할 수 없다.
- 작성된 리뷰는 모든 사용자가 확인할 수 있다.

### 구매내역
- 상품 구매 시 상품이 구매 내역에 추가된다.
- 구매한 상품 정보는 마이페이지에서 상세 정보를 확인할 수 있다.
- 상품 상세 페이지 내 상품 구매 및 구매자 채팅을 통해 상품을 구매할 수 있다.

### 판매내역
- 사용자가 야놀자에서 구매한 상품은 상품 등록 후보 리스트로 확인할 수 있다.
- 상품 등록 후보 리스트에서 판매할 상품을 선택하여 마켓 플레이스에 상품을 등록할 수 있다.
- 사용자는 상품의 가격 및 게시기한, 캐치특가 예약 여부 등을 수정할 수 있다.
- 게시 기한이 종료되면 상품은 마켓 플레이스에 노출되지 않는다.
- 상품 삭제 시 Soft-Delete로 삭제되며, DB에서 데이터가 삭제되지 않는다.

### 검색
- 

### 채팅
- 구매자는 상품 상세 페이지에서 판매자와 채팅을 진행할 수 있다.
- 채팅방 생성 및 삭제 시 채팅방 리스트 및 마지막 메세지가 최신화된다.
- 구매자는 네고하기 기능을 통해 판매자에게 가격 네고 요청을 전달할 수 있다.
- 판매자는 네고 승인 여부를 결정할 수 있다.
- 판매 완료 후 채팅방 삭제 시 채팅방 목록은 DB에서 삭제된다.


## ⚙️ 프로젝트 세팅

- 자바 버전 : **17**
- 서버 : AWS EC2
- 스프링 버전 : **Spring Boot 3**
- 데이터베이스 : Mysql, Redis , MongoDB 
- 문서화 도구 : Swagger
- 채팅 : Web Socket,STOMP,Redis Pub/Sub
- 의존성
    - Data-JPA
    - Data-Redis
    - QueryDSL
    - Validation
    - Security
    - Lombok
    - jwt
    - Spring Cloud

## 🛠️ 기술 스택
#### Framework
![Spring](https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![springboot](https://img.shields.io/badge/springboot-6DB33F.svg?style=for-the-badge&logo=springboot&logoColor=white)
![springsecurity](https://img.shields.io/badge/springsecurity-6DB33F.svg?style=for-the-badge&logo=springsecurity&logoColor=white)

#### DB
![MongoDB](https://img.shields.io/badge/H2-%234ea94b.svg?style=for-the-badge&logo=htop&logoColor=white)
![mysql](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)
![redis]

## 🧑‍🤝‍🧑 조원 & 역할

| 이름  | 역할                             |
|-----|--------------------------------|
| 박건우 | 조장, 회원 도메인 개발 , 마이페이지 도메인 개발 , 찜 도메인 개발, 리뷰 도메인 개발,구매/판매 도메인 개발, 서버와 DevOps 설정관리|
| 성지운 | 채팅 도메인 개발, 채팅 인프라 구성, 검색 도메인 개발|
| 정혜민 | 채팅 도메인 개발, 판매 도메인 개발|
| 홍용현 | 구매 도메인 개발, 찜 도메인 개발, 메인 화면 개발|

## 🚀 프로젝트 일정

- **프로젝트 기간**: 12월 11일(월) ~ 1월 30일(화)

## 📐 ERD 설계도

<img width="1694" alt="image" src="https://github.com/catchroom/BE_CatchRoom/assets/114489245/69507595-d816-42b7-8d52-c70241f19014">


## 🏗 API 서버 구조 & CI/CD 구조

<img width="1694" alt="image" src="https://github.com/catchroom/BE_CatchRoom/assets/50697545/f15ab45d-4626-4e02-a85e-74bac12ed312">


