# 날씨 출력 프로그램
weather = input("오늘의 날씨는? (맑음, 비, 눈) : ")
if weather == "맑음" :
    print("산책하기")
elif weather == "비" :
    print("우산 챙기기")
elif weather == "눈" :
    print("눈사람 만들기")
else :
    print("마음대로 하세요.")
    
# 국립 공원 입장료 계산하기
age = int(input("나이를 입력하세요. : "))
if age >= 65 or age <= 7 :
    print("입장료는 0원입니다.")
elif 8 <= age <= 18 :
    print("입장료는 1,000원입니다.")
else :
    print("입장료는 3,000원입니다.")

# 성적 관리
grade = int(input("성적을 입력하세요 : "))
if grade >= 90 :
    print("A")
elif 80 <= grade < 90 :
    print("B")
elif 70 <= grade < 80 :
    print("C")
else :
    print("F")