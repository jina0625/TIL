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


# 사이트별 비밀번호 만들어 주는 프로그램 작성
    # ex) http://naver.com
    # http:// 부분 제외 => naver.com
    # 처음 만나는 점(.) 이후 부분 제외 => naver
    # 남은 글자 중 처음 세자리 + 글자 갯수 + 글자 내 'e' 갯수 + "!"로 구성
url = "http://youtube.com"
my_str = url.replace("http://", "")
my_str2 = my_str[:my_str.index(".")]
password = my_str2[0:3] + str(len(my_str2)) + str(my_str2.count("e")) + "!"
print(f"{url}의 비밀번호는 {password}입니다.")


# 댓글 작성자들 중 추첨 통해 1명은 치킨, 3명은 커피 쿠폰을 받게 되는 추첨 프로그램 작성
    # 편의상 댓글은 20명이 작성하였고 아이디는 1~20 이라고 가정
    # 댓글 내용과 상관 없이 무작위로 추첨하되 중복 불가
    # random 모듈의 shuffle과 sample 활용
import random
event =[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
winners = random.sample(event, 4)
print(winners)
random.shuffle(winners)
print(winners)
chicken = winners[0]
print(chicken)
coffee = winners[1:]
print(coffee)
print(f"""
      -- 당청자 발표 --
      치킨 당첨자 : {chicken}
      커피 당첨자 : [{coffee}]
      -- 축하합니다 --
      """)


# 50명의 승객과 매칭 기회가 있을 때, 총 탑승 승객 수 구하는 프로그램 작성
    # 승객별 운행 소요 시간은 5분 ~ 50분 사이 난수로 정해짐
    # 소요 시간 5분 ~ 15분 사이 승객만 매칭해야 함
import random
people = list(range(1,51))
print(people)
random.shuffle(people)
print(people)
drive = list(range(5,51))
print(drive)
random.shuffle(drive)
print(drive)
user = list(zip(people, drive))
print(user)
for i in user :
    print(i)
    number =+ i
    print(number)
   
