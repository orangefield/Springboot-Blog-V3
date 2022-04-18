# 스프링부트 JPA 블로그 V3 - GREEN Computer

### 1. 의존성
- devtools
- spring web (mvc)
- mustache
- lombok
- jpa
- mysql
- security
- validation

### 2. DB설정
```sql
CREATE USER 'green'@'%' IDENTIFIED BY 'green1234';
CREATE DATABASE greendb;
GRANT ALL PRIVILEGES ON greendb.* TO 'green'@'%';
```

### 3. 에디터
- https://quilljs.com/

### 4. 댓글
- https://livere.com/

### 5. 주소 요청 이런식으로 해볼까?
```txt
localhost:8080/ (메인페이지 - 글 있는 곳 아님)
localhost:8080/user/{userId}/post
localhost:8080/user/{userId}/post/{postId}
localhost:8080/user/{userId}/category/{title}
```

### 6. 모델링
```sql
Visit
id
userId
totalCount
createDate
updateDate

User
id
username
password
createDate
updateDate

Post
id
title
content
thumnail
userId
categoryId
createDate
updateDate

Like
id
postId
userId
createDate
updateDate

Category
id
title
userId
createDate
updateDate
```

### 7. 기능정리
- 카테고리 등록
- 글쓰기
- 글 목록 보기
- 페이징
- 글 상세보기
- 검색
- 글 삭제
- 글 수정
- 댓글(라이브러리 사용)          
- 프로필 사진 업로드 (회원가입시)
- 회원수정

### Gradle depenency update
'''txt
./gradlew --refresh-dependencie
'''