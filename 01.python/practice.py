# 변수 이용해서 다음 문장 출력하기
    # 변수명 : station
    # 변수값 : "사당", "신도림", "인천공항" 순서대로 입력
    # 출력 문장 : xx행 열차가 들어오고 있습니다.
station = "인천공항"
print(station, "행 열차가 들어오고 있습니다.")


# 월 4회 스터디를 하는데 3번은 온라인으로 하고 1번은 오프라인 스터디를 할 시 오프라인 모임 날짜 정해주는 프로그램 작성
    # 랜덤으로 날짜 뽑아야 함
    # 월별 날짜는 다름을 감안하여 최소 일수인 28 이내로 정함
    # 매월 1~3일은 스터디 준비를 해야 하므로 제외
    # 출력문 예제 : 오프라인 스터디 모임 날짜는 매월 x일로 선정되었습니다.
import random
date = random.randrange(4, 29)
print(f"오프라인 스터디 모임 날짜는 매월 {date}일로 선정되었습니다.")
