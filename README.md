# JPA

1. GET /daily
설명: 일정을 페이지네이션하여 조회합니다.
쿼리 파라미터:
page (default: 0): 페이지 번호
size (default: 10): 페이지 크기

2. GET /daily/{id}
설명: 특정 일정을 조회합니다.

경로 변수:

id: 조회할 일정의 ID

3. PUT /daily/{id}
설명: 특정 일정을 수정합니다.
경로 변수:
id: 수정할 일정의 ID

4. POST /daily
설명: 새로운 일정을 생성합니다.

5. DELETE /daily/{id}
설명: 특정 일정을 삭제합니다.
경로 변수
id: 삭제할 일정의 ID

6. GET /daily/{id}/comments
설명: 특정 일정의 댓글을 조회합니다.
경로 변수
id: 댓글을 조회할 일정의 ID

7. POST /daily/{id}/comments
설명: 특정 일정에 댓글을 추가합니다.
경로 변수
id: 댓글을 추가할 일정의 ID

8. PUT /comments/{id}
설명: 특정 댓글을 수정합니다.
경로 변수
id: 수정할 댓글의 ID

9. DELETE /comments/{id}
설명: 특정 댓글을 삭제합니다.
경로 변수
id: 삭제할 댓글의 ID
